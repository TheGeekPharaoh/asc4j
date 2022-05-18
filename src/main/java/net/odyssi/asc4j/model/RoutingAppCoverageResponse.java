package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoutingAppCoverageResponse implements Serializable {

	private static final long serialVersionUID = 4948400630627007844L;

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

	private RoutingAppCoverage data;

	private List<AppStoreVersion> included = null;
	private DocumentLinks links;

	public RoutingAppCoverageResponse addIncludedItem(AppStoreVersion includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public RoutingAppCoverageResponse data(RoutingAppCoverage data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public RoutingAppCoverage getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<AppStoreVersion> getIncluded() {
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

	public RoutingAppCoverageResponse included(List<AppStoreVersion> included) {
		this.included = included;
		return this;
	}

	public RoutingAppCoverageResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(RoutingAppCoverage data) {
		this.data = data;
	}

	public void setIncluded(List<AppStoreVersion> included) {
		this.included = included;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RoutingAppCoverageResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
