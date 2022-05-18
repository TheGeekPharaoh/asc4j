package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiTestResultAttributesDestinationTestResults implements Serializable {

	private static final long serialVersionUID = 8413227145353867598L;

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

	private String deviceName;

	private BigDecimal duration;

	private String osVersion;

	private CiTestStatus status;
	private String uuid;

	public CiTestResultAttributesDestinationTestResults deviceName(String deviceName) {
		this.deviceName = deviceName;
		return this;
	}

	public CiTestResultAttributesDestinationTestResults duration(BigDecimal duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Get deviceName
	 *
	 * @return deviceName
	 **/
	@JsonProperty("deviceName")
	public String getDeviceName() {
		return this.deviceName;
	}

	/**
	 * Get duration
	 *
	 * @return duration
	 **/
	@JsonProperty("duration")
	public BigDecimal getDuration() {
		return this.duration;
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

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@JsonProperty("status")
	public CiTestStatus getStatus() {
		return this.status;
	}

	/**
	 * Get uuid
	 *
	 * @return uuid
	 **/
	@JsonProperty("uuid")
	public String getUuid() {
		return this.uuid;
	}

	public CiTestResultAttributesDestinationTestResults osVersion(String osVersion) {
		this.osVersion = osVersion;
		return this;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public void setStatus(CiTestStatus status) {
		this.status = status;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public CiTestResultAttributesDestinationTestResults status(CiTestStatus status) {
		this.status = status;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiTestResultAttributesDestinationTestResults {\n");

		sb.append("    uuid: ").append(toIndentedString(this.uuid)).append("\n");
		sb.append("    deviceName: ").append(toIndentedString(this.deviceName)).append("\n");
		sb.append("    osVersion: ").append(toIndentedString(this.osVersion)).append("\n");
		sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
		sb.append("    duration: ").append(toIndentedString(this.duration)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiTestResultAttributesDestinationTestResults uuid(String uuid) {
		this.uuid = uuid;
		return this;
	}
}
