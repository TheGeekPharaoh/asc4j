package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewSubmissionAttributes implements Serializable {

	public enum StateEnum {

		CANCELING(String.valueOf("CANCELING")), COMPLETE(String.valueOf("COMPLETE")),
		COMPLETING(String.valueOf("COMPLETING")), IN_REVIEW(String.valueOf("IN_REVIEW")),
		READY_FOR_REVIEW(String.valueOf("READY_FOR_REVIEW")), UNRESOLVED_ISSUES(String.valueOf("UNRESOLVED_ISSUES")),
		WAITING_FOR_REVIEW(String.valueOf("WAITING_FOR_REVIEW"));

		public static StateEnum fromValue(String value) {
			for (StateEnum b : StateEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		StateEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = 6429063021836686976L;

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

	private Platform platform;

	private StateEnum state;
	private OffsetDateTime submittedDate;

	/**
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public Platform getPlatform() {
		return this.platform;
	}

	/**
	 * Get state
	 *
	 * @return state
	 **/
	@JsonProperty("state")
	public String getState() {
		if (this.state == null) {
			return null;
		}
		return this.state.value();
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

	public ReviewSubmissionAttributes platform(Platform platform) {
		this.platform = platform;
		return this;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}

	public void setSubmittedDate(OffsetDateTime submittedDate) {
		this.submittedDate = submittedDate;
	}

	public ReviewSubmissionAttributes state(StateEnum state) {
		this.state = state;
		return this;
	}

	public ReviewSubmissionAttributes submittedDate(OffsetDateTime submittedDate) {
		this.submittedDate = submittedDate;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReviewSubmissionAttributes {\n");

		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    submittedDate: ").append(toIndentedString(this.submittedDate)).append("\n");
		sb.append("    state: ").append(toIndentedString(this.state)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
