package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdfaDeclarationCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -2009475078370817790L;

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

	private Boolean attributesActionWithPreviousAd;

	private Boolean attributesAppInstallationToPreviousAd;

	private Boolean honorsLimitedAdTracking;
	private Boolean servesAds;

	public IdfaDeclarationCreateRequestDataAttributes attributesActionWithPreviousAd(
			Boolean attributesActionWithPreviousAd) {
		this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
		return this;
	}

	public IdfaDeclarationCreateRequestDataAttributes attributesAppInstallationToPreviousAd(
			Boolean attributesAppInstallationToPreviousAd) {
		this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
		return this;
	}

	public IdfaDeclarationCreateRequestDataAttributes honorsLimitedAdTracking(Boolean honorsLimitedAdTracking) {
		this.honorsLimitedAdTracking = honorsLimitedAdTracking;
		return this;
	}

	/**
	 * Get attributesActionWithPreviousAd
	 *
	 * @return attributesActionWithPreviousAd
	 **/
	@JsonProperty("attributesActionWithPreviousAd")
	public Boolean isAttributesActionWithPreviousAd() {
		return this.attributesActionWithPreviousAd;
	}

	/**
	 * Get attributesAppInstallationToPreviousAd
	 *
	 * @return attributesAppInstallationToPreviousAd
	 **/
	@JsonProperty("attributesAppInstallationToPreviousAd")
	public Boolean isAttributesAppInstallationToPreviousAd() {
		return this.attributesAppInstallationToPreviousAd;
	}

	/**
	 * Get honorsLimitedAdTracking
	 *
	 * @return honorsLimitedAdTracking
	 **/
	@JsonProperty("honorsLimitedAdTracking")
	public Boolean isHonorsLimitedAdTracking() {
		return this.honorsLimitedAdTracking;
	}

	/**
	 * Get servesAds
	 *
	 * @return servesAds
	 **/
	@JsonProperty("servesAds")
	public Boolean isServesAds() {
		return this.servesAds;
	}

	public IdfaDeclarationCreateRequestDataAttributes servesAds(Boolean servesAds) {
		this.servesAds = servesAds;
		return this;
	}

	public void setAttributesActionWithPreviousAd(Boolean attributesActionWithPreviousAd) {
		this.attributesActionWithPreviousAd = attributesActionWithPreviousAd;
	}

	public void setAttributesAppInstallationToPreviousAd(Boolean attributesAppInstallationToPreviousAd) {
		this.attributesAppInstallationToPreviousAd = attributesAppInstallationToPreviousAd;
	}

	public void setHonorsLimitedAdTracking(Boolean honorsLimitedAdTracking) {
		this.honorsLimitedAdTracking = honorsLimitedAdTracking;
	}

	public void setServesAds(Boolean servesAds) {
		this.servesAds = servesAds;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IdfaDeclarationCreateRequestDataAttributes {\n");

		sb.append("    servesAds: ").append(toIndentedString(this.servesAds)).append("\n");
		sb.append("    attributesAppInstallationToPreviousAd: ")
				.append(toIndentedString(this.attributesAppInstallationToPreviousAd)).append("\n");
		sb.append("    attributesActionWithPreviousAd: ").append(toIndentedString(this.attributesActionWithPreviousAd))
				.append("\n");
		sb.append("    honorsLimitedAdTracking: ").append(toIndentedString(this.honorsLimitedAdTracking)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
