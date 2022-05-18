package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaTesterInvitationResponse implements Serializable {

	private static final long serialVersionUID = -4377828965595093094L;

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

	private BetaTesterInvitation data;
	private DocumentLinks links;

	public BetaTesterInvitationResponse data(BetaTesterInvitation data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public BetaTesterInvitation getData() {
		return this.data;
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

	public BetaTesterInvitationResponse links(DocumentLinks links) {
		this.links = links;
		return this;
	}

	public void setData(BetaTesterInvitation data) {
		this.data = data;
	}

	public void setLinks(DocumentLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaTesterInvitationResponse {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
