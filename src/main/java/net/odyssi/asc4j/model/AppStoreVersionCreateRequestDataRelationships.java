package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 3194946768258304885L;

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

	private AppStoreVersionCreateRequestDataRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations;
	private AppStoreVersionCreateRequestDataRelationshipsBuild build;

	public AppStoreVersionCreateRequestDataRelationships app(
			AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public AppStoreVersionCreateRequestDataRelationships appStoreVersionLocalizations(
			AppStoreVersionCreateRequestDataRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations) {
		this.appStoreVersionLocalizations = appStoreVersionLocalizations;
		return this;
	}

	public AppStoreVersionCreateRequestDataRelationships build(
			AppStoreVersionCreateRequestDataRelationshipsBuild build) {
		this.build = build;
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
	 * Get appStoreVersionLocalizations
	 *
	 * @return appStoreVersionLocalizations
	 **/
	@JsonProperty("appStoreVersionLocalizations")
	public AppStoreVersionCreateRequestDataRelationshipsAppStoreVersionLocalizations getAppStoreVersionLocalizations() {
		return this.appStoreVersionLocalizations;
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

	public void setApp(AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
	}

	public void setAppStoreVersionLocalizations(
			AppStoreVersionCreateRequestDataRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations) {
		this.appStoreVersionLocalizations = appStoreVersionLocalizations;
	}

	public void setBuild(AppStoreVersionCreateRequestDataRelationshipsBuild build) {
		this.build = build;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionCreateRequestDataRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    appStoreVersionLocalizations: ").append(toIndentedString(this.appStoreVersionLocalizations))
				.append("\n");
		sb.append("    build: ").append(toIndentedString(this.build)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
