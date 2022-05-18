package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfoLocalizationCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -106659098490684113L;

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

	private String name;

	private String privacyChoicesUrl;

	private String privacyPolicyText;

	private String privacyPolicyUrl;
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
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get privacyChoicesUrl
	 *
	 * @return privacyChoicesUrl
	 **/
	@JsonProperty("privacyChoicesUrl")
	public String getPrivacyChoicesUrl() {
		return this.privacyChoicesUrl;
	}

	/**
	 * Get privacyPolicyText
	 *
	 * @return privacyPolicyText
	 **/
	@JsonProperty("privacyPolicyText")
	public String getPrivacyPolicyText() {
		return this.privacyPolicyText;
	}

	/**
	 * Get privacyPolicyUrl
	 *
	 * @return privacyPolicyUrl
	 **/
	@JsonProperty("privacyPolicyUrl")
	public String getPrivacyPolicyUrl() {
		return this.privacyPolicyUrl;
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

	public AppInfoLocalizationCreateRequestDataAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public AppInfoLocalizationCreateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public AppInfoLocalizationCreateRequestDataAttributes privacyChoicesUrl(String privacyChoicesUrl) {
		this.privacyChoicesUrl = privacyChoicesUrl;
		return this;
	}

	public AppInfoLocalizationCreateRequestDataAttributes privacyPolicyText(String privacyPolicyText) {
		this.privacyPolicyText = privacyPolicyText;
		return this;
	}

	public AppInfoLocalizationCreateRequestDataAttributes privacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
		return this;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrivacyChoicesUrl(String privacyChoicesUrl) {
		this.privacyChoicesUrl = privacyChoicesUrl;
	}

	public void setPrivacyPolicyText(String privacyPolicyText) {
		this.privacyPolicyText = privacyPolicyText;
	}

	public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public AppInfoLocalizationCreateRequestDataAttributes subtitle(String subtitle) {
		this.subtitle = subtitle;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppInfoLocalizationCreateRequestDataAttributes {\n");

		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    subtitle: ").append(toIndentedString(this.subtitle)).append("\n");
		sb.append("    privacyPolicyUrl: ").append(toIndentedString(this.privacyPolicyUrl)).append("\n");
		sb.append("    privacyChoicesUrl: ").append(toIndentedString(this.privacyChoicesUrl)).append("\n");
		sb.append("    privacyPolicyText: ").append(toIndentedString(this.privacyPolicyText)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
