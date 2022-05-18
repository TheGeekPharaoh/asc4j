package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppUpdateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 5064014339300166654L;

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

	private AppUpdateRequestDataRelationshipsAvailableTerritories availableTerritories;
	private AppUpdateRequestDataRelationshipsPrices prices;

	public AppUpdateRequestDataRelationships availableTerritories(
			AppUpdateRequestDataRelationshipsAvailableTerritories availableTerritories) {
		this.availableTerritories = availableTerritories;
		return this;
	}

	/**
	 * Get availableTerritories
	 *
	 * @return availableTerritories
	 **/
	@JsonProperty("availableTerritories")
	public AppUpdateRequestDataRelationshipsAvailableTerritories getAvailableTerritories() {
		return this.availableTerritories;
	}

	/**
	 * Get prices
	 *
	 * @return prices
	 **/
	@JsonProperty("prices")
	public AppUpdateRequestDataRelationshipsPrices getPrices() {
		return this.prices;
	}

	public AppUpdateRequestDataRelationships prices(AppUpdateRequestDataRelationshipsPrices prices) {
		this.prices = prices;
		return this;
	}

	public void setAvailableTerritories(AppUpdateRequestDataRelationshipsAvailableTerritories availableTerritories) {
		this.availableTerritories = availableTerritories;
	}

	public void setPrices(AppUpdateRequestDataRelationshipsPrices prices) {
		this.prices = prices;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppUpdateRequestDataRelationships {\n");

		sb.append("    prices: ").append(toIndentedString(this.prices)).append("\n");
		sb.append("    availableTerritories: ").append(toIndentedString(this.availableTerritories)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
