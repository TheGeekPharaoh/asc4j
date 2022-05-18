package net.odyssi.asc4j.model;

/**
 * Gets or Sets AppClipAction
 */
public enum AppClipAction {

	OPEN("OPEN"),

	PLAY("PLAY"),

	VIEW("VIEW");

	public static AppClipAction fromValue(String value) {
		for (AppClipAction b : AppClipAction.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	AppClipAction(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
