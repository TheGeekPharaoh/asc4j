package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppClipInvocationLocalizationAttributes implements Serializable {

	private static final long serialVersionUID = 7416480079457724552L;

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
	private String title;

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
	 * Get title
	 *
	 * @return title
	 **/
	@JsonProperty("title")
	public String getTitle() {
		return this.title;
	}

	public BetaAppClipInvocationLocalizationAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BetaAppClipInvocationLocalizationAttributes title(String title) {
		this.title = title;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppClipInvocationLocalizationAttributes {\n");

		sb.append("    title: ").append(toIndentedString(this.title)).append("\n");
		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
