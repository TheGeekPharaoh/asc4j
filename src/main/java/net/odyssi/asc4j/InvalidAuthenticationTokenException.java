/**
 *
 */
package net.odyssi.asc4j;

import net.odyssi.asc4j.model.ErrorResponse;

/**
 * The exception thrown when an invalid authentication token is provided in
 * calls to the App Store Connect API
 *
 */
public class InvalidAuthenticationTokenException extends AppStoreConnectException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1932194155845496867L;

	public InvalidAuthenticationTokenException(int httpStatusCode) {
		super(httpStatusCode);
	}

	public InvalidAuthenticationTokenException(int httpStatusCode, ErrorResponse errorResponse) {
		super(httpStatusCode, errorResponse);
	}

	public InvalidAuthenticationTokenException(int httpStatusCode, String message) {
		super(httpStatusCode, message);
	}

	public InvalidAuthenticationTokenException(int httpStatusCode, String message, ErrorResponse errorResponse) {
		super(httpStatusCode, message, errorResponse);
	}

}
