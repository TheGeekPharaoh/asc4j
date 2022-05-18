package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventScreenshotCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 746875329357982257L;

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

	public AppEventScreenshotCreateRequestDataAttributes appEventAssetType(AppEventAssetType appEventAssetType) {
		this.appEventAssetType = appEventAssetType;
		return this;
	}

	public AppEventScreenshotCreateRequestDataAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppEventScreenshotCreateRequestDataAttributes fileSize(Integer fileSize) {
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

	public void setAppEventAssetType(AppEventAssetType appEventAssetType) {
		this.appEventAssetType = appEventAssetType;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventScreenshotCreateRequestDataAttributes {\n");

		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    appEventAssetType: ").append(toIndentedString(this.appEventAssetType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
