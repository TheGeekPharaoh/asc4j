package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScmRepositoryAttributes implements Serializable {

	private static final long serialVersionUID = 3955135204002747077L;

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

	private URI httpCloneUrl;

	private OffsetDateTime lastAccessedDate;

	private String ownerName;

	private String repositoryName;
	private URI sshCloneUrl;

	/**
	 * Get httpCloneUrl
	 *
	 * @return httpCloneUrl
	 **/
	@JsonProperty("httpCloneUrl")
	public URI getHttpCloneUrl() {
		return this.httpCloneUrl;
	}

	/**
	 * Get lastAccessedDate
	 *
	 * @return lastAccessedDate
	 **/
	@JsonProperty("lastAccessedDate")
	public OffsetDateTime getLastAccessedDate() {
		return this.lastAccessedDate;
	}

	/**
	 * Get ownerName
	 *
	 * @return ownerName
	 **/
	@JsonProperty("ownerName")
	public String getOwnerName() {
		return this.ownerName;
	}

	/**
	 * Get repositoryName
	 *
	 * @return repositoryName
	 **/
	@JsonProperty("repositoryName")
	public String getRepositoryName() {
		return this.repositoryName;
	}

	/**
	 * Get sshCloneUrl
	 *
	 * @return sshCloneUrl
	 **/
	@JsonProperty("sshCloneUrl")
	public URI getSshCloneUrl() {
		return this.sshCloneUrl;
	}

	public ScmRepositoryAttributes httpCloneUrl(URI httpCloneUrl) {
		this.httpCloneUrl = httpCloneUrl;
		return this;
	}

	public ScmRepositoryAttributes lastAccessedDate(OffsetDateTime lastAccessedDate) {
		this.lastAccessedDate = lastAccessedDate;
		return this;
	}

	public ScmRepositoryAttributes ownerName(String ownerName) {
		this.ownerName = ownerName;
		return this;
	}

	public ScmRepositoryAttributes repositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
		return this;
	}

	public void setHttpCloneUrl(URI httpCloneUrl) {
		this.httpCloneUrl = httpCloneUrl;
	}

	public void setLastAccessedDate(OffsetDateTime lastAccessedDate) {
		this.lastAccessedDate = lastAccessedDate;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

	public void setSshCloneUrl(URI sshCloneUrl) {
		this.sshCloneUrl = sshCloneUrl;
	}

	public ScmRepositoryAttributes sshCloneUrl(URI sshCloneUrl) {
		this.sshCloneUrl = sshCloneUrl;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScmRepositoryAttributes {\n");

		sb.append("    lastAccessedDate: ").append(toIndentedString(this.lastAccessedDate)).append("\n");
		sb.append("    httpCloneUrl: ").append(toIndentedString(this.httpCloneUrl)).append("\n");
		sb.append("    sshCloneUrl: ").append(toIndentedString(this.sshCloneUrl)).append("\n");
		sb.append("    ownerName: ").append(toIndentedString(this.ownerName)).append("\n");
		sb.append("    repositoryName: ").append(toIndentedString(this.repositoryName)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
