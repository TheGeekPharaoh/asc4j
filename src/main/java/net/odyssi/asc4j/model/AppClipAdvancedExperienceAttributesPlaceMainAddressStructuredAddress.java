package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress implements Serializable {

	private static final long serialVersionUID = -4605094515527228637L;

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

	private String countryCode;

	private String floor;

	private String locality;

	private String neighborhood;

	private String postalCode;

	private String stateProvince;
	private List<String> streetAddress = null;

	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress addStreetAddressItem(
			String streetAddressItem) {
		this.streetAddress.add(streetAddressItem);
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress countryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress floor(String floor) {
		this.floor = floor;
		return this;
	}

	/**
	 * Get countryCode
	 *
	 * @return countryCode
	 **/
	@JsonProperty("countryCode")
	public String getCountryCode() {
		return this.countryCode;
	}

	/**
	 * Get floor
	 *
	 * @return floor
	 **/
	@JsonProperty("floor")
	public String getFloor() {
		return this.floor;
	}

	/**
	 * Get locality
	 *
	 * @return locality
	 **/
	@JsonProperty("locality")
	public String getLocality() {
		return this.locality;
	}

	/**
	 * Get neighborhood
	 *
	 * @return neighborhood
	 **/
	@JsonProperty("neighborhood")
	public String getNeighborhood() {
		return this.neighborhood;
	}

	/**
	 * Get postalCode
	 *
	 * @return postalCode
	 **/
	@JsonProperty("postalCode")
	public String getPostalCode() {
		return this.postalCode;
	}

	/**
	 * Get stateProvince
	 *
	 * @return stateProvince
	 **/
	@JsonProperty("stateProvince")
	public String getStateProvince() {
		return this.stateProvince;
	}

	/**
	 * Get streetAddress
	 *
	 * @return streetAddress
	 **/
	@JsonProperty("streetAddress")
	public List<String> getStreetAddress() {
		return this.streetAddress;
	}

	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress locality(String locality) {
		this.locality = locality;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress neighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public void setStreetAddress(List<String> streetAddress) {
		this.streetAddress = streetAddress;
	}

	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress stateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress streetAddress(
			List<String> streetAddress) {
		this.streetAddress = streetAddress;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceAttributesPlaceMainAddressStructuredAddress {\n");

		sb.append("    streetAddress: ").append(toIndentedString(this.streetAddress)).append("\n");
		sb.append("    floor: ").append(toIndentedString(this.floor)).append("\n");
		sb.append("    neighborhood: ").append(toIndentedString(this.neighborhood)).append("\n");
		sb.append("    locality: ").append(toIndentedString(this.locality)).append("\n");
		sb.append("    stateProvince: ").append(toIndentedString(this.stateProvince)).append("\n");
		sb.append("    postalCode: ").append(toIndentedString(this.postalCode)).append("\n");
		sb.append("    countryCode: ").append(toIndentedString(this.countryCode)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
