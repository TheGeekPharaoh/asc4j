package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppClipInvocationCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -5759829224788007806L;

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

	private URI url;

	/**
	 * Get url
	 *
	 * @return url
	 **/
	@JsonProperty("url")
	public URI getUrl() {
		return this.url;
	}

	public void setUrl(URI url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppClipInvocationCreateRequestDataAttributes {\n");

		sb.append("    url: ").append(toIndentedString(this.url)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BetaAppClipInvocationCreateRequestDataAttributes url(URI url) {
		this.url = url;
		return this;
	}
}
