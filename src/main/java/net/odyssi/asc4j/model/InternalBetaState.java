package net.odyssi.asc4j.model;

/**
 * Gets or Sets InternalBetaState
 */
public enum InternalBetaState {

	EXPIRED("EXPIRED"),

	IN_BETA_TESTING("IN_BETA_TESTING"),

	IN_EXPORT_COMPLIANCE_REVIEW("IN_EXPORT_COMPLIANCE_REVIEW"),

	MISSING_EXPORT_COMPLIANCE("MISSING_EXPORT_COMPLIANCE"),

	PROCESSING("PROCESSING"),

	PROCESSING_EXCEPTION("PROCESSING_EXCEPTION"),

	READY_FOR_BETA_TESTING("READY_FOR_BETA_TESTING");

	public static InternalBetaState fromValue(String value) {
		for (InternalBetaState b : InternalBetaState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	InternalBetaState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
