package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameCenterEnabledVersionRelationships implements Serializable {

	private static final long serialVersionUID = 4234049889835008109L;

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
	private AppRelationshipsGameCenterEnabledVersions compatibleVersions;

	public GameCenterEnabledVersionRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public GameCenterEnabledVersionRelationships compatibleVersions(
			AppRelationshipsGameCenterEnabledVersions compatibleVersions) {
		this.compatibleVersions = compatibleVersions;
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
	 * Get compatibleVersions
	 *
	 * @return compatibleVersions
	 **/
	@JsonProperty("compatibleVersions")
	public AppRelationshipsGameCenterEnabledVersions getCompatibleVersions() {
		return this.compatibleVersions;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setCompatibleVersions(AppRelationshipsGameCenterEnabledVersions compatibleVersions) {
		this.compatibleVersions = compatibleVersions;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GameCenterEnabledVersionRelationships {\n");

		sb.append("    compatibleVersions: ").append(toIndentedString(this.compatibleVersions)).append("\n");
		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
