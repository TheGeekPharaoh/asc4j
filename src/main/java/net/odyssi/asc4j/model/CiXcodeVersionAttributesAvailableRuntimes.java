package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiXcodeVersionAttributesAvailableRuntimes implements Serializable {

	private static final long serialVersionUID = 9029828857521861038L;

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

	private String runtimeIdentifier;
	private String runtimeName;

	/**
	 * Get runtimeIdentifier
	 *
	 * @return runtimeIdentifier
	 **/
	@JsonProperty("runtimeIdentifier")
	public String getRuntimeIdentifier() {
		return this.runtimeIdentifier;
	}

	/**
	 * Get runtimeName
	 *
	 * @return runtimeName
	 **/
	@JsonProperty("runtimeName")
	public String getRuntimeName() {
		return this.runtimeName;
	}

	public CiXcodeVersionAttributesAvailableRuntimes runtimeIdentifier(String runtimeIdentifier) {
		this.runtimeIdentifier = runtimeIdentifier;
		return this;
	}

	public CiXcodeVersionAttributesAvailableRuntimes runtimeName(String runtimeName) {
		this.runtimeName = runtimeName;
		return this;
	}

	public void setRuntimeIdentifier(String runtimeIdentifier) {
		this.runtimeIdentifier = runtimeIdentifier;
	}

	public void setRuntimeName(String runtimeName) {
		this.runtimeName = runtimeName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiXcodeVersionAttributesAvailableRuntimes {\n");

		sb.append("    runtimeName: ").append(toIndentedString(this.runtimeName)).append("\n");
		sb.append("    runtimeIdentifier: ").append(toIndentedString(this.runtimeIdentifier)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
