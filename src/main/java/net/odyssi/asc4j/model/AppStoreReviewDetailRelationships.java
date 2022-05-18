package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreReviewDetailRelationships implements Serializable {

	private static final long serialVersionUID = 3547931088137868501L;

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

	private AppStoreReviewDetailRelationshipsAppStoreReviewAttachments appStoreReviewAttachments;
	private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion;

	public AppStoreReviewDetailRelationships appStoreReviewAttachments(
			AppStoreReviewDetailRelationshipsAppStoreReviewAttachments appStoreReviewAttachments) {
		this.appStoreReviewAttachments = appStoreReviewAttachments;
		return this;
	}

	public AppStoreReviewDetailRelationships appStoreVersion(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
		return this;
	}

	/**
	 * Get appStoreReviewAttachments
	 *
	 * @return appStoreReviewAttachments
	 **/
	@JsonProperty("appStoreReviewAttachments")
	public AppStoreReviewDetailRelationshipsAppStoreReviewAttachments getAppStoreReviewAttachments() {
		return this.appStoreReviewAttachments;
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

	public void setAppStoreReviewAttachments(
			AppStoreReviewDetailRelationshipsAppStoreReviewAttachments appStoreReviewAttachments) {
		this.appStoreReviewAttachments = appStoreReviewAttachments;
	}

	public void setAppStoreVersion(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreReviewDetailRelationships {\n");

		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("    appStoreReviewAttachments: ").append(toIndentedString(this.appStoreReviewAttachments))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
