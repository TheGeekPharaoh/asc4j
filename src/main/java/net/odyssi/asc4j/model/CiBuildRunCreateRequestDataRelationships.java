package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiBuildRunCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -4054548864101218303L;

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

	private CiBuildRunCreateRequestDataRelationshipsBuildRun buildRun;

	private CiBuildRunCreateRequestDataRelationshipsPullRequest pullRequest;

	private CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag sourceBranchOrTag;
	private CiBuildRunCreateRequestDataRelationshipsWorkflow workflow;

	public CiBuildRunCreateRequestDataRelationships buildRun(
			CiBuildRunCreateRequestDataRelationshipsBuildRun buildRun) {
		this.buildRun = buildRun;
		return this;
	}

	/**
	 * Get buildRun
	 *
	 * @return buildRun
	 **/
	@JsonProperty("buildRun")
	public CiBuildRunCreateRequestDataRelationshipsBuildRun getBuildRun() {
		return this.buildRun;
	}

	/**
	 * Get pullRequest
	 *
	 * @return pullRequest
	 **/
	@JsonProperty("pullRequest")
	public CiBuildRunCreateRequestDataRelationshipsPullRequest getPullRequest() {
		return this.pullRequest;
	}

	/**
	 * Get sourceBranchOrTag
	 *
	 * @return sourceBranchOrTag
	 **/
	@JsonProperty("sourceBranchOrTag")
	public CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag getSourceBranchOrTag() {
		return this.sourceBranchOrTag;
	}

	/**
	 * Get workflow
	 *
	 * @return workflow
	 **/
	@JsonProperty("workflow")
	public CiBuildRunCreateRequestDataRelationshipsWorkflow getWorkflow() {
		return this.workflow;
	}

	public CiBuildRunCreateRequestDataRelationships pullRequest(
			CiBuildRunCreateRequestDataRelationshipsPullRequest pullRequest) {
		this.pullRequest = pullRequest;
		return this;
	}

	public void setBuildRun(CiBuildRunCreateRequestDataRelationshipsBuildRun buildRun) {
		this.buildRun = buildRun;
	}

	public void setPullRequest(CiBuildRunCreateRequestDataRelationshipsPullRequest pullRequest) {
		this.pullRequest = pullRequest;
	}

	public void setSourceBranchOrTag(CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag sourceBranchOrTag) {
		this.sourceBranchOrTag = sourceBranchOrTag;
	}

	public void setWorkflow(CiBuildRunCreateRequestDataRelationshipsWorkflow workflow) {
		this.workflow = workflow;
	}

	public CiBuildRunCreateRequestDataRelationships sourceBranchOrTag(
			CiBuildRunCreateRequestDataRelationshipsSourceBranchOrTag sourceBranchOrTag) {
		this.sourceBranchOrTag = sourceBranchOrTag;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiBuildRunCreateRequestDataRelationships {\n");

		sb.append("    buildRun: ").append(toIndentedString(this.buildRun)).append("\n");
		sb.append("    workflow: ").append(toIndentedString(this.workflow)).append("\n");
		sb.append("    sourceBranchOrTag: ").append(toIndentedString(this.sourceBranchOrTag)).append("\n");
		sb.append("    pullRequest: ").append(toIndentedString(this.pullRequest)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiBuildRunCreateRequestDataRelationships workflow(
			CiBuildRunCreateRequestDataRelationshipsWorkflow workflow) {
		this.workflow = workflow;
		return this;
	}
}
