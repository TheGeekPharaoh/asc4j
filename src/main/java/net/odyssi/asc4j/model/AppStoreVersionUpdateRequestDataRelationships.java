package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionUpdateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 2303687515909319092L;

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

	private AppClipDefaultExperienceCreateRequestDataRelationshipsAppClipDefaultExperienceTemplate appClipDefaultExperience;
	private AppStoreVersionCreateRequestDataRelationshipsBuild build;

	public AppStoreVersionUpdateRequestDataRelationships appClipDefaultExperience(
			AppClipDefaultExperienceCreateRequestDataRelationshipsAppClipDefaultExperienceTemplate appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
		return this;
	}

	public AppStoreVersionUpdateRequestDataRelationships build(
			AppStoreVersionCreateRequestDataRelationshipsBuild build) {
		this.build = build;
		return this;
	}

	/**
	 * Get appClipDefaultExperience
	 *
	 * @return appClipDefaultExperience
	 **/
	@JsonProperty("appClipDefaultExperience")
	public AppClipDefaultExperienceCreateRequestDataRelationshipsAppClipDefaultExperienceTemplate getAppClipDefaultExperience() {
		return this.appClipDefaultExperience;
	}

	/**
	 * Get build
	 *
	 * @return build
	 **/
	@JsonProperty("build")
	public AppStoreVersionCreateRequestDataRelationshipsBuild getBuild() {
		return this.build;
	}

	public void setAppClipDefaultExperience(
			AppClipDefaultExperienceCreateRequestDataRelationshipsAppClipDefaultExperienceTemplate appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
	}

	public void setBuild(AppStoreVersionCreateRequestDataRelationshipsBuild build) {
		this.build = build;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionUpdateRequestDataRelationships {\n");

		sb.append("    build: ").append(toIndentedString(this.build)).append("\n");
		sb.append("    appClipDefaultExperience: ").append(toIndentedString(this.appClipDefaultExperience))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
