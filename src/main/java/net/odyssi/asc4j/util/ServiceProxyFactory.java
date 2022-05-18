/**
 *
 */
package net.odyssi.asc4j.util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import net.odyssi.asc4j.jaxrs.filters.ErrorResponseFilter;
import net.odyssi.asc4j.jaxrs.filters.TokenAuthenticationClientRequestFilter;

/**
 * A factory class that creates JAX-RS client proxy instances for interacting
 * with the App Store Connect API
 *
 *
 */
public class ServiceProxyFactory {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(ServiceProxyFactory.class.getName());

	private static ServiceProxyFactory instance = null;
	/**
	 * Returns a singleton instance of the factory
	 *
	 * @return The factory instance
	 */
	synchronized public static ServiceProxyFactory getInstance() {
		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - start"); //$NON-NLS-1$
		}

		if (instance == null) {
			instance = new ServiceProxyFactory();
		}

		if (logger.isDebugEnabled()) {
			logger.debug("getInstance() - end"); //$NON-NLS-1$
		}
		return instance;
	}

	protected ServiceProxyFactory() {

	}

	/**
	 * Creates a JAX-RS client proxy instance for the given proxy class
	 *
	 * @param proxyClass The client proxy class
	 * @param token      The App Store Connect token (JWT) used for authorization
	 * @return The client proxy
	 */
	public <T> T createServiceProxy(Class<T> proxyClass, String token) {
		if (logger.isDebugEnabled()) {
			logger.debug("createServiceProxy(Class<T>, String) - start"); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("createServiceProxy(Class<T>, String) - Generating API client proxy... - proxyClass={}"); //$NON-NLS-1$
		}

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(ASC4JConstants.API_ENDPOINT);
		ResteasyWebTarget webTarget = (ResteasyWebTarget) target;

		webTarget.register(new TokenAuthenticationClientRequestFilter(token));
		webTarget.register(ErrorResponseFilter.class);

		T clientProxy = webTarget.proxy(proxyClass);

		if (logger.isDebugEnabled()) {
			logger.debug("createServiceProxy(Class<T>, String) - end"); //$NON-NLS-1$
		}
		return clientProxy;
	}
}
