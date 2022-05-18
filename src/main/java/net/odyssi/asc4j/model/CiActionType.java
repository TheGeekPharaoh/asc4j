package net.odyssi.asc4j.model;

/**
 * Gets or Sets CiActionType
 */
public enum CiActionType {

	ANALYZE("ANALYZE"),

	ARCHIVE("ARCHIVE"),

	BUILD("BUILD"),

	TEST("TEST");

	public static CiActionType fromValue(String value) {
		for (CiActionType b : CiActionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	CiActionType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
