package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAppStoreReviewDetailRelationships implements Serializable {

	private static final long serialVersionUID = 5748655222627688843L;

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

	public AppClipAppStoreReviewDetailRelationships appClipDefaultExperience(
			AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
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

	public void setAppClipDefaultExperience(
			AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAppStoreReviewDetailRelationships {\n");

		sb.append("    appClipDefaultExperience: ").append(toIndentedString(this.appClipDefaultExperience))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
