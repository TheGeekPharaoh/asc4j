package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppScreenshotSetRelationships implements Serializable {

	private static final long serialVersionUID = -1699253306341292386L;

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

	private AppPreviewSetRelationshipsAppCustomProductPageLocalization appCustomProductPageLocalization;

	private AppScreenshotSetRelationshipsAppScreenshots appScreenshots;

	private AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalization appStoreVersionExperimentTreatmentLocalization;
	private AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization;

	public AppScreenshotSetRelationships appCustomProductPageLocalization(
			AppPreviewSetRelationshipsAppCustomProductPageLocalization appCustomProductPageLocalization) {
		this.appCustomProductPageLocalization = appCustomProductPageLocalization;
		return this;
	}

	public AppScreenshotSetRelationships appScreenshots(AppScreenshotSetRelationshipsAppScreenshots appScreenshots) {
		this.appScreenshots = appScreenshots;
		return this;
	}

	public AppScreenshotSetRelationships appStoreVersionExperimentTreatmentLocalization(
			AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalization appStoreVersionExperimentTreatmentLocalization) {
		this.appStoreVersionExperimentTreatmentLocalization = appStoreVersionExperimentTreatmentLocalization;
		return this;
	}

	public AppScreenshotSetRelationships appStoreVersionLocalization(
			AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
		this.appStoreVersionLocalization = appStoreVersionLocalization;
		return this;
	}

	/**
	 * Get appCustomProductPageLocalization
	 *
	 * @return appCustomProductPageLocalization
	 **/
	@JsonProperty("appCustomProductPageLocalization")
	public AppPreviewSetRelationshipsAppCustomProductPageLocalization getAppCustomProductPageLocalization() {
		return this.appCustomProductPageLocalization;
	}

	/**
	 * Get appScreenshots
	 *
	 * @return appScreenshots
	 **/
	@JsonProperty("appScreenshots")
	public AppScreenshotSetRelationshipsAppScreenshots getAppScreenshots() {
		return this.appScreenshots;
	}

	/**
	 * Get appStoreVersionExperimentTreatmentLocalization
	 *
	 * @return appStoreVersionExperimentTreatmentLocalization
	 **/
	@JsonProperty("appStoreVersionExperimentTreatmentLocalization")
	public AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalization getAppStoreVersionExperimentTreatmentLocalization() {
		return this.appStoreVersionExperimentTreatmentLocalization;
	}

	/**
	 * Get appStoreVersionLocalization
	 *
	 * @return appStoreVersionLocalization
	 **/
	@JsonProperty("appStoreVersionLocalization")
	public AppPreviewSetRelationshipsAppStoreVersionLocalization getAppStoreVersionLocalization() {
		return this.appStoreVersionLocalization;
	}

	public void setAppCustomProductPageLocalization(
			AppPreviewSetRelationshipsAppCustomProductPageLocalization appCustomProductPageLocalization) {
		this.appCustomProductPageLocalization = appCustomProductPageLocalization;
	}

	public void setAppScreenshots(AppScreenshotSetRelationshipsAppScreenshots appScreenshots) {
		this.appScreenshots = appScreenshots;
	}

	public void setAppStoreVersionExperimentTreatmentLocalization(
			AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalization appStoreVersionExperimentTreatmentLocalization) {
		this.appStoreVersionExperimentTreatmentLocalization = appStoreVersionExperimentTreatmentLocalization;
	}

	public void setAppStoreVersionLocalization(
			AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
		this.appStoreVersionLocalization = appStoreVersionLocalization;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppScreenshotSetRelationships {\n");

		sb.append("    appStoreVersionLocalization: ").append(toIndentedString(this.appStoreVersionLocalization))
				.append("\n");
		sb.append("    appCustomProductPageLocalization: ")
				.append(toIndentedString(this.appCustomProductPageLocalization)).append("\n");
		sb.append("    appStoreVersionExperimentTreatmentLocalization: ")
				.append(toIndentedString(this.appStoreVersionExperimentTreatmentLocalization)).append("\n");
		sb.append("    appScreenshots: ").append(toIndentedString(this.appScreenshots)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
