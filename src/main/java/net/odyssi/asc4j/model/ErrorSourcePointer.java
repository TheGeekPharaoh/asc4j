package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorSourcePointer implements Serializable {

	private static final long serialVersionUID = 7714404592031534690L;

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

	private String pointer;

	/**
	 * Get pointer
	 *
	 * @return pointer
	 **/
	@JsonProperty("pointer")
	public String getPointer() {
		return this.pointer;
	}

	public ErrorSourcePointer pointer(String pointer) {
		this.pointer = pointer;
		return this;
	}

	public void setPointer(String pointer) {
		this.pointer = pointer;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorSourcePointer {\n");

		sb.append("    pointer: ").append(toIndentedString(this.pointer)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
