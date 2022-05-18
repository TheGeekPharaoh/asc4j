package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPricePointRelationships implements Serializable {

	private static final long serialVersionUID = 4451082812175479767L;

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

	private AppPricePointV2RelationshipsPriceTier priceTier;
	private AppPricePointV2RelationshipsTerritory territory;

	/**
	 * Get priceTier
	 *
	 * @return priceTier
	 **/
	@JsonProperty("priceTier")
	public AppPricePointV2RelationshipsPriceTier getPriceTier() {
		return this.priceTier;
	}

	/**
	 * Get territory
	 *
	 * @return territory
	 **/
	@JsonProperty("territory")
	public AppPricePointV2RelationshipsTerritory getTerritory() {
		return this.territory;
	}

	public AppPricePointRelationships priceTier(AppPricePointV2RelationshipsPriceTier priceTier) {
		this.priceTier = priceTier;
		return this;
	}

	public void setPriceTier(AppPricePointV2RelationshipsPriceTier priceTier) {
		this.priceTier = priceTier;
	}

	public void setTerritory(AppPricePointV2RelationshipsTerritory territory) {
		this.territory = territory;
	}

	public AppPricePointRelationships territory(AppPricePointV2RelationshipsTerritory territory) {
		this.territory = territory;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPricePointRelationships {\n");

		sb.append("    priceTier: ").append(toIndentedString(this.priceTier)).append("\n");
		sb.append("    territory: ").append(toIndentedString(this.territory)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
