package net.odyssi.asc4j.model;

/**
 * Gets or Sets BetaInviteType
 */
public enum BetaInviteType {

	EMAIL("EMAIL"),

	PUBLIC_LINK("PUBLIC_LINK");

	public static BetaInviteType fromValue(String value) {
		for (BetaInviteType b : BetaInviteType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	BetaInviteType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
