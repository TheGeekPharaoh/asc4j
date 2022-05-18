package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentTreatmentCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -7076878818893759833L;

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

	private AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperiment appStoreVersionExperiment;

	public AppStoreVersionExperimentTreatmentCreateRequestDataRelationships appStoreVersionExperiment(
			AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperiment appStoreVersionExperiment) {
		this.appStoreVersionExperiment = appStoreVersionExperiment;
		return this;
	}

	/**
	 * Get appStoreVersionExperiment
	 *
	 * @return appStoreVersionExperiment
	 **/
	@JsonProperty("appStoreVersionExperiment")
	public AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperiment getAppStoreVersionExperiment() {
		return this.appStoreVersionExperiment;
	}

	public void setAppStoreVersionExperiment(
			AppStoreVersionExperimentTreatmentCreateRequestDataRelationshipsAppStoreVersionExperiment appStoreVersionExperiment) {
		this.appStoreVersionExperiment = appStoreVersionExperiment;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentTreatmentCreateRequestDataRelationships {\n");

		sb.append("    appStoreVersionExperiment: ").append(toIndentedString(this.appStoreVersionExperiment))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
