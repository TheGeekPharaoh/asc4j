package net.odyssi.asc4j.model;

/**
 * Gets or Sets BetaReviewState
 */
public enum BetaReviewState {

	APPROVED("APPROVED"),

	IN_REVIEW("IN_REVIEW"),

	REJECTED("REJECTED"),

	WAITING_FOR_REVIEW("WAITING_FOR_REVIEW");

	public static BetaReviewState fromValue(String value) {
		for (BetaReviewState b : BetaReviewState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	BetaReviewState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
