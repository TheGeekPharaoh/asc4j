package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleIdCapabilityUpdateRequest implements Serializable {

	private static final long serialVersionUID = -449078565032943860L;

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

	private BundleIdCapabilityUpdateRequestData data;

	public BundleIdCapabilityUpdateRequest data(BundleIdCapabilityUpdateRequestData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public BundleIdCapabilityUpdateRequestData getData() {
		return this.data;
	}

	public void setData(BundleIdCapabilityUpdateRequestData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BundleIdCapabilityUpdateRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
