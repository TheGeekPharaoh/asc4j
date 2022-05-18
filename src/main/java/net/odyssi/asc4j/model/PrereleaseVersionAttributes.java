package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrereleaseVersionAttributes implements Serializable {

	private static final long serialVersionUID = 5579458075250903749L;

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

	private Platform platform;
	private String version;

	/**
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public Platform getPlatform() {
		return this.platform;
	}

	/**
	 * Get version
	 *
	 * @return version
	 **/
	@JsonProperty("version")
	public String getVersion() {
		return this.version;
	}

	public PrereleaseVersionAttributes platform(Platform platform) {
		this.platform = platform;
		return this;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PrereleaseVersionAttributes {\n");

		sb.append("    version: ").append(toIndentedString(this.version)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public PrereleaseVersionAttributes version(String version) {
		this.version = version;
		return this;
	}
}
