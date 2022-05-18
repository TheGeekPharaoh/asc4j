package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventLocalizationUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -6636727851826031949L;

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

	private String longDescription;

	private String name;
	private String shortDescription;

	/**
	 * Get longDescription
	 *
	 * @return longDescription
	 **/
	@JsonProperty("longDescription")
	public String getLongDescription() {
		return this.longDescription;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get shortDescription
	 *
	 * @return shortDescription
	 **/
	@JsonProperty("shortDescription")
	public String getShortDescription() {
		return this.shortDescription;
	}

	public AppEventLocalizationUpdateRequestDataAttributes longDescription(String longDescription) {
		this.longDescription = longDescription;
		return this;
	}

	public AppEventLocalizationUpdateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public AppEventLocalizationUpdateRequestDataAttributes shortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventLocalizationUpdateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    shortDescription: ").append(toIndentedString(this.shortDescription)).append("\n");
		sb.append("    longDescription: ").append(toIndentedString(this.longDescription)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
