package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaGroupCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -7272757669714611506L;

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

	private Boolean hasAccessToAllBuilds;

	private Boolean isInternalGroup;

	private String name;

	private Boolean publicLinkEnabled;

	private Integer publicLinkLimit;
	private Boolean publicLinkLimitEnabled;

	public BetaGroupCreateRequestDataAttributes feedbackEnabled(Boolean feedbackEnabled) {
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

	public BetaGroupCreateRequestDataAttributes hasAccessToAllBuilds(Boolean hasAccessToAllBuilds) {
		this.hasAccessToAllBuilds = hasAccessToAllBuilds;
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
	 * Get hasAccessToAllBuilds
	 *
	 * @return hasAccessToAllBuilds
	 **/
	@JsonProperty("hasAccessToAllBuilds")
	public Boolean isHasAccessToAllBuilds() {
		return this.hasAccessToAllBuilds;
	}

	public BetaGroupCreateRequestDataAttributes isInternalGroup(Boolean isInternalGroup) {
		this.isInternalGroup = isInternalGroup;
		return this;
	}

	/**
	 * Get isInternalGroup
	 *
	 * @return isInternalGroup
	 **/
	@JsonProperty("isInternalGroup")
	public Boolean isIsInternalGroup() {
		return this.isInternalGroup;
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

	public BetaGroupCreateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public BetaGroupCreateRequestDataAttributes publicLinkEnabled(Boolean publicLinkEnabled) {
		this.publicLinkEnabled = publicLinkEnabled;
		return this;
	}

	public BetaGroupCreateRequestDataAttributes publicLinkLimit(Integer publicLinkLimit) {
		this.publicLinkLimit = publicLinkLimit;
		return this;
	}

	public BetaGroupCreateRequestDataAttributes publicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
		this.publicLinkLimitEnabled = publicLinkLimitEnabled;
		return this;
	}

	public void setFeedbackEnabled(Boolean feedbackEnabled) {
		this.feedbackEnabled = feedbackEnabled;
	}

	public void setHasAccessToAllBuilds(Boolean hasAccessToAllBuilds) {
		this.hasAccessToAllBuilds = hasAccessToAllBuilds;
	}

	public void setIsInternalGroup(Boolean isInternalGroup) {
		this.isInternalGroup = isInternalGroup;
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
		sb.append("class BetaGroupCreateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    isInternalGroup: ").append(toIndentedString(this.isInternalGroup)).append("\n");
		sb.append("    hasAccessToAllBuilds: ").append(toIndentedString(this.hasAccessToAllBuilds)).append("\n");
		sb.append("    publicLinkEnabled: ").append(toIndentedString(this.publicLinkEnabled)).append("\n");
		sb.append("    publicLinkLimitEnabled: ").append(toIndentedString(this.publicLinkLimitEnabled)).append("\n");
		sb.append("    publicLinkLimit: ").append(toIndentedString(this.publicLinkLimit)).append("\n");
		sb.append("    feedbackEnabled: ").append(toIndentedString(this.feedbackEnabled)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
