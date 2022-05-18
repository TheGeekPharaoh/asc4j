package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiTagPatterns implements Serializable {

	private static final long serialVersionUID = -3167546278093194655L;

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

	private Boolean isAllMatch;
	private List<CiBranchPatternsPatterns> patterns = null;

	public CiTagPatterns addPatternsItem(CiBranchPatternsPatterns patternsItem) {
		this.patterns.add(patternsItem);
		return this;
	}

	/**
	 * Get patterns
	 *
	 * @return patterns
	 **/
	@JsonProperty("patterns")
	public List<CiBranchPatternsPatterns> getPatterns() {
		return this.patterns;
	}

	public CiTagPatterns isAllMatch(Boolean isAllMatch) {
		this.isAllMatch = isAllMatch;
		return this;
	}

	/**
	 * Get isAllMatch
	 *
	 * @return isAllMatch
	 **/
	@JsonProperty("isAllMatch")
	public Boolean isIsAllMatch() {
		return this.isAllMatch;
	}

	public CiTagPatterns patterns(List<CiBranchPatternsPatterns> patterns) {
		this.patterns = patterns;
		return this;
	}

	public void setIsAllMatch(Boolean isAllMatch) {
		this.isAllMatch = isAllMatch;
	}

	public void setPatterns(List<CiBranchPatternsPatterns> patterns) {
		this.patterns = patterns;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiTagPatterns {\n");

		sb.append("    isAllMatch: ").append(toIndentedString(this.isAllMatch)).append("\n");
		sb.append("    patterns: ").append(toIndentedString(this.patterns)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
