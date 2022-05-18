package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionLocalizationCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 7022911260044629250L;

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

	private String description;

	private String keywords;

	private String locale;

	private URI marketingUrl;

	private String promotionalText;

	private URI supportUrl;
	private String whatsNew;

	public AppStoreVersionLocalizationCreateRequestDataAttributes description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	/**
	 * Get keywords
	 *
	 * @return keywords
	 **/
	@JsonProperty("keywords")
	public String getKeywords() {
		return this.keywords;
	}

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
	 * Get marketingUrl
	 *
	 * @return marketingUrl
	 **/
	@JsonProperty("marketingUrl")
	public URI getMarketingUrl() {
		return this.marketingUrl;
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

	/**
	 * Get supportUrl
	 *
	 * @return supportUrl
	 **/
	@JsonProperty("supportUrl")
	public URI getSupportUrl() {
		return this.supportUrl;
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

	public AppStoreVersionLocalizationCreateRequestDataAttributes keywords(String keywords) {
		this.keywords = keywords;
		return this;
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes marketingUrl(URI marketingUrl) {
		this.marketingUrl = marketingUrl;
		return this;
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes promotionalText(String promotionalText) {
		this.promotionalText = promotionalText;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setMarketingUrl(URI marketingUrl) {
		this.marketingUrl = marketingUrl;
	}

	public void setPromotionalText(String promotionalText) {
		this.promotionalText = promotionalText;
	}

	public void setSupportUrl(URI supportUrl) {
		this.supportUrl = supportUrl;
	}

	public void setWhatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes supportUrl(URI supportUrl) {
		this.supportUrl = supportUrl;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionLocalizationCreateRequestDataAttributes {\n");

		sb.append("    description: ").append(toIndentedString(this.description)).append("\n");
		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("    keywords: ").append(toIndentedString(this.keywords)).append("\n");
		sb.append("    marketingUrl: ").append(toIndentedString(this.marketingUrl)).append("\n");
		sb.append("    promotionalText: ").append(toIndentedString(this.promotionalText)).append("\n");
		sb.append("    supportUrl: ").append(toIndentedString(this.supportUrl)).append("\n");
		sb.append("    whatsNew: ").append(toIndentedString(this.whatsNew)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionLocalizationCreateRequestDataAttributes whatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
		return this;
	}
}
