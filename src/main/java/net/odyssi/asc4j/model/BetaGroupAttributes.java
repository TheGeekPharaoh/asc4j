package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaGroupAttributes implements Serializable {

	private static final long serialVersionUID = -560740924406775987L;

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

	private OffsetDateTime createdDate;

	private Boolean feedbackEnabled;

	private Boolean hasAccessToAllBuilds;

	private Boolean iosBuildsAvailableForAppleSiliconMac;

	private Boolean isInternalGroup;

	private String name;

	private String publicLink;

	private Boolean publicLinkEnabled;

	private String publicLinkId;

	private Integer publicLinkLimit;
	private Boolean publicLinkLimitEnabled;

	public BetaGroupAttributes createdDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public BetaGroupAttributes feedbackEnabled(Boolean feedbackEnabled) {
		this.feedbackEnabled = feedbackEnabled;
		return this;
	}

	/**
	 * Get createdDate
	 *
	 * @return createdDate
	 **/
	@JsonProperty("createdDate")
	public OffsetDateTime getCreatedDate() {
		return this.createdDate;
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
	 * Get publicLink
	 *
	 * @return publicLink
	 **/
	@JsonProperty("publicLink")
	public String getPublicLink() {
		return this.publicLink;
	}

	/**
	 * Get publicLinkId
	 *
	 * @return publicLinkId
	 **/
	@JsonProperty("publicLinkId")
	public String getPublicLinkId() {
		return this.publicLinkId;
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

	public BetaGroupAttributes hasAccessToAllBuilds(Boolean hasAccessToAllBuilds) {
		this.hasAccessToAllBuilds = hasAccessToAllBuilds;
		return this;
	}

	public BetaGroupAttributes iosBuildsAvailableForAppleSiliconMac(Boolean iosBuildsAvailableForAppleSiliconMac) {
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
	 * Get hasAccessToAllBuilds
	 *
	 * @return hasAccessToAllBuilds
	 **/
	@JsonProperty("hasAccessToAllBuilds")
	public Boolean isHasAccessToAllBuilds() {
		return this.hasAccessToAllBuilds;
	}

	public BetaGroupAttributes isInternalGroup(Boolean isInternalGroup) {
		this.isInternalGroup = isInternalGroup;
		return this;
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

	public BetaGroupAttributes name(String name) {
		this.name = name;
		return this;
	}

	public BetaGroupAttributes publicLink(String publicLink) {
		this.publicLink = publicLink;
		return this;
	}

	public BetaGroupAttributes publicLinkEnabled(Boolean publicLinkEnabled) {
		this.publicLinkEnabled = publicLinkEnabled;
		return this;
	}

	public BetaGroupAttributes publicLinkId(String publicLinkId) {
		this.publicLinkId = publicLinkId;
		return this;
	}

	public BetaGroupAttributes publicLinkLimit(Integer publicLinkLimit) {
		this.publicLinkLimit = publicLinkLimit;
		return this;
	}

	public BetaGroupAttributes publicLinkLimitEnabled(Boolean publicLinkLimitEnabled) {
		this.publicLinkLimitEnabled = publicLinkLimitEnabled;
		return this;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setFeedbackEnabled(Boolean feedbackEnabled) {
		this.feedbackEnabled = feedbackEnabled;
	}

	public void setHasAccessToAllBuilds(Boolean hasAccessToAllBuilds) {
		this.hasAccessToAllBuilds = hasAccessToAllBuilds;
	}

	public void setIosBuildsAvailableForAppleSiliconMac(Boolean iosBuildsAvailableForAppleSiliconMac) {
		this.iosBuildsAvailableForAppleSiliconMac = iosBuildsAvailableForAppleSiliconMac;
	}

	public void setIsInternalGroup(Boolean isInternalGroup) {
		this.isInternalGroup = isInternalGroup;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPublicLink(String publicLink) {
		this.publicLink = publicLink;
	}

	public void setPublicLinkEnabled(Boolean publicLinkEnabled) {
		this.publicLinkEnabled = publicLinkEnabled;
	}

	public void setPublicLinkId(String publicLinkId) {
		this.publicLinkId = publicLinkId;
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
		sb.append("class BetaGroupAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(this.createdDate)).append("\n");
		sb.append("    isInternalGroup: ").append(toIndentedString(this.isInternalGroup)).append("\n");
		sb.append("    hasAccessToAllBuilds: ").append(toIndentedString(this.hasAccessToAllBuilds)).append("\n");
		sb.append("    publicLinkEnabled: ").append(toIndentedString(this.publicLinkEnabled)).append("\n");
		sb.append("    publicLinkId: ").append(toIndentedString(this.publicLinkId)).append("\n");
		sb.append("    publicLinkLimitEnabled: ").append(toIndentedString(this.publicLinkLimitEnabled)).append("\n");
		sb.append("    publicLinkLimit: ").append(toIndentedString(this.publicLinkLimit)).append("\n");
		sb.append("    publicLink: ").append(toIndentedString(this.publicLink)).append("\n");
		sb.append("    feedbackEnabled: ").append(toIndentedString(this.feedbackEnabled)).append("\n");
		sb.append("    iosBuildsAvailableForAppleSiliconMac: ")
				.append(toIndentedString(this.iosBuildsAvailableForAppleSiliconMac)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
