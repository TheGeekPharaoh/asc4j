package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 6436371241982901194L;

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

	private AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip;

	private AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage headerImage;
	private AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations localizations;

	public AppClipAdvancedExperienceCreateRequestDataRelationships appClip(
			AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip) {
		this.appClip = appClip;
		return this;
	}

	/**
	 * Get appClip
	 *
	 * @return appClip
	 **/
	@JsonProperty("appClip")
	public AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip getAppClip() {
		return this.appClip;
	}

	/**
	 * Get headerImage
	 *
	 * @return headerImage
	 **/
	@JsonProperty("headerImage")
	public AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage getHeaderImage() {
		return this.headerImage;
	}

	/**
	 * Get localizations
	 *
	 * @return localizations
	 **/
	@JsonProperty("localizations")
	public AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations getLocalizations() {
		return this.localizations;
	}

	public AppClipAdvancedExperienceCreateRequestDataRelationships headerImage(
			AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage headerImage) {
		this.headerImage = headerImage;
		return this;
	}

	public AppClipAdvancedExperienceCreateRequestDataRelationships localizations(
			AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations localizations) {
		this.localizations = localizations;
		return this;
	}

	public void setAppClip(AppClipAdvancedExperienceCreateRequestDataRelationshipsAppClip appClip) {
		this.appClip = appClip;
	}

	public void setHeaderImage(AppClipAdvancedExperienceCreateRequestDataRelationshipsHeaderImage headerImage) {
		this.headerImage = headerImage;
	}

	public void setLocalizations(AppClipAdvancedExperienceCreateRequestDataRelationshipsLocalizations localizations) {
		this.localizations = localizations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceCreateRequestDataRelationships {\n");

		sb.append("    appClip: ").append(toIndentedString(this.appClip)).append("\n");
		sb.append("    headerImage: ").append(toIndentedString(this.headerImage)).append("\n");
		sb.append("    localizations: ").append(toIndentedString(this.localizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
