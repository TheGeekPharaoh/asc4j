package net.odyssi.asc4j.model;

/**
 * Gets or Sets BundleIdPlatform
 */
public enum BundleIdPlatform {

	IOS("IOS"),

	MAC_OS("MAC_OS");

	public static BundleIdPlatform fromValue(String value) {
		for (BundleIdPlatform b : BundleIdPlatform.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	BundleIdPlatform(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
