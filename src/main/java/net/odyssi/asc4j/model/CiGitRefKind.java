package net.odyssi.asc4j.model;

/**
 * Gets or Sets CiGitRefKind
 */
public enum CiGitRefKind {

	BRANCH("BRANCH"),

	TAG("TAG");

	public static CiGitRefKind fromValue(String value) {
		for (CiGitRefKind b : CiGitRefKind.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	CiGitRefKind(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
