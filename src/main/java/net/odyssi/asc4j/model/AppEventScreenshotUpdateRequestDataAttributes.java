package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventScreenshotUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -6365432759665060961L;

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

	private Boolean uploaded;

	/**
	 * Get uploaded
	 *
	 * @return uploaded
	 **/
	@JsonProperty("uploaded")
	public Boolean isUploaded() {
		return this.uploaded;
	}

	public void setUploaded(Boolean uploaded) {
		this.uploaded = uploaded;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventScreenshotUpdateRequestDataAttributes {\n");

		sb.append("    uploaded: ").append(toIndentedString(this.uploaded)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppEventScreenshotUpdateRequestDataAttributes uploaded(Boolean uploaded) {
		this.uploaded = uploaded;
		return this;
	}
}
