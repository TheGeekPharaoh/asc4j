package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceAttributesPlaceDisplayPoint implements Serializable {

	public enum SourceEnum {

		CALCULATED(String.valueOf("CALCULATED")), MANUALLY_PLACED(String.valueOf("MANUALLY_PLACED"));

		public static SourceEnum fromValue(String value) {
			for (SourceEnum b : SourceEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		SourceEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = -404488988795485526L;

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

	private AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates coordinates;
	private SourceEnum source;

	public AppClipAdvancedExperienceAttributesPlaceDisplayPoint coordinates(
			AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates coordinates) {
		this.coordinates = coordinates;
		return this;
	}

	/**
	 * Get coordinates
	 *
	 * @return coordinates
	 **/
	@JsonProperty("coordinates")
	public AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates getCoordinates() {
		return this.coordinates;
	}

	/**
	 * Get source
	 *
	 * @return source
	 **/
	@JsonProperty("source")
	public String getSource() {
		if (this.source == null) {
			return null;
		}
		return this.source.value();
	}

	public void setCoordinates(AppClipAdvancedExperienceAttributesPlaceDisplayPointCoordinates coordinates) {
		this.coordinates = coordinates;
	}

	public void setSource(SourceEnum source) {
		this.source = source;
	}

	public AppClipAdvancedExperienceAttributesPlaceDisplayPoint source(SourceEnum source) {
		this.source = source;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceAttributesPlaceDisplayPoint {\n");

		sb.append("    coordinates: ").append(toIndentedString(this.coordinates)).append("\n");
		sb.append("    source: ").append(toIndentedString(this.source)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
