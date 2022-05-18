/**
 *
 */
package net.odyssi.asc4j;

import net.odyssi.asc4j.model.ErrorResponse;

/**
 * The root {@link RuntimeException} thrown when an error occurs while working
 * with the App Store Connect API. If available, the {@link ErrorResponse}
 * object returned by the API is made available for further details.
 *
 */
public class AppStoreConnectException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 7838416360751479846L;

	private ErrorResponse errorResponse = null;

	private int httpStatusCode = 0;

	public AppStoreConnectException(int httpStatusCode) {
		super();
		this.httpStatusCode = httpStatusCode;
	}

	public AppStoreConnectException(int httpStatusCode, ErrorResponse errorResponse) {
		super();
		this.errorResponse = errorResponse;
		this.httpStatusCode = httpStatusCode;
	}

	public AppStoreConnectException(int httpStatusCode, String message) {
		super(message);
		this.httpStatusCode = httpStatusCode;
	}

	public AppStoreConnectException(int httpStatusCode, String message, ErrorResponse errorResponse) {
		super(message);
		this.errorResponse = errorResponse;
		this.httpStatusCode = httpStatusCode;
	}

	public ErrorResponse getErrorResponse() {
		return this.errorResponse;
	}

	public int getHttpStatusCode() {
		return this.httpStatusCode;
	}
}
