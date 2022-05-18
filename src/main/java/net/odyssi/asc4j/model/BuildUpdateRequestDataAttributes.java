package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 4925477584258141765L;

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

	private Boolean expired;
	private Boolean usesNonExemptEncryption;

	public BuildUpdateRequestDataAttributes expired(Boolean expired) {
		this.expired = expired;
		return this;
	}

	/**
	 * Get expired
	 *
	 * @return expired
	 **/
	@JsonProperty("expired")
	public Boolean isExpired() {
		return this.expired;
	}

	/**
	 * Get usesNonExemptEncryption
	 *
	 * @return usesNonExemptEncryption
	 **/
	@JsonProperty("usesNonExemptEncryption")
	public Boolean isUsesNonExemptEncryption() {
		return this.usesNonExemptEncryption;
	}

	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	public void setUsesNonExemptEncryption(Boolean usesNonExemptEncryption) {
		this.usesNonExemptEncryption = usesNonExemptEncryption;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildUpdateRequestDataAttributes {\n");

		sb.append("    expired: ").append(toIndentedString(this.expired)).append("\n");
		sb.append("    usesNonExemptEncryption: ").append(toIndentedString(this.usesNonExemptEncryption)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BuildUpdateRequestDataAttributes usesNonExemptEncryption(Boolean usesNonExemptEncryption) {
		this.usesNonExemptEncryption = usesNonExemptEncryption;
		return this;
	}
}
