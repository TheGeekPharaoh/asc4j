package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreviewSetCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -6021289198710298747L;

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

	private PreviewType previewType;

	/**
	 * Get previewType
	 *
	 * @return previewType
	 **/
	@JsonProperty("previewType")
	public PreviewType getPreviewType() {
		return this.previewType;
	}

	public AppPreviewSetCreateRequestDataAttributes previewType(PreviewType previewType) {
		this.previewType = previewType;
		return this;
	}

	public void setPreviewType(PreviewType previewType) {
		this.previewType = previewType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreviewSetCreateRequestDataAttributes {\n");

		sb.append("    previewType: ").append(toIndentedString(this.previewType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
