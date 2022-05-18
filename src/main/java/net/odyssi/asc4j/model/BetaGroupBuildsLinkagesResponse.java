package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaGroupBuildsLinkagesResponse implements Serializable {

	private static final long serialVersionUID = 4444930363733868241L;

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

	private List<AppStoreVersionRelationshipsBuildData> data = new ArrayList<>();

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public BetaGroupBuildsLinkagesResponse addDataItem(AppStoreVersionRelationshipsBuildData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public BetaGroupBuildsLinkagesResponse data(List<AppStoreVersionRelationshipsBuildData> data) {
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
	public PagedDocumentLinks getLinks() {
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

	public BetaGroupBuildsLinkagesResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public BetaGroupBuildsLinkagesResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<AppStoreVersionRelationshipsBuildData> data) {
		this.data = data;
	}

	public void setLinks(PagedDocumentLinks links) {
		this.links = links;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaGroupBuildsLinkagesResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
