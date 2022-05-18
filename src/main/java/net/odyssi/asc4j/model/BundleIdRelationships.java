package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleIdRelationships implements Serializable {

	private static final long serialVersionUID = -4649397550839090863L;

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

	private AppClipRelationshipsApp app;

	private BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities;
	private BundleIdRelationshipsProfiles profiles;

	public BundleIdRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public BundleIdRelationships bundleIdCapabilities(BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities) {
		this.bundleIdCapabilities = bundleIdCapabilities;
		return this;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/
	@JsonProperty("app")
	public AppClipRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get bundleIdCapabilities
	 *
	 * @return bundleIdCapabilities
	 **/
	@JsonProperty("bundleIdCapabilities")
	public BundleIdRelationshipsBundleIdCapabilities getBundleIdCapabilities() {
		return this.bundleIdCapabilities;
	}

	/**
	 * Get profiles
	 *
	 * @return profiles
	 **/
	@JsonProperty("profiles")
	public BundleIdRelationshipsProfiles getProfiles() {
		return this.profiles;
	}

	public BundleIdRelationships profiles(BundleIdRelationshipsProfiles profiles) {
		this.profiles = profiles;
		return this;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setBundleIdCapabilities(BundleIdRelationshipsBundleIdCapabilities bundleIdCapabilities) {
		this.bundleIdCapabilities = bundleIdCapabilities;
	}

	public void setProfiles(BundleIdRelationshipsProfiles profiles) {
		this.profiles = profiles;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BundleIdRelationships {\n");

		sb.append("    profiles: ").append(toIndentedString(this.profiles)).append("\n");
		sb.append("    bundleIdCapabilities: ").append(toIndentedString(this.bundleIdCapabilities)).append("\n");
		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
