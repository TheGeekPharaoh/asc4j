package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiTestDestination implements Serializable {

	private static final long serialVersionUID = 6039670132561866767L;

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

	private String deviceTypeIdentifier;

	private String deviceTypeName;

	private CiTestDestinationKind kind;

	private String runtimeIdentifier;
	private String runtimeName;

	public CiTestDestination deviceTypeIdentifier(String deviceTypeIdentifier) {
		this.deviceTypeIdentifier = deviceTypeIdentifier;
		return this;
	}

	public CiTestDestination deviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
		return this;
	}

	/**
	 * Get deviceTypeIdentifier
	 *
	 * @return deviceTypeIdentifier
	 **/
	@JsonProperty("deviceTypeIdentifier")
	public String getDeviceTypeIdentifier() {
		return this.deviceTypeIdentifier;
	}

	/**
	 * Get deviceTypeName
	 *
	 * @return deviceTypeName
	 **/
	@JsonProperty("deviceTypeName")
	public String getDeviceTypeName() {
		return this.deviceTypeName;
	}

	/**
	 * Get kind
	 *
	 * @return kind
	 **/
	@JsonProperty("kind")
	public CiTestDestinationKind getKind() {
		return this.kind;
	}

	/**
	 * Get runtimeIdentifier
	 *
	 * @return runtimeIdentifier
	 **/
	@JsonProperty("runtimeIdentifier")
	public String getRuntimeIdentifier() {
		return this.runtimeIdentifier;
	}

	/**
	 * Get runtimeName
	 *
	 * @return runtimeName
	 **/
	@JsonProperty("runtimeName")
	public String getRuntimeName() {
		return this.runtimeName;
	}

	public CiTestDestination kind(CiTestDestinationKind kind) {
		this.kind = kind;
		return this;
	}

	public CiTestDestination runtimeIdentifier(String runtimeIdentifier) {
		this.runtimeIdentifier = runtimeIdentifier;
		return this;
	}

	public CiTestDestination runtimeName(String runtimeName) {
		this.runtimeName = runtimeName;
		return this;
	}

	public void setDeviceTypeIdentifier(String deviceTypeIdentifier) {
		this.deviceTypeIdentifier = deviceTypeIdentifier;
	}

	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}

	public void setKind(CiTestDestinationKind kind) {
		this.kind = kind;
	}

	public void setRuntimeIdentifier(String runtimeIdentifier) {
		this.runtimeIdentifier = runtimeIdentifier;
	}

	public void setRuntimeName(String runtimeName) {
		this.runtimeName = runtimeName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiTestDestination {\n");

		sb.append("    deviceTypeName: ").append(toIndentedString(this.deviceTypeName)).append("\n");
		sb.append("    deviceTypeIdentifier: ").append(toIndentedString(this.deviceTypeIdentifier)).append("\n");
		sb.append("    runtimeName: ").append(toIndentedString(this.runtimeName)).append("\n");
		sb.append("    runtimeIdentifier: ").append(toIndentedString(this.runtimeIdentifier)).append("\n");
		sb.append("    kind: ").append(toIndentedString(this.kind)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
