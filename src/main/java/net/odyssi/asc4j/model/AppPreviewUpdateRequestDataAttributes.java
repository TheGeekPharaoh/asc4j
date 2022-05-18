package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreviewUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -5025533382130322105L;

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

	private String sourceFileChecksum;
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
	 * Get sourceFileChecksum
	 *
	 * @return sourceFileChecksum
	 **/
	@JsonProperty("sourceFileChecksum")
	public String getSourceFileChecksum() {
		return this.sourceFileChecksum;
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

	public AppPreviewUpdateRequestDataAttributes previewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
		return this;
	}

	public void setPreviewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
	}

	public void setSourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
	}

	public void setUploaded(Boolean uploaded) {
		this.uploaded = uploaded;
	}

	public AppPreviewUpdateRequestDataAttributes sourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreviewUpdateRequestDataAttributes {\n");

		sb.append("    sourceFileChecksum: ").append(toIndentedString(this.sourceFileChecksum)).append("\n");
		sb.append("    previewFrameTimeCode: ").append(toIndentedString(this.previewFrameTimeCode)).append("\n");
		sb.append("    uploaded: ").append(toIndentedString(this.uploaded)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppPreviewUpdateRequestDataAttributes uploaded(Boolean uploaded) {
		this.uploaded = uploaded;
		return this;
	}
}
