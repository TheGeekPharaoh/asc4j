package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPriceTierRelationships implements Serializable {

	private static final long serialVersionUID = -7956404944708767914L;

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

	private AppPriceTierRelationshipsPricePoints pricePoints;

	/**
	 * Get pricePoints
	 *
	 * @return pricePoints
	 **/
	@JsonProperty("pricePoints")
	public AppPriceTierRelationshipsPricePoints getPricePoints() {
		return this.pricePoints;
	}

	public AppPriceTierRelationships pricePoints(AppPriceTierRelationshipsPricePoints pricePoints) {
		this.pricePoints = pricePoints;
		return this;
	}

	public void setPricePoints(AppPriceTierRelationshipsPricePoints pricePoints) {
		this.pricePoints = pricePoints;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPriceTierRelationships {\n");

		sb.append("    pricePoints: ").append(toIndentedString(this.pricePoints)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
