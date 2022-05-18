package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewSubmissionItemRelationships implements Serializable {

	private static final long serialVersionUID = -5802206590223355983L;

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

	private AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersion appCustomProductPageVersion;

	private AppEventLocalizationRelationshipsAppEvent appEvent;

	private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion;
	private AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperiment appStoreVersionExperiment;

	public ReviewSubmissionItemRelationships appCustomProductPageVersion(
			AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
		this.appCustomProductPageVersion = appCustomProductPageVersion;
		return this;
	}

	public ReviewSubmissionItemRelationships appEvent(AppEventLocalizationRelationshipsAppEvent appEvent) {
		this.appEvent = appEvent;
		return this;
	}

	public ReviewSubmissionItemRelationships appStoreVersion(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
		return this;
	}

	public ReviewSubmissionItemRelationships appStoreVersionExperiment(
			AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperiment appStoreVersionExperiment) {
		this.appStoreVersionExperiment = appStoreVersionExperiment;
		return this;
	}

	/**
	 * Get appCustomProductPageVersion
	 *
	 * @return appCustomProductPageVersion
	 **/
	@JsonProperty("appCustomProductPageVersion")
	public AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersion getAppCustomProductPageVersion() {
		return this.appCustomProductPageVersion;
	}

	/**
	 * Get appEvent
	 *
	 * @return appEvent
	 **/
	@JsonProperty("appEvent")
	public AppEventLocalizationRelationshipsAppEvent getAppEvent() {
		return this.appEvent;
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
	 * Get appStoreVersionExperiment
	 *
	 * @return appStoreVersionExperiment
	 **/
	@JsonProperty("appStoreVersionExperiment")
	public AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperiment getAppStoreVersionExperiment() {
		return this.appStoreVersionExperiment;
	}

	public void setAppCustomProductPageVersion(
			AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
		this.appCustomProductPageVersion = appCustomProductPageVersion;
	}

	public void setAppEvent(AppEventLocalizationRelationshipsAppEvent appEvent) {
		this.appEvent = appEvent;
	}

	public void setAppStoreVersion(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	public void setAppStoreVersionExperiment(
			AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperiment appStoreVersionExperiment) {
		this.appStoreVersionExperiment = appStoreVersionExperiment;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReviewSubmissionItemRelationships {\n");

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
