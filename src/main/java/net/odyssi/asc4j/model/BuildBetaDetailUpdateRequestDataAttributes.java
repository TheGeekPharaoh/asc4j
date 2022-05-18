package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildBetaDetailUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 7272771016408800004L;

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

	private Boolean autoNotifyEnabled;

	public BuildBetaDetailUpdateRequestDataAttributes autoNotifyEnabled(Boolean autoNotifyEnabled) {
		this.autoNotifyEnabled = autoNotifyEnabled;
		return this;
	}

	/**
	 * Get autoNotifyEnabled
	 *
	 * @return autoNotifyEnabled
	 **/
	@JsonProperty("autoNotifyEnabled")
	public Boolean isAutoNotifyEnabled() {
		return this.autoNotifyEnabled;
	}

	public void setAutoNotifyEnabled(Boolean autoNotifyEnabled) {
		this.autoNotifyEnabled = autoNotifyEnabled;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildBetaDetailUpdateRequestDataAttributes {\n");

		sb.append("    autoNotifyEnabled: ").append(toIndentedString(this.autoNotifyEnabled)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
