package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewSubmissionItemUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -2121801516566631371L;

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

	private Boolean removed;
	private Boolean resolved;

	/**
	 * Get removed
	 *
	 * @return removed
	 **/
	@JsonProperty("removed")
	public Boolean isRemoved() {
		return this.removed;
	}

	/**
	 * Get resolved
	 *
	 * @return resolved
	 **/
	@JsonProperty("resolved")
	public Boolean isResolved() {
		return this.resolved;
	}

	public ReviewSubmissionItemUpdateRequestDataAttributes removed(Boolean removed) {
		this.removed = removed;
		return this;
	}

	public ReviewSubmissionItemUpdateRequestDataAttributes resolved(Boolean resolved) {
		this.resolved = resolved;
		return this;
	}

	public void setRemoved(Boolean removed) {
		this.removed = removed;
	}

	public void setResolved(Boolean resolved) {
		this.resolved = resolved;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReviewSubmissionItemUpdateRequestDataAttributes {\n");

		sb.append("    resolved: ").append(toIndentedString(this.resolved)).append("\n");
		sb.append("    removed: ").append(toIndentedString(this.removed)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
