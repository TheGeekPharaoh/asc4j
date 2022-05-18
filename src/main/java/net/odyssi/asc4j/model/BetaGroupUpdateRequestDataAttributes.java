package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaGroupUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 1976730083342626685L;

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

	private Boolean feedbackEnabled;

	private Boolean iosBuildsAvailableForAppleSiliconMac;

	private String name;

	private Boolean publicLinkEnabled;

	private Integer publicLinkLimit;
	private Boolean publicLinkLimitEnabled;

	public BetaGroupUpdateRequestDataAttributes feedbackEnabled(Boolean feedbackEnabled) {
		this.feedbackEnabled = feedbackEnabled;
		return this;
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
	 * Get publicLinkLimit
	 *
	 * @return publicLinkLimit
	 **/
	@JsonProperty("publicLinkLimit")
	public Integer getPublicLinkLimit() {
		return this.publicLinkLimit;
	}

	public BetaGroupUpdateRequestDataAttributes iosBuildsAvailableForAppleSiliconMac(
			Boolean iosBuildsAvailableForAppleSiliconMac) {
		this.iosBuildsAvailableForAppleSiliconMac = iosBuildsAvailableForAppleSiliconMac;
		return this;
	}

	/**
	 * Get feedbackEnabled
	 *
	 * @return feedbackEnabled
	 **/
	@JsonProperty("feedbackEnabled")
	public Boolean isFeedbackEnabled() {
		return this.feedbackEnabled;
	}

	/**
	 * Get iosBuildsAvailableForAppleSiliconMac
	 *
	 * @return iosBuildsAvailableForAppleSiliconMac
	 **/
	@JsonProperty("iosBuildsAvailableForAppleSiliconMac")
	public Boolean isIosBuildsAvailableForAppleSiliconMac() {
		return this.iosBuildsAvailableForAppleSiliconMac;
	}

	/**
	 * Get publicLinkEnabled
	 *
	 * @return publicLinkEnabled
	 **/
	@JsonProperty("publicLinkEnabled")
	public Boolean isPublicLinkEnabled() {
		return this.publicLinkEnabled;
	}

	/**
	 * Get publicLinkLimitEnabled
	 *
	 * @return publicLinkLimitEnabled
	 **/
	@JsonProperty("publicLinkLimitEnabled")
	public Boolean isPublicLinkLimitEnabled() {
		return this.publicLinkLimitEnabled;
	}

	public BetaGroupUpdateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public BetaGroupUpdateRequestDataAttributes publicLinkEnabled(Boolean publicLinkEnabled) {
		this.publicLinkEnabled = publicLinkEnabled;
		return this;
	}

	public BetaGroupUpdateRequestDataAttributes publicLinkLimit(Integer publicLinkLimit) {
		this.publicLinkLimit = publicLinkLimit;
		return this;
	}

	public BetaGroupUpdateRequestDataAttributes publicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
		this.publicLinkLimitEnabled = publicLinkLimitEnabled;
		return this;
	}

	public void setFeedbackEnabled(Boolean feedbackEnabled) {
		this.feedbackEnabled = feedbackEnabled;
	}

	public void setIosBuildsAvailableForAppleSiliconMac(Boolean iosBuildsAvailableForAppleSiliconMac) {
		this.iosBuildsAvailableForAppleSiliconMac = iosBuildsAvailableForAppleSiliconMac;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPublicLinkEnabled(Boolean publicLinkEnabled) {
		this.publicLinkEnabled = publicLinkEnabled;
	}

	public void setPublicLinkLimit(Integer publicLinkLimit) {
		this.publicLinkLimit = publicLinkLimit;
	}

	public void setPublicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
		this.publicLinkLimitEnabled = publicLinkLimitEnabled;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaGroupUpdateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    publicLinkEnabled: ").append(toIndentedString(this.publicLinkEnabled)).append("\n");
		sb.append("    publicLinkLimitEnabled: ").append(toIndentedString(this.publicLinkLimitEnabled)).append("\n");
		sb.append("    publicLinkLimit: ").append(toIndentedString(this.publicLinkLimit)).append("\n");
		sb.append("    feedbackEnabled: ").append(toIndentedString(this.feedbackEnabled)).append("\n");
		sb.append("    iosBuildsAvailableForAppleSiliconMac: ")
				.append(toIndentedString(this.iosBuildsAvailableForAppleSiliconMac)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
