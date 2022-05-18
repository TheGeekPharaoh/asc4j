package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventVideoClipAttributes implements Serializable {

	private static final long serialVersionUID = -1688044036767476795L;

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

	private AppMediaAssetState assetDeliveryState;

	private String fileName;

	private Integer fileSize;

	private String previewFrameTimeCode;

	private ImageAsset previewImage;

	private List<UploadOperation> uploadOperations = null;
	private String videoUrl;

	public AppEventVideoClipAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
		this.uploadOperations.add(uploadOperationsItem);
		return this;
	}

	public AppEventVideoClipAttributes appEventAssetType(AppEventAssetType appEventAssetType) {
		this.appEventAssetType = appEventAssetType;
		return this;
	}

	public AppEventVideoClipAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
		return this;
	}

	public AppEventVideoClipAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppEventVideoClipAttributes fileSize(Integer fileSize) {
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
	 * Get assetDeliveryState
	 *
	 * @return assetDeliveryState
	 **/
	@JsonProperty("assetDeliveryState")
	public AppMediaAssetState getAssetDeliveryState() {
		return this.assetDeliveryState;
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

	/**
	 * Get previewImage
	 *
	 * @return previewImage
	 **/
	@JsonProperty("previewImage")
	public ImageAsset getPreviewImage() {
		return this.previewImage;
	}

	/**
	 * Get uploadOperations
	 *
	 * @return uploadOperations
	 **/
	@JsonProperty("uploadOperations")
	public List<UploadOperation> getUploadOperations() {
		return this.uploadOperations;
	}

	/**
	 * Get videoUrl
	 *
	 * @return videoUrl
	 **/
	@JsonProperty("videoUrl")
	public String getVideoUrl() {
		return this.videoUrl;
	}

	public AppEventVideoClipAttributes previewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
		return this;
	}

	public AppEventVideoClipAttributes previewImage(ImageAsset previewImage) {
		this.previewImage = previewImage;
		return this;
	}

	public void setAppEventAssetType(AppEventAssetType appEventAssetType) {
		this.appEventAssetType = appEventAssetType;
	}

	public void setAssetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
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

	public void setPreviewImage(ImageAsset previewImage) {
		this.previewImage = previewImage;
	}

	public void setUploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventVideoClipAttributes {\n");

		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    previewFrameTimeCode: ").append(toIndentedString(this.previewFrameTimeCode)).append("\n");
		sb.append("    videoUrl: ").append(toIndentedString(this.videoUrl)).append("\n");
		sb.append("    previewImage: ").append(toIndentedString(this.previewImage)).append("\n");
		sb.append("    uploadOperations: ").append(toIndentedString(this.uploadOperations)).append("\n");
		sb.append("    assetDeliveryState: ").append(toIndentedString(this.assetDeliveryState)).append("\n");
		sb.append("    appEventAssetType: ").append(toIndentedString(this.appEventAssetType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppEventVideoClipAttributes uploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
		return this;
	}

	public AppEventVideoClipAttributes videoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
		return this;
	}
}
