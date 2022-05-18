package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiMacOsVersionAttributes implements Serializable {

	private static final long serialVersionUID = 1749457053457367840L;

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
	private String version;

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
	 * Get version
	 *
	 * @return version
	 **/
	@JsonProperty("version")
	public String getVersion() {
		return this.version;
	}

	public CiMacOsVersionAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiMacOsVersionAttributes {\n");

		sb.append("    version: ").append(toIndentedString(this.version)).append("\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiMacOsVersionAttributes version(String version) {
		this.version = version;
		return this;
	}
}
