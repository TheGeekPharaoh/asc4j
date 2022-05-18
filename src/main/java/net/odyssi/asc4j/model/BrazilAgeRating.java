package net.odyssi.asc4j.model;

/**
 * Gets or Sets BrazilAgeRating
 */
public enum BrazilAgeRating {

	EIGHTEEN("EIGHTEEN"),

	FOURTEEN("FOURTEEN"),

	L("L"),

	SIXTEEN("SIXTEEN"),

	TEN("TEN"),

	TWELVE("TWELVE");

	public static BrazilAgeRating fromValue(String value) {
		for (BrazilAgeRating b : BrazilAgeRating.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	BrazilAgeRating(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
