/**
 *
 */
package net.odyssi.asc4j.jaxrs.filters;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.odyssi.asc4j.AppStoreConnectException;
import net.odyssi.asc4j.InvalidAuthenticationTokenException;
import net.odyssi.asc4j.InvalidRequestException;
import net.odyssi.asc4j.PermissionDeniedException;
import net.odyssi.asc4j.ResourceConflictException;
import net.odyssi.asc4j.ResourceNotFoundException;
import net.odyssi.asc4j.model.ErrorResponse;

/**
 * A JAX-RS {@link ClientResponseFilter} used to handle errors returned from the
 * App Store Connect API
 *
 */
public class ErrorResponseFilter implements ClientResponseFilter {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(ErrorResponseFilter.class.getName());

	private static final ObjectMapper mapper = new ObjectMapper();

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.ws.rs.client.ClientResponseFilter#filter(javax.ws.rs.client.
	 * ClientRequestContext, javax.ws.rs.client.ClientResponseContext)
	 */
	@Override
	public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {
		if (logger.isDebugEnabled()) {
			logger.debug("filter(ClientRequestContext, ClientResponseContext) - start"); //$NON-NLS-1$
		}

		int httpStatusCode = responseContext.getStatus();
		if (httpStatusCode == Response.Status.OK.getStatusCode()
				|| httpStatusCode == Response.Status.NO_CONTENT.getStatusCode()
				|| httpStatusCode == Response.Status.CREATED.getStatusCode()) {
			if (logger.isDebugEnabled()) {
				logger.debug("filter(ClientRequestContext, ClientResponseContext) - Successful HTTP status returned.  Continuing... - httpStatusCode={}"); //$NON-NLS-1$
			}
		} else {
			if (logger.isDebugEnabled()) {
				logger.debug("filter(ClientRequestContext, ClientResponseContext) - Error HTTP status returned.  Handling error condition... - httpStatusCode={}"); //$NON-NLS-1$
			}

			if (responseContext.hasEntity()) {
				ErrorResponse errorResponse;
				try {
					errorResponse = mapper.readValue(responseContext.getEntityStream(), ErrorResponse.class);
				} catch (Exception e) {
					logger.error("filter(ClientRequestContext, ClientResponseContext)", e); //$NON-NLS-1$

					throw new AppStoreConnectException(httpStatusCode, e.getMessage());
				}

				switch (httpStatusCode) {
				case 400: { // Bad request
					throw new InvalidRequestException(httpStatusCode, errorResponse);
				}
				case 401: { // Unauthorized
					throw new InvalidAuthenticationTokenException(httpStatusCode, errorResponse);
				}
				case 403: { // Forbidden
					throw new PermissionDeniedException(httpStatusCode, errorResponse);
				}
				case 404: { // Resource not found
					throw new ResourceNotFoundException(httpStatusCode, errorResponse);
				}
				case 409: { // Conflict
					throw new ResourceConflictException(httpStatusCode, errorResponse);
				}
				default:
					throw new AppStoreConnectException(httpStatusCode,
							"Unable to complete App Store Connect API operation", errorResponse);
				}
			} else {
				if (logger.isDebugEnabled()) {
					logger.debug("filter(ClientRequestContext, ClientResponseContext) - No entity found in response context.  Throwing generic exception."); //$NON-NLS-1$
				}

				throw new AppStoreConnectException(httpStatusCode,
						"Unable to complete App Store Connect API operation");
			}
		}

		if (logger.isDebugEnabled()) {
			logger.debug("filter(ClientRequestContext, ClientResponseContext) - end"); //$NON-NLS-1$
		}
	}

}
