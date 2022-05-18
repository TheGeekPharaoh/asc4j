package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiGitUser implements Serializable {

	private static final long serialVersionUID = 145835882972122841L;

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

	private URI avatarUrl;
	private String displayName;

	public CiGitUser avatarUrl(URI avatarUrl) {
		this.avatarUrl = avatarUrl;
		return this;
	}

	public CiGitUser displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Get avatarUrl
	 *
	 * @return avatarUrl
	 **/
	@JsonProperty("avatarUrl")
	public URI getAvatarUrl() {
		return this.avatarUrl;
	}

	/**
	 * Get displayName
	 *
	 * @return displayName
	 **/
	@JsonProperty("displayName")
	public String getDisplayName() {
		return this.displayName;
	}

	public void setAvatarUrl(URI avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiGitUser {\n");

		sb.append("    displayName: ").append(toIndentedString(this.displayName)).append("\n");
		sb.append("    avatarUrl: ").append(toIndentedString(this.avatarUrl)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
