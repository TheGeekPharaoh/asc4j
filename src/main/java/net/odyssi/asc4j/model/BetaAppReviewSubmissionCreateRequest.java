package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppReviewSubmissionCreateRequest implements Serializable {

	private static final long serialVersionUID = -1373348052778027966L;

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

	private BetaAppReviewSubmissionCreateRequestData data;

	public BetaAppReviewSubmissionCreateRequest data(BetaAppReviewSubmissionCreateRequestData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public BetaAppReviewSubmissionCreateRequestData getData() {
		return this.data;
	}

	public void setData(BetaAppReviewSubmissionCreateRequestData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppReviewSubmissionCreateRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
