package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiBuildActionRelationships implements Serializable {

	private static final long serialVersionUID = -3972693604350881898L;

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

	private CiBuildActionRelationshipsBuildRun buildRun;

	public CiBuildActionRelationships buildRun(CiBuildActionRelationshipsBuildRun buildRun) {
		this.buildRun = buildRun;
		return this;
	}

	/**
	 * Get buildRun
	 *
	 * @return buildRun
	 **/
	@JsonProperty("buildRun")
	public CiBuildActionRelationshipsBuildRun getBuildRun() {
		return this.buildRun;
	}

	public void setBuildRun(CiBuildActionRelationshipsBuildRun buildRun) {
		this.buildRun = buildRun;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiBuildActionRelationships {\n");

		sb.append("    buildRun: ").append(toIndentedString(this.buildRun)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
