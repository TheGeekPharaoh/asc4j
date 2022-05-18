package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleIdCapabilityCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 4282730273696235530L;

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

	public BundleIdCapabilityCreateRequestDataRelationships bundleId(
			BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
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

	public void setBundleId(BundleIdCapabilityCreateRequestDataRelationshipsBundleId bundleId) {
		this.bundleId = bundleId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BundleIdCapabilityCreateRequestDataRelationships {\n");

		sb.append("    bundleId: ").append(toIndentedString(this.bundleId)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
