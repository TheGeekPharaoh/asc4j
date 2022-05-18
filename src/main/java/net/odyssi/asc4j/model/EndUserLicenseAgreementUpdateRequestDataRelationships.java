package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndUserLicenseAgreementUpdateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -5559623271376371285L;

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

	private AppUpdateRequestDataRelationshipsAvailableTerritories territories;

	/**
	 * Get territories
	 *
	 * @return territories
	 **/
	@JsonProperty("territories")
	public AppUpdateRequestDataRelationshipsAvailableTerritories getTerritories() {
		return this.territories;
	}

	public void setTerritories(AppUpdateRequestDataRelationshipsAvailableTerritories territories) {
		this.territories = territories;
	}

	public EndUserLicenseAgreementUpdateRequestDataRelationships territories(
			AppUpdateRequestDataRelationshipsAvailableTerritories territories) {
		this.territories = territories;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EndUserLicenseAgreementUpdateRequestDataRelationships {\n");

		sb.append("    territories: ").append(toIndentedString(this.territories)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
