package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentRelationships implements Serializable {

	private static final long serialVersionUID = -7311602954238029059L;

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

	private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion;
	private AppStoreVersionExperimentRelationshipsAppStoreVersionExperimentTreatments appStoreVersionExperimentTreatments;

	public AppStoreVersionExperimentRelationships appStoreVersion(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
		return this;
	}

	public AppStoreVersionExperimentRelationships appStoreVersionExperimentTreatments(
			AppStoreVersionExperimentRelationshipsAppStoreVersionExperimentTreatments appStoreVersionExperimentTreatments) {
		this.appStoreVersionExperimentTreatments = appStoreVersionExperimentTreatments;
		return this;
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
	 * Get appStoreVersionExperimentTreatments
	 *
	 * @return appStoreVersionExperimentTreatments
	 **/
	@JsonProperty("appStoreVersionExperimentTreatments")
	public AppStoreVersionExperimentRelationshipsAppStoreVersionExperimentTreatments getAppStoreVersionExperimentTreatments() {
		return this.appStoreVersionExperimentTreatments;
	}

	public void setAppStoreVersion(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	public void setAppStoreVersionExperimentTreatments(
			AppStoreVersionExperimentRelationshipsAppStoreVersionExperimentTreatments appStoreVersionExperimentTreatments) {
		this.appStoreVersionExperimentTreatments = appStoreVersionExperimentTreatments;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentRelationships {\n");

		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("    appStoreVersionExperimentTreatments: ")
				.append(toIndentedString(this.appStoreVersionExperimentTreatments)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
