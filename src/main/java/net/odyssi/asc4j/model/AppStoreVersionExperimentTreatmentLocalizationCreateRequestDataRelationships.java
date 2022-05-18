package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -2580957908316166879L;

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

	private AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationshipsAppStoreVersionExperimentTreatment appStoreVersionExperimentTreatment;

	public AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationships appStoreVersionExperimentTreatment(
			AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationshipsAppStoreVersionExperimentTreatment appStoreVersionExperimentTreatment) {
		this.appStoreVersionExperimentTreatment = appStoreVersionExperimentTreatment;
		return this;
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

	public void setAppStoreVersionExperimentTreatment(
			AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationshipsAppStoreVersionExperimentTreatment appStoreVersionExperimentTreatment) {
		this.appStoreVersionExperimentTreatment = appStoreVersionExperimentTreatment;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentTreatmentLocalizationCreateRequestDataRelationships {\n");

		sb.append("    appStoreVersionExperimentTreatment: ")
				.append(toIndentedString(this.appStoreVersionExperimentTreatment)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
