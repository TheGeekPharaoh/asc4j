package net.odyssi.asc4j.model;

/**
 * Gets or Sets BuildAudienceType
 */
public enum BuildAudienceType {

	APP_STORE_ELIGIBLE("APP_STORE_ELIGIBLE"),

	INTERNAL_ONLY("INTERNAL_ONLY");

	public static BuildAudienceType fromValue(String value) {
		for (BuildAudienceType b : BuildAudienceType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	BuildAudienceType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
