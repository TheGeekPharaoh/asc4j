package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageRelationships implements Serializable {

	private static final long serialVersionUID = -2755826104564580265L;

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

	private AppClipRelationshipsApp app;
	private AppCustomProductPageRelationshipsAppCustomProductPageVersions appCustomProductPageVersions;

	public AppCustomProductPageRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public AppCustomProductPageRelationships appCustomProductPageVersions(
			AppCustomProductPageRelationshipsAppCustomProductPageVersions appCustomProductPageVersions) {
		this.appCustomProductPageVersions = appCustomProductPageVersions;
		return this;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/
	@JsonProperty("app")
	public AppClipRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get appCustomProductPageVersions
	 *
	 * @return appCustomProductPageVersions
	 **/
	@JsonProperty("appCustomProductPageVersions")
	public AppCustomProductPageRelationshipsAppCustomProductPageVersions getAppCustomProductPageVersions() {
		return this.appCustomProductPageVersions;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setAppCustomProductPageVersions(
			AppCustomProductPageRelationshipsAppCustomProductPageVersions appCustomProductPageVersions) {
		this.appCustomProductPageVersions = appCustomProductPageVersions;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    appCustomProductPageVersions: ").append(toIndentedString(this.appCustomProductPageVersions))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
