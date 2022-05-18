package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildIconAttributes implements Serializable {

	private static final long serialVersionUID = -7144681274229880486L;

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

	private ImageAsset iconAsset;

	private IconAssetType iconType;
	private String name;

	/**
	 * Get iconAsset
	 *
	 * @return iconAsset
	 **/
	@JsonProperty("iconAsset")
	public ImageAsset getIconAsset() {
		return this.iconAsset;
	}

	/**
	 * Get iconType
	 *
	 * @return iconType
	 **/
	@JsonProperty("iconType")
	public IconAssetType getIconType() {
		return this.iconType;
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

	public BuildIconAttributes iconAsset(ImageAsset iconAsset) {
		this.iconAsset = iconAsset;
		return this;
	}

	public BuildIconAttributes iconType(IconAssetType iconType) {
		this.iconType = iconType;
		return this;
	}

	public BuildIconAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setIconAsset(ImageAsset iconAsset) {
		this.iconAsset = iconAsset;
	}

	public void setIconType(IconAssetType iconType) {
		this.iconType = iconType;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildIconAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    iconAsset: ").append(toIndentedString(this.iconAsset)).append("\n");
		sb.append("    iconType: ").append(toIndentedString(this.iconType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
