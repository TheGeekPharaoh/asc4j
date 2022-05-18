package net.odyssi.asc4j.model;

/**
 * Gets or Sets AppEncryptionDeclarationState
 */
public enum AppEncryptionDeclarationState {

	APPROVED("APPROVED"),

	EXPIRED("EXPIRED"),

	IN_REVIEW("IN_REVIEW"),

	INVALID("INVALID"),

	REJECTED("REJECTED");

	public static AppEncryptionDeclarationState fromValue(String value) {
		for (AppEncryptionDeclarationState b : AppEncryptionDeclarationState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	AppEncryptionDeclarationState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
