package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildBetaDetailsResponse implements Serializable {

	private static final long serialVersionUID = 2122353411397848510L;

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

	private List<BuildBetaDetail> data = new ArrayList<>();

	private List<Build> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public BuildBetaDetailsResponse addDataItem(BuildBetaDetail dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public BuildBetaDetailsResponse addIncludedItem(Build includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public BuildBetaDetailsResponse data(List<BuildBetaDetail> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<BuildBetaDetail> getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<Build> getIncluded() {
		return this.included;
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

	public BuildBetaDetailsResponse included(List<Build> included) {
		this.included = included;
		return this;
	}

	public BuildBetaDetailsResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public BuildBetaDetailsResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<BuildBetaDetail> data) {
		this.data = data;
	}

	public void setIncluded(List<Build> included) {
		this.included = included;
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
		sb.append("class BuildBetaDetailsResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
