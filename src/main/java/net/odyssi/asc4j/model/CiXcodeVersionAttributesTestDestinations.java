package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiXcodeVersionAttributesTestDestinations implements Serializable {

	private static final long serialVersionUID = 4251578365640398852L;

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

	private List<CiXcodeVersionAttributesAvailableRuntimes> availableRuntimes = null;

	private String deviceTypeIdentifier;

	private String deviceTypeName;
	private CiTestDestinationKind kind;

	public CiXcodeVersionAttributesTestDestinations addAvailableRuntimesItem(
			CiXcodeVersionAttributesAvailableRuntimes availableRuntimesItem) {
		this.availableRuntimes.add(availableRuntimesItem);
		return this;
	}

	public CiXcodeVersionAttributesTestDestinations availableRuntimes(
			List<CiXcodeVersionAttributesAvailableRuntimes> availableRuntimes) {
		this.availableRuntimes = availableRuntimes;
		return this;
	}

	public CiXcodeVersionAttributesTestDestinations deviceTypeIdentifier(String deviceTypeIdentifier) {
		this.deviceTypeIdentifier = deviceTypeIdentifier;
		return this;
	}

	public CiXcodeVersionAttributesTestDestinations deviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
		return this;
	}

	/**
	 * Get availableRuntimes
	 *
	 * @return availableRuntimes
	 **/
	@JsonProperty("availableRuntimes")
	public List<CiXcodeVersionAttributesAvailableRuntimes> getAvailableRuntimes() {
		return this.availableRuntimes;
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

	public CiXcodeVersionAttributesTestDestinations kind(CiTestDestinationKind kind) {
		this.kind = kind;
		return this;
	}

	public void setAvailableRuntimes(List<CiXcodeVersionAttributesAvailableRuntimes> availableRuntimes) {
		this.availableRuntimes = availableRuntimes;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiXcodeVersionAttributesTestDestinations {\n");

		sb.append("    deviceTypeName: ").append(toIndentedString(this.deviceTypeName)).append("\n");
		sb.append("    deviceTypeIdentifier: ").append(toIndentedString(this.deviceTypeIdentifier)).append("\n");
		sb.append("    availableRuntimes: ").append(toIndentedString(this.availableRuntimes)).append("\n");
		sb.append("    kind: ").append(toIndentedString(this.kind)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
