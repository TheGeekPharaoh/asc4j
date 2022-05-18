/**
 *
 */
package net.odyssi.asc4j;

import net.odyssi.asc4j.model.ErrorResponse;

/**
 * The exception thrown when an API resource cannot be located
 *
 */
public class ResourceNotFoundException extends AppStoreConnectException {

	/**
	 *
	 */
	private static final long serialVersionUID = 977999484027032376L;

	public ResourceNotFoundException(int httpStatusCode) {
		super(httpStatusCode);
	}

	public ResourceNotFoundException(int httpStatusCode, ErrorResponse errorResponse) {
		super(httpStatusCode, errorResponse);
	}

	public ResourceNotFoundException(int httpStatusCode, String message) {
		super(httpStatusCode, message);
	}

	public ResourceNotFoundException(int httpStatusCode, String message, ErrorResponse errorResponse) {
		super(httpStatusCode, message, errorResponse);
	}

}
