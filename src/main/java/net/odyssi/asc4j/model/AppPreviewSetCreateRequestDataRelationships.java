package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreviewSetCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 5443271252374372513L;

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

	private AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization appCustomProductPageLocalization;

	private AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionExperimentTreatmentLocalization appStoreVersionExperimentTreatmentLocalization;
	private AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization appStoreVersionLocalization;

	public AppPreviewSetCreateRequestDataRelationships appCustomProductPageLocalization(
			AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization appCustomProductPageLocalization) {
		this.appCustomProductPageLocalization = appCustomProductPageLocalization;
		return this;
	}

	public AppPreviewSetCreateRequestDataRelationships appStoreVersionExperimentTreatmentLocalization(
			AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionExperimentTreatmentLocalization appStoreVersionExperimentTreatmentLocalization) {
		this.appStoreVersionExperimentTreatmentLocalization = appStoreVersionExperimentTreatmentLocalization;
		return this;
	}

	public AppPreviewSetCreateRequestDataRelationships appStoreVersionLocalization(
			AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
		this.appStoreVersionLocalization = appStoreVersionLocalization;
		return this;
	}

	/**
	 * Get appCustomProductPageLocalization
	 *
	 * @return appCustomProductPageLocalization
	 **/
	@JsonProperty("appCustomProductPageLocalization")
	public AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization getAppCustomProductPageLocalization() {
		return this.appCustomProductPageLocalization;
	}

	/**
	 * Get appStoreVersionExperimentTreatmentLocalization
	 *
	 * @return appStoreVersionExperimentTreatmentLocalization
	 **/
	@JsonProperty("appStoreVersionExperimentTreatmentLocalization")
	public AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionExperimentTreatmentLocalization getAppStoreVersionExperimentTreatmentLocalization() {
		return this.appStoreVersionExperimentTreatmentLocalization;
	}

	/**
	 * Get appStoreVersionLocalization
	 *
	 * @return appStoreVersionLocalization
	 **/
	@JsonProperty("appStoreVersionLocalization")
	public AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization getAppStoreVersionLocalization() {
		return this.appStoreVersionLocalization;
	}

	public void setAppCustomProductPageLocalization(
			AppPreviewSetCreateRequestDataRelationshipsAppCustomProductPageLocalization appCustomProductPageLocalization) {
		this.appCustomProductPageLocalization = appCustomProductPageLocalization;
	}

	public void setAppStoreVersionExperimentTreatmentLocalization(
			AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionExperimentTreatmentLocalization appStoreVersionExperimentTreatmentLocalization) {
		this.appStoreVersionExperimentTreatmentLocalization = appStoreVersionExperimentTreatmentLocalization;
	}

	public void setAppStoreVersionLocalization(
			AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionLocalization appStoreVersionLocalization) {
		this.appStoreVersionLocalization = appStoreVersionLocalization;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreviewSetCreateRequestDataRelationships {\n");

		sb.append("    appStoreVersionLocalization: ").append(toIndentedString(this.appStoreVersionLocalization))
				.append("\n");
		sb.append("    appCustomProductPageLocalization: ")
				.append(toIndentedString(this.appCustomProductPageLocalization)).append("\n");
		sb.append("    appStoreVersionExperimentTreatmentLocalization: ")
				.append(toIndentedString(this.appStoreVersionExperimentTreatmentLocalization)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
