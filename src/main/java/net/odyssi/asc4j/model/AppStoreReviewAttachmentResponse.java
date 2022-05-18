package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreReviewAttachmentResponse implements Serializable {

	private static final long serialVersionUID = 5958649398806857392L;

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

	private AppStoreReviewAttachment data;

	private List<AppStoreReviewDetail> included = null;
	private DocumentLinks links;

	public AppStoreReviewAttachmentResponse addIncludedItem(AppStoreReviewDetail includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppStoreReviewAttachmentResponse data(AppStoreReviewAttachment data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppStoreReviewAttachment getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<AppStoreReviewDetail> getIncluded() {
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

	public AppStoreReviewAttachmentResponse included(List<AppStoreReviewDetail> included) {
		this.included = included;
		return this;
	}

	public AppStoreReviewAttachmentResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(AppStoreReviewAttachment data) {
		this.data = data;
	}

	public void setIncluded(List<AppStoreReviewDetail> included) {
		this.included = included;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreReviewAttachmentResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
