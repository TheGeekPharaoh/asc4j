package net.odyssi.asc4j.model;

/**
 * Gets or Sets CiCompletionStatus
 */
public enum CiCompletionStatus {

	CANCELED("CANCELED"),

	ERRORED("ERRORED"),

	FAILED("FAILED"),

	SKIPPED("SKIPPED"),

	SUCCEEDED("SUCCEEDED");

	public static CiCompletionStatus fromValue(String value) {
		for (CiCompletionStatus b : CiCompletionStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	CiCompletionStatus(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
