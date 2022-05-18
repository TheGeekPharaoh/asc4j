package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse implements Serializable {

	private static final long serialVersionUID = -3470400121334755879L;

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

	private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersionData data;
	private DocumentLinks links;

	public AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse data(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersionData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersionData getData() {
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

	public AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersionData data) {
		this.data = data;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
