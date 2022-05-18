package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionRelationships implements Serializable {

	private static final long serialVersionUID = -2075714473543797497L;

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

	private AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration;

	private AppClipRelationshipsApp app;

	private AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience;

	private AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail;

	private AppStoreVersionRelationshipsAppStoreVersionExperiments appStoreVersionExperiments;

	private AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations;

	private AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease;

	private AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission;

	private AppStoreVersionRelationshipsBuild build;

	private AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration;
	private AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage;

	public AppStoreVersionRelationships ageRatingDeclaration(
			AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
		this.ageRatingDeclaration = ageRatingDeclaration;
		return this;
	}

	public AppStoreVersionRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public AppStoreVersionRelationships appClipDefaultExperience(
			AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
		return this;
	}

	public AppStoreVersionRelationships appStoreReviewDetail(
			AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
		this.appStoreReviewDetail = appStoreReviewDetail;
		return this;
	}

	public AppStoreVersionRelationships appStoreVersionExperiments(
			AppStoreVersionRelationshipsAppStoreVersionExperiments appStoreVersionExperiments) {
		this.appStoreVersionExperiments = appStoreVersionExperiments;
		return this;
	}

	public AppStoreVersionRelationships appStoreVersionLocalizations(
			AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations) {
		this.appStoreVersionLocalizations = appStoreVersionLocalizations;
		return this;
	}

	public AppStoreVersionRelationships appStoreVersionPhasedRelease(
			AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease) {
		this.appStoreVersionPhasedRelease = appStoreVersionPhasedRelease;
		return this;
	}

	public AppStoreVersionRelationships appStoreVersionSubmission(
			AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission) {
		this.appStoreVersionSubmission = appStoreVersionSubmission;
		return this;
	}

	public AppStoreVersionRelationships build(AppStoreVersionRelationshipsBuild build) {
		this.build = build;
		return this;
	}

	/**
	 * Get ageRatingDeclaration
	 *
	 * @return ageRatingDeclaration
	 **/
	@JsonProperty("ageRatingDeclaration")
	public AppStoreVersionRelationshipsAgeRatingDeclaration getAgeRatingDeclaration() {
		return this.ageRatingDeclaration;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/
	@JsonProperty("app")
	public AppClipRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get appClipDefaultExperience
	 *
	 * @return appClipDefaultExperience
	 **/
	@JsonProperty("appClipDefaultExperience")
	public AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience getAppClipDefaultExperience() {
		return this.appClipDefaultExperience;
	}

	/**
	 * Get appStoreReviewDetail
	 *
	 * @return appStoreReviewDetail
	 **/
	@JsonProperty("appStoreReviewDetail")
	public AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail getAppStoreReviewDetail() {
		return this.appStoreReviewDetail;
	}

	/**
	 * Get appStoreVersionExperiments
	 *
	 * @return appStoreVersionExperiments
	 **/
	@JsonProperty("appStoreVersionExperiments")
	public AppStoreVersionRelationshipsAppStoreVersionExperiments getAppStoreVersionExperiments() {
		return this.appStoreVersionExperiments;
	}

	/**
	 * Get appStoreVersionLocalizations
	 *
	 * @return appStoreVersionLocalizations
	 **/
	@JsonProperty("appStoreVersionLocalizations")
	public AppStoreVersionRelationshipsAppStoreVersionLocalizations getAppStoreVersionLocalizations() {
		return this.appStoreVersionLocalizations;
	}

	/**
	 * Get appStoreVersionPhasedRelease
	 *
	 * @return appStoreVersionPhasedRelease
	 **/
	@JsonProperty("appStoreVersionPhasedRelease")
	public AppStoreVersionRelationshipsAppStoreVersionPhasedRelease getAppStoreVersionPhasedRelease() {
		return this.appStoreVersionPhasedRelease;
	}

	/**
	 * Get appStoreVersionSubmission
	 *
	 * @return appStoreVersionSubmission
	 **/
	@JsonProperty("appStoreVersionSubmission")
	public AppStoreVersionRelationshipsAppStoreVersionSubmission getAppStoreVersionSubmission() {
		return this.appStoreVersionSubmission;
	}

	/**
	 * Get build
	 *
	 * @return build
	 **/
	@JsonProperty("build")
	public AppStoreVersionRelationshipsBuild getBuild() {
		return this.build;
	}

	/**
	 * Get idfaDeclaration
	 *
	 * @return idfaDeclaration
	 **/
	@JsonProperty("idfaDeclaration")
	public AppStoreVersionRelationshipsIdfaDeclaration getIdfaDeclaration() {
		return this.idfaDeclaration;
	}

	/**
	 * Get routingAppCoverage
	 *
	 * @return routingAppCoverage
	 **/
	@JsonProperty("routingAppCoverage")
	public AppStoreVersionRelationshipsRoutingAppCoverage getRoutingAppCoverage() {
		return this.routingAppCoverage;
	}

	public AppStoreVersionRelationships idfaDeclaration(AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration) {
		this.idfaDeclaration = idfaDeclaration;
		return this;
	}

	public AppStoreVersionRelationships routingAppCoverage(
			AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage) {
		this.routingAppCoverage = routingAppCoverage;
		return this;
	}

	public void setAgeRatingDeclaration(AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
		this.ageRatingDeclaration = ageRatingDeclaration;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setAppClipDefaultExperience(
			AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
	}

	public void setAppStoreReviewDetail(
			AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
		this.appStoreReviewDetail = appStoreReviewDetail;
	}

	public void setAppStoreVersionExperiments(
			AppStoreVersionRelationshipsAppStoreVersionExperiments appStoreVersionExperiments) {
		this.appStoreVersionExperiments = appStoreVersionExperiments;
	}

	public void setAppStoreVersionLocalizations(
			AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations) {
		this.appStoreVersionLocalizations = appStoreVersionLocalizations;
	}

	public void setAppStoreVersionPhasedRelease(
			AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease) {
		this.appStoreVersionPhasedRelease = appStoreVersionPhasedRelease;
	}

	public void setAppStoreVersionSubmission(
			AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission) {
		this.appStoreVersionSubmission = appStoreVersionSubmission;
	}

	public void setBuild(AppStoreVersionRelationshipsBuild build) {
		this.build = build;
	}

	public void setIdfaDeclaration(AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration) {
		this.idfaDeclaration = idfaDeclaration;
	}

	public void setRoutingAppCoverage(AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage) {
		this.routingAppCoverage = routingAppCoverage;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    ageRatingDeclaration: ").append(toIndentedString(this.ageRatingDeclaration)).append("\n");
		sb.append("    appStoreVersionLocalizations: ").append(toIndentedString(this.appStoreVersionLocalizations))
				.append("\n");
		sb.append("    build: ").append(toIndentedString(this.build)).append("\n");
		sb.append("    appStoreVersionPhasedRelease: ").append(toIndentedString(this.appStoreVersionPhasedRelease))
				.append("\n");
		sb.append("    routingAppCoverage: ").append(toIndentedString(this.routingAppCoverage)).append("\n");
		sb.append("    appStoreReviewDetail: ").append(toIndentedString(this.appStoreReviewDetail)).append("\n");
		sb.append("    appStoreVersionSubmission: ").append(toIndentedString(this.appStoreVersionSubmission))
				.append("\n");
		sb.append("    idfaDeclaration: ").append(toIndentedString(this.idfaDeclaration)).append("\n");
		sb.append("    appClipDefaultExperience: ").append(toIndentedString(this.appClipDefaultExperience))
				.append("\n");
		sb.append("    appStoreVersionExperiments: ").append(toIndentedString(this.appStoreVersionExperiments))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
