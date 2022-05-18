package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAppStoreReviewDetailAttributes implements Serializable {

	private static final long serialVersionUID = 1332117286254922356L;

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

	private List<URI> invocationUrls = null;

	public AppClipAppStoreReviewDetailAttributes addInvocationUrlsItem(URI invocationUrlsItem) {
		this.invocationUrls.add(invocationUrlsItem);
		return this;
	}

	/**
	 * Get invocationUrls
	 *
	 * @return invocationUrls
	 **/
	@JsonProperty("invocationUrls")
	public List<URI> getInvocationUrls() {
		return this.invocationUrls;
	}

	public AppClipAppStoreReviewDetailAttributes invocationUrls(List<URI> invocationUrls) {
		this.invocationUrls = invocationUrls;
		return this;
	}

	public void setInvocationUrls(List<URI> invocationUrls) {
		this.invocationUrls = invocationUrls;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAppStoreReviewDetailAttributes {\n");

		sb.append("    invocationUrls: ").append(toIndentedString(this.invocationUrls)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
