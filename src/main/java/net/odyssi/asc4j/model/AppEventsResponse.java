package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventsResponse implements Serializable {

	private static final long serialVersionUID = -797808068993308962L;

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

	private List<AppEvent> data = new ArrayList<>();

	private List<AppEventLocalization> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public AppEventsResponse addDataItem(AppEvent dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public AppEventsResponse addIncludedItem(AppEventLocalization includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppEventsResponse data(List<AppEvent> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<AppEvent> getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<AppEventLocalization> getIncluded() {
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

	public AppEventsResponse included(List<AppEventLocalization> included) {
		this.included = included;
		return this;
	}

	public AppEventsResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public AppEventsResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<AppEvent> data) {
		this.data = data;
	}

	public void setIncluded(List<AppEventLocalization> included) {
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
		sb.append("class AppEventsResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
