package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionAppClipDefaultExperienceLinkageResponse implements Serializable {

	private static final long serialVersionUID = 1599626958737362401L;

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

	private AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperienceData data;
	private DocumentLinks links;

	public AppStoreVersionAppClipDefaultExperienceLinkageResponse data(
			AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperienceData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperienceData getData() {
		return this.data;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/
	@JsonProperty("links")
	public DocumentLinks getLinks() {
		return this.links;
	}

	public AppStoreVersionAppClipDefaultExperienceLinkageResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(AppClipAppStoreReviewDetailRelationshipsAppClipDefaultExperienceData data) {
		this.data = data;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionAppClipDefaultExperienceLinkageResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
