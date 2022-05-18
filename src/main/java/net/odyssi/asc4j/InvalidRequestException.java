/**
 *
 */
package net.odyssi.asc4j;

import net.odyssi.asc4j.model.ErrorResponse;

/**
 * The exception thrown when the client submits a bad request to the API
 * endpoint
 *
 */
public class InvalidRequestException extends AppStoreConnectException {

	/**
	 *
	 */
	private static final long serialVersionUID = 4370737585679292302L;

	public InvalidRequestException(int httpStatusCode) {
		super(httpStatusCode);
	}

	public InvalidRequestException(int httpStatusCode, ErrorResponse errorResponse) {
		super(httpStatusCode, errorResponse);
	}

	public InvalidRequestException(int httpStatusCode, String message) {
		super(httpStatusCode, message);
	}

	public InvalidRequestException(int httpStatusCode, String message, ErrorResponse errorResponse) {
		super(httpStatusCode, message, errorResponse);
	}

}
