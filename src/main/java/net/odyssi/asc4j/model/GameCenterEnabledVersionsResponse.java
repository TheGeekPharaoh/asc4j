package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;



public class GameCenterEnabledVersionsResponse implements Serializable {

	private static final long serialVersionUID = 8586353432761001970L;

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

	private List<GameCenterEnabledVersion> data = new ArrayList<>();

	private List<Object> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public GameCenterEnabledVersionsResponse addDataItem(GameCenterEnabledVersion dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public GameCenterEnabledVersionsResponse addIncludedItem(Object includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public GameCenterEnabledVersionsResponse data(List<GameCenterEnabledVersion> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<GameCenterEnabledVersion> getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<Object> getIncluded() {
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

	public GameCenterEnabledVersionsResponse included(List<Object> included) {
		this.included = included;
		return this;
	}

	public GameCenterEnabledVersionsResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public GameCenterEnabledVersionsResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<GameCenterEnabledVersion> data) {
		this.data = data;
	}

	public void setIncluded(List<Object> included) {
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
		sb.append("class GameCenterEnabledVersionsResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
