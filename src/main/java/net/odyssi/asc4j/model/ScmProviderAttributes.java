package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScmProviderAttributes implements Serializable {

	private static final long serialVersionUID = 4746982308182696790L;

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

	private ScmProviderType scmProviderType;
	private URI url;

	/**
	 * Get scmProviderType
	 *
	 * @return scmProviderType
	 **/
	@JsonProperty("scmProviderType")
	public ScmProviderType getScmProviderType() {
		return this.scmProviderType;
	}

	/**
	 * Get url
	 *
	 * @return url
	 **/
	@JsonProperty("url")
	public URI getUrl() {
		return this.url;
	}

	public ScmProviderAttributes scmProviderType(ScmProviderType scmProviderType) {
		this.scmProviderType = scmProviderType;
		return this;
	}

	public void setScmProviderType(ScmProviderType scmProviderType) {
		this.scmProviderType = scmProviderType;
	}

	public void setUrl(URI url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScmProviderAttributes {\n");

		sb.append("    scmProviderType: ").append(toIndentedString(this.scmProviderType)).append("\n");
		sb.append("    url: ").append(toIndentedString(this.url)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public ScmProviderAttributes url(URI url) {
		this.url = url;
		return this;
	}
}
