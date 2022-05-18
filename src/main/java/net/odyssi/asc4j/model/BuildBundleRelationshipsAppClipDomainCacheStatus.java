package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildBundleRelationshipsAppClipDomainCacheStatus implements Serializable {

	private static final long serialVersionUID = -4377143611360675675L;

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

	private BuildBundleRelationshipsAppClipDomainCacheStatusData data;
	private AppCategoryRelationshipsSubcategoriesLinks links;

	public BuildBundleRelationshipsAppClipDomainCacheStatus data(
			BuildBundleRelationshipsAppClipDomainCacheStatusData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public BuildBundleRelationshipsAppClipDomainCacheStatusData getData() {
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

	public BuildBundleRelationshipsAppClipDomainCacheStatus links(AppCategoryRelationshipsSubcategoriesLinks links) {
		this.links = links;
		return this;
	}

	public void setData(BuildBundleRelationshipsAppClipDomainCacheStatusData data) {
		this.data = data;
	}

	public void setLinks(AppCategoryRelationshipsSubcategoriesLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildBundleRelationshipsAppClipDomainCacheStatus {\n");

		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
