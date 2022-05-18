package net.odyssi.asc4j.model;

/**
 * Gets or Sets PreviewType
 */
public enum PreviewType {

	APPLE_TV("APPLE_TV"),

	DESKTOP("DESKTOP"),

	IPAD_105("IPAD_105"),

	IPAD_97("IPAD_97"),

	IPAD_PRO_129("IPAD_PRO_129"),

	IPAD_PRO_3GEN_11("IPAD_PRO_3GEN_11"),

	IPAD_PRO_3GEN_129("IPAD_PRO_3GEN_129"),

	IPHONE_35("IPHONE_35"),

	IPHONE_40("IPHONE_40"),

	IPHONE_47("IPHONE_47"),

	IPHONE_55("IPHONE_55"),

	IPHONE_58("IPHONE_58"),

	IPHONE_65("IPHONE_65"),

	WATCH_SERIES_3("WATCH_SERIES_3"),

	WATCH_SERIES_4("WATCH_SERIES_4");

	public static PreviewType fromValue(String value) {
		for (PreviewType b : PreviewType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	PreviewType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
