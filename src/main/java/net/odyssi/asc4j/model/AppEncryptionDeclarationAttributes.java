package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEncryptionDeclarationAttributes implements Serializable {

	private static final long serialVersionUID = -5817718443055516144L;

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

	private AppEncryptionDeclarationState appEncryptionDeclarationState;

	private Boolean availableOnFrenchStore;

	private String codeValue;

	private Boolean containsProprietaryCryptography;

	private Boolean containsThirdPartyCryptography;

	private String documentName;

	private String documentType;

	private String documentUrl;

	private Boolean exempt;

	private Platform platform;

	private OffsetDateTime uploadedDate;
	private Boolean usesEncryption;

	public AppEncryptionDeclarationAttributes appEncryptionDeclarationState(
			AppEncryptionDeclarationState appEncryptionDeclarationState) {
		this.appEncryptionDeclarationState = appEncryptionDeclarationState;
		return this;
	}

	public AppEncryptionDeclarationAttributes availableOnFrenchStore(Boolean availableOnFrenchStore) {
		this.availableOnFrenchStore = availableOnFrenchStore;
		return this;
	}

	public AppEncryptionDeclarationAttributes codeValue(String codeValue) {
		this.codeValue = codeValue;
		return this;
	}

	public AppEncryptionDeclarationAttributes containsProprietaryCryptography(Boolean containsProprietaryCryptography) {
		this.containsProprietaryCryptography = containsProprietaryCryptography;
		return this;
	}

	public AppEncryptionDeclarationAttributes containsThirdPartyCryptography(Boolean containsThirdPartyCryptography) {
		this.containsThirdPartyCryptography = containsThirdPartyCryptography;
		return this;
	}

	public AppEncryptionDeclarationAttributes documentName(String documentName) {
		this.documentName = documentName;
		return this;
	}

	public AppEncryptionDeclarationAttributes documentType(String documentType) {
		this.documentType = documentType;
		return this;
	}

	public AppEncryptionDeclarationAttributes documentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
		return this;
	}

	public AppEncryptionDeclarationAttributes exempt(Boolean exempt) {
		this.exempt = exempt;
		return this;
	}

	/**
	 * Get appEncryptionDeclarationState
	 *
	 * @return appEncryptionDeclarationState
	 **/
	@JsonProperty("appEncryptionDeclarationState")
	public AppEncryptionDeclarationState getAppEncryptionDeclarationState() {
		return this.appEncryptionDeclarationState;
	}

	/**
	 * Get codeValue
	 *
	 * @return codeValue
	 **/
	@JsonProperty("codeValue")
	public String getCodeValue() {
		return this.codeValue;
	}

	/**
	 * Get documentName
	 *
	 * @return documentName
	 **/
	@JsonProperty("documentName")
	public String getDocumentName() {
		return this.documentName;
	}

	/**
	 * Get documentType
	 *
	 * @return documentType
	 **/
	@JsonProperty("documentType")
	public String getDocumentType() {
		return this.documentType;
	}

	/**
	 * Get documentUrl
	 *
	 * @return documentUrl
	 **/
	@JsonProperty("documentUrl")
	public String getDocumentUrl() {
		return this.documentUrl;
	}

	/**
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public Platform getPlatform() {
		return this.platform;
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
	 * Get availableOnFrenchStore
	 *
	 * @return availableOnFrenchStore
	 **/
	@JsonProperty("availableOnFrenchStore")
	public Boolean isAvailableOnFrenchStore() {
		return this.availableOnFrenchStore;
	}

	/**
	 * Get containsProprietaryCryptography
	 *
	 * @return containsProprietaryCryptography
	 **/
	@JsonProperty("containsProprietaryCryptography")
	public Boolean isContainsProprietaryCryptography() {
		return this.containsProprietaryCryptography;
	}

	/**
	 * Get containsThirdPartyCryptography
	 *
	 * @return containsThirdPartyCryptography
	 **/
	@JsonProperty("containsThirdPartyCryptography")
	public Boolean isContainsThirdPartyCryptography() {
		return this.containsThirdPartyCryptography;
	}

	/**
	 * Get exempt
	 *
	 * @return exempt
	 **/
	@JsonProperty("exempt")
	public Boolean isExempt() {
		return this.exempt;
	}

	/**
	 * Get usesEncryption
	 *
	 * @return usesEncryption
	 **/
	@JsonProperty("usesEncryption")
	public Boolean isUsesEncryption() {
		return this.usesEncryption;
	}

	public AppEncryptionDeclarationAttributes platform(Platform platform) {
		this.platform = platform;
		return this;
	}

	public void setAppEncryptionDeclarationState(AppEncryptionDeclarationState appEncryptionDeclarationState) {
		this.appEncryptionDeclarationState = appEncryptionDeclarationState;
	}

	public void setAvailableOnFrenchStore(Boolean availableOnFrenchStore) {
		this.availableOnFrenchStore = availableOnFrenchStore;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public void setContainsProprietaryCryptography(Boolean containsProprietaryCryptography) {
		this.containsProprietaryCryptography = containsProprietaryCryptography;
	}

	public void setContainsThirdPartyCryptography(Boolean containsThirdPartyCryptography) {
		this.containsThirdPartyCryptography = containsThirdPartyCryptography;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}

	public void setExempt(Boolean exempt) {
		this.exempt = exempt;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public void setUploadedDate(OffsetDateTime uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public void setUsesEncryption(Boolean usesEncryption) {
		this.usesEncryption = usesEncryption;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEncryptionDeclarationAttributes {\n");

		sb.append("    usesEncryption: ").append(toIndentedString(this.usesEncryption)).append("\n");
		sb.append("    exempt: ").append(toIndentedString(this.exempt)).append("\n");
		sb.append("    containsProprietaryCryptography: ")
				.append(toIndentedString(this.containsProprietaryCryptography)).append("\n");
		sb.append("    containsThirdPartyCryptography: ").append(toIndentedString(this.containsThirdPartyCryptography))
				.append("\n");
		sb.append("    availableOnFrenchStore: ").append(toIndentedString(this.availableOnFrenchStore)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    uploadedDate: ").append(toIndentedString(this.uploadedDate)).append("\n");
		sb.append("    documentUrl: ").append(toIndentedString(this.documentUrl)).append("\n");
		sb.append("    documentName: ").append(toIndentedString(this.documentName)).append("\n");
		sb.append("    documentType: ").append(toIndentedString(this.documentType)).append("\n");
		sb.append("    appEncryptionDeclarationState: ").append(toIndentedString(this.appEncryptionDeclarationState))
				.append("\n");
		sb.append("    codeValue: ").append(toIndentedString(this.codeValue)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppEncryptionDeclarationAttributes uploadedDate(OffsetDateTime uploadedDate) {
		this.uploadedDate = uploadedDate;
		return this;
	}

	public AppEncryptionDeclarationAttributes usesEncryption(Boolean usesEncryption) {
		this.usesEncryption = usesEncryption;
		return this;
	}
}
