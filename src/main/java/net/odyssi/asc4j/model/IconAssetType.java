package net.odyssi.asc4j.model;

/**
 * Gets or Sets IconAssetType
 */
public enum IconAssetType {

	ALTERNATE_EXPERIMENT("ALTERNATE_EXPERIMENT"),

	APP_STORE("APP_STORE"),

	MESSAGES_APP_STORE("MESSAGES_APP_STORE"),

	TV_OS_HOME_SCREEN("TV_OS_HOME_SCREEN"),

	TV_OS_TOP_SHELF("TV_OS_TOP_SHELF"),

	WATCH_APP_STORE("WATCH_APP_STORE");

	public static IconAssetType fromValue(String value) {
		for (IconAssetType b : IconAssetType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	IconAssetType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
