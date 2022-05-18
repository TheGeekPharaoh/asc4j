package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndUserLicenseAgreementCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -2024204794160153441L;

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
	private EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories territories;

	public EndUserLicenseAgreementCreateRequestDataRelationships app(
			AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
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
	 * Get territories
	 *
	 * @return territories
	 **/
	@JsonProperty("territories")
	public EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories getTerritories() {
		return this.territories;
	}

	public void setApp(AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
	}

	public void setTerritories(EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories territories) {
		this.territories = territories;
	}

	public EndUserLicenseAgreementCreateRequestDataRelationships territories(
			EndUserLicenseAgreementCreateRequestDataRelationshipsTerritories territories) {
		this.territories = territories;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EndUserLicenseAgreementCreateRequestDataRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    territories: ").append(toIndentedString(this.territories)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
