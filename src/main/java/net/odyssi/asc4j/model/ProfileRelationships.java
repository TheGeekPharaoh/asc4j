package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileRelationships implements Serializable {

	private static final long serialVersionUID = -1650176306032168601L;

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

	private CiProductRelationshipsBundleId bundleId;

	private ProfileRelationshipsCertificates certificates;
	private ProfileRelationshipsDevices devices;

	public ProfileRelationships bundleId(CiProductRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
		return this;
	}

	public ProfileRelationships certificates(ProfileRelationshipsCertificates certificates) {
		this.certificates = certificates;
		return this;
	}

	public ProfileRelationships devices(ProfileRelationshipsDevices devices) {
		this.devices = devices;
		return this;
	}

	/**
	 * Get bundleId
	 *
	 * @return bundleId
	 **/
	@JsonProperty("bundleId")
	public CiProductRelationshipsBundleId getBundleId() {
		return this.bundleId;
	}

	/**
	 * Get certificates
	 *
	 * @return certificates
	 **/
	@JsonProperty("certificates")
	public ProfileRelationshipsCertificates getCertificates() {
		return this.certificates;
	}

	/**
	 * Get devices
	 *
	 * @return devices
	 **/
	@JsonProperty("devices")
	public ProfileRelationshipsDevices getDevices() {
		return this.devices;
	}

	public void setBundleId(CiProductRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
	}

	public void setCertificates(ProfileRelationshipsCertificates certificates) {
		this.certificates = certificates;
	}

	public void setDevices(ProfileRelationshipsDevices devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProfileRelationships {\n");

		sb.append("    bundleId: ").append(toIndentedString(this.bundleId)).append("\n");
		sb.append("    devices: ").append(toIndentedString(this.devices)).append("\n");
		sb.append("    certificates: ").append(toIndentedString(this.certificates)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
