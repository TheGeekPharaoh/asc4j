package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageAsset implements Serializable {

	private static final long serialVersionUID = 6124427021414093768L;

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

	private Integer height;

	private String templateUrl;
	private Integer width;

	/**
	 * Get height
	 *
	 * @return height
	 **/
	@JsonProperty("height")
	public Integer getHeight() {
		return this.height;
	}

	/**
	 * Get templateUrl
	 *
	 * @return templateUrl
	 **/
	@JsonProperty("templateUrl")
	public String getTemplateUrl() {
		return this.templateUrl;
	}

	/**
	 * Get width
	 *
	 * @return width
	 **/
	@JsonProperty("width")
	public Integer getWidth() {
		return this.width;
	}

	public ImageAsset height(Integer height) {
		this.height = height;
		return this;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public ImageAsset templateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ImageAsset {\n");

		sb.append("    templateUrl: ").append(toIndentedString(this.templateUrl)).append("\n");
		sb.append("    width: ").append(toIndentedString(this.width)).append("\n");
		sb.append("    height: ").append(toIndentedString(this.height)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public ImageAsset width(Integer width) {
		this.width = width;
		return this;
	}
}
