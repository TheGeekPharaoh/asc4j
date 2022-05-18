package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndUserLicenseAgreementRelationships implements Serializable {

	private static final long serialVersionUID = 5238972449381090608L;

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
	private AppRelationshipsAvailableTerritories territories;

	public EndUserLicenseAgreementRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
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
	 * Get territories
	 *
	 * @return territories
	 **/
	@JsonProperty("territories")
	public AppRelationshipsAvailableTerritories getTerritories() {
		return this.territories;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setTerritories(AppRelationshipsAvailableTerritories territories) {
		this.territories = territories;
	}

	public EndUserLicenseAgreementRelationships territories(AppRelationshipsAvailableTerritories territories) {
		this.territories = territories;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EndUserLicenseAgreementRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    territories: ").append(toIndentedString(this.territories)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
