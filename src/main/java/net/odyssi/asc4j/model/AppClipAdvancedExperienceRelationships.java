package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceRelationships implements Serializable {

	private static final long serialVersionUID = 3922167868070154684L;

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

	private AppClipAdvancedExperienceRelationshipsAppClip appClip;

	private AppClipAdvancedExperienceRelationshipsHeaderImage headerImage;
	private AppClipAdvancedExperienceRelationshipsLocalizations localizations;

	public AppClipAdvancedExperienceRelationships appClip(AppClipAdvancedExperienceRelationshipsAppClip appClip) {
		this.appClip = appClip;
		return this;
	}

	/**
	 * Get appClip
	 *
	 * @return appClip
	 **/
	@JsonProperty("appClip")
	public AppClipAdvancedExperienceRelationshipsAppClip getAppClip() {
		return this.appClip;
	}

	/**
	 * Get headerImage
	 *
	 * @return headerImage
	 **/
	@JsonProperty("headerImage")
	public AppClipAdvancedExperienceRelationshipsHeaderImage getHeaderImage() {
		return this.headerImage;
	}

	/**
	 * Get localizations
	 *
	 * @return localizations
	 **/
	@JsonProperty("localizations")
	public AppClipAdvancedExperienceRelationshipsLocalizations getLocalizations() {
		return this.localizations;
	}

	public AppClipAdvancedExperienceRelationships headerImage(
			AppClipAdvancedExperienceRelationshipsHeaderImage headerImage) {
		this.headerImage = headerImage;
		return this;
	}

	public AppClipAdvancedExperienceRelationships localizations(
			AppClipAdvancedExperienceRelationshipsLocalizations localizations) {
		this.localizations = localizations;
		return this;
	}

	public void setAppClip(AppClipAdvancedExperienceRelationshipsAppClip appClip) {
		this.appClip = appClip;
	}

	public void setHeaderImage(AppClipAdvancedExperienceRelationshipsHeaderImage headerImage) {
		this.headerImage = headerImage;
	}

	public void setLocalizations(AppClipAdvancedExperienceRelationshipsLocalizations localizations) {
		this.localizations = localizations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceRelationships {\n");

		sb.append("    appClip: ").append(toIndentedString(this.appClip)).append("\n");
		sb.append("    headerImage: ").append(toIndentedString(this.headerImage)).append("\n");
		sb.append("    localizations: ").append(toIndentedString(this.localizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
