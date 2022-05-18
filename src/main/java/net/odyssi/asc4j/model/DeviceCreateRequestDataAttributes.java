package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 187872032092003728L;

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

	private String name;

	private BundleIdPlatform platform;
	private String udid;

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
	 * Get udid
	 *
	 * @return udid
	 **/
	@JsonProperty("udid")
	public String getUdid() {
		return this.udid;
	}

	public DeviceCreateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public DeviceCreateRequestDataAttributes platform(BundleIdPlatform platform) {
		this.platform = platform;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceCreateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    udid: ").append(toIndentedString(this.udid)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public DeviceCreateRequestDataAttributes udid(String udid) {
		this.udid = udid;
		return this;
	}
}
