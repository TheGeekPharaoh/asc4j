package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiIssueAttributes implements Serializable {

	public enum IssueTypeEnum {

		ANALYZER_WARNING(String.valueOf("ANALYZER_WARNING")), ERROR(String.valueOf("ERROR")),
		TEST_FAILURE(String.valueOf("TEST_FAILURE")), WARNING(String.valueOf("WARNING"));

		public static IssueTypeEnum fromValue(String value) {
			for (IssueTypeEnum b : IssueTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		IssueTypeEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = 174637423217456768L;

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

	private String category;

	private FileLocation fileSource;

	private IssueTypeEnum issueType;
	private String message;

	public CiIssueAttributes category(String category) {
		this.category = category;
		return this;
	}

	public CiIssueAttributes fileSource(FileLocation fileSource) {
		this.fileSource = fileSource;
		return this;
	}

	/**
	 * Get category
	 *
	 * @return category
	 **/
	@JsonProperty("category")
	public String getCategory() {
		return this.category;
	}

	/**
	 * Get fileSource
	 *
	 * @return fileSource
	 **/
	@JsonProperty("fileSource")
	public FileLocation getFileSource() {
		return this.fileSource;
	}

	/**
	 * Get issueType
	 *
	 * @return issueType
	 **/
	@JsonProperty("issueType")
	public String getIssueType() {
		if (this.issueType == null) {
			return null;
		}
		return this.issueType.value();
	}

	/**
	 * Get message
	 *
	 * @return message
	 **/
	@JsonProperty("message")
	public String getMessage() {
		return this.message;
	}

	public CiIssueAttributes issueType(IssueTypeEnum issueType) {
		this.issueType = issueType;
		return this;
	}

	public CiIssueAttributes message(String message) {
		this.message = message;
		return this;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setFileSource(FileLocation fileSource) {
		this.fileSource = fileSource;
	}

	public void setIssueType(IssueTypeEnum issueType) {
		this.issueType = issueType;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiIssueAttributes {\n");

		sb.append("    issueType: ").append(toIndentedString(this.issueType)).append("\n");
		sb.append("    message: ").append(toIndentedString(this.message)).append("\n");
		sb.append("    fileSource: ").append(toIndentedString(this.fileSource)).append("\n");
		sb.append("    category: ").append(toIndentedString(this.category)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
