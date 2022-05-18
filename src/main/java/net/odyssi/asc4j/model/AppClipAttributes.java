package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAttributes implements Serializable {

	private static final long serialVersionUID = -7403978037440034170L;

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

	private String bundleId;

	public AppClipAttributes bundleId(String bundleId) {
		this.bundleId = bundleId;
		return this;
	}

	/**
	 * Get bundleId
	 *
	 * @return bundleId
	 **/
	@JsonProperty("bundleId")
	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAttributes {\n");

		sb.append("    bundleId: ").append(toIndentedString(this.bundleId)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
