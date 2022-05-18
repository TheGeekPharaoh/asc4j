package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResourceLinks implements Serializable {

	private static final long serialVersionUID = 9115030443689679738L;

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

	private String self;

	/**
	 * Get self
	 *
	 * @return self
	 **/
	@JsonProperty("self")
	public String getSelf() {
		return this.self;
	}

	public ResourceLinks self(String self) {
		this.self = self;
		return this;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ResourceLinks {\n");

		sb.append("    self: ").append(toIndentedString(this.self)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
