package net.odyssi.asc4j.model;

/**
 * Gets or Sets ScreenshotDisplayType
 */
public enum ScreenshotDisplayType {

	APP_APPLE_TV("APP_APPLE_TV"),

	APP_DESKTOP("APP_DESKTOP"),

	APP_IPAD_105("APP_IPAD_105"),

	APP_IPAD_97("APP_IPAD_97"),

	APP_IPAD_PRO_129("APP_IPAD_PRO_129"),

	APP_IPAD_PRO_3GEN_11("APP_IPAD_PRO_3GEN_11"),

	APP_IPAD_PRO_3GEN_129("APP_IPAD_PRO_3GEN_129"),

	APP_IPHONE_35("APP_IPHONE_35"),

	APP_IPHONE_40("APP_IPHONE_40"),

	APP_IPHONE_47("APP_IPHONE_47"),

	APP_IPHONE_55("APP_IPHONE_55"),

	APP_IPHONE_58("APP_IPHONE_58"),

	APP_IPHONE_65("APP_IPHONE_65"),

	APP_WATCH_SERIES_3("APP_WATCH_SERIES_3"),

	APP_WATCH_SERIES_4("APP_WATCH_SERIES_4"),

	APP_WATCH_SERIES_7("APP_WATCH_SERIES_7"),

	IMESSAGE_APP_IPAD_105("IMESSAGE_APP_IPAD_105"),

	IMESSAGE_APP_IPAD_97("IMESSAGE_APP_IPAD_97"),

	IMESSAGE_APP_IPAD_PRO_129("IMESSAGE_APP_IPAD_PRO_129"),

	IMESSAGE_APP_IPAD_PRO_3GEN_11("IMESSAGE_APP_IPAD_PRO_3GEN_11"),

	IMESSAGE_APP_IPAD_PRO_3GEN_129("IMESSAGE_APP_IPAD_PRO_3GEN_129"),

	IMESSAGE_APP_IPHONE_40("IMESSAGE_APP_IPHONE_40"),

	IMESSAGE_APP_IPHONE_47("IMESSAGE_APP_IPHONE_47"),

	IMESSAGE_APP_IPHONE_55("IMESSAGE_APP_IPHONE_55"),

	IMESSAGE_APP_IPHONE_58("IMESSAGE_APP_IPHONE_58"),

	IMESSAGE_APP_IPHONE_65("IMESSAGE_APP_IPHONE_65");

	public static ScreenshotDisplayType fromValue(String value) {
		for (ScreenshotDisplayType b : ScreenshotDisplayType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	ScreenshotDisplayType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
