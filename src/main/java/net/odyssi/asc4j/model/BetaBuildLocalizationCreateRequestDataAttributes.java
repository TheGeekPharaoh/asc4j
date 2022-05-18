package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaBuildLocalizationCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 359633088986380037L;

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
	private String whatsNew;

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
	 * Get whatsNew
	 *
	 * @return whatsNew
	 **/
	@JsonProperty("whatsNew")
	public String getWhatsNew() {
		return this.whatsNew;
	}

	public BetaBuildLocalizationCreateRequestDataAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setWhatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaBuildLocalizationCreateRequestDataAttributes {\n");

		sb.append("    whatsNew: ").append(toIndentedString(this.whatsNew)).append("\n");
		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BetaBuildLocalizationCreateRequestDataAttributes whatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
		return this;
	}
}
