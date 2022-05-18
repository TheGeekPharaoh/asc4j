package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiMacOsVersionRelationships implements Serializable {

	private static final long serialVersionUID = 1966278618627533633L;

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

	private CiMacOsVersionRelationshipsXcodeVersions xcodeVersions;

	/**
	 * Get xcodeVersions
	 *
	 * @return xcodeVersions
	 **/
	@JsonProperty("xcodeVersions")
	public CiMacOsVersionRelationshipsXcodeVersions getXcodeVersions() {
		return this.xcodeVersions;
	}

	public void setXcodeVersions(CiMacOsVersionRelationshipsXcodeVersions xcodeVersions) {
		this.xcodeVersions = xcodeVersions;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiMacOsVersionRelationships {\n");

		sb.append("    xcodeVersions: ").append(toIndentedString(this.xcodeVersions)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiMacOsVersionRelationships xcodeVersions(CiMacOsVersionRelationshipsXcodeVersions xcodeVersions) {
		this.xcodeVersions = xcodeVersions;
		return this;
	}
}
