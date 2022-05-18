package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppRelationshipsBuilds implements Serializable {

	private static final long serialVersionUID = 5113143880126834442L;

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

	private List<AppStoreVersionRelationshipsBuildData> data = null;

	private AppCategoryRelationshipsSubcategoriesLinks links;
	private PagingInformation meta;

	public AppRelationshipsBuilds addDataItem(AppStoreVersionRelationshipsBuildData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public AppRelationshipsBuilds data(List<AppStoreVersionRelationshipsBuildData> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<AppStoreVersionRelationshipsBuildData> getData() {
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

	/**
	 * Get meta
	 *
	 * @return meta
	 **/
	@JsonProperty("meta")
	public PagingInformation getMeta() {
		return this.meta;
	}

	public AppRelationshipsBuilds links(AppCategoryRelationshipsSubcategoriesLinks links) {
		this.links = links;
		return this;
	}

	public AppRelationshipsBuilds meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<AppStoreVersionRelationshipsBuildData> data) {
		this.data = data;
	}

	public void setLinks(AppCategoryRelationshipsSubcategoriesLinks links) {
		this.links = links;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppRelationshipsBuilds {\n");

		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
