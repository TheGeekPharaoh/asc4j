package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionPromotionCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -2912745019311031608L;

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

	private AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion;
	private AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationshipsAppStoreVersionExperimentTreatment appStoreVersionExperimentTreatment;

	public AppStoreVersionPromotionCreateRequestDataRelationships appStoreVersion(
			AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
		return this;
	}

	public AppStoreVersionPromotionCreateRequestDataRelationships appStoreVersionExperimentTreatment(
			AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationshipsAppStoreVersionExperimentTreatment appStoreVersionExperimentTreatment) {
		this.appStoreVersionExperimentTreatment = appStoreVersionExperimentTreatment;
		return this;
	}

	/**
	 * Get appStoreVersion
	 *
	 * @return appStoreVersion
	 **/
	@JsonProperty("appStoreVersion")
	public AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion getAppStoreVersion() {
		return this.appStoreVersion;
	}

	/**
	 * Get appStoreVersionExperimentTreatment
	 *
	 * @return appStoreVersionExperimentTreatment
	 **/
	@JsonProperty("appStoreVersionExperimentTreatment")
	public AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationshipsAppStoreVersionExperimentTreatment getAppStoreVersionExperimentTreatment() {
		return this.appStoreVersionExperimentTreatment;
	}

	public void setAppStoreVersion(AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	public void setAppStoreVersionExperimentTreatment(
			AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationshipsAppStoreVersionExperimentTreatment appStoreVersionExperimentTreatment) {
		this.appStoreVersionExperimentTreatment = appStoreVersionExperimentTreatment;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionPromotionCreateRequestDataRelationships {\n");

		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("    appStoreVersionExperimentTreatment: ")
				.append(toIndentedString(this.appStoreVersionExperimentTreatment)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
