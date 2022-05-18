package net.odyssi.asc4j.model;

/**
 * Gets or Sets CiTestDestinationKind
 */
public enum CiTestDestinationKind {

	MAC("MAC"),

	SIMULATOR("SIMULATOR");

	public static CiTestDestinationKind fromValue(String value) {
		for (CiTestDestinationKind b : CiTestDestinationKind.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	CiTestDestinationKind(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
