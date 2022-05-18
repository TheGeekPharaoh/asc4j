package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HttpHeader implements Serializable {

	private static final long serialVersionUID = -1213154564567622749L;

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

	private String name;
	private String value;

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get value
	 *
	 * @return value
	 **/
	@JsonProperty("value")
	public String getValue() {
		return this.value;
	}

	public HttpHeader name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HttpHeader {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    value: ").append(toIndentedString(this.value)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public HttpHeader value(String value) {
		this.value = value;
		return this;
	}
}
