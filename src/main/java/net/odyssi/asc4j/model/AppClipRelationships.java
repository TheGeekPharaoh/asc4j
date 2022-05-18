package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipRelationships implements Serializable {

	private static final long serialVersionUID = -3363727798907837513L;

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
	private AppClipRelationshipsAppClipDefaultExperiences appClipDefaultExperiences;

	public AppClipRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public AppClipRelationships appClipDefaultExperiences(
			AppClipRelationshipsAppClipDefaultExperiences appClipDefaultExperiences) {
		this.appClipDefaultExperiences = appClipDefaultExperiences;
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
	 * Get appClipDefaultExperiences
	 *
	 * @return appClipDefaultExperiences
	 **/
	@JsonProperty("appClipDefaultExperiences")
	public AppClipRelationshipsAppClipDefaultExperiences getAppClipDefaultExperiences() {
		return this.appClipDefaultExperiences;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setAppClipDefaultExperiences(AppClipRelationshipsAppClipDefaultExperiences appClipDefaultExperiences) {
		this.appClipDefaultExperiences = appClipDefaultExperiences;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    appClipDefaultExperiences: ").append(toIndentedString(this.appClipDefaultExperiences))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
