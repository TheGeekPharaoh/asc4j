package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -4027956158833836190L;

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

	private AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip;

	private AppClipDefaultExperienceCreateRequestDataRelationshipsAppClipDefaultExperienceTemplate appClipDefaultExperienceTemplate;
	private AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion;

	public AppClipDefaultExperienceCreateRequestDataRelationships appClip(
			AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip) {
		this.appClip = appClip;
		return this;
	}

	public AppClipDefaultExperienceCreateRequestDataRelationships appClipDefaultExperienceTemplate(
			AppClipDefaultExperienceCreateRequestDataRelationshipsAppClipDefaultExperienceTemplate appClipDefaultExperienceTemplate) {
		this.appClipDefaultExperienceTemplate = appClipDefaultExperienceTemplate;
		return this;
	}

	/**
	 * Get appClip
	 *
	 * @return appClip
	 **/
	@JsonProperty("appClip")
	public AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip getAppClip() {
		return this.appClip;
	}

	/**
	 * Get appClipDefaultExperienceTemplate
	 *
	 * @return appClipDefaultExperienceTemplate
	 **/
	@JsonProperty("appClipDefaultExperienceTemplate")
	public AppClipDefaultExperienceCreateRequestDataRelationshipsAppClipDefaultExperienceTemplate getAppClipDefaultExperienceTemplate() {
		return this.appClipDefaultExperienceTemplate;
	}

	/**
	 * Get releaseWithAppStoreVersion
	 *
	 * @return releaseWithAppStoreVersion
	 **/
	@JsonProperty("releaseWithAppStoreVersion")
	public AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion getReleaseWithAppStoreVersion() {
		return this.releaseWithAppStoreVersion;
	}

	public AppClipDefaultExperienceCreateRequestDataRelationships releaseWithAppStoreVersion(
			AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion) {
		this.releaseWithAppStoreVersion = releaseWithAppStoreVersion;
		return this;
	}

	public void setAppClip(AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip) {
		this.appClip = appClip;
	}

	public void setAppClipDefaultExperienceTemplate(
			AppClipDefaultExperienceCreateRequestDataRelationshipsAppClipDefaultExperienceTemplate appClipDefaultExperienceTemplate) {
		this.appClipDefaultExperienceTemplate = appClipDefaultExperienceTemplate;
	}

	public void setReleaseWithAppStoreVersion(
			AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion) {
		this.releaseWithAppStoreVersion = releaseWithAppStoreVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceCreateRequestDataRelationships {\n");

		sb.append("    appClip: ").append(toIndentedString(this.appClip)).append("\n");
		sb.append("    releaseWithAppStoreVersion: ").append(toIndentedString(this.releaseWithAppStoreVersion))
				.append("\n");
		sb.append("    appClipDefaultExperienceTemplate: ")
				.append(toIndentedString(this.appClipDefaultExperienceTemplate)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
