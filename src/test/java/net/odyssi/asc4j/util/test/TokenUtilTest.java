/**
 *
 */
package net.odyssi.asc4j.util.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Properties;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.odyssi.asc4j.util.TokenUtil;

/**
 *
 */
class TokenUtilTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(TokenUtilTest.class.getName());

	private Properties testProperties = null;

	/**
	 * Decodes the PEM-encoded string
	 *
	 * @param pem The PEM-encoded string
	 * @return The decoded string
	 * @throws IOException
	 */
	protected byte[] decodePEM(String pem) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("decodePEM(String) - start"); //$NON-NLS-1$
		}

		Pattern parse = Pattern.compile("(?m)(?s)^---*BEGIN.*---*$(.*)^---*END.*---*$.*");
		String encoded = parse.matcher(pem).replaceFirst("$1");

		byte[] decoded = Base64.getMimeDecoder().decode(encoded);

		if (logger.isDebugEnabled()) {
			logger.debug("decodePEM(String) - end"); //$NON-NLS-1$
		}
		return decoded;
	}

	/**
	 * Loads and returns the {@link PrivateKey} from the PKCS#8-encoded key data
	 *
	 * @param keyData The key data
	 * @return The private key
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeySpecException
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 */
	protected PrivateKey generatePrivateKey(byte[] keyData)
			throws NoSuchAlgorithmException, InvalidKeySpecException, UnsupportedEncodingException, IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("generatePrivateKey(byte[]) - start"); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("generatePrivateKey(byte[]) - Generating PrivateKey object from key data... - keyData.length={}"); //$NON-NLS-1$
		}

		byte[] decodedPEM = decodePEM(new String(keyData, "UTF-8"));
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decodedPEM);
		KeyFactory kf = KeyFactory.getInstance("EC");

		PrivateKey privateKey = kf.generatePrivate(keySpec);

		if (logger.isDebugEnabled()) {
			logger.debug("generatePrivateKey(byte[]) - PrivateKey object generated."); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("generatePrivateKey(byte[]) - end"); //$NON-NLS-1$
		}
		return privateKey;
	}

	protected String getIssuerID() {
		if (logger.isDebugEnabled()) {
			logger.debug("getIssuerID() - start"); //$NON-NLS-1$
		}

		String issuerID = this.testProperties.getProperty("test.issuerID");
		assertNotNull(issuerID);
		assertFalse(issuerID.isBlank());

		if (logger.isDebugEnabled()) {
			logger.debug("getIssuerID() - end"); //$NON-NLS-1$
		}
		return issuerID;
	}

	protected String getKeyFile() {
		if (logger.isDebugEnabled()) {
			logger.debug("getKeyFile() - start"); //$NON-NLS-1$
		}

		String keyFile = this.testProperties.getProperty("test.keyFile");
		assertNotNull(keyFile);
		assertFalse(keyFile.isBlank());

		if (logger.isDebugEnabled()) {
			logger.debug("getKeyFile() - end"); //$NON-NLS-1$
		}
		return keyFile;
	}

	protected String getKeyID() {
		if (logger.isDebugEnabled()) {
			logger.debug("getKeyID() - start"); //$NON-NLS-1$
		}

		String keyID = this.testProperties.getProperty("test.keyID");
		assertNotNull(keyID);
		assertFalse(keyID.isBlank());

		if (logger.isDebugEnabled()) {
			logger.debug("getKeyID() - end"); //$NON-NLS-1$
		}
		return keyID;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("setUp() - start"); //$NON-NLS-1$
		}

		InputStream testConfigInStream = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("testSetup.properties");
		if (testConfigInStream == null) {
			fail("You must supply a file called testSetup.properties in the src/test/resources directory");
		}

		Properties properties = new Properties();
		properties.load(testConfigInStream);

		assertTrue(properties.size() > 0);

		this.testProperties = properties;

		if (logger.isDebugEnabled()) {
			logger.debug("setUp() - end"); //$NON-NLS-1$
		}
	}

	/**
	 * Test method for
	 * {@link net.odyssi.praxeum.asc4j.util.TokenUtil#generateToken(java.lang.String, java.lang.String, byte[])}.
	 */
	@Test
	void testGenerateTokenStringStringByteArray() {
		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringByteArray() - start"); //$NON-NLS-1$
		}

		InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(getKeyFile());
		assertNotNull(inStream);

		String token = null;
		try {
			byte[] keyData = inStream.readAllBytes();
			token = TokenUtil.generateToken(getIssuerID(), getKeyID(), keyData);
		} catch (IOException e) {
			logger.error("testGenerateTokenStringStringByteArray()", e); //$NON-NLS-1$

			fail(e.getMessage());
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					logger.error("testGenerateTokenStringStringByteArray()", e); //$NON-NLS-1$

					fail(e.getMessage());
				}
			}
		}

		assertNotNull(token);
		assertFalse(token.isBlank());

		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringByteArray() - end"); //$NON-NLS-1$
		}
	}

	/**
	 * Test method for
	 * {@link net.odyssi.praxeum.asc4j.util.TokenUtil#generateToken(java.lang.String, java.lang.String, java.io.File)}.
	 */
	@Test
	void testGenerateTokenStringStringFile() {
		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringFile() - start"); //$NON-NLS-1$
		}

		URL keyFileURL = Thread.currentThread().getContextClassLoader().getResource(getKeyFile());
		assertNotNull(keyFileURL);

		File keyFile = new File(keyFileURL.toExternalForm().replace("file:", ""));
		assertNotNull(keyFile);
		assertTrue(keyFile.exists());

		String token = null;
		try {
			token = TokenUtil.generateToken(getIssuerID(), getKeyID(), keyFile);
		} catch (IOException e) {
			logger.error("testGenerateTokenStringStringFile()", e); //$NON-NLS-1$

			fail(e.getMessage());
		}

		assertNotNull(token);
		assertFalse(token.isBlank());

		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringFile() - end"); //$NON-NLS-1$
		}
	}

	/**
	 * Test method for
	 * {@link net.odyssi.praxeum.asc4j.util.TokenUtil#generateToken(java.lang.String, java.lang.String, java.io.InputStream)}.
	 */
	@Test
	void testGenerateTokenStringStringInputStream() {
		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringInputStream() - start"); //$NON-NLS-1$
		}

		InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(getKeyFile());
		assertNotNull(inStream);

		String token = null;
		try {
			token = TokenUtil.generateToken(getIssuerID(), getKeyID(), inStream);
		} catch (IOException e) {
			logger.error("testGenerateTokenStringStringInputStream()", e); //$NON-NLS-1$

			fail(e.getMessage());
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					logger.error("testGenerateTokenStringStringInputStream()", e); //$NON-NLS-1$

					fail(e.getMessage());
				}
			}
		}

		assertNotNull(token);
		assertFalse(token.isBlank());

		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringInputStream() - end"); //$NON-NLS-1$
		}
	}

	/**
	 * Test method for
	 * {@link net.odyssi.praxeum.asc4j.util.TokenUtil#generateToken(java.lang.String, java.lang.String, java.security.PrivateKey)}.
	 */
	@Test
	void testGenerateTokenStringStringPrivateKey() {
		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringPrivateKey() - start"); //$NON-NLS-1$
		}

		InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(getKeyFile());
		assertNotNull(inStream);

		String token = null;
		try {
			byte[] keyData = inStream.readAllBytes();

			PrivateKey key = generatePrivateKey(keyData);
			assertNotNull(key);
			token = TokenUtil.generateToken(getIssuerID(), getKeyID(), key);
		} catch (IOException | NoSuchAlgorithmException | InvalidKeySpecException e) {
			logger.error("testGenerateTokenStringStringPrivateKey()", e); //$NON-NLS-1$

			fail(e.getMessage());
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					logger.error("testGenerateTokenStringStringPrivateKey()", e); //$NON-NLS-1$

					fail(e.getMessage());
				}
			}
		}

		assertNotNull(token);
		assertFalse(token.isBlank());

		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringPrivateKey() - end"); //$NON-NLS-1$
		}
	}

	/**
	 * Test method for
	 * {@link net.odyssi.praxeum.asc4j.util.TokenUtil#generateToken(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testGenerateTokenStringStringString() {
		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringString() - start"); //$NON-NLS-1$
		}

		URL keyFileURL = Thread.currentThread().getContextClassLoader().getResource(getKeyFile());
		assertNotNull(keyFileURL);

		String token = null;
		try {
			token = TokenUtil.generateToken(getIssuerID(), getKeyID(),
					keyFileURL.toExternalForm().replace("file:", ""));
			if (logger.isDebugEnabled()) {
				logger.debug("testGenerateTokenStringStringString() - String token={}"); //$NON-NLS-1$
			}
		} catch (IOException e) {
			logger.error("testGenerateTokenStringStringString()", e); //$NON-NLS-1$

			fail(e.getMessage());
		}
		assertNotNull(token);
		assertFalse(token.isBlank());

		if (logger.isDebugEnabled()) {
			logger.debug("testGenerateTokenStringStringString() - end"); //$NON-NLS-1$
		}
	}

}
