package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventScreenshotAttributes implements Serializable {

	private static final long serialVersionUID = 6999744905639121630L;

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

	private String assetToken;

	private String fileName;

	private Integer fileSize;

	private ImageAsset imageAsset;
	private List<UploadOperation> uploadOperations = null;

	public AppEventScreenshotAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
		this.uploadOperations.add(uploadOperationsItem);
		return this;
	}

	public AppEventScreenshotAttributes appEventAssetType(AppEventAssetType appEventAssetType) {
		this.appEventAssetType = appEventAssetType;
		return this;
	}

	public AppEventScreenshotAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
		return this;
	}

	public AppEventScreenshotAttributes assetToken(String assetToken) {
		this.assetToken = assetToken;
		return this;
	}

	public AppEventScreenshotAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppEventScreenshotAttributes fileSize(Integer fileSize) {
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
	 * Get assetToken
	 *
	 * @return assetToken
	 **/
	@JsonProperty("assetToken")
	public String getAssetToken() {
		return this.assetToken;
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
	 * Get imageAsset
	 *
	 * @return imageAsset
	 **/
	@JsonProperty("imageAsset")
	public ImageAsset getImageAsset() {
		return this.imageAsset;
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

	public AppEventScreenshotAttributes imageAsset(ImageAsset imageAsset) {
		this.imageAsset = imageAsset;
		return this;
	}

	public void setAppEventAssetType(AppEventAssetType appEventAssetType) {
		this.appEventAssetType = appEventAssetType;
	}

	public void setAssetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
	}

	public void setAssetToken(String assetToken) {
		this.assetToken = assetToken;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public void setImageAsset(ImageAsset imageAsset) {
		this.imageAsset = imageAsset;
	}

	public void setUploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventScreenshotAttributes {\n");

		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    imageAsset: ").append(toIndentedString(this.imageAsset)).append("\n");
		sb.append("    assetToken: ").append(toIndentedString(this.assetToken)).append("\n");
		sb.append("    uploadOperations: ").append(toIndentedString(this.uploadOperations)).append("\n");
		sb.append("    assetDeliveryState: ").append(toIndentedString(this.assetDeliveryState)).append("\n");
		sb.append("    appEventAssetType: ").append(toIndentedString(this.appEventAssetType)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppEventScreenshotAttributes uploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
		return this;
	}
}
