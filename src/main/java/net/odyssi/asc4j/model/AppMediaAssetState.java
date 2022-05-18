package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppMediaAssetState implements Serializable {

	public enum StateEnum {

		AWAITING_UPLOAD(String.valueOf("AWAITING_UPLOAD")), COMPLETE(String.valueOf("COMPLETE")),
		FAILED(String.valueOf("FAILED")), UPLOAD_COMPLETE(String.valueOf("UPLOAD_COMPLETE"));

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

	private static final long serialVersionUID = -7178164485886837078L;

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

	private List<AppMediaStateError> errors = null;

	private StateEnum state;
	private List<AppMediaStateError> warnings = null;

	public AppMediaAssetState addErrorsItem(AppMediaStateError errorsItem) {
		this.errors.add(errorsItem);
		return this;
	}

	public AppMediaAssetState addWarningsItem(AppMediaStateError warningsItem) {
		this.warnings.add(warningsItem);
		return this;
	}

	public AppMediaAssetState errors(List<AppMediaStateError> errors) {
		this.errors = errors;
		return this;
	}

	/**
	 * Get errors
	 *
	 * @return errors
	 **/
	@JsonProperty("errors")
	public List<AppMediaStateError> getErrors() {
		return this.errors;
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
	 * Get warnings
	 *
	 * @return warnings
	 **/
	@JsonProperty("warnings")
	public List<AppMediaStateError> getWarnings() {
		return this.warnings;
	}

	public void setErrors(List<AppMediaStateError> errors) {
		this.errors = errors;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}

	public void setWarnings(List<AppMediaStateError> warnings) {
		this.warnings = warnings;
	}

	public AppMediaAssetState state(StateEnum state) {
		this.state = state;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppMediaAssetState {\n");

		sb.append("    errors: ").append(toIndentedString(this.errors)).append("\n");
		sb.append("    warnings: ").append(toIndentedString(this.warnings)).append("\n");
		sb.append("    state: ").append(toIndentedString(this.state)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppMediaAssetState warnings(List<AppMediaStateError> warnings) {
		this.warnings = warnings;
		return this;
	}
}
