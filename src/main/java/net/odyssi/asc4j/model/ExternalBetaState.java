package net.odyssi.asc4j.model;

/**
 * Gets or Sets ExternalBetaState
 */
public enum ExternalBetaState {

	BETA_APPROVED("BETA_APPROVED"),

	BETA_REJECTED("BETA_REJECTED"),

	EXPIRED("EXPIRED"),

	IN_BETA_REVIEW("IN_BETA_REVIEW"),

	IN_BETA_TESTING("IN_BETA_TESTING"),

	IN_EXPORT_COMPLIANCE_REVIEW("IN_EXPORT_COMPLIANCE_REVIEW"),

	MISSING_EXPORT_COMPLIANCE("MISSING_EXPORT_COMPLIANCE"),

	PROCESSING("PROCESSING"),

	PROCESSING_EXCEPTION("PROCESSING_EXCEPTION"),

	READY_FOR_BETA_SUBMISSION("READY_FOR_BETA_SUBMISSION"),

	READY_FOR_BETA_TESTING("READY_FOR_BETA_TESTING"),

	WAITING_FOR_BETA_REVIEW("WAITING_FOR_BETA_REVIEW");

	public static ExternalBetaState fromValue(String value) {
		for (ExternalBetaState b : ExternalBetaState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	ExternalBetaState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
