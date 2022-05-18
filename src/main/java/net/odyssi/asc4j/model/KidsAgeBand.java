package net.odyssi.asc4j.model;

/**
 * Gets or Sets KidsAgeBand
 */
public enum KidsAgeBand {

	FIVE_AND_UNDER("FIVE_AND_UNDER"),

	NINE_TO_ELEVEN("NINE_TO_ELEVEN"),

	SIX_TO_EIGHT("SIX_TO_EIGHT");

	public static KidsAgeBand fromValue(String value) {
		for (KidsAgeBand b : KidsAgeBand.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	KidsAgeBand(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
