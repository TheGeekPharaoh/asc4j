package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreviewSetRelationships implements Serializable {

	private static final long serialVersionUID = 6747867145796867081L;

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

	private AppPreviewSetRelationshipsAppPreviews appPreviews;

	private AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalization appStoreVersionExperimentTreatmentLocalization;
	private AppPreviewSetRelationshipsAppStoreVersionLocalization appStoreVersionLocalization;

	public AppPreviewSetRelationships appCustomProductPageLocalization(
			AppPreviewSetRelationshipsAppCustomProductPageLocalization appCustomProductPageLocalization) {
		this.appCustomProductPageLocalization = appCustomProductPageLocalization;
		return this;
	}

	public AppPreviewSetRelationships appPreviews(AppPreviewSetRelationshipsAppPreviews appPreviews) {
		this.appPreviews = appPreviews;
		return this;
	}

	public AppPreviewSetRelationships appStoreVersionExperimentTreatmentLocalization(
			AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalization appStoreVersionExperimentTreatmentLocalization) {
		this.appStoreVersionExperimentTreatmentLocalization = appStoreVersionExperimentTreatmentLocalization;
		return this;
	}

	public AppPreviewSetRelationships appStoreVersionLocalization(
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
	 * Get appPreviews
	 *
	 * @return appPreviews
	 **/
	@JsonProperty("appPreviews")
	public AppPreviewSetRelationshipsAppPreviews getAppPreviews() {
		return this.appPreviews;
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

	public void setAppPreviews(AppPreviewSetRelationshipsAppPreviews appPreviews) {
		this.appPreviews = appPreviews;
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
		sb.append("class AppPreviewSetRelationships {\n");

		sb.append("    appStoreVersionLocalization: ").append(toIndentedString(this.appStoreVersionLocalization))
				.append("\n");
		sb.append("    appCustomProductPageLocalization: ")
				.append(toIndentedString(this.appCustomProductPageLocalization)).append("\n");
		sb.append("    appStoreVersionExperimentTreatmentLocalization: ")
				.append(toIndentedString(this.appStoreVersionExperimentTreatmentLocalization)).append("\n");
		sb.append("    appPreviews: ").append(toIndentedString(this.appPreviews)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
