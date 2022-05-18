package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewSubmissionItemAttributes implements Serializable {

	public enum StateEnum {

		ACCEPTED(String.valueOf("ACCEPTED")), APPROVED(String.valueOf("APPROVED")),
		READY_FOR_REVIEW(String.valueOf("READY_FOR_REVIEW")), REJECTED(String.valueOf("REJECTED")),
		REMOVED(String.valueOf("REMOVED"));

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

	private static final long serialVersionUID = -9152440602672109105L;

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

	private StateEnum state;

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

	public void setState(StateEnum state) {
		this.state = state;
	}

	public ReviewSubmissionItemAttributes state(StateEnum state) {
		this.state = state;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReviewSubmissionItemAttributes {\n");

		sb.append("    state: ").append(toIndentedString(this.state)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
