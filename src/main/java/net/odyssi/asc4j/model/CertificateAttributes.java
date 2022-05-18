package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CertificateAttributes implements Serializable {

	private static final long serialVersionUID = -7450793228367549095L;

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

	private String certificateContent;

	private CertificateType certificateType;

	private String displayName;

	private OffsetDateTime expirationDate;

	private String name;

	private BundleIdPlatform platform;
	private String serialNumber;

	public CertificateAttributes certificateContent(String certificateContent) {
		this.certificateContent = certificateContent;
		return this;
	}

	public CertificateAttributes certificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
		return this;
	}

	public CertificateAttributes displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	public CertificateAttributes expirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	/**
	 * Get certificateContent
	 *
	 * @return certificateContent
	 **/
	@JsonProperty("certificateContent")
	public String getCertificateContent() {
		return this.certificateContent;
	}

	/**
	 * Get certificateType
	 *
	 * @return certificateType
	 **/
	@JsonProperty("certificateType")
	public CertificateType getCertificateType() {
		return this.certificateType;
	}

	/**
	 * Get displayName
	 *
	 * @return displayName
	 **/
	@JsonProperty("displayName")
	public String getDisplayName() {
		return this.displayName;
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
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public BundleIdPlatform getPlatform() {
		return this.platform;
	}

	/**
	 * Get serialNumber
	 *
	 * @return serialNumber
	 **/
	@JsonProperty("serialNumber")
	public String getSerialNumber() {
		return this.serialNumber;
	}

	public CertificateAttributes name(String name) {
		this.name = name;
		return this;
	}

	public CertificateAttributes platform(BundleIdPlatform platform) {
		this.platform = platform;
		return this;
	}

	public CertificateAttributes serialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	public void setCertificateContent(String certificateContent) {
		this.certificateContent = certificateContent;
	}

	public void setCertificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setExpirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CertificateAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    certificateType: ").append(toIndentedString(this.certificateType)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(this.displayName)).append("\n");
		sb.append("    serialNumber: ").append(toIndentedString(this.serialNumber)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    expirationDate: ").append(toIndentedString(this.expirationDate)).append("\n");
		sb.append("    certificateContent: ").append(toIndentedString(this.certificateContent)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
