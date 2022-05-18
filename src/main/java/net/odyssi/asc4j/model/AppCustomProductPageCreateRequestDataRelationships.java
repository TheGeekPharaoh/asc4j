package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 155866587987127443L;

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

	private AppCustomProductPageCreateRequestDataRelationshipsApp app;

	private AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions appCustomProductPageVersions;

	private AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersionTemplate;
	private AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage customProductPageTemplate;

	public AppCustomProductPageCreateRequestDataRelationships app(
			AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public AppCustomProductPageCreateRequestDataRelationships appCustomProductPageVersions(
			AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions appCustomProductPageVersions) {
		this.appCustomProductPageVersions = appCustomProductPageVersions;
		return this;
	}

	public AppCustomProductPageCreateRequestDataRelationships appStoreVersionTemplate(
			AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersionTemplate) {
		this.appStoreVersionTemplate = appStoreVersionTemplate;
		return this;
	}

	public AppCustomProductPageCreateRequestDataRelationships customProductPageTemplate(
			AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage customProductPageTemplate) {
		this.customProductPageTemplate = customProductPageTemplate;
		return this;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/
	@JsonProperty("app")
	public AppCustomProductPageCreateRequestDataRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get appCustomProductPageVersions
	 *
	 * @return appCustomProductPageVersions
	 **/
	@JsonProperty("appCustomProductPageVersions")
	public AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions getAppCustomProductPageVersions() {
		return this.appCustomProductPageVersions;
	}

	/**
	 * Get appStoreVersionTemplate
	 *
	 * @return appStoreVersionTemplate
	 **/
	@JsonProperty("appStoreVersionTemplate")
	public AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion getAppStoreVersionTemplate() {
		return this.appStoreVersionTemplate;
	}

	/**
	 * Get customProductPageTemplate
	 *
	 * @return customProductPageTemplate
	 **/
	@JsonProperty("customProductPageTemplate")
	public AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage getCustomProductPageTemplate() {
		return this.customProductPageTemplate;
	}

	public void setApp(AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
	}

	public void setAppCustomProductPageVersions(
			AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions appCustomProductPageVersions) {
		this.appCustomProductPageVersions = appCustomProductPageVersions;
	}

	public void setAppStoreVersionTemplate(
			AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion appStoreVersionTemplate) {
		this.appStoreVersionTemplate = appStoreVersionTemplate;
	}

	public void setCustomProductPageTemplate(
			AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage customProductPageTemplate) {
		this.customProductPageTemplate = customProductPageTemplate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageCreateRequestDataRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    appCustomProductPageVersions: ").append(toIndentedString(this.appCustomProductPageVersions))
				.append("\n");
		sb.append("    appStoreVersionTemplate: ").append(toIndentedString(this.appStoreVersionTemplate)).append("\n");
		sb.append("    customProductPageTemplate: ").append(toIndentedString(this.customProductPageTemplate))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
