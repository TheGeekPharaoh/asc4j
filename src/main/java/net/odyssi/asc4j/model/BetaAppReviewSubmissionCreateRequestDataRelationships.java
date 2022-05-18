package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppReviewSubmissionCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 3672222981508515875L;

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

	private BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild build;

	public BetaAppReviewSubmissionCreateRequestDataRelationships build(
			BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild build) {
		this.build = build;
		return this;
	}

	/**
	 * Get build
	 *
	 * @return build
	 **/
	@JsonProperty("build")
	public BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild getBuild() {
		return this.build;
	}

	public void setBuild(BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild build) {
		this.build = build;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppReviewSubmissionCreateRequestDataRelationships {\n");

		sb.append("    build: ").append(toIndentedString(this.build)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
