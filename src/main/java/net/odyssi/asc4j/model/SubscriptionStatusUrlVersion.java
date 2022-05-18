package net.odyssi.asc4j.model;

/**
 * Gets or Sets SubscriptionStatusUrlVersion
 */
public enum SubscriptionStatusUrlVersion {

	V1("v1"),

	V2("v2");

	public static SubscriptionStatusUrlVersion fromValue(String value) {
		for (SubscriptionStatusUrlVersion b : SubscriptionStatusUrlVersion.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	SubscriptionStatusUrlVersion(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
