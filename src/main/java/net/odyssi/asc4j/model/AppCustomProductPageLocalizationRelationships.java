package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageLocalizationRelationships implements Serializable {

	private static final long serialVersionUID = 7723337219456913617L;

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

	private AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersion appCustomProductPageVersion;

	private AppCustomProductPageLocalizationRelationshipsAppPreviewSets appPreviewSets;
	private AppCustomProductPageLocalizationRelationshipsAppScreenshotSets appScreenshotSets;

	public AppCustomProductPageLocalizationRelationships appCustomProductPageVersion(
			AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
		this.appCustomProductPageVersion = appCustomProductPageVersion;
		return this;
	}

	public AppCustomProductPageLocalizationRelationships appPreviewSets(
			AppCustomProductPageLocalizationRelationshipsAppPreviewSets appPreviewSets) {
		this.appPreviewSets = appPreviewSets;
		return this;
	}

	public AppCustomProductPageLocalizationRelationships appScreenshotSets(
			AppCustomProductPageLocalizationRelationshipsAppScreenshotSets appScreenshotSets) {
		this.appScreenshotSets = appScreenshotSets;
		return this;
	}

	/**
	 * Get appCustomProductPageVersion
	 *
	 * @return appCustomProductPageVersion
	 **/
	@JsonProperty("appCustomProductPageVersion")
	public AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersion getAppCustomProductPageVersion() {
		return this.appCustomProductPageVersion;
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

	public void setAppCustomProductPageVersion(
			AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
		this.appCustomProductPageVersion = appCustomProductPageVersion;
	}

	public void setAppPreviewSets(AppCustomProductPageLocalizationRelationshipsAppPreviewSets appPreviewSets) {
		this.appPreviewSets = appPreviewSets;
	}

	public void setAppScreenshotSets(AppCustomProductPageLocalizationRelationshipsAppScreenshotSets appScreenshotSets) {
		this.appScreenshotSets = appScreenshotSets;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageLocalizationRelationships {\n");

		sb.append("    appCustomProductPageVersion: ").append(toIndentedString(this.appCustomProductPageVersion))
				.append("\n");
		sb.append("    appScreenshotSets: ").append(toIndentedString(this.appScreenshotSets)).append("\n");
		sb.append("    appPreviewSets: ").append(toIndentedString(this.appPreviewSets)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
