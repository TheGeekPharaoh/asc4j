package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppLocalizationAttributes implements Serializable {

	private static final long serialVersionUID = -1484365207569981593L;

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

	private String feedbackEmail;

	private String locale;

	private String marketingUrl;

	private String privacyPolicyUrl;
	private String tvOsPrivacyPolicy;

	public BetaAppLocalizationAttributes description(String description) {
		this.description = description;
		return this;
	}

	public BetaAppLocalizationAttributes feedbackEmail(String feedbackEmail) {
		this.feedbackEmail = feedbackEmail;
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
	 * Get feedbackEmail
	 *
	 * @return feedbackEmail
	 **/
	@JsonProperty("feedbackEmail")
	public String getFeedbackEmail() {
		return this.feedbackEmail;
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
	public String getMarketingUrl() {
		return this.marketingUrl;
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
	 * Get tvOsPrivacyPolicy
	 *
	 * @return tvOsPrivacyPolicy
	 **/
	@JsonProperty("tvOsPrivacyPolicy")
	public String getTvOsPrivacyPolicy() {
		return this.tvOsPrivacyPolicy;
	}

	public BetaAppLocalizationAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public BetaAppLocalizationAttributes marketingUrl(String marketingUrl) {
		this.marketingUrl = marketingUrl;
		return this;
	}

	public BetaAppLocalizationAttributes privacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFeedbackEmail(String feedbackEmail) {
		this.feedbackEmail = feedbackEmail;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public void setMarketingUrl(String marketingUrl) {
		this.marketingUrl = marketingUrl;
	}

	public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
	}

	public void setTvOsPrivacyPolicy(String tvOsPrivacyPolicy) {
		this.tvOsPrivacyPolicy = tvOsPrivacyPolicy;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppLocalizationAttributes {\n");

		sb.append("    feedbackEmail: ").append(toIndentedString(this.feedbackEmail)).append("\n");
		sb.append("    marketingUrl: ").append(toIndentedString(this.marketingUrl)).append("\n");
		sb.append("    privacyPolicyUrl: ").append(toIndentedString(this.privacyPolicyUrl)).append("\n");
		sb.append("    tvOsPrivacyPolicy: ").append(toIndentedString(this.tvOsPrivacyPolicy)).append("\n");
		sb.append("    description: ").append(toIndentedString(this.description)).append("\n");
		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BetaAppLocalizationAttributes tvOsPrivacyPolicy(String tvOsPrivacyPolicy) {
		this.tvOsPrivacyPolicy = tvOsPrivacyPolicy;
		return this;
	}
}
