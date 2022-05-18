/**
 *
 */
package net.odyssi.asc4j;

import net.odyssi.asc4j.model.ErrorResponse;

/**
 * The exception thrown when a caller is not authorized to perform an API
 * operation
 *
 */
public class PermissionDeniedException extends AppStoreConnectException {

	/**
	 *
	 */
	private static final long serialVersionUID = -5183900639736943197L;

	public PermissionDeniedException(int httpStatusCode) {
		super(httpStatusCode);
	}

	public PermissionDeniedException(int httpStatusCode, ErrorResponse errorResponse) {
		super(httpStatusCode, errorResponse);
	}

	public PermissionDeniedException(int httpStatusCode, String message) {
		super(httpStatusCode, message);
	}

	public PermissionDeniedException(int httpStatusCode, String message, ErrorResponse errorResponse) {
		super(httpStatusCode, message, errorResponse);
	}

}
