package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates implements Serializable {

	private static final long serialVersionUID = -1819502816710591570L;

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

	private BigDecimal latitude;
	private BigDecimal longitude;

	/**
	 * Get latitude
	 *
	 * @return latitude
	 **/
	@JsonProperty("latitude")
	public BigDecimal getLatitude() {
		return this.latitude;
	}

	/**
	 * Get longitude
	 *
	 * @return longitude
	 **/
	@JsonProperty("longitude")
	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates latitude(BigDecimal latitude) {
		this.latitude = latitude;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates longitude(BigDecimal longitude) {
		this.longitude = longitude;
		return this;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates {\n");

		sb.append("    latitude: ").append(toIndentedString(this.latitude)).append("\n");
		sb.append("    longitude: ").append(toIndentedString(this.longitude)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
