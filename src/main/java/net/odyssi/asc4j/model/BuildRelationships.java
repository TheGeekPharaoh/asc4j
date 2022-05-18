package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildRelationships implements Serializable {

	private static final long serialVersionUID = 4822979697597287280L;

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

	private AppClipRelationshipsApp app;

	private BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration;

	private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion;

	private BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission;

	private BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations;

	private AppRelationshipsBetaGroups betaGroups;

	private BuildRelationshipsBuildBetaDetail buildBetaDetail;

	private BuildRelationshipsBuildBundles buildBundles;

	private BuildRelationshipsIcons icons;

	private BetaGroupRelationshipsBetaTesters individualTesters;
	private BuildRelationshipsPreReleaseVersion preReleaseVersion;

	public BuildRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public BuildRelationships appEncryptionDeclaration(
			BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
		this.appEncryptionDeclaration = appEncryptionDeclaration;
		return this;
	}

	public BuildRelationships appStoreVersion(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
		return this;
	}

	public BuildRelationships betaAppReviewSubmission(
			BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission) {
		this.betaAppReviewSubmission = betaAppReviewSubmission;
		return this;
	}

	public BuildRelationships betaBuildLocalizations(BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations) {
		this.betaBuildLocalizations = betaBuildLocalizations;
		return this;
	}

	public BuildRelationships betaGroups(AppRelationshipsBetaGroups betaGroups) {
		this.betaGroups = betaGroups;
		return this;
	}

	public BuildRelationships buildBetaDetail(BuildRelationshipsBuildBetaDetail buildBetaDetail) {
		this.buildBetaDetail = buildBetaDetail;
		return this;
	}

	public BuildRelationships buildBundles(BuildRelationshipsBuildBundles buildBundles) {
		this.buildBundles = buildBundles;
		return this;
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
	 * Get appEncryptionDeclaration
	 *
	 * @return appEncryptionDeclaration
	 **/
	@JsonProperty("appEncryptionDeclaration")
	public BuildRelationshipsAppEncryptionDeclaration getAppEncryptionDeclaration() {
		return this.appEncryptionDeclaration;
	}

	/**
	 * Get appStoreVersion
	 *
	 * @return appStoreVersion
	 **/
	@JsonProperty("appStoreVersion")
	public AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion getAppStoreVersion() {
		return this.appStoreVersion;
	}

	/**
	 * Get betaAppReviewSubmission
	 *
	 * @return betaAppReviewSubmission
	 **/
	@JsonProperty("betaAppReviewSubmission")
	public BuildRelationshipsBetaAppReviewSubmission getBetaAppReviewSubmission() {
		return this.betaAppReviewSubmission;
	}

	/**
	 * Get betaBuildLocalizations
	 *
	 * @return betaBuildLocalizations
	 **/
	@JsonProperty("betaBuildLocalizations")
	public BuildRelationshipsBetaBuildLocalizations getBetaBuildLocalizations() {
		return this.betaBuildLocalizations;
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
	 * Get buildBetaDetail
	 *
	 * @return buildBetaDetail
	 **/
	@JsonProperty("buildBetaDetail")
	public BuildRelationshipsBuildBetaDetail getBuildBetaDetail() {
		return this.buildBetaDetail;
	}

	/**
	 * Get buildBundles
	 *
	 * @return buildBundles
	 **/
	@JsonProperty("buildBundles")
	public BuildRelationshipsBuildBundles getBuildBundles() {
		return this.buildBundles;
	}

	/**
	 * Get icons
	 *
	 * @return icons
	 **/
	@JsonProperty("icons")
	public BuildRelationshipsIcons getIcons() {
		return this.icons;
	}

	/**
	 * Get individualTesters
	 *
	 * @return individualTesters
	 **/
	@JsonProperty("individualTesters")
	public BetaGroupRelationshipsBetaTesters getIndividualTesters() {
		return this.individualTesters;
	}

	/**
	 * Get preReleaseVersion
	 *
	 * @return preReleaseVersion
	 **/
	@JsonProperty("preReleaseVersion")
	public BuildRelationshipsPreReleaseVersion getPreReleaseVersion() {
		return this.preReleaseVersion;
	}

	public BuildRelationships icons(BuildRelationshipsIcons icons) {
		this.icons = icons;
		return this;
	}

	public BuildRelationships individualTesters(BetaGroupRelationshipsBetaTesters individualTesters) {
		this.individualTesters = individualTesters;
		return this;
	}

	public BuildRelationships preReleaseVersion(BuildRelationshipsPreReleaseVersion preReleaseVersion) {
		this.preReleaseVersion = preReleaseVersion;
		return this;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setAppEncryptionDeclaration(BuildRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
		this.appEncryptionDeclaration = appEncryptionDeclaration;
	}

	public void setAppStoreVersion(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	public void setBetaAppReviewSubmission(BuildRelationshipsBetaAppReviewSubmission betaAppReviewSubmission) {
		this.betaAppReviewSubmission = betaAppReviewSubmission;
	}

	public void setBetaBuildLocalizations(BuildRelationshipsBetaBuildLocalizations betaBuildLocalizations) {
		this.betaBuildLocalizations = betaBuildLocalizations;
	}

	public void setBetaGroups(AppRelationshipsBetaGroups betaGroups) {
		this.betaGroups = betaGroups;
	}

	public void setBuildBetaDetail(BuildRelationshipsBuildBetaDetail buildBetaDetail) {
		this.buildBetaDetail = buildBetaDetail;
	}

	public void setBuildBundles(BuildRelationshipsBuildBundles buildBundles) {
		this.buildBundles = buildBundles;
	}

	public void setIcons(BuildRelationshipsIcons icons) {
		this.icons = icons;
	}

	public void setIndividualTesters(BetaGroupRelationshipsBetaTesters individualTesters) {
		this.individualTesters = individualTesters;
	}

	public void setPreReleaseVersion(BuildRelationshipsPreReleaseVersion preReleaseVersion) {
		this.preReleaseVersion = preReleaseVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildRelationships {\n");

		sb.append("    preReleaseVersion: ").append(toIndentedString(this.preReleaseVersion)).append("\n");
		sb.append("    individualTesters: ").append(toIndentedString(this.individualTesters)).append("\n");
		sb.append("    betaGroups: ").append(toIndentedString(this.betaGroups)).append("\n");
		sb.append("    betaBuildLocalizations: ").append(toIndentedString(this.betaBuildLocalizations)).append("\n");
		sb.append("    appEncryptionDeclaration: ").append(toIndentedString(this.appEncryptionDeclaration))
				.append("\n");
		sb.append("    betaAppReviewSubmission: ").append(toIndentedString(this.betaAppReviewSubmission)).append("\n");
		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    buildBetaDetail: ").append(toIndentedString(this.buildBetaDetail)).append("\n");
		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("    icons: ").append(toIndentedString(this.icons)).append("\n");
		sb.append("    buildBundles: ").append(toIndentedString(this.buildBundles)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
