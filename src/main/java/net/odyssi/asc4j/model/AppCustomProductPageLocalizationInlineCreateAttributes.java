package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageLocalizationInlineCreateAttributes implements Serializable {

	private static final long serialVersionUID = 7301645803968974938L;

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

	private String locale;
	private String promotionalText;

	/**
	 * Get locale
	 *
	 * @return locale
	 **/
	@JsonProperty("locale")
	public String getLocale() {
		return this.locale;
	}

	/**
	 * Get promotionalText
	 *
	 * @return promotionalText
	 **/
	@JsonProperty("promotionalText")
	public String getPromotionalText() {
		return this.promotionalText;
	}

	public AppCustomProductPageLocalizationInlineCreateAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public AppCustomProductPageLocalizationInlineCreateAttributes promotionalText(String promotionalText) {
		this.promotionalText = promotionalText;
		return this;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setPromotionalText(String promotionalText) {
		this.promotionalText = promotionalText;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageLocalizationInlineCreateAttributes {\n");

		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("    promotionalText: ").append(toIndentedString(this.promotionalText)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
