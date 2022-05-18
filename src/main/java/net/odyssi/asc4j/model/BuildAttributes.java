package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildAttributes implements Serializable {

	public enum ProcessingStateEnum {

		FAILED(String.valueOf("FAILED")), INVALID(String.valueOf("INVALID")), PROCESSING(String.valueOf("PROCESSING")),
		VALID(String.valueOf("VALID"));

		public static ProcessingStateEnum fromValue(String value) {
			for (ProcessingStateEnum b : ProcessingStateEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ProcessingStateEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = -1167985873160828713L;

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

	private BuildAudienceType buildAudienceType;

	private String computedMinMacOsVersion;

	private OffsetDateTime expirationDate;

	private Boolean expired;

	private ImageAsset iconAssetToken;

	private String lsMinimumSystemVersion;

	private String minOsVersion;

	private ProcessingStateEnum processingState;

	private OffsetDateTime uploadedDate;

	private Boolean usesNonExemptEncryption;
	private String version;

	public BuildAttributes buildAudienceType(BuildAudienceType buildAudienceType) {
		this.buildAudienceType = buildAudienceType;
		return this;
	}

	public BuildAttributes computedMinMacOsVersion(String computedMinMacOsVersion) {
		this.computedMinMacOsVersion = computedMinMacOsVersion;
		return this;
	}

	public BuildAttributes expirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public BuildAttributes expired(Boolean expired) {
		this.expired = expired;
		return this;
	}

	/**
	 * Get buildAudienceType
	 *
	 * @return buildAudienceType
	 **/
	@JsonProperty("buildAudienceType")
	public BuildAudienceType getBuildAudienceType() {
		return this.buildAudienceType;
	}

	/**
	 * Get computedMinMacOsVersion
	 *
	 * @return computedMinMacOsVersion
	 **/
	@JsonProperty("computedMinMacOsVersion")
	public String getComputedMinMacOsVersion() {
		return this.computedMinMacOsVersion;
	}

	/**
	 * Get expirationDate
	 *
	 * @return expirationDate
	 **/
	@JsonProperty("expirationDate")
	public OffsetDateTime getExpirationDate() {
		return this.expirationDate;
	}

	/**
	 * Get iconAssetToken
	 *
	 * @return iconAssetToken
	 **/
	@JsonProperty("iconAssetToken")
	public ImageAsset getIconAssetToken() {
		return this.iconAssetToken;
	}

	/**
	 * Get lsMinimumSystemVersion
	 *
	 * @return lsMinimumSystemVersion
	 **/
	@JsonProperty("lsMinimumSystemVersion")
	public String getLsMinimumSystemVersion() {
		return this.lsMinimumSystemVersion;
	}

	/**
	 * Get minOsVersion
	 *
	 * @return minOsVersion
	 **/
	@JsonProperty("minOsVersion")
	public String getMinOsVersion() {
		return this.minOsVersion;
	}

	/**
	 * Get processingState
	 *
	 * @return processingState
	 **/
	@JsonProperty("processingState")
	public String getProcessingState() {
		if (this.processingState == null) {
			return null;
		}
		return this.processingState.value();
	}

	/**
	 * Get uploadedDate
	 *
	 * @return uploadedDate
	 **/
	@JsonProperty("uploadedDate")
	public OffsetDateTime getUploadedDate() {
		return this.uploadedDate;
	}

	/**
	 * Get version
	 *
	 * @return version
	 **/
	@JsonProperty("version")
	public String getVersion() {
		return this.version;
	}

	public BuildAttributes iconAssetToken(ImageAsset iconAssetToken) {
		this.iconAssetToken = iconAssetToken;
		return this;
	}

	/**
	 * Get expired
	 *
	 * @return expired
	 **/
	@JsonProperty("expired")
	public Boolean isExpired() {
		return this.expired;
	}

	/**
	 * Get usesNonExemptEncryption
	 *
	 * @return usesNonExemptEncryption
	 **/
	@JsonProperty("usesNonExemptEncryption")
	public Boolean isUsesNonExemptEncryption() {
		return this.usesNonExemptEncryption;
	}

	public BuildAttributes lsMinimumSystemVersion(String lsMinimumSystemVersion) {
		this.lsMinimumSystemVersion = lsMinimumSystemVersion;
		return this;
	}

	public BuildAttributes minOsVersion(String minOsVersion) {
		this.minOsVersion = minOsVersion;
		return this;
	}

	public BuildAttributes processingState(ProcessingStateEnum processingState) {
		this.processingState = processingState;
		return this;
	}

	public void setBuildAudienceType(BuildAudienceType buildAudienceType) {
		this.buildAudienceType = buildAudienceType;
	}

	public void setComputedMinMacOsVersion(String computedMinMacOsVersion) {
		this.computedMinMacOsVersion = computedMinMacOsVersion;
	}

	public void setExpirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	public void setIconAssetToken(ImageAsset iconAssetToken) {
		this.iconAssetToken = iconAssetToken;
	}

	public void setLsMinimumSystemVersion(String lsMinimumSystemVersion) {
		this.lsMinimumSystemVersion = lsMinimumSystemVersion;
	}

	public void setMinOsVersion(String minOsVersion) {
		this.minOsVersion = minOsVersion;
	}

	public void setProcessingState(ProcessingStateEnum processingState) {
		this.processingState = processingState;
	}

	public void setUploadedDate(OffsetDateTime uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public void setUsesNonExemptEncryption(Boolean usesNonExemptEncryption) {
		this.usesNonExemptEncryption = usesNonExemptEncryption;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildAttributes {\n");

		sb.append("    version: ").append(toIndentedString(this.version)).append("\n");
		sb.append("    uploadedDate: ").append(toIndentedString(this.uploadedDate)).append("\n");
		sb.append("    expirationDate: ").append(toIndentedString(this.expirationDate)).append("\n");
		sb.append("    expired: ").append(toIndentedString(this.expired)).append("\n");
		sb.append("    minOsVersion: ").append(toIndentedString(this.minOsVersion)).append("\n");
		sb.append("    lsMinimumSystemVersion: ").append(toIndentedString(this.lsMinimumSystemVersion)).append("\n");
		sb.append("    computedMinMacOsVersion: ").append(toIndentedString(this.computedMinMacOsVersion)).append("\n");
		sb.append("    iconAssetToken: ").append(toIndentedString(this.iconAssetToken)).append("\n");
		sb.append("    processingState: ").append(toIndentedString(this.processingState)).append("\n");
		sb.append("    buildAudienceType: ").append(toIndentedString(this.buildAudienceType)).append("\n");
		sb.append("    usesNonExemptEncryption: ").append(toIndentedString(this.usesNonExemptEncryption)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BuildAttributes uploadedDate(OffsetDateTime uploadedDate) {
		this.uploadedDate = uploadedDate;
		return this;
	}

	public BuildAttributes usesNonExemptEncryption(Boolean usesNonExemptEncryption) {
		this.usesNonExemptEncryption = usesNonExemptEncryption;
		return this;
	}

	public BuildAttributes version(String version) {
		this.version = version;
		return this;
	}
}
