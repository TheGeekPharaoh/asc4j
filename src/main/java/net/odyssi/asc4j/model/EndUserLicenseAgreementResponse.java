package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;



public class EndUserLicenseAgreementResponse implements Serializable {

	private static final long serialVersionUID = 4675417419965073387L;

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

	private EndUserLicenseAgreement data;

	private List<Object> included = null;
	private DocumentLinks links;

	public EndUserLicenseAgreementResponse addIncludedItem(Object includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public EndUserLicenseAgreementResponse data(EndUserLicenseAgreement data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public EndUserLicenseAgreement getData() {
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

	public EndUserLicenseAgreementResponse included(List<Object> included) {
		this.included = included;
		return this;
	}

	public EndUserLicenseAgreementResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(EndUserLicenseAgreement data) {
		this.data = data;
	}

	public void setIncluded(List<Object> included) {
		this.included = included;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EndUserLicenseAgreementResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
