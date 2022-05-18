package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 3351365343420165332L;

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

	private BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId;

	private ProfileCreateRequestDataRelationshipsCertificates certificates;
	private ProfileCreateRequestDataRelationshipsDevices devices;

	public ProfileCreateRequestDataRelationships bundleId(
			BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
		return this;
	}

	public ProfileCreateRequestDataRelationships certificates(
			ProfileCreateRequestDataRelationshipsCertificates certificates) {
		this.certificates = certificates;
		return this;
	}

	public ProfileCreateRequestDataRelationships devices(ProfileCreateRequestDataRelationshipsDevices devices) {
		this.devices = devices;
		return this;
	}

	/**
	 * Get bundleId
	 *
	 * @return bundleId
	 **/
	@JsonProperty("bundleId")
	public BundleIdCapabilityCreateRequestDataRelationshipsBundleId getBundleId() {
		return this.bundleId;
	}

	/**
	 * Get certificates
	 *
	 * @return certificates
	 **/
	@JsonProperty("certificates")
	public ProfileCreateRequestDataRelationshipsCertificates getCertificates() {
		return this.certificates;
	}

	/**
	 * Get devices
	 *
	 * @return devices
	 **/
	@JsonProperty("devices")
	public ProfileCreateRequestDataRelationshipsDevices getDevices() {
		return this.devices;
	}

	public void setBundleId(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
	}

	public void setCertificates(ProfileCreateRequestDataRelationshipsCertificates certificates) {
		this.certificates = certificates;
	}

	public void setDevices(ProfileCreateRequestDataRelationshipsDevices devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProfileCreateRequestDataRelationships {\n");

		sb.append("    bundleId: ").append(toIndentedString(this.bundleId)).append("\n");
		sb.append("    devices: ").append(toIndentedString(this.devices)).append("\n");
		sb.append("    certificates: ").append(toIndentedString(this.certificates)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
