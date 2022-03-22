# ASC4j
Apple App Store Connect API Client for Java

## Overview

Apple's [App Store Connect API](https://developer.apple.com/app-store-connect/api/) provides a programmatic interface for many of the functions found in [App Store Connect](https://appstoreconnect.apple.com/).  Unfortunately, the documentation for this API is somewhat lacking, and no client libraries are provided for working with it in common languages.

An [OpenAPI spec](https://github.com/TheGeekPharaoh/AppStoreConnectAPI-openapi) for the API helps with the first of these issues, while this library aims to help with the second when developing in Java.  The ASC4j library provides a [JAX-RS](https://github.com/jax-rs) client proxy for making calls against the App Store Connect API.  In addition, it includes utility classes for handling things such as token generation and exception mapping.  All data types, and path endpoints are derived from Apple's official [OpenAPI spec](https://developer.apple.com/sample-code/app-store-connect/app-store-connect-openapi-specification.zip), with enhancements to the code documentation taken directly from Apple's [App Store Connect API Documentation](https://developer.apple.com/documentation/appstoreconnectapi).  The current version of the App Store Connect API is v1.8.

## The Code

The model code is derived using this [OpenAPI spec](https://github.com/TheGeekPharaoh/AppStoreConnectAPI-openapi), and uses [Jackson](https://github.com/FasterXML/jackson) for mapping JSON objects to Java classes.  The resource proxies are standard JAX-RS client proxies.  One design goal of this project is to have minimal dependencies beyond what would typically be found in a modern Java project.

## Getting Started

### App Store Connect API

Getting setup with the App Store Connect API is beyond the scope of this document.  For that, I would refer you to the [official documentation](https://developer.apple.com/app-store-connect/api/) for the API.  At a minimum, to use this library you must provide the following:

* Issuer ID, found in the API Keys section of App Store Connect
* The Key Identifier from App Store Connect
* A PKCS#8-encoded key file, used to sign the authentication token

### Building the Project

#### Test Setup

A JUnit test for the TokenUtil class – used to generate the authentication token – is included in the library.  This is useful to ensure that you have all of the necessary values and that the key file is encoded properly.  To configure the test, create a file called `testSetup.properties` in the `/src/test/resources` directory of your source code distribution.  The content of this file should look like this:

```
test.issuerID=<THE ISSUER ID>
test.keyID=<THE KEY ID>
test.keyFile=<THE PATH TO YOUR PKCS#8-ENCODED KEY FILE>
```

#### Maven Build

Once you have configured your test parameters, building the library with [Maven](https://maven.apache.org) is as simple as running `mvn clean install`.  If you do not wish to run the JUnit tests, simply skip them by running `mvn clean install -DskipTests` instead.

### Sample Usage

#### Generating the Authentication Token

The authentication token used by the App Store Connect API is a [JWT](https://en.wikipedia.org/wiki/JSON_Web_Token).  The `TokenUtil` class is used to generate and sign the JWT using the credential data you obtained when registering to use the API.  The `TokenUtil` class has several ways to read the PKCS#8-encoded key, so it should be easy to leverage this class in your project.  Generating the JWT is as simple as:

```java
import net.odyssi.asc4j.util.TokenUtil;

// ...snip...

String issuerID = "...";
String keyID = "...";

String keyFilePath = "...";
// You could also specify a java.io.File, java.io.InputStream,
// or java.security.Private key object instead of a path on the
// file system.

String token = TokenUtil.generateToken(issuerID, keyID, keyFilePath);
```

#### Creating the Client Proxy

JAX-RS client proxies are provided for each of the App Store Connect API services.  These include services for managing:

* Users
* User Invitations
* Bundle Identifiers
* Devices
* Certificates
* Provisioning and Distribution Profiles
* Sales and Finance Reports

A `ServiceProxyFactory` object is provided to simplify instantiating these proxy objects.  Once you have obtained your authentication token, you can use this factory class to generate the proxy client.  This client will have a JAX-RS `ClientRequestFilter` associated with it that will automatically include the `Authorization` header with your JWT.

#### Example

A full example, showing how to obtain the token, instantiate a client API proxy, and make a service call would look something like this:

```java
import net.odyssi.asc4j.util.TokenUtil;
import net.odyssi.asc4j.util.ServiceProxyFactory;
import net.odyssi.asc4j.jaxrs.UsersResource;
import net.odyssi.asc4j.model.Users

// ...snip...

String issuerID = "...";
String keyID = "...";

String keyFilePath = "...";

String token = TokenUtil.generateToken(issuerID, keyID, keyFilePath);

ServiceProxyFactory spf = ServiceProxyFactory.getInstance();
UsersResource usersClient = spf.createServiceProxy(UsersResource.class, token);

// This method provides the ability to apply numerous filters to restrict the
// results returned.  This example does not show their usage, which is why
// all of the method parameters are null.
Response response = usersClient.getUsers(null, null, null, null, null, null, null, null, null);
Users users = response.readEntity(Users.class);

System.out.println(users.getData().size() + " users found");
```

## Issues, Contributing, and More

If you find this library helpful and encounter any issues, or if you wish to contribute enhancements, please reach out!  All contributions and merge requests are welcome, and I am very open to your feedback on this library.  I hope you find it helpful!

## FAQs

#### *Is this library available on Maven Central?*

Not yet.  I'm working on it, though.  Stay tuned!

#### *Are all of the App Store Connect API methods documentation and implemented in this library?*

No, not at the moment.  Currently, only the core functionality has been implemented, though there are plans to include the entirety of the API.

#### *Why are the property names and descriptions so generic?*

These values are obtained directly from the App Store Connect API documentation.  No effort was made to map those names to friendlier property names, or to infer better documentation for them.