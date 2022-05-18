package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceLocalizationRelationships implements Serializable {

	private static final long serialVersionUID = -781841576514774005L;

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

	private AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience;
	private AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage appClipHeaderImage;

	public AppClipDefaultExperienceLocalizationRelationships appClipDefaultExperience(
			AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
		return this;
	}

	public AppClipDefaultExperienceLocalizationRelationships appClipHeaderImage(
			AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage appClipHeaderImage) {
		this.appClipHeaderImage = appClipHeaderImage;
		return this;
	}

	/**
	 * Get appClipDefaultExperience
	 *
	 * @return appClipDefaultExperience
	 **/
	@JsonProperty("appClipDefaultExperience")
	public AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience getAppClipDefaultExperience() {
		return this.appClipDefaultExperience;
	}

	/**
	 * Get appClipHeaderImage
	 *
	 * @return appClipHeaderImage
	 **/
	@JsonProperty("appClipHeaderImage")
	public AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage getAppClipHeaderImage() {
		return this.appClipHeaderImage;
	}

	public void setAppClipDefaultExperience(
			AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
	}

	public void setAppClipHeaderImage(
			AppClipDefaultExperienceLocalizationRelationshipsAppClipHeaderImage appClipHeaderImage) {
		this.appClipHeaderImage = appClipHeaderImage;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceLocalizationRelationships {\n");

		sb.append("    appClipDefaultExperience: ").append(toIndentedString(this.appClipDefaultExperience))
				.append("\n");
		sb.append("    appClipHeaderImage: ").append(toIndentedString(this.appClipHeaderImage)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
