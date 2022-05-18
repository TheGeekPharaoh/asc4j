package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppUpdateRequestDataAttributes implements Serializable {

	public enum ContentRightsDeclarationEnum {

		DOES_NOT_USE_THIRD_PARTY_CONTENT(String.valueOf("DOES_NOT_USE_THIRD_PARTY_CONTENT")),
		USES_THIRD_PARTY_CONTENT(String.valueOf("USES_THIRD_PARTY_CONTENT"));

		public static ContentRightsDeclarationEnum fromValue(String value) {
			for (ContentRightsDeclarationEnum b : ContentRightsDeclarationEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ContentRightsDeclarationEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = 7925881796959269385L;

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

	private Boolean availableInNewTerritories;

	private String bundleId;

	private ContentRightsDeclarationEnum contentRightsDeclaration;

	private String primaryLocale;

	private URI subscriptionStatusUrl;

	private URI subscriptionStatusUrlForSandbox;

	private SubscriptionStatusUrlVersion subscriptionStatusUrlVersion;
	private SubscriptionStatusUrlVersion subscriptionStatusUrlVersionForSandbox;

	public AppUpdateRequestDataAttributes availableInNewTerritories(Boolean availableInNewTerritories) {
		this.availableInNewTerritories = availableInNewTerritories;
		return this;
	}

	public AppUpdateRequestDataAttributes bundleId(String bundleId) {
		this.bundleId = bundleId;
		return this;
	}

	public AppUpdateRequestDataAttributes contentRightsDeclaration(
			ContentRightsDeclarationEnum contentRightsDeclaration) {
		this.contentRightsDeclaration = contentRightsDeclaration;
		return this;
	}

	/**
	 * Get bundleId
	 *
	 * @return bundleId
	 **/
	@JsonProperty("bundleId")
	public String getBundleId() {
		return this.bundleId;
	}

	/**
	 * Get contentRightsDeclaration
	 *
	 * @return contentRightsDeclaration
	 **/
	@JsonProperty("contentRightsDeclaration")
	public String getContentRightsDeclaration() {
		if (this.contentRightsDeclaration == null) {
			return null;
		}
		return this.contentRightsDeclaration.value();
	}

	/**
	 * Get primaryLocale
	 *
	 * @return primaryLocale
	 **/
	@JsonProperty("primaryLocale")
	public String getPrimaryLocale() {
		return this.primaryLocale;
	}

	/**
	 * Get subscriptionStatusUrl
	 *
	 * @return subscriptionStatusUrl
	 **/
	@JsonProperty("subscriptionStatusUrl")
	public URI getSubscriptionStatusUrl() {
		return this.subscriptionStatusUrl;
	}

	/**
	 * Get subscriptionStatusUrlForSandbox
	 *
	 * @return subscriptionStatusUrlForSandbox
	 **/
	@JsonProperty("subscriptionStatusUrlForSandbox")
	public URI getSubscriptionStatusUrlForSandbox() {
		return this.subscriptionStatusUrlForSandbox;
	}

	/**
	 * Get subscriptionStatusUrlVersion
	 *
	 * @return subscriptionStatusUrlVersion
	 **/
	@JsonProperty("subscriptionStatusUrlVersion")
	public SubscriptionStatusUrlVersion getSubscriptionStatusUrlVersion() {
		return this.subscriptionStatusUrlVersion;
	}

	/**
	 * Get subscriptionStatusUrlVersionForSandbox
	 *
	 * @return subscriptionStatusUrlVersionForSandbox
	 **/
	@JsonProperty("subscriptionStatusUrlVersionForSandbox")
	public SubscriptionStatusUrlVersion getSubscriptionStatusUrlVersionForSandbox() {
		return this.subscriptionStatusUrlVersionForSandbox;
	}

	/**
	 * Get availableInNewTerritories
	 *
	 * @return availableInNewTerritories
	 **/
	@JsonProperty("availableInNewTerritories")
	public Boolean isAvailableInNewTerritories() {
		return this.availableInNewTerritories;
	}

	public AppUpdateRequestDataAttributes primaryLocale(String primaryLocale) {
		this.primaryLocale = primaryLocale;
		return this;
	}

	public void setAvailableInNewTerritories(Boolean availableInNewTerritories) {
		this.availableInNewTerritories = availableInNewTerritories;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public void setContentRightsDeclaration(ContentRightsDeclarationEnum contentRightsDeclaration) {
		this.contentRightsDeclaration = contentRightsDeclaration;
	}

	public void setPrimaryLocale(String primaryLocale) {
		this.primaryLocale = primaryLocale;
	}

	public void setSubscriptionStatusUrl(URI subscriptionStatusUrl) {
		this.subscriptionStatusUrl = subscriptionStatusUrl;
	}

	public void setSubscriptionStatusUrlForSandbox(URI subscriptionStatusUrlForSandbox) {
		this.subscriptionStatusUrlForSandbox = subscriptionStatusUrlForSandbox;
	}

	public void setSubscriptionStatusUrlVersion(SubscriptionStatusUrlVersion subscriptionStatusUrlVersion) {
		this.subscriptionStatusUrlVersion = subscriptionStatusUrlVersion;
	}

	public void setSubscriptionStatusUrlVersionForSandbox(
			SubscriptionStatusUrlVersion subscriptionStatusUrlVersionForSandbox) {
		this.subscriptionStatusUrlVersionForSandbox = subscriptionStatusUrlVersionForSandbox;
	}

	public AppUpdateRequestDataAttributes subscriptionStatusUrl(URI subscriptionStatusUrl) {
		this.subscriptionStatusUrl = subscriptionStatusUrl;
		return this;
	}

	public AppUpdateRequestDataAttributes subscriptionStatusUrlForSandbox(URI subscriptionStatusUrlForSandbox) {
		this.subscriptionStatusUrlForSandbox = subscriptionStatusUrlForSandbox;
		return this;
	}

	public AppUpdateRequestDataAttributes subscriptionStatusUrlVersion(
			SubscriptionStatusUrlVersion subscriptionStatusUrlVersion) {
		this.subscriptionStatusUrlVersion = subscriptionStatusUrlVersion;
		return this;
	}

	public AppUpdateRequestDataAttributes subscriptionStatusUrlVersionForSandbox(
			SubscriptionStatusUrlVersion subscriptionStatusUrlVersionForSandbox) {
		this.subscriptionStatusUrlVersionForSandbox = subscriptionStatusUrlVersionForSandbox;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppUpdateRequestDataAttributes {\n");

		sb.append("    bundleId: ").append(toIndentedString(this.bundleId)).append("\n");
		sb.append("    primaryLocale: ").append(toIndentedString(this.primaryLocale)).append("\n");
		sb.append("    subscriptionStatusUrl: ").append(toIndentedString(this.subscriptionStatusUrl)).append("\n");
		sb.append("    subscriptionStatusUrlVersion: ").append(toIndentedString(this.subscriptionStatusUrlVersion))
				.append("\n");
		sb.append("    subscriptionStatusUrlForSandbox: ")
				.append(toIndentedString(this.subscriptionStatusUrlForSandbox)).append("\n");
		sb.append("    subscriptionStatusUrlVersionForSandbox: ")
				.append(toIndentedString(this.subscriptionStatusUrlVersionForSandbox)).append("\n");
		sb.append("    availableInNewTerritories: ").append(toIndentedString(this.availableInNewTerritories))
				.append("\n");
		sb.append("    contentRightsDeclaration: ").append(toIndentedString(this.contentRightsDeclaration))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
