package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetail implements Serializable {

	private static final long serialVersionUID = 2621766488852167672L;

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

	private AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetailData data;
	private AppCategoryRelationshipsSubcategoriesLinks links;

	public AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetail data(
			AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetailData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetailData getData() {
		return this.data;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/
	@JsonProperty("links")
	public AppCategoryRelationshipsSubcategoriesLinks getLinks() {
		return this.links;
	}

	public AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetail links(
			AppCategoryRelationshipsSubcategoriesLinks links) {
		this.links = links;
		return this;
	}

	public void setData(AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetailData data) {
		this.data = data;
	}

	public void setLinks(AppCategoryRelationshipsSubcategoriesLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceRelationshipsAppClipAppStoreReviewDetail {\n");

		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
