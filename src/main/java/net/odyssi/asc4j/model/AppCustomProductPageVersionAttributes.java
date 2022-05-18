package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageVersionAttributes implements Serializable {

	public enum StateEnum {

		ACCEPTED(String.valueOf("ACCEPTED")), APPROVED(String.valueOf("APPROVED")),
		IN_REVIEW(String.valueOf("IN_REVIEW")), PREPARE_FOR_SUBMISSION(String.valueOf("PREPARE_FOR_SUBMISSION")),
		READY_FOR_REVIEW(String.valueOf("READY_FOR_REVIEW")), REJECTED(String.valueOf("REJECTED")),
		REPLACED_WITH_NEW_VERSION(String.valueOf("REPLACED_WITH_NEW_VERSION")),
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

	private static final long serialVersionUID = 3556638302588585693L;

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
	private String version;

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
	 * Get version
	 *
	 * @return version
	 **/
	@JsonProperty("version")
	public String getVersion() {
		return this.version;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public AppCustomProductPageVersionAttributes state(StateEnum state) {
		this.state = state;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageVersionAttributes {\n");

		sb.append("    version: ").append(toIndentedString(this.version)).append("\n");
		sb.append("    state: ").append(toIndentedString(this.state)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppCustomProductPageVersionAttributes version(String version) {
		this.version = version;
		return this;
	}
}
