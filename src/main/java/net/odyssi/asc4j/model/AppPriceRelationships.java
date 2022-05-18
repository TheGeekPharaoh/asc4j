package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPriceRelationships implements Serializable {

	private static final long serialVersionUID = 3791513997806464046L;

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

	public AppPriceRelationships app(AppClipRelationshipsApp app) {
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

	public AppPriceRelationships priceTier(AppPricePointV2RelationshipsPriceTier priceTier) {
		this.priceTier = priceTier;
		return this;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setPriceTier(AppPricePointV2RelationshipsPriceTier priceTier) {
		this.priceTier = priceTier;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPriceRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    priceTier: ").append(toIndentedString(this.priceTier)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
