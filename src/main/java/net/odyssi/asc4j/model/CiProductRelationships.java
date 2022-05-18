package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiProductRelationships implements Serializable {

	private static final long serialVersionUID = 7145772493583200794L;

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

	private CiProductRelationshipsBundleId bundleId;
	private CiProductRelationshipsPrimaryRepositories primaryRepositories;

	public CiProductRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public CiProductRelationships bundleId(CiProductRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
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
	 * Get bundleId
	 *
	 * @return bundleId
	 **/
	@JsonProperty("bundleId")
	public CiProductRelationshipsBundleId getBundleId() {
		return this.bundleId;
	}

	/**
	 * Get primaryRepositories
	 *
	 * @return primaryRepositories
	 **/
	@JsonProperty("primaryRepositories")
	public CiProductRelationshipsPrimaryRepositories getPrimaryRepositories() {
		return this.primaryRepositories;
	}

	public CiProductRelationships primaryRepositories(CiProductRelationshipsPrimaryRepositories primaryRepositories) {
		this.primaryRepositories = primaryRepositories;
		return this;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setBundleId(CiProductRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
	}

	public void setPrimaryRepositories(CiProductRelationshipsPrimaryRepositories primaryRepositories) {
		this.primaryRepositories = primaryRepositories;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiProductRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    bundleId: ").append(toIndentedString(this.bundleId)).append("\n");
		sb.append("    primaryRepositories: ").append(toIndentedString(this.primaryRepositories)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
