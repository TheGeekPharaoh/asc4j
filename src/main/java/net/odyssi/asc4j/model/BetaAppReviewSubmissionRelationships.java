package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppReviewSubmissionRelationships implements Serializable {

	private static final long serialVersionUID = -1079853119279457345L;

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

	private AppStoreVersionRelationshipsBuild build;

	public BetaAppReviewSubmissionRelationships build(AppStoreVersionRelationshipsBuild build) {
		this.build = build;
		return this;
	}

	/**
	 * Get build
	 *
	 * @return build
	 **/
	@JsonProperty("build")
	public AppStoreVersionRelationshipsBuild getBuild() {
		return this.build;
	}

	public void setBuild(AppStoreVersionRelationshipsBuild build) {
		this.build = build;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppReviewSubmissionRelationships {\n");

		sb.append("    build: ").append(toIndentedString(this.build)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
