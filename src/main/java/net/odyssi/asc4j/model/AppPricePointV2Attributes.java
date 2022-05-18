package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPricePointV2Attributes implements Serializable {

	private static final long serialVersionUID = -4204638474424306625L;

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

	private String customerPrice;
	private String proceeds;

	public AppPricePointV2Attributes customerPrice(String customerPrice) {
		this.customerPrice = customerPrice;
		return this;
	}

	/**
	 * Get customerPrice
	 *
	 * @return customerPrice
	 **/
	@JsonProperty("customerPrice")
	public String getCustomerPrice() {
		return this.customerPrice;
	}

	/**
	 * Get proceeds
	 *
	 * @return proceeds
	 **/
	@JsonProperty("proceeds")
	public String getProceeds() {
		return this.proceeds;
	}

	public AppPricePointV2Attributes proceeds(String proceeds) {
		this.proceeds = proceeds;
		return this;
	}

	public void setCustomerPrice(String customerPrice) {
		this.customerPrice = customerPrice;
	}

	public void setProceeds(String proceeds) {
		this.proceeds = proceeds;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPricePointV2Attributes {\n");

		sb.append("    customerPrice: ").append(toIndentedString(this.customerPrice)).append("\n");
		sb.append("    proceeds: ").append(toIndentedString(this.proceeds)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
