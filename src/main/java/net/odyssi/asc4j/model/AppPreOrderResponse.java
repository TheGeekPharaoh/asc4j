package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreOrderResponse implements Serializable {

	private static final long serialVersionUID = -5317447204832954259L;

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

	private AppPreOrder data;

	private List<App> included = null;
	private DocumentLinks links;

	public AppPreOrderResponse addIncludedItem(App includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppPreOrderResponse data(AppPreOrder data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppPreOrder getData() {
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
	public DocumentLinks getLinks() {
		return this.links;
	}

	public AppPreOrderResponse included(List<App> included) {
		this.included = included;
		return this;
	}

	public AppPreOrderResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(AppPreOrder data) {
		this.data = data;
	}

	public void setIncluded(List<App> included) {
		this.included = included;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreOrderResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
