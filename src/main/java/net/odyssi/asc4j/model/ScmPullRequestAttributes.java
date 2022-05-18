package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScmPullRequestAttributes implements Serializable {

	private static final long serialVersionUID = 652486106348328680L;

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

	private String destinationBranchName;

	private String destinationRepositoryName;

	private String destinationRepositoryOwner;

	private Boolean isClosed;

	private Boolean isCrossRepository;

	private Integer number;

	private String sourceBranchName;

	private String sourceRepositoryName;

	private String sourceRepositoryOwner;

	private String title;
	private URI webUrl;

	public ScmPullRequestAttributes destinationBranchName(String destinationBranchName) {
		this.destinationBranchName = destinationBranchName;
		return this;
	}

	public ScmPullRequestAttributes destinationRepositoryName(String destinationRepositoryName) {
		this.destinationRepositoryName = destinationRepositoryName;
		return this;
	}

	public ScmPullRequestAttributes destinationRepositoryOwner(String destinationRepositoryOwner) {
		this.destinationRepositoryOwner = destinationRepositoryOwner;
		return this;
	}

	/**
	 * Get destinationBranchName
	 *
	 * @return destinationBranchName
	 **/
	@JsonProperty("destinationBranchName")
	public String getDestinationBranchName() {
		return this.destinationBranchName;
	}

	/**
	 * Get destinationRepositoryName
	 *
	 * @return destinationRepositoryName
	 **/
	@JsonProperty("destinationRepositoryName")
	public String getDestinationRepositoryName() {
		return this.destinationRepositoryName;
	}

	/**
	 * Get destinationRepositoryOwner
	 *
	 * @return destinationRepositoryOwner
	 **/
	@JsonProperty("destinationRepositoryOwner")
	public String getDestinationRepositoryOwner() {
		return this.destinationRepositoryOwner;
	}

	/**
	 * Get number
	 *
	 * @return number
	 **/
	@JsonProperty("number")
	public Integer getNumber() {
		return this.number;
	}

	/**
	 * Get sourceBranchName
	 *
	 * @return sourceBranchName
	 **/
	@JsonProperty("sourceBranchName")
	public String getSourceBranchName() {
		return this.sourceBranchName;
	}

	/**
	 * Get sourceRepositoryName
	 *
	 * @return sourceRepositoryName
	 **/
	@JsonProperty("sourceRepositoryName")
	public String getSourceRepositoryName() {
		return this.sourceRepositoryName;
	}

	/**
	 * Get sourceRepositoryOwner
	 *
	 * @return sourceRepositoryOwner
	 **/
	@JsonProperty("sourceRepositoryOwner")
	public String getSourceRepositoryOwner() {
		return this.sourceRepositoryOwner;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@JsonProperty("title")
	public String getTitle() {
		return this.title;
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

	public ScmPullRequestAttributes isClosed(Boolean isClosed) {
		this.isClosed = isClosed;
		return this;
	}

	public ScmPullRequestAttributes isCrossRepository(Boolean isCrossRepository) {
		this.isCrossRepository = isCrossRepository;
		return this;
	}

	/**
	 * Get isClosed
	 *
	 * @return isClosed
	 **/
	@JsonProperty("isClosed")
	public Boolean isIsClosed() {
		return this.isClosed;
	}

	/**
	 * Get isCrossRepository
	 *
	 * @return isCrossRepository
	 **/
	@JsonProperty("isCrossRepository")
	public Boolean isIsCrossRepository() {
		return this.isCrossRepository;
	}

	public ScmPullRequestAttributes number(Integer number) {
		this.number = number;
		return this;
	}

	public void setDestinationBranchName(String destinationBranchName) {
		this.destinationBranchName = destinationBranchName;
	}

	public void setDestinationRepositoryName(String destinationRepositoryName) {
		this.destinationRepositoryName = destinationRepositoryName;
	}

	public void setDestinationRepositoryOwner(String destinationRepositoryOwner) {
		this.destinationRepositoryOwner = destinationRepositoryOwner;
	}

	public void setIsClosed(Boolean isClosed) {
		this.isClosed = isClosed;
	}

	public void setIsCrossRepository(Boolean isCrossRepository) {
		this.isCrossRepository = isCrossRepository;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setSourceBranchName(String sourceBranchName) {
		this.sourceBranchName = sourceBranchName;
	}

	public void setSourceRepositoryName(String sourceRepositoryName) {
		this.sourceRepositoryName = sourceRepositoryName;
	}

	public void setSourceRepositoryOwner(String sourceRepositoryOwner) {
		this.sourceRepositoryOwner = sourceRepositoryOwner;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWebUrl(URI webUrl) {
		this.webUrl = webUrl;
	}

	public ScmPullRequestAttributes sourceBranchName(String sourceBranchName) {
		this.sourceBranchName = sourceBranchName;
		return this;
	}

	public ScmPullRequestAttributes sourceRepositoryName(String sourceRepositoryName) {
		this.sourceRepositoryName = sourceRepositoryName;
		return this;
	}

	public ScmPullRequestAttributes sourceRepositoryOwner(String sourceRepositoryOwner) {
		this.sourceRepositoryOwner = sourceRepositoryOwner;
		return this;
	}

	public ScmPullRequestAttributes title(String title) {
		this.title = title;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScmPullRequestAttributes {\n");

		sb.append("    title: ").append(toIndentedString(this.title)).append("\n");
		sb.append("    number: ").append(toIndentedString(this.number)).append("\n");
		sb.append("    webUrl: ").append(toIndentedString(this.webUrl)).append("\n");
		sb.append("    sourceRepositoryOwner: ").append(toIndentedString(this.sourceRepositoryOwner)).append("\n");
		sb.append("    sourceRepositoryName: ").append(toIndentedString(this.sourceRepositoryName)).append("\n");
		sb.append("    sourceBranchName: ").append(toIndentedString(this.sourceBranchName)).append("\n");
		sb.append("    destinationRepositoryOwner: ").append(toIndentedString(this.destinationRepositoryOwner))
				.append("\n");
		sb.append("    destinationRepositoryName: ").append(toIndentedString(this.destinationRepositoryName))
				.append("\n");
		sb.append("    destinationBranchName: ").append(toIndentedString(this.destinationBranchName)).append("\n");
		sb.append("    isClosed: ").append(toIndentedString(this.isClosed)).append("\n");
		sb.append("    isCrossRepository: ").append(toIndentedString(this.isCrossRepository)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public ScmPullRequestAttributes webUrl(URI webUrl) {
		this.webUrl = webUrl;
		return this;
	}
}
