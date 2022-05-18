package net.odyssi.asc4j.model;

/**
 * Gets or Sets Platform
 */
public enum Platform {

	IOS("IOS"),

	MAC_OS("MAC_OS"),

	TV_OS("TV_OS");

	public static Platform fromValue(String value) {
		for (Platform b : Platform.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	Platform(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
