package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -814925442751120724L;

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

	private String name;
	private Boolean visible;

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
	 * Get visible
	 *
	 * @return visible
	 **/
	@JsonProperty("visible")
	public Boolean isVisible() {
		return this.visible;
	}

	public AppCustomProductPageUpdateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageUpdateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    visible: ").append(toIndentedString(this.visible)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppCustomProductPageUpdateRequestDataAttributes visible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
