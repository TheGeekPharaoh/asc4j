package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse implements Serializable {

	private static final long serialVersionUID = 3064580384470701465L;

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

	private List<ErrorResponseErrors> errors = null;

	public ErrorResponse addErrorsItem(ErrorResponseErrors errorsItem) {
		this.errors.add(errorsItem);
		return this;
	}

	public ErrorResponse errors(List<ErrorResponseErrors> errors) {
		this.errors = errors;
		return this;
	}

	/**
	 * Get errors
	 *
	 * @return errors
	 **/
	@JsonProperty("errors")
	public List<ErrorResponseErrors> getErrors() {
		return this.errors;
	}

	public void setErrors(List<ErrorResponseErrors> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorResponse {\n");

		sb.append("    errors: ").append(toIndentedString(this.errors)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
