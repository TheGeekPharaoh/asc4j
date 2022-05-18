package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventVideoClipUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 419766911786474953L;

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

	private String previewFrameTimeCode;
	private Boolean uploaded;

	/**
	 * Get previewFrameTimeCode
	 *
	 * @return previewFrameTimeCode
	 **/
	@JsonProperty("previewFrameTimeCode")
	public String getPreviewFrameTimeCode() {
		return this.previewFrameTimeCode;
	}

	/**
	 * Get uploaded
	 *
	 * @return uploaded
	 **/
	@JsonProperty("uploaded")
	public Boolean isUploaded() {
		return this.uploaded;
	}

	public AppEventVideoClipUpdateRequestDataAttributes previewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
		return this;
	}

	public void setPreviewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
	}

	public void setUploaded(Boolean uploaded) {
		this.uploaded = uploaded;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventVideoClipUpdateRequestDataAttributes {\n");

		sb.append("    previewFrameTimeCode: ").append(toIndentedString(this.previewFrameTimeCode)).append("\n");
		sb.append("    uploaded: ").append(toIndentedString(this.uploaded)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppEventVideoClipUpdateRequestDataAttributes uploaded(Boolean uploaded) {
		this.uploaded = uploaded;
		return this;
	}
}
