package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleIdCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 6477729275660787080L;

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

	private String identifier;

	private String name;

	private BundleIdPlatform platform;
	private String seedId;

	/**
	 * Get identifier
	 *
	 * @return identifier
	 **/
	@JsonProperty("identifier")
	public String getIdentifier() {
		return this.identifier;
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
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public BundleIdPlatform getPlatform() {
		return this.platform;
	}

	/**
	 * Get seedId
	 *
	 * @return seedId
	 **/
	@JsonProperty("seedId")
	public String getSeedId() {
		return this.seedId;
	}

	public BundleIdCreateRequestDataAttributes identifier(String identifier) {
		this.identifier = identifier;
		return this;
	}

	public BundleIdCreateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public BundleIdCreateRequestDataAttributes platform(BundleIdPlatform platform) {
		this.platform = platform;
		return this;
	}

	public BundleIdCreateRequestDataAttributes seedId(String seedId) {
		this.seedId = seedId;
		return this;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setSeedId(String seedId) {
		this.seedId = seedId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BundleIdCreateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    identifier: ").append(toIndentedString(this.identifier)).append("\n");
		sb.append("    seedId: ").append(toIndentedString(this.seedId)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
