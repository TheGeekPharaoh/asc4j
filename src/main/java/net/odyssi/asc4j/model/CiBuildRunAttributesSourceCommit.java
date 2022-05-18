package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiBuildRunAttributesSourceCommit implements Serializable {

	private static final long serialVersionUID = -672262627522003079L;

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

	private CiGitUser author;

	private String commitSha;

	private CiGitUser committer;

	private String message;
	private URI webUrl;

	public CiBuildRunAttributesSourceCommit author(CiGitUser author) {
		this.author = author;
		return this;
	}

	public CiBuildRunAttributesSourceCommit commitSha(String commitSha) {
		this.commitSha = commitSha;
		return this;
	}

	public CiBuildRunAttributesSourceCommit committer(CiGitUser committer) {
		this.committer = committer;
		return this;
	}

	/**
	 * Get author
	 *
	 * @return author
	 **/
	@JsonProperty("author")
	public CiGitUser getAuthor() {
		return this.author;
	}

	/**
	 * Get commitSha
	 *
	 * @return commitSha
	 **/
	@JsonProperty("commitSha")
	public String getCommitSha() {
		return this.commitSha;
	}

	/**
	 * Get committer
	 *
	 * @return committer
	 **/
	@JsonProperty("committer")
	public CiGitUser getCommitter() {
		return this.committer;
	}

	/**
	 * Get message
	 *
	 * @return message
	 **/
	@JsonProperty("message")
	public String getMessage() {
		return this.message;
	}

	/**
	 * Get webUrl
	 *
	 * @return webUrl
	 **/
	@JsonProperty("webUrl")
	public URI getWebUrl() {
		return this.webUrl;
	}

	public CiBuildRunAttributesSourceCommit message(String message) {
		this.message = message;
		return this;
	}

	public void setAuthor(CiGitUser author) {
		this.author = author;
	}

	public void setCommitSha(String commitSha) {
		this.commitSha = commitSha;
	}

	public void setCommitter(CiGitUser committer) {
		this.committer = committer;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setWebUrl(URI webUrl) {
		this.webUrl = webUrl;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiBuildRunAttributesSourceCommit {\n");

		sb.append("    commitSha: ").append(toIndentedString(this.commitSha)).append("\n");
		sb.append("    message: ").append(toIndentedString(this.message)).append("\n");
		sb.append("    author: ").append(toIndentedString(this.author)).append("\n");
		sb.append("    committer: ").append(toIndentedString(this.committer)).append("\n");
		sb.append("    webUrl: ").append(toIndentedString(this.webUrl)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiBuildRunAttributesSourceCommit webUrl(URI webUrl) {
		this.webUrl = webUrl;
		return this;
	}
}
