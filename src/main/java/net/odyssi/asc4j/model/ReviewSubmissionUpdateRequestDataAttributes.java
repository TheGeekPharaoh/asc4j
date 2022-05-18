package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewSubmissionUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -478881149350003585L;

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

	private Boolean canceled;
	private Boolean submitted;

	public ReviewSubmissionUpdateRequestDataAttributes canceled(Boolean canceled) {
		this.canceled = canceled;
		return this;
	}

	/**
	 * Get canceled
	 *
	 * @return canceled
	 **/
	@JsonProperty("canceled")
	public Boolean isCanceled() {
		return this.canceled;
	}

	/**
	 * Get submitted
	 *
	 * @return submitted
	 **/
	@JsonProperty("submitted")
	public Boolean isSubmitted() {
		return this.submitted;
	}

	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}

	public void setSubmitted(Boolean submitted) {
		this.submitted = submitted;
	}

	public ReviewSubmissionUpdateRequestDataAttributes submitted(Boolean submitted) {
		this.submitted = submitted;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReviewSubmissionUpdateRequestDataAttributes {\n");

		sb.append("    submitted: ").append(toIndentedString(this.submitted)).append("\n");
		sb.append("    canceled: ").append(toIndentedString(this.canceled)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
