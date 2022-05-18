package net.odyssi.asc4j.model;

/**
 * Gets or Sets AppStoreAgeRating
 */
public enum AppStoreAgeRating {

	FOUR_PLUS("FOUR_PLUS"),

	NINE_PLUS("NINE_PLUS"),

	SEVENTEEN_PLUS("SEVENTEEN_PLUS"),

	TWELVE_PLUS("TWELVE_PLUS");

	public static AppStoreAgeRating fromValue(String value) {
		for (AppStoreAgeRating b : AppStoreAgeRating.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	AppStoreAgeRating(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
