package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceRelationships implements Serializable {

	private static final long serialVersionUID = -3986935912078706850L;

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

	private AppClipAdvancedExperienceRelationshipsAppClip appClip;

	private AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetail appClipAppStoreReviewDetail;

	private AppClipDefaultExperienceRelationshipsAppClipDefaultExperienceLocalizations appClipDefaultExperienceLocalizations;
	private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion;

	public AppClipDefaultExperienceRelationships appClip(AppClipAdvancedExperienceRelationshipsAppClip appClip) {
		this.appClip = appClip;
		return this;
	}

	public AppClipDefaultExperienceRelationships appClipAppStoreReviewDetail(
			AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetail appClipAppStoreReviewDetail) {
		this.appClipAppStoreReviewDetail = appClipAppStoreReviewDetail;
		return this;
	}

	public AppClipDefaultExperienceRelationships appClipDefaultExperienceLocalizations(
			AppClipDefaultExperienceRelationshipsAppClipDefaultExperienceLocalizations appClipDefaultExperienceLocalizations) {
		this.appClipDefaultExperienceLocalizations = appClipDefaultExperienceLocalizations;
		return this;
	}

	/**
	 * Get appClip
	 *
	 * @return appClip
	 **/
	@JsonProperty("appClip")
	public AppClipAdvancedExperienceRelationshipsAppClip getAppClip() {
		return this.appClip;
	}

	/**
	 * Get appClipAppStoreReviewDetail
	 *
	 * @return appClipAppStoreReviewDetail
	 **/
	@JsonProperty("appClipAppStoreReviewDetail")
	public AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetail getAppClipAppStoreReviewDetail() {
		return this.appClipAppStoreReviewDetail;
	}

	/**
	 * Get appClipDefaultExperienceLocalizations
	 *
	 * @return appClipDefaultExperienceLocalizations
	 **/
	@JsonProperty("appClipDefaultExperienceLocalizations")
	public AppClipDefaultExperienceRelationshipsAppClipDefaultExperienceLocalizations getAppClipDefaultExperienceLocalizations() {
		return this.appClipDefaultExperienceLocalizations;
	}

	/**
	 * Get releaseWithAppStoreVersion
	 *
	 * @return releaseWithAppStoreVersion
	 **/
	@JsonProperty("releaseWithAppStoreVersion")
	public AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion getReleaseWithAppStoreVersion() {
		return this.releaseWithAppStoreVersion;
	}

	public AppClipDefaultExperienceRelationships releaseWithAppStoreVersion(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion) {
		this.releaseWithAppStoreVersion = releaseWithAppStoreVersion;
		return this;
	}

	public void setAppClip(AppClipAdvancedExperienceRelationshipsAppClip appClip) {
		this.appClip = appClip;
	}

	public void setAppClipAppStoreReviewDetail(
			AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetail appClipAppStoreReviewDetail) {
		this.appClipAppStoreReviewDetail = appClipAppStoreReviewDetail;
	}

	public void setAppClipDefaultExperienceLocalizations(
			AppClipDefaultExperienceRelationshipsAppClipDefaultExperienceLocalizations appClipDefaultExperienceLocalizations) {
		this.appClipDefaultExperienceLocalizations = appClipDefaultExperienceLocalizations;
	}

	public void setReleaseWithAppStoreVersion(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion) {
		this.releaseWithAppStoreVersion = releaseWithAppStoreVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceRelationships {\n");

		sb.append("    appClip: ").append(toIndentedString(this.appClip)).append("\n");
		sb.append("    releaseWithAppStoreVersion: ").append(toIndentedString(this.releaseWithAppStoreVersion))
				.append("\n");
		sb.append("    appClipDefaultExperienceLocalizations: ")
				.append(toIndentedString(this.appClipDefaultExperienceLocalizations)).append("\n");
		sb.append("    appClipAppStoreReviewDetail: ").append(toIndentedString(this.appClipAppStoreReviewDetail))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
