package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionLocalizationRelationships implements Serializable {

	private static final long serialVersionUID = 4903014761478178523L;

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

	private AppCustomProductPageLocalizationRelationshipsAppPreviewSets appPreviewSets;

	private AppCustomProductPageLocalizationRelationshipsAppScreenshotSets appScreenshotSets;
	private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion;

	public AppStoreVersionLocalizationRelationships appPreviewSets(
			AppCustomProductPageLocalizationRelationshipsAppPreviewSets appPreviewSets) {
		this.appPreviewSets = appPreviewSets;
		return this;
	}

	public AppStoreVersionLocalizationRelationships appScreenshotSets(
			AppCustomProductPageLocalizationRelationshipsAppScreenshotSets appScreenshotSets) {
		this.appScreenshotSets = appScreenshotSets;
		return this;
	}

	public AppStoreVersionLocalizationRelationships appStoreVersion(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
		return this;
	}

	/**
	 * Get appPreviewSets
	 *
	 * @return appPreviewSets
	 **/
	@JsonProperty("appPreviewSets")
	public AppCustomProductPageLocalizationRelationshipsAppPreviewSets getAppPreviewSets() {
		return this.appPreviewSets;
	}

	/**
	 * Get appScreenshotSets
	 *
	 * @return appScreenshotSets
	 **/
	@JsonProperty("appScreenshotSets")
	public AppCustomProductPageLocalizationRelationshipsAppScreenshotSets getAppScreenshotSets() {
		return this.appScreenshotSets;
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

	public void setAppPreviewSets(AppCustomProductPageLocalizationRelationshipsAppPreviewSets appPreviewSets) {
		this.appPreviewSets = appPreviewSets;
	}

	public void setAppScreenshotSets(AppCustomProductPageLocalizationRelationshipsAppScreenshotSets appScreenshotSets) {
		this.appScreenshotSets = appScreenshotSets;
	}

	public void setAppStoreVersion(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionLocalizationRelationships {\n");

		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("    appScreenshotSets: ").append(toIndentedString(this.appScreenshotSets)).append("\n");
		sb.append("    appPreviewSets: ").append(toIndentedString(this.appPreviewSets)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
