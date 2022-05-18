package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventVideoClipCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -4259755352368625552L;

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

	private AppEventAssetType appEventAssetType;

	private String fileName;

	private Integer fileSize;
	private String previewFrameTimeCode;

	public AppEventVideoClipCreateRequestDataAttributes appEventAssetType(AppEventAssetType appEventAssetType) {
		this.appEventAssetType = appEventAssetType;
		return this;
	}

	public AppEventVideoClipCreateRequestDataAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppEventVideoClipCreateRequestDataAttributes fileSize(Integer fileSize) {
		this.fileSize = fileSize;
		return this;
	}

	/**
	 * Get appEventAssetType
	 *
	 * @return appEventAssetType
	 **/
	@JsonProperty("appEventAssetType")
	public AppEventAssetType getAppEventAssetType() {
		return this.appEventAssetType;
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
	 * Get previewFrameTimeCode
	 *
	 * @return previewFrameTimeCode
	 **/
	@JsonProperty("previewFrameTimeCode")
	public String getPreviewFrameTimeCode() {
		return this.previewFrameTimeCode;
	}

	public AppEventVideoClipCreateRequestDataAttributes previewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
		return this;
	}

	public void setAppEventAssetType(AppEventAssetType appEventAssetType) {
		this.appEventAssetType = appEventAssetType;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public void setPreviewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventVideoClipCreateRequestDataAttributes {\n");

		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    previewFrameTimeCode: ").append(toIndentedString(this.previewFrameTimeCode)).append("\n");
		sb.append("    appEventAssetType: ").append(toIndentedString(this.appEventAssetType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
