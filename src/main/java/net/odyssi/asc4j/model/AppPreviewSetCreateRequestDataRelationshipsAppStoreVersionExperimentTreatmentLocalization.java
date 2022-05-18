package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionExperimentTreatmentLocalization
		implements Serializable {

	private static final long serialVersionUID = -2321830115794584046L;

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

	private AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData data;

	public AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionExperimentTreatmentLocalization data(
			AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData getData() {
		return this.data;
	}

	public void setData(AppPreviewSetRelationshipsAppStoreVersionExperimentTreatmentLocalizationData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"class AppPreviewSetCreateRequestDataRelationshipsAppStoreVersionExperimentTreatmentLocalization {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
