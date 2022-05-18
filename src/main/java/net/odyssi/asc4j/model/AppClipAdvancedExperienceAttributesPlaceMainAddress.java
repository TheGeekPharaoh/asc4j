package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceAttributesPlaceMainAddress implements Serializable {

	private static final long serialVersionUID = -253539129661838150L;

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

	private String fullAddress;
	private AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress structuredAddress;

	public AppClipAdvancedExperienceAttributesPlaceMainAddress fullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
		return this;
	}

	/**
	 * Get fullAddress
	 *
	 * @return fullAddress
	 **/
	@JsonProperty("fullAddress")
	public String getFullAddress() {
		return this.fullAddress;
	}

	/**
	 * Get structuredAddress
	 *
	 * @return structuredAddress
	 **/
	@JsonProperty("structuredAddress")
	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress getStructuredAddress() {
		return this.structuredAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public void setStructuredAddress(
			AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress structuredAddress) {
		this.structuredAddress = structuredAddress;
	}

	public AppClipAdvancedExperienceAttributesPlaceMainAddress structuredAddress(
			AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress structuredAddress) {
		this.structuredAddress = structuredAddress;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceAttributesPlaceMainAddress {\n");

		sb.append("    fullAddress: ").append(toIndentedString(this.fullAddress)).append("\n");
		sb.append("    structuredAddress: ").append(toIndentedString(this.structuredAddress)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
