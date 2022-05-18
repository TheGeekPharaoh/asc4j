package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewSubmissionItemCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -5490135605144557842L;

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

	private AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion;

	private ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent appEvent;

	private AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersion;

	private ReviewSubmissionItemCreateRequestDataRelationshipsAppStoreVersionExperiment appStoreVersionExperiment;
	private ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission reviewSubmission;

	public ReviewSubmissionItemCreateRequestDataRelationships appCustomProductPageVersion(
			AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
		this.appCustomProductPageVersion = appCustomProductPageVersion;
		return this;
	}

	public ReviewSubmissionItemCreateRequestDataRelationships appEvent(
			ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent appEvent) {
		this.appEvent = appEvent;
		return this;
	}

	public ReviewSubmissionItemCreateRequestDataRelationships appStoreVersion(
			AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
		return this;
	}

	public ReviewSubmissionItemCreateRequestDataRelationships appStoreVersionExperiment(
			ReviewSubmissionItemCreateRequestDataRelationshipsAppStoreVersionExperiment appStoreVersionExperiment) {
		this.appStoreVersionExperiment = appStoreVersionExperiment;
		return this;
	}

	/**
	 * Get appCustomProductPageVersion
	 *
	 * @return appCustomProductPageVersion
	 **/
	@JsonProperty("appCustomProductPageVersion")
	public AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion getAppCustomProductPageVersion() {
		return this.appCustomProductPageVersion;
	}

	/**
	 * Get appEvent
	 *
	 * @return appEvent
	 **/
	@JsonProperty("appEvent")
	public ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent getAppEvent() {
		return this.appEvent;
	}

	/**
	 * Get appStoreVersion
	 *
	 * @return appStoreVersion
	 **/
	@JsonProperty("appStoreVersion")
	public AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion getAppStoreVersion() {
		return this.appStoreVersion;
	}

	/**
	 * Get appStoreVersionExperiment
	 *
	 * @return appStoreVersionExperiment
	 **/
	@JsonProperty("appStoreVersionExperiment")
	public ReviewSubmissionItemCreateRequestDataRelationshipsAppStoreVersionExperiment getAppStoreVersionExperiment() {
		return this.appStoreVersionExperiment;
	}

	/**
	 * Get reviewSubmission
	 *
	 * @return reviewSubmission
	 **/
	@JsonProperty("reviewSubmission")
	public ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission getReviewSubmission() {
		return this.reviewSubmission;
	}

	public ReviewSubmissionItemCreateRequestDataRelationships reviewSubmission(
			ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission reviewSubmission) {
		this.reviewSubmission = reviewSubmission;
		return this;
	}

	public void setAppCustomProductPageVersion(
			AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
		this.appCustomProductPageVersion = appCustomProductPageVersion;
	}

	public void setAppEvent(ReviewSubmissionItemCreateRequestDataRelationshipsAppEvent appEvent) {
		this.appEvent = appEvent;
	}

	public void setAppStoreVersion(
			AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	public void setAppStoreVersionExperiment(
			ReviewSubmissionItemCreateRequestDataRelationshipsAppStoreVersionExperiment appStoreVersionExperiment) {
		this.appStoreVersionExperiment = appStoreVersionExperiment;
	}

	public void setReviewSubmission(
			ReviewSubmissionItemCreateRequestDataRelationshipsReviewSubmission reviewSubmission) {
		this.reviewSubmission = reviewSubmission;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReviewSubmissionItemCreateRequestDataRelationships {\n");

		sb.append("    reviewSubmission: ").append(toIndentedString(this.reviewSubmission)).append("\n");
		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("    appCustomProductPageVersion: ").append(toIndentedString(this.appCustomProductPageVersion))
				.append("\n");
		sb.append("    appStoreVersionExperiment: ").append(toIndentedString(this.appStoreVersionExperiment))
				.append("\n");
		sb.append("    appEvent: ").append(toIndentedString(this.appEvent)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
