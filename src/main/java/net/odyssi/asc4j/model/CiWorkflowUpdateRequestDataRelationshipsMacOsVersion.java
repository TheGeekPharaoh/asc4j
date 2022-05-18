package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiWorkflowUpdateRequestDataRelationshipsMacOsVersion implements Serializable {

	private static final long serialVersionUID = 1451578662121196324L;

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

	private CiWorkflowRelationshipsMacOsVersionData data;

	public CiWorkflowUpdateRequestDataRelationshipsMacOsVersion data(CiWorkflowRelationshipsMacOsVersionData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public CiWorkflowRelationshipsMacOsVersionData getData() {
		return this.data;
	}

	public void setData(CiWorkflowRelationshipsMacOsVersionData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiWorkflowUpdateRequestDataRelationshipsMacOsVersion {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
