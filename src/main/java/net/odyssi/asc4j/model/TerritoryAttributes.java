package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TerritoryAttributes implements Serializable {

	private static final long serialVersionUID = -7881648034224524571L;

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

	private String currency;

	public TerritoryAttributes currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 *
	 * @return currency
	 **/
	@JsonProperty("currency")
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TerritoryAttributes {\n");

		sb.append("    currency: ").append(toIndentedString(this.currency)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
