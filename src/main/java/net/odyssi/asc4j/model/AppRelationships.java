package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppRelationships implements Serializable {

	private static final long serialVersionUID = -7829132173948385633L;

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

	private AppRelationshipsAppClips appClips;

	private AppRelationshipsAppCustomProductPages appCustomProductPages;

	private AppRelationshipsAppEvents appEvents;

	private AppRelationshipsAppInfos appInfos;

	private AppRelationshipsAppStoreVersions appStoreVersions;

	private AppRelationshipsAvailableTerritories availableTerritories;

	private AppRelationshipsBetaAppLocalizations betaAppLocalizations;

	private AppRelationshipsBetaAppReviewDetail betaAppReviewDetail;

	private AppRelationshipsBetaGroups betaGroups;

	private AppRelationshipsBetaLicenseAgreement betaLicenseAgreement;

	private AppRelationshipsBuilds builds;

	private AppRelationshipsCiProduct ciProduct;

	private AppRelationshipsEndUserLicenseAgreement endUserLicenseAgreement;

	private AppRelationshipsGameCenterEnabledVersions gameCenterEnabledVersions;

	private AppRelationshipsInAppPurchases inAppPurchases;

	private AppRelationshipsPreOrder preOrder;

	private AppRelationshipsPreReleaseVersions preReleaseVersions;

	private AppRelationshipsPrices prices;
	private AppRelationshipsReviewSubmissions reviewSubmissions;

	public AppRelationships appClips(AppRelationshipsAppClips appClips) {
		this.appClips = appClips;
		return this;
	}

	public AppRelationships appCustomProductPages(AppRelationshipsAppCustomProductPages appCustomProductPages) {
		this.appCustomProductPages = appCustomProductPages;
		return this;
	}

	public AppRelationships appEvents(AppRelationshipsAppEvents appEvents) {
		this.appEvents = appEvents;
		return this;
	}

	public AppRelationships appInfos(AppRelationshipsAppInfos appInfos) {
		this.appInfos = appInfos;
		return this;
	}

	public AppRelationships appStoreVersions(AppRelationshipsAppStoreVersions appStoreVersions) {
		this.appStoreVersions = appStoreVersions;
		return this;
	}

	public AppRelationships availableTerritories(AppRelationshipsAvailableTerritories availableTerritories) {
		this.availableTerritories = availableTerritories;
		return this;
	}

	public AppRelationships betaAppLocalizations(AppRelationshipsBetaAppLocalizations betaAppLocalizations) {
		this.betaAppLocalizations = betaAppLocalizations;
		return this;
	}

	public AppRelationships betaAppReviewDetail(AppRelationshipsBetaAppReviewDetail betaAppReviewDetail) {
		this.betaAppReviewDetail = betaAppReviewDetail;
		return this;
	}

	public AppRelationships betaGroups(AppRelationshipsBetaGroups betaGroups) {
		this.betaGroups = betaGroups;
		return this;
	}

	public AppRelationships betaLicenseAgreement(AppRelationshipsBetaLicenseAgreement betaLicenseAgreement) {
		this.betaLicenseAgreement = betaLicenseAgreement;
		return this;
	}

	public AppRelationships builds(AppRelationshipsBuilds builds) {
		this.builds = builds;
		return this;
	}

	public AppRelationships ciProduct(AppRelationshipsCiProduct ciProduct) {
		this.ciProduct = ciProduct;
		return this;
	}

	public AppRelationships endUserLicenseAgreement(AppRelationshipsEndUserLicenseAgreement endUserLicenseAgreement) {
		this.endUserLicenseAgreement = endUserLicenseAgreement;
		return this;
	}

	public AppRelationships gameCenterEnabledVersions(
			AppRelationshipsGameCenterEnabledVersions gameCenterEnabledVersions) {
		this.gameCenterEnabledVersions = gameCenterEnabledVersions;
		return this;
	}

	/**
	 * Get appClips
	 *
	 * @return appClips
	 **/
	@JsonProperty("appClips")
	public AppRelationshipsAppClips getAppClips() {
		return this.appClips;
	}

	/**
	 * Get appCustomProductPages
	 *
	 * @return appCustomProductPages
	 **/
	@JsonProperty("appCustomProductPages")
	public AppRelationshipsAppCustomProductPages getAppCustomProductPages() {
		return this.appCustomProductPages;
	}

	/**
	 * Get appEvents
	 *
	 * @return appEvents
	 **/
	@JsonProperty("appEvents")
	public AppRelationshipsAppEvents getAppEvents() {
		return this.appEvents;
	}

	/**
	 * Get appInfos
	 *
	 * @return appInfos
	 **/
	@JsonProperty("appInfos")
	public AppRelationshipsAppInfos getAppInfos() {
		return this.appInfos;
	}

	/**
	 * Get appStoreVersions
	 *
	 * @return appStoreVersions
	 **/
	@JsonProperty("appStoreVersions")
	public AppRelationshipsAppStoreVersions getAppStoreVersions() {
		return this.appStoreVersions;
	}

	/**
	 * Get availableTerritories
	 *
	 * @return availableTerritories
	 **/
	@JsonProperty("availableTerritories")
	public AppRelationshipsAvailableTerritories getAvailableTerritories() {
		return this.availableTerritories;
	}

	/**
	 * Get betaAppLocalizations
	 *
	 * @return betaAppLocalizations
	 **/
	@JsonProperty("betaAppLocalizations")
	public AppRelationshipsBetaAppLocalizations getBetaAppLocalizations() {
		return this.betaAppLocalizations;
	}

	/**
	 * Get betaAppReviewDetail
	 *
	 * @return betaAppReviewDetail
	 **/
	@JsonProperty("betaAppReviewDetail")
	public AppRelationshipsBetaAppReviewDetail getBetaAppReviewDetail() {
		return this.betaAppReviewDetail;
	}

	/**
	 * Get betaGroups
	 *
	 * @return betaGroups
	 **/
	@JsonProperty("betaGroups")
	public AppRelationshipsBetaGroups getBetaGroups() {
		return this.betaGroups;
	}

	/**
	 * Get betaLicenseAgreement
	 *
	 * @return betaLicenseAgreement
	 **/
	@JsonProperty("betaLicenseAgreement")
	public AppRelationshipsBetaLicenseAgreement getBetaLicenseAgreement() {
		return this.betaLicenseAgreement;
	}

	/**
	 * Get builds
	 *
	 * @return builds
	 **/
	@JsonProperty("builds")
	public AppRelationshipsBuilds getBuilds() {
		return this.builds;
	}

	/**
	 * Get ciProduct
	 *
	 * @return ciProduct
	 **/
	@JsonProperty("ciProduct")
	public AppRelationshipsCiProduct getCiProduct() {
		return this.ciProduct;
	}

	/**
	 * Get endUserLicenseAgreement
	 *
	 * @return endUserLicenseAgreement
	 **/
	@JsonProperty("endUserLicenseAgreement")
	public AppRelationshipsEndUserLicenseAgreement getEndUserLicenseAgreement() {
		return this.endUserLicenseAgreement;
	}

	/**
	 * Get gameCenterEnabledVersions
	 *
	 * @return gameCenterEnabledVersions
	 **/
	@JsonProperty("gameCenterEnabledVersions")
	public AppRelationshipsGameCenterEnabledVersions getGameCenterEnabledVersions() {
		return this.gameCenterEnabledVersions;
	}

	/**
	 * Get inAppPurchases
	 *
	 * @return inAppPurchases
	 **/
	@JsonProperty("inAppPurchases")
	public AppRelationshipsInAppPurchases getInAppPurchases() {
		return this.inAppPurchases;
	}

	/**
	 * Get preOrder
	 *
	 * @return preOrder
	 **/
	@JsonProperty("preOrder")
	public AppRelationshipsPreOrder getPreOrder() {
		return this.preOrder;
	}

	/**
	 * Get preReleaseVersions
	 *
	 * @return preReleaseVersions
	 **/
	@JsonProperty("preReleaseVersions")
	public AppRelationshipsPreReleaseVersions getPreReleaseVersions() {
		return this.preReleaseVersions;
	}

	/**
	 * Get prices
	 *
	 * @return prices
	 **/
	@JsonProperty("prices")
	public AppRelationshipsPrices getPrices() {
		return this.prices;
	}

	/**
	 * Get reviewSubmissions
	 *
	 * @return reviewSubmissions
	 **/
	@JsonProperty("reviewSubmissions")
	public AppRelationshipsReviewSubmissions getReviewSubmissions() {
		return this.reviewSubmissions;
	}

	public AppRelationships inAppPurchases(AppRelationshipsInAppPurchases inAppPurchases) {
		this.inAppPurchases = inAppPurchases;
		return this;
	}

	public AppRelationships preOrder(AppRelationshipsPreOrder preOrder) {
		this.preOrder = preOrder;
		return this;
	}

	public AppRelationships preReleaseVersions(AppRelationshipsPreReleaseVersions preReleaseVersions) {
		this.preReleaseVersions = preReleaseVersions;
		return this;
	}

	public AppRelationships prices(AppRelationshipsPrices prices) {
		this.prices = prices;
		return this;
	}

	public AppRelationships reviewSubmissions(AppRelationshipsReviewSubmissions reviewSubmissions) {
		this.reviewSubmissions = reviewSubmissions;
		return this;
	}

	public void setAppClips(AppRelationshipsAppClips appClips) {
		this.appClips = appClips;
	}

	public void setAppCustomProductPages(AppRelationshipsAppCustomProductPages appCustomProductPages) {
		this.appCustomProductPages = appCustomProductPages;
	}

	public void setAppEvents(AppRelationshipsAppEvents appEvents) {
		this.appEvents = appEvents;
	}

	public void setAppInfos(AppRelationshipsAppInfos appInfos) {
		this.appInfos = appInfos;
	}

	public void setAppStoreVersions(AppRelationshipsAppStoreVersions appStoreVersions) {
		this.appStoreVersions = appStoreVersions;
	}

	public void setAvailableTerritories(AppRelationshipsAvailableTerritories availableTerritories) {
		this.availableTerritories = availableTerritories;
	}

	public void setBetaAppLocalizations(AppRelationshipsBetaAppLocalizations betaAppLocalizations) {
		this.betaAppLocalizations = betaAppLocalizations;
	}

	public void setBetaAppReviewDetail(AppRelationshipsBetaAppReviewDetail betaAppReviewDetail) {
		this.betaAppReviewDetail = betaAppReviewDetail;
	}

	public void setBetaGroups(AppRelationshipsBetaGroups betaGroups) {
		this.betaGroups = betaGroups;
	}

	public void setBetaLicenseAgreement(AppRelationshipsBetaLicenseAgreement betaLicenseAgreement) {
		this.betaLicenseAgreement = betaLicenseAgreement;
	}

	public void setBuilds(AppRelationshipsBuilds builds) {
		this.builds = builds;
	}

	public void setCiProduct(AppRelationshipsCiProduct ciProduct) {
		this.ciProduct = ciProduct;
	}

	public void setEndUserLicenseAgreement(AppRelationshipsEndUserLicenseAgreement endUserLicenseAgreement) {
		this.endUserLicenseAgreement = endUserLicenseAgreement;
	}

	public void setGameCenterEnabledVersions(AppRelationshipsGameCenterEnabledVersions gameCenterEnabledVersions) {
		this.gameCenterEnabledVersions = gameCenterEnabledVersions;
	}

	public void setInAppPurchases(AppRelationshipsInAppPurchases inAppPurchases) {
		this.inAppPurchases = inAppPurchases;
	}

	public void setPreOrder(AppRelationshipsPreOrder preOrder) {
		this.preOrder = preOrder;
	}

	public void setPreReleaseVersions(AppRelationshipsPreReleaseVersions preReleaseVersions) {
		this.preReleaseVersions = preReleaseVersions;
	}

	public void setPrices(AppRelationshipsPrices prices) {
		this.prices = prices;
	}

	public void setReviewSubmissions(AppRelationshipsReviewSubmissions reviewSubmissions) {
		this.reviewSubmissions = reviewSubmissions;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppRelationships {\n");

		sb.append("    ciProduct: ").append(toIndentedString(this.ciProduct)).append("\n");
		sb.append("    betaGroups: ").append(toIndentedString(this.betaGroups)).append("\n");
		sb.append("    appStoreVersions: ").append(toIndentedString(this.appStoreVersions)).append("\n");
		sb.append("    preReleaseVersions: ").append(toIndentedString(this.preReleaseVersions)).append("\n");
		sb.append("    betaAppLocalizations: ").append(toIndentedString(this.betaAppLocalizations)).append("\n");
		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("    betaLicenseAgreement: ").append(toIndentedString(this.betaLicenseAgreement)).append("\n");
		sb.append("    betaAppReviewDetail: ").append(toIndentedString(this.betaAppReviewDetail)).append("\n");
		sb.append("    appInfos: ").append(toIndentedString(this.appInfos)).append("\n");
		sb.append("    appClips: ").append(toIndentedString(this.appClips)).append("\n");
		sb.append("    endUserLicenseAgreement: ").append(toIndentedString(this.endUserLicenseAgreement)).append("\n");
		sb.append("    preOrder: ").append(toIndentedString(this.preOrder)).append("\n");
		sb.append("    prices: ").append(toIndentedString(this.prices)).append("\n");
		sb.append("    availableTerritories: ").append(toIndentedString(this.availableTerritories)).append("\n");
		sb.append("    inAppPurchases: ").append(toIndentedString(this.inAppPurchases)).append("\n");
		sb.append("    gameCenterEnabledVersions: ").append(toIndentedString(this.gameCenterEnabledVersions))
				.append("\n");
		sb.append("    appCustomProductPages: ").append(toIndentedString(this.appCustomProductPages)).append("\n");
		sb.append("    appEvents: ").append(toIndentedString(this.appEvents)).append("\n");
		sb.append("    reviewSubmissions: ").append(toIndentedString(this.reviewSubmissions)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
