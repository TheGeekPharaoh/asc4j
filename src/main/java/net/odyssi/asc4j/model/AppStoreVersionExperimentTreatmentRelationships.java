package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentTreatmentRelationships implements Serializable {

	private static final long serialVersionUID = 3115086950945519119L;

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

	private AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperiment appStoreVersionExperiment;
	private AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations appStoreVersionExperimentTreatmentLocalizations;

	public AppStoreVersionExperimentTreatmentRelationships appStoreVersionExperiment(
			AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperiment appStoreVersionExperiment) {
		this.appStoreVersionExperiment = appStoreVersionExperiment;
		return this;
	}

	public AppStoreVersionExperimentTreatmentRelationships appStoreVersionExperimentTreatmentLocalizations(
			AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations appStoreVersionExperimentTreatmentLocalizations) {
		this.appStoreVersionExperimentTreatmentLocalizations = appStoreVersionExperimentTreatmentLocalizations;
		return this;
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

	/**
	 * Get appStoreVersionExperimentTreatmentLocalizations
	 *
	 * @return appStoreVersionExperimentTreatmentLocalizations
	 **/
	@JsonProperty("appStoreVersionExperimentTreatmentLocalizations")
	public AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations getAppStoreVersionExperimentTreatmentLocalizations() {
		return this.appStoreVersionExperimentTreatmentLocalizations;
	}

	public void setAppStoreVersionExperiment(
			AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperiment appStoreVersionExperiment) {
		this.appStoreVersionExperiment = appStoreVersionExperiment;
	}

	public void setAppStoreVersionExperimentTreatmentLocalizations(
			AppStoreVersionExperimentTreatmentRelationshipsAppStoreVersionExperimentTreatmentLocalizations appStoreVersionExperimentTreatmentLocalizations) {
		this.appStoreVersionExperimentTreatmentLocalizations = appStoreVersionExperimentTreatmentLocalizations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentTreatmentRelationships {\n");

		sb.append("    appStoreVersionExperiment: ").append(toIndentedString(this.appStoreVersionExperiment))
				.append("\n");
		sb.append("    appStoreVersionExperimentTreatmentLocalizations: ")
				.append(toIndentedString(this.appStoreVersionExperimentTreatmentLocalizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
