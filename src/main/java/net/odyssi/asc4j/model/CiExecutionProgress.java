package net.odyssi.asc4j.model;

/**
 * Gets or Sets CiExecutionProgress
 */
public enum CiExecutionProgress {

	COMPLETE("COMPLETE"),

	PENDING("PENDING"),

	RUNNING("RUNNING");

	public static CiExecutionProgress fromValue(String value) {
		for (CiExecutionProgress b : CiExecutionProgress.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	CiExecutionProgress(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
