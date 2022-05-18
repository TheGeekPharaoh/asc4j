/**
 *
 */
package net.odyssi.asc4j.jaxrs.filters;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
/**
 * A JAX-RS {@link ClientRequestFilter} used to insert an authorization header
 * into outgoing requests. This header will include the JWT generated using the
 * registration details from App Store Connect.
 *
 *
 */
public class TokenAuthenticationClientRequestFilter implements ClientRequestFilter {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(TokenAuthenticationClientRequestFilter.class.getName());

	private String AUTHORIZATION_HEADER = "Authorization";

	private String token = null;

	private String TOKEN_PREFIX = "Bearer ";

	public TokenAuthenticationClientRequestFilter(String token) {
		super();
		this.token = token;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.ws.rs.client.ClientRequestFilter#filter(javax.ws.rs.client.
	 * ClientRequestContext)
	 */
	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("filter(ClientRequestContext) - start"); //$NON-NLS-1$
		}

		if (this.token == null || this.token.isBlank()) {
			logger.warn(
					"filter(ClientRequestContext) - No authorization token provided or token is blank.  Call will likely fail."); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("filter(ClientRequestContext) - Adding token Authorization header to outgoing request..."); //$NON-NLS-1$
		}

		requestContext.getHeaders().add(this.AUTHORIZATION_HEADER, this.TOKEN_PREFIX + this.token);

		if (logger.isDebugEnabled()) {
			logger.debug("filter(ClientRequestContext) - Authorization header added to outgoing request."); //$NON-NLS-1$
		}

		if (logger.isDebugEnabled()) {
			logger.debug("filter(ClientRequestContext) - end"); //$NON-NLS-1$
		}
	}

}
