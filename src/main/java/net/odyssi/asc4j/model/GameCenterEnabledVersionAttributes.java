package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameCenterEnabledVersionAttributes implements Serializable {

	private static final long serialVersionUID = 7210336644892051716L;

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

	private Platform platform;
	private String versionString;

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
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public Platform getPlatform() {
		return this.platform;
	}

	/**
	 * Get versionString
	 *
	 * @return versionString
	 **/
	@JsonProperty("versionString")
	public String getVersionString() {
		return this.versionString;
	}

	public GameCenterEnabledVersionAttributes iconAsset(ImageAsset iconAsset) {
		this.iconAsset = iconAsset;
		return this;
	}

	public GameCenterEnabledVersionAttributes platform(Platform platform) {
		this.platform = platform;
		return this;
	}

	public void setIconAsset(ImageAsset iconAsset) {
		this.iconAsset = iconAsset;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public void setVersionString(String versionString) {
		this.versionString = versionString;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GameCenterEnabledVersionAttributes {\n");

		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    versionString: ").append(toIndentedString(this.versionString)).append("\n");
		sb.append("    iconAsset: ").append(toIndentedString(this.iconAsset)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public GameCenterEnabledVersionAttributes versionString(String versionString) {
		this.versionString = versionString;
		return this;
	}
}
