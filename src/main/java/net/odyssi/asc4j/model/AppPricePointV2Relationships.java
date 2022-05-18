package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPricePointV2Relationships implements Serializable {

	private static final long serialVersionUID = 8527596936455987464L;

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

	private AppPricePointV2RelationshipsPriceTier priceTier;
	private AppPricePointV2RelationshipsTerritory territory;

	public AppPricePointV2Relationships app(AppClipRelationshipsApp app) {
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

	public AppPricePointV2Relationships priceTier(AppPricePointV2RelationshipsPriceTier priceTier) {
		this.priceTier = priceTier;
		return this;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setPriceTier(AppPricePointV2RelationshipsPriceTier priceTier) {
		this.priceTier = priceTier;
	}

	public void setTerritory(AppPricePointV2RelationshipsTerritory territory) {
		this.territory = territory;
	}

	public AppPricePointV2Relationships territory(AppPricePointV2RelationshipsTerritory territory) {
		this.territory = territory;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPricePointV2Relationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    priceTier: ").append(toIndentedString(this.priceTier)).append("\n");
		sb.append("    territory: ").append(toIndentedString(this.territory)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
