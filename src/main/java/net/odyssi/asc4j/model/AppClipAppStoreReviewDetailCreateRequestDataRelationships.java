package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAppStoreReviewDetailCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -2145241314607920866L;

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

	private AppClipAppStoreReviewDetailCreateRequestDataRelationshipsAppClipDefaultExperience appClipDefaultExperience;

	public AppClipAppStoreReviewDetailCreateRequestDataRelationships appClipDefaultExperience(
			AppClipAppStoreReviewDetailCreateRequestDataRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
		return this;
	}

	/**
	 * Get appClipDefaultExperience
	 *
	 * @return appClipDefaultExperience
	 **/
	@JsonProperty("appClipDefaultExperience")
	public AppClipAppStoreReviewDetailCreateRequestDataRelationshipsAppClipDefaultExperience getAppClipDefaultExperience() {
		return this.appClipDefaultExperience;
	}

	public void setAppClipDefaultExperience(
			AppClipAppStoreReviewDetailCreateRequestDataRelationshipsAppClipDefaultExperience appClipDefaultExperience) {
		this.appClipDefaultExperience = appClipDefaultExperience;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAppStoreReviewDetailCreateRequestDataRelationships {\n");

		sb.append("    appClipDefaultExperience: ").append(toIndentedString(this.appClipDefaultExperience))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
