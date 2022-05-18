package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionSubmissionRelationships implements Serializable {

	private static final long serialVersionUID = 8164129637885483030L;

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

	public AppStoreVersionSubmissionRelationships appStoreVersion(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
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

	public void setAppStoreVersion(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionSubmissionRelationships {\n");

		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
