package net.odyssi.asc4j.model;

/**
 * Gets or Sets AppEventAssetType
 */
public enum AppEventAssetType {

	CARD("EVENT_CARD"),

	DETAILS_PAGE("EVENT_DETAILS_PAGE");

	public static AppEventAssetType fromValue(String value) {
		for (AppEventAssetType b : AppEventAssetType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	AppEventAssetType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
