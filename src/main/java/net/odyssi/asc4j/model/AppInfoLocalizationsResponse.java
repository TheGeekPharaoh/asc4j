package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfoLocalizationsResponse implements Serializable {

	private static final long serialVersionUID = -9146331279046132979L;

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

	private List<AppInfoLocalization> data = new ArrayList<>();

	private List<AppInfo> included = null;

	private PagedDocumentLinks links;
	private PagingInformation meta;

	public AppInfoLocalizationsResponse addDataItem(AppInfoLocalization dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public AppInfoLocalizationsResponse addIncludedItem(AppInfo includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppInfoLocalizationsResponse data(List<AppInfoLocalization> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<AppInfoLocalization> getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<AppInfo> getIncluded() {
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

	public AppInfoLocalizationsResponse included(List<AppInfo> included) {
		this.included = included;
		return this;
	}

	public AppInfoLocalizationsResponse links(PagedDocumentLinks links) {
		this.links = links;
		return this;
	}

	public AppInfoLocalizationsResponse meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<AppInfoLocalization> data) {
		this.data = data;
	}

	public void setIncluded(List<AppInfo> included) {
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
		sb.append("class AppInfoLocalizationsResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
