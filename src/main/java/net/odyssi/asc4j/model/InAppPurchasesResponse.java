package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InAppPurchasesResponse implements Serializable {

	private static final long serialVersionUID = 4354101581676115049L;

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

	private List<InAppPurchase> data = new ArrayList<>();

	private List<App> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public InAppPurchasesResponse addDataItem(InAppPurchase dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public InAppPurchasesResponse addIncludedItem(App includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public InAppPurchasesResponse data(List<InAppPurchase> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<InAppPurchase> getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<App> getIncluded() {
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

	public InAppPurchasesResponse included(List<App> included) {
		this.included = included;
		return this;
	}

	public InAppPurchasesResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public InAppPurchasesResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<InAppPurchase> data) {
		this.data = data;
	}

	public void setIncluded(List<App> included) {
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
		sb.append("class InAppPurchasesResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
