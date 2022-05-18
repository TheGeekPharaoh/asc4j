package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceLocalizationAttributes implements Serializable {

	private static final long serialVersionUID = -4222338514496069870L;

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
	private String subtitle;

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
	 * Get subtitle
	 *
	 * @return subtitle
	 **/
	@JsonProperty("subtitle")
	public String getSubtitle() {
		return this.subtitle;
	}

	public AppClipDefaultExperienceLocalizationAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public AppClipDefaultExperienceLocalizationAttributes subtitle(String subtitle) {
		this.subtitle = subtitle;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceLocalizationAttributes {\n");

		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("    subtitle: ").append(toIndentedString(this.subtitle)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
