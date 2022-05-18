package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageLocalizationUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 1236727002825324045L;

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

	private String promotionalText;

	/**
	 * Get promotionalText
	 *
	 * @return promotionalText
	 **/
	@JsonProperty("promotionalText")
	public String getPromotionalText() {
		return this.promotionalText;
	}

	public AppCustomProductPageLocalizationUpdateRequestDataAttributes promotionalText(String promotionalText) {
		this.promotionalText = promotionalText;
		return this;
	}

	public void setPromotionalText(String promotionalText) {
		this.promotionalText = promotionalText;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageLocalizationUpdateRequestDataAttributes {\n");

		sb.append("    promotionalText: ").append(toIndentedString(this.promotionalText)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
