package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppScreenshotAttributes implements Serializable {

	private static final long serialVersionUID = -6360247097003599169L;

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

	private String assetToken;

	private String assetType;

	private String fileName;

	private Integer fileSize;

	private ImageAsset imageAsset;

	private String sourceFileChecksum;
	private List<UploadOperation> uploadOperations = null;

	public AppScreenshotAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
		this.uploadOperations.add(uploadOperationsItem);
		return this;
	}

	public AppScreenshotAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
		return this;
	}

	public AppScreenshotAttributes assetToken(String assetToken) {
		this.assetToken = assetToken;
		return this;
	}

	public AppScreenshotAttributes assetType(String assetType) {
		this.assetType = assetType;
		return this;
	}

	public AppScreenshotAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppScreenshotAttributes fileSize(Integer fileSize) {
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
	 * Get assetToken
	 *
	 * @return assetToken
	 **/
	@JsonProperty("assetToken")
	public String getAssetToken() {
		return this.assetToken;
	}

	/**
	 * Get assetType
	 *
	 * @return assetType
	 **/
	@JsonProperty("assetType")
	public String getAssetType() {
		return this.assetType;
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

	public AppScreenshotAttributes imageAsset(ImageAsset imageAsset) {
		this.imageAsset = imageAsset;
		return this;
	}

	public void setAssetDeliveryState(AppMediaAssetState assetDeliveryState) {
		this.assetDeliveryState = assetDeliveryState;
	}

	public void setAssetToken(String assetToken) {
		this.assetToken = assetToken;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
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

	public void setSourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
	}

	public void setUploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
	}

	public AppScreenshotAttributes sourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppScreenshotAttributes {\n");

		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    sourceFileChecksum: ").append(toIndentedString(this.sourceFileChecksum)).append("\n");
		sb.append("    imageAsset: ").append(toIndentedString(this.imageAsset)).append("\n");
		sb.append("    assetToken: ").append(toIndentedString(this.assetToken)).append("\n");
		sb.append("    assetType: ").append(toIndentedString(this.assetType)).append("\n");
		sb.append("    uploadOperations: ").append(toIndentedString(this.uploadOperations)).append("\n");
		sb.append("    assetDeliveryState: ").append(toIndentedString(this.assetDeliveryState)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppScreenshotAttributes uploadOperations(List<UploadOperation> uploadOperations) {
		this.uploadOperations = uploadOperations;
		return this;
	}
}
