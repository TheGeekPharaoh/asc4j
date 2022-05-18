package net.odyssi.asc4j.model;

/**
 * Gets or Sets CiTestStatus
 */
public enum CiTestStatus {

	EXPECTED_FAILURE("EXPECTED_FAILURE"),

	FAILURE("FAILURE"),

	MIXED("MIXED"),

	SKIPPED("SKIPPED"),

	SUCCESS("SUCCESS");

	public static CiTestStatus fromValue(String value) {
		for (CiTestStatus b : CiTestStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	CiTestStatus(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
