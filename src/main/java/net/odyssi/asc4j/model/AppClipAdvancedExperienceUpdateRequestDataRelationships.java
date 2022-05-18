package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceUpdateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 393444799783768503L;

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

	private AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip appClip;

	private AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage headerImage;
	private AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations localizations;

	public AppClipAdvancedExperienceUpdateRequestDataRelationships appClip(
			AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip appClip) {
		this.appClip = appClip;
		return this;
	}

	/**
	 * Get appClip
	 *
	 * @return appClip
	 **/
	@JsonProperty("appClip")
	public AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip getAppClip() {
		return this.appClip;
	}

	/**
	 * Get headerImage
	 *
	 * @return headerImage
	 **/
	@JsonProperty("headerImage")
	public AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage getHeaderImage() {
		return this.headerImage;
	}

	/**
	 * Get localizations
	 *
	 * @return localizations
	 **/
	@JsonProperty("localizations")
	public AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations getLocalizations() {
		return this.localizations;
	}

	public AppClipAdvancedExperienceUpdateRequestDataRelationships headerImage(
			AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage headerImage) {
		this.headerImage = headerImage;
		return this;
	}

	public AppClipAdvancedExperienceUpdateRequestDataRelationships localizations(
			AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations localizations) {
		this.localizations = localizations;
		return this;
	}

	public void setAppClip(AppClipAdvancedExperienceUpdateRequestDataRelationshipsAppClip appClip) {
		this.appClip = appClip;
	}

	public void setHeaderImage(AppClipAdvancedExperienceUpdateRequestDataRelationshipsHeaderImage headerImage) {
		this.headerImage = headerImage;
	}

	public void setLocalizations(AppClipAdvancedExperienceUpdateRequestDataRelationshipsLocalizations localizations) {
		this.localizations = localizations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceUpdateRequestDataRelationships {\n");

		sb.append("    appClip: ").append(toIndentedString(this.appClip)).append("\n");
		sb.append("    headerImage: ").append(toIndentedString(this.headerImage)).append("\n");
		sb.append("    localizations: ").append(toIndentedString(this.localizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
