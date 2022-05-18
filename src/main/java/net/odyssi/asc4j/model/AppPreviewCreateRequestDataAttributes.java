package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreviewCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 4786655280076106350L;

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

	private String fileName;

	private Integer fileSize;

	private String mimeType;
	private String previewFrameTimeCode;

	public AppPreviewCreateRequestDataAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppPreviewCreateRequestDataAttributes fileSize(Integer fileSize) {
		this.fileSize = fileSize;
		return this;
	}

	/**
	 * Get fileName
	 *
	 * @return fileName
	 **/
	@JsonProperty("fileName")
	public String getFileName() {
		return this.fileName;
	}

	/**
	 * Get fileSize
	 *
	 * @return fileSize
	 **/
	@JsonProperty("fileSize")
	public Integer getFileSize() {
		return this.fileSize;
	}

	/**
	 * Get mimeType
	 *
	 * @return mimeType
	 **/
	@JsonProperty("mimeType")
	public String getMimeType() {
		return this.mimeType;
	}

	/**
	 * Get previewFrameTimeCode
	 *
	 * @return previewFrameTimeCode
	 **/
	@JsonProperty("previewFrameTimeCode")
	public String getPreviewFrameTimeCode() {
		return this.previewFrameTimeCode;
	}

	public AppPreviewCreateRequestDataAttributes mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	public AppPreviewCreateRequestDataAttributes previewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
		return this;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public void setPreviewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreviewCreateRequestDataAttributes {\n");

		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    previewFrameTimeCode: ").append(toIndentedString(this.previewFrameTimeCode)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(this.mimeType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
