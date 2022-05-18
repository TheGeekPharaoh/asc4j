package net.odyssi.asc4j.model;

/**
 * Gets or Sets PhasedReleaseState
 */
public enum PhasedReleaseState {

	ACTIVE("ACTIVE"),

	COMPLETE("COMPLETE"),

	INACTIVE("INACTIVE"),

	PAUSED("PAUSED");

	public static PhasedReleaseState fromValue(String value) {
		for (PhasedReleaseState b : PhasedReleaseState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	PhasedReleaseState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
