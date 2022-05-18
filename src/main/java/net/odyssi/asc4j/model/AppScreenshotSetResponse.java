package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;



public class AppScreenshotSetResponse implements Serializable {

	private static final long serialVersionUID = 6969048249862028930L;

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

	private AppScreenshotSet data;

	private List<Object> included = null;
	private DocumentLinks links;

	public AppScreenshotSetResponse addIncludedItem(
			Object includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppScreenshotSetResponse data(AppScreenshotSet data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppScreenshotSet getData() {
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
	public DocumentLinks getLinks() {
		return this.links;
	}

	public AppScreenshotSetResponse included(
			List<Object> included) {
		this.included = included;
		return this;
	}

	public AppScreenshotSetResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(AppScreenshotSet data) {
		this.data = data;
	}

	public void setIncluded(
			List<Object> included) {
		this.included = included;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppScreenshotSetResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
