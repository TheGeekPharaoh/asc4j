/**
 *
 */
package net.odyssi.asc4j;

import net.odyssi.asc4j.model.ErrorResponse;

/**
 * The exception thrown when an operation results in a conflict status
 *
 */
public class ResourceConflictException extends AppStoreConnectException {

	/**
	 *
	 */
	private static final long serialVersionUID = 5325315641231945313L;

	public ResourceConflictException(int httpStatusCode) {
		super(httpStatusCode);
	}

	public ResourceConflictException(int httpStatusCode, ErrorResponse errorResponse) {
		super(httpStatusCode, errorResponse);
	}

	public ResourceConflictException(int httpStatusCode, String message) {
		super(httpStatusCode, message);
	}

	public ResourceConflictException(int httpStatusCode, String message, ErrorResponse errorResponse) {
		super(httpStatusCode, message, errorResponse);
	}

}
