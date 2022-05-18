package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiBranchPatternsPatterns implements Serializable {

	private static final long serialVersionUID = -9083828442377943799L;

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	private Boolean isPrefix;
	private String pattern;

	/**
	 * Get pattern
	 *
	 * @return pattern
	 **/
	@JsonProperty("pattern")
	public String getPattern() {
		return this.pattern;
	}

	/**
	 * Get isPrefix
	 *
	 * @return isPrefix
	 **/
	@JsonProperty("isPrefix")
	public Boolean isIsPrefix() {
		return this.isPrefix;
	}

	public CiBranchPatternsPatterns isPrefix(Boolean isPrefix) {
		this.isPrefix = isPrefix;
		return this;
	}

	public CiBranchPatternsPatterns pattern(String pattern) {
		this.pattern = pattern;
		return this;
	}

	public void setIsPrefix(Boolean isPrefix) {
		this.isPrefix = isPrefix;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiBranchPatternsPatterns {\n");

		sb.append("    pattern: ").append(toIndentedString(this.pattern)).append("\n");
		sb.append("    isPrefix: ").append(toIndentedString(this.isPrefix)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
