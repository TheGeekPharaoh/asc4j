package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiBuildRunCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 8702807390331627439L;

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

	private Boolean clean;

	public CiBuildRunCreateRequestDataAttributes clean(Boolean clean) {
		this.clean = clean;
		return this;
	}

	/**
	 * Get clean
	 *
	 * @return clean
	 **/
	@JsonProperty("clean")
	public Boolean isClean() {
		return this.clean;
	}

	public void setClean(Boolean clean) {
		this.clean = clean;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiBuildRunCreateRequestDataAttributes {\n");

		sb.append("    clean: ").append(toIndentedString(this.clean)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
