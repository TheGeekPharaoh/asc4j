package net.odyssi.asc4j.model;

/**
 * Gets or Sets AppStoreVersionState
 */
public enum AppStoreVersionState {

	ACCEPTED("ACCEPTED"),

	DEVELOPER_REJECTED("DEVELOPER_REJECTED"),

	DEVELOPER_REMOVED_FROM_SALE("DEVELOPER_REMOVED_FROM_SALE"),

	IN_REVIEW("IN_REVIEW"),

	INVALID_BINARY("INVALID_BINARY"),

	METADATA_REJECTED("METADATA_REJECTED"),

	PENDING_APPLE_RELEASE("PENDING_APPLE_RELEASE"),

	PENDING_CONTRACT("PENDING_CONTRACT"),

	PENDING_DEVELOPER_RELEASE("PENDING_DEVELOPER_RELEASE"),

	PREORDER_READY_FOR_SALE("PREORDER_READY_FOR_SALE"),

	PREPARE_FOR_SUBMISSION("PREPARE_FOR_SUBMISSION"),

	PROCESSING_FOR_APP_STORE("PROCESSING_FOR_APP_STORE"),

	READY_FOR_REVIEW("READY_FOR_REVIEW"),

	READY_FOR_SALE("READY_FOR_SALE"),

	REJECTED("REJECTED"),

	REMOVED_FROM_SALE("REMOVED_FROM_SALE"),

	REPLACED_WITH_NEW_VERSION("REPLACED_WITH_NEW_VERSION"),

	WAITING_FOR_EXPORT_COMPLIANCE("WAITING_FOR_EXPORT_COMPLIANCE"),

	WAITING_FOR_REVIEW("WAITING_FOR_REVIEW");

	public static AppStoreVersionState fromValue(String value) {
		for (AppStoreVersionState b : AppStoreVersionState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	AppStoreVersionState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
