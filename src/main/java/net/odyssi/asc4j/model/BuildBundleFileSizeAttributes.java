package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildBundleFileSizeAttributes implements Serializable {

	private static final long serialVersionUID = -5180037770892882709L;

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

	private String deviceModel;

	private Integer downloadBytes;

	private Integer installBytes;
	private String osVersion;

	public BuildBundleFileSizeAttributes deviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
		return this;
	}

	public BuildBundleFileSizeAttributes downloadBytes(Integer downloadBytes) {
		this.downloadBytes = downloadBytes;
		return this;
	}

	/**
	 * Get deviceModel
	 *
	 * @return deviceModel
	 **/
	@JsonProperty("deviceModel")
	public String getDeviceModel() {
		return this.deviceModel;
	}

	/**
	 * Get downloadBytes
	 *
	 * @return downloadBytes
	 **/
	@JsonProperty("downloadBytes")
	public Integer getDownloadBytes() {
		return this.downloadBytes;
	}

	/**
	 * Get installBytes
	 *
	 * @return installBytes
	 **/
	@JsonProperty("installBytes")
	public Integer getInstallBytes() {
		return this.installBytes;
	}

	/**
	 * Get osVersion
	 *
	 * @return osVersion
	 **/
	@JsonProperty("osVersion")
	public String getOsVersion() {
		return this.osVersion;
	}

	public BuildBundleFileSizeAttributes installBytes(Integer installBytes) {
		this.installBytes = installBytes;
		return this;
	}

	public BuildBundleFileSizeAttributes osVersion(String osVersion) {
		this.osVersion = osVersion;
		return this;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public void setDownloadBytes(Integer downloadBytes) {
		this.downloadBytes = downloadBytes;
	}

	public void setInstallBytes(Integer installBytes) {
		this.installBytes = installBytes;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildBundleFileSizeAttributes {\n");

		sb.append("    deviceModel: ").append(toIndentedString(this.deviceModel)).append("\n");
		sb.append("    osVersion: ").append(toIndentedString(this.osVersion)).append("\n");
		sb.append("    downloadBytes: ").append(toIndentedString(this.downloadBytes)).append("\n");
		sb.append("    installBytes: ").append(toIndentedString(this.installBytes)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
