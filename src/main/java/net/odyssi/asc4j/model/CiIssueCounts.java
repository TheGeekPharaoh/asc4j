package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiIssueCounts implements Serializable {

	private static final long serialVersionUID = 1012066074958102066L;

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

	private Integer analyzerWarnings;

	private Integer errors;

	private Integer testFailures;
	private Integer warnings;

	public CiIssueCounts analyzerWarnings(Integer analyzerWarnings) {
		this.analyzerWarnings = analyzerWarnings;
		return this;
	}

	public CiIssueCounts errors(Integer errors) {
		this.errors = errors;
		return this;
	}

	/**
	 * Get analyzerWarnings
	 *
	 * @return analyzerWarnings
	 **/
	@JsonProperty("analyzerWarnings")
	public Integer getAnalyzerWarnings() {
		return this.analyzerWarnings;
	}

	/**
	 * Get errors
	 *
	 * @return errors
	 **/
	@JsonProperty("errors")
	public Integer getErrors() {
		return this.errors;
	}

	/**
	 * Get testFailures
	 *
	 * @return testFailures
	 **/
	@JsonProperty("testFailures")
	public Integer getTestFailures() {
		return this.testFailures;
	}

	/**
	 * Get warnings
	 *
	 * @return warnings
	 **/
	@JsonProperty("warnings")
	public Integer getWarnings() {
		return this.warnings;
	}

	public void setAnalyzerWarnings(Integer analyzerWarnings) {
		this.analyzerWarnings = analyzerWarnings;
	}

	public void setErrors(Integer errors) {
		this.errors = errors;
	}

	public void setTestFailures(Integer testFailures) {
		this.testFailures = testFailures;
	}

	public void setWarnings(Integer warnings) {
		this.warnings = warnings;
	}

	public CiIssueCounts testFailures(Integer testFailures) {
		this.testFailures = testFailures;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiIssueCounts {\n");

		sb.append("    analyzerWarnings: ").append(toIndentedString(this.analyzerWarnings)).append("\n");
		sb.append("    errors: ").append(toIndentedString(this.errors)).append("\n");
		sb.append("    testFailures: ").append(toIndentedString(this.testFailures)).append("\n");
		sb.append("    warnings: ").append(toIndentedString(this.warnings)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiIssueCounts warnings(Integer warnings) {
		this.warnings = warnings;
		return this;
	}
}
