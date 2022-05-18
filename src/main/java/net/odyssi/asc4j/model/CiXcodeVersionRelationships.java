package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiXcodeVersionRelationships implements Serializable {

	private static final long serialVersionUID = -7353281103379399818L;

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

	private CiXcodeVersionRelationshipsMacOsVersions macOsVersions;

	/**
	 * Get macOsVersions
	 *
	 * @return macOsVersions
	 **/
	@JsonProperty("macOsVersions")
	public CiXcodeVersionRelationshipsMacOsVersions getMacOsVersions() {
		return this.macOsVersions;
	}

	public CiXcodeVersionRelationships macOsVersions(CiXcodeVersionRelationshipsMacOsVersions macOsVersions) {
		this.macOsVersions = macOsVersions;
		return this;
	}

	public void setMacOsVersions(CiXcodeVersionRelationshipsMacOsVersions macOsVersions) {
		this.macOsVersions = macOsVersions;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiXcodeVersionRelationships {\n");

		sb.append("    macOsVersions: ").append(toIndentedString(this.macOsVersions)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
