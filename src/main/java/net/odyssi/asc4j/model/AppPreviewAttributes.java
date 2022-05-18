package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreviewAttributes implements Serializable {

	private static final long serialVersionUID = -1044168438892488972L;

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

	private AppMediaAssetState assetDeliveryState;

	private String fileName;

	private Integer fileSize;

	private String mimeType;

	private String previewFrameTimeCode;

	private ImageAsset previewImage;

	private String sourceFileChecksum;

	private List<UploadOperation> uploadOperations = null;
	private String videoUrl;

	public AppPreviewAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
		this.uploadOperations.add(uploadOperationsItem);
		return this;
	}

	public AppPreviewAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
		return this;
	}

	public AppPreviewAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppPreviewAttributes fileSize(Integer fileSize) {
		this.fileSize = fileSize;
		return this;
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
	 * Get sourceFileChecksum
	 *
	 * @return sourceFileChecksum
	 **/
	@JsonProperty("sourceFileChecksum")
	public String getSourceFileChecksum() {
		return this.sourceFileChecksum;
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

	public AppPreviewAttributes mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	public AppPreviewAttributes previewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
		return this;
	}

	public AppPreviewAttributes previewImage(ImageAsset previewImage) {
		this.previewImage = previewImage;
		return this;
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

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public void setPreviewFrameTimeCode(String previewFrameTimeCode) {
		this.previewFrameTimeCode = previewFrameTimeCode;
	}

	public void setPreviewImage(ImageAsset previewImage) {
		this.previewImage = previewImage;
	}

	public void setSourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
	}

	public void setUploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public AppPreviewAttributes sourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreviewAttributes {\n");

		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    sourceFileChecksum: ").append(toIndentedString(this.sourceFileChecksum)).append("\n");
		sb.append("    previewFrameTimeCode: ").append(toIndentedString(this.previewFrameTimeCode)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(this.mimeType)).append("\n");
		sb.append("    videoUrl: ").append(toIndentedString(this.videoUrl)).append("\n");
		sb.append("    previewImage: ").append(toIndentedString(this.previewImage)).append("\n");
		sb.append("    uploadOperations: ").append(toIndentedString(this.uploadOperations)).append("\n");
		sb.append("    assetDeliveryState: ").append(toIndentedString(this.assetDeliveryState)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppPreviewAttributes uploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
		return this;
	}

	public AppPreviewAttributes videoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
		return this;
	}
}
