package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCategoryAttributes implements Serializable {

	private static final long serialVersionUID = -1000020482645313011L;

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

	private List<Platform> platforms = null;

	public AppCategoryAttributes addPlatformsItem(Platform platformsItem) {
		this.platforms.add(platformsItem);
		return this;
	}

	/**
	 * Get platforms
	 *
	 * @return platforms
	 **/
	@JsonProperty("platforms")
	public List<Platform> getPlatforms() {
		return this.platforms;
	}

	public AppCategoryAttributes platforms(List<Platform> platforms) {
		this.platforms = platforms;
		return this;
	}

	public void setPlatforms(List<Platform> platforms) {
		this.platforms = platforms;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCategoryAttributes {\n");

		sb.append("    platforms: ").append(toIndentedString(this.platforms)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
