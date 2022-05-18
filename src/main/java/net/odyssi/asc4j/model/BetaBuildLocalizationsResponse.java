package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaBuildLocalizationsResponse implements Serializable {

	private static final long serialVersionUID = 3509446293032619698L;

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

	private List<BetaBuildLocalization> data = new ArrayList<>();

	private List<Build> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public BetaBuildLocalizationsResponse addDataItem(BetaBuildLocalization dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public BetaBuildLocalizationsResponse addIncludedItem(Build includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public BetaBuildLocalizationsResponse data(List<BetaBuildLocalization> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<BetaBuildLocalization> getData() {
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

	public BetaBuildLocalizationsResponse included(List<Build> included) {
		this.included = included;
		return this;
	}

	public BetaBuildLocalizationsResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public BetaBuildLocalizationsResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<BetaBuildLocalization> data) {
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
		sb.append("class BetaBuildLocalizationsResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
