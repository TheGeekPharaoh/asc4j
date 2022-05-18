package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceAttributes implements Serializable {

	private static final long serialVersionUID = -3428782753435462149L;

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

	private AppClipAction action;

	public AppClipDefaultExperienceAttributes action(AppClipAction action) {
		this.action = action;
		return this;
	}

	/**
	 * Get action
	 *
	 * @return action
	 **/
	@JsonProperty("action")
	public AppClipAction getAction() {
		return this.action;
	}

	public void setAction(AppClipAction action) {
		this.action = action;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceAttributes {\n");

		sb.append("    action: ").append(toIndentedString(this.action)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
