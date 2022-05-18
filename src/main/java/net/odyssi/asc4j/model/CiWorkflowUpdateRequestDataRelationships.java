package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiWorkflowUpdateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -3090563199417697397L;

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

	private CiWorkflowUpdateRequestDataRelationshipsMacOsVersion macOsVersion;
	private CiWorkflowUpdateRequestDataRelationshipsXcodeVersion xcodeVersion;

	/**
	 * Get macOsVersion
	 *
	 * @return macOsVersion
	 **/
	@JsonProperty("macOsVersion")
	public CiWorkflowUpdateRequestDataRelationshipsMacOsVersion getMacOsVersion() {
		return this.macOsVersion;
	}

	/**
	 * Get xcodeVersion
	 *
	 * @return xcodeVersion
	 **/
	@JsonProperty("xcodeVersion")
	public CiWorkflowUpdateRequestDataRelationshipsXcodeVersion getXcodeVersion() {
		return this.xcodeVersion;
	}

	public CiWorkflowUpdateRequestDataRelationships macOsVersion(
			CiWorkflowUpdateRequestDataRelationshipsMacOsVersion macOsVersion) {
		this.macOsVersion = macOsVersion;
		return this;
	}

	public void setMacOsVersion(CiWorkflowUpdateRequestDataRelationshipsMacOsVersion macOsVersion) {
		this.macOsVersion = macOsVersion;
	}

	public void setXcodeVersion(CiWorkflowUpdateRequestDataRelationshipsXcodeVersion xcodeVersion) {
		this.xcodeVersion = xcodeVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiWorkflowUpdateRequestDataRelationships {\n");

		sb.append("    xcodeVersion: ").append(toIndentedString(this.xcodeVersion)).append("\n");
		sb.append("    macOsVersion: ").append(toIndentedString(this.macOsVersion)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiWorkflowUpdateRequestDataRelationships xcodeVersion(
			CiWorkflowUpdateRequestDataRelationshipsXcodeVersion xcodeVersion) {
		this.xcodeVersion = xcodeVersion;
		return this;
	}
}
