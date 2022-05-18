package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FileLocation implements Serializable {

	private static final long serialVersionUID = -7264202681090499301L;

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

	private Integer lineNumber;
	private String path;

	/**
	 * Get lineNumber
	 *
	 * @return lineNumber
	 **/
	@JsonProperty("lineNumber")
	public Integer getLineNumber() {
		return this.lineNumber;
	}

	/**
	 * Get path
	 *
	 * @return path
	 **/
	@JsonProperty("path")
	public String getPath() {
		return this.path;
	}

	public FileLocation lineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}

	public FileLocation path(String path) {
		this.path = path;
		return this;
	}

	public void setLineNumber(Integer lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileLocation {\n");

		sb.append("    path: ").append(toIndentedString(this.path)).append("\n");
		sb.append("    lineNumber: ").append(toIndentedString(this.lineNumber)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
