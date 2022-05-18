package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppMediaStateError implements Serializable {

	private static final long serialVersionUID = -227444756519480783L;

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

	private String code;
	private String description;

	public AppMediaStateError code(String code) {
		this.code = code;
		return this;
	}

	public AppMediaStateError description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get code
	 *
	 * @return code
	 **/
	@JsonProperty("code")
	public String getCode() {
		return this.code;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppMediaStateError {\n");

		sb.append("    code: ").append(toIndentedString(this.code)).append("\n");
		sb.append("    description: ").append(toIndentedString(this.description)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
