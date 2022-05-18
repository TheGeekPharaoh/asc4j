package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorSourceParameter implements Serializable {

	private static final long serialVersionUID = 7965743419271261510L;

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

	private String parameter;

	/**
	 * Get parameter
	 *
	 * @return parameter
	 **/
	@JsonProperty("parameter")
	public String getParameter() {
		return this.parameter;
	}

	public ErrorSourceParameter parameter(String parameter) {
		this.parameter = parameter;
		return this;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorSourceParameter {\n");

		sb.append("    parameter: ").append(toIndentedString(this.parameter)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
