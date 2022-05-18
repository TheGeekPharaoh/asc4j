package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageAttributes implements Serializable {

	private static final long serialVersionUID = -4733447749991964582L;

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

	private URI url;
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
	 * Get url
	 *
	 * @return url
	 **/
	@JsonProperty("url")
	public URI getUrl() {
		return this.url;
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

	public AppCustomProductPageAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(URI url) {
		this.url = url;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    url: ").append(toIndentedString(this.url)).append("\n");
		sb.append("    visible: ").append(toIndentedString(this.visible)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppCustomProductPageAttributes url(URI url) {
		this.url = url;
		return this;
	}

	public AppCustomProductPageAttributes visible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
