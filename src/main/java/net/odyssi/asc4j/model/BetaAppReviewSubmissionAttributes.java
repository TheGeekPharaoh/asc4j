package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppReviewSubmissionAttributes implements Serializable {

	private static final long serialVersionUID = -2956466104677140425L;

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

	private BetaReviewState betaReviewState;
	private OffsetDateTime submittedDate;

	public BetaAppReviewSubmissionAttributes betaReviewState(BetaReviewState betaReviewState) {
		this.betaReviewState = betaReviewState;
		return this;
	}

	/**
	 * Get betaReviewState
	 *
	 * @return betaReviewState
	 **/
	@JsonProperty("betaReviewState")
	public BetaReviewState getBetaReviewState() {
		return this.betaReviewState;
	}

	/**
	 * Get submittedDate
	 *
	 * @return submittedDate
	 **/
	@JsonProperty("submittedDate")
	public OffsetDateTime getSubmittedDate() {
		return this.submittedDate;
	}

	public void setBetaReviewState(BetaReviewState betaReviewState) {
		this.betaReviewState = betaReviewState;
	}

	public void setSubmittedDate(OffsetDateTime submittedDate) {
		this.submittedDate = submittedDate;
	}

	public BetaAppReviewSubmissionAttributes submittedDate(OffsetDateTime submittedDate) {
		this.submittedDate = submittedDate;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppReviewSubmissionAttributes {\n");

		sb.append("    betaReviewState: ").append(toIndentedString(this.betaReviewState)).append("\n");
		sb.append("    submittedDate: ").append(toIndentedString(this.submittedDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
