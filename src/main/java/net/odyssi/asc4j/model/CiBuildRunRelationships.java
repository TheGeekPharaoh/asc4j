package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiBuildRunRelationships implements Serializable {

	private static final long serialVersionUID = -96336817774021296L;

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

	private AppRelationshipsBuilds builds;

	private CiBuildRunRelationshipsSourceBranchOrTag destinationBranch;

	private AppRelationshipsCiProduct product;

	private CiBuildRunRelationshipsPullRequest pullRequest;

	private CiBuildRunRelationshipsSourceBranchOrTag sourceBranchOrTag;
	private CiBuildRunRelationshipsWorkflow workflow;

	public CiBuildRunRelationships builds(AppRelationshipsBuilds builds) {
		this.builds = builds;
		return this;
	}

	public CiBuildRunRelationships destinationBranch(CiBuildRunRelationshipsSourceBranchOrTag destinationBranch) {
		this.destinationBranch = destinationBranch;
		return this;
	}

	/**
	 * Get builds
	 *
	 * @return builds
	 **/
	@JsonProperty("builds")
	public AppRelationshipsBuilds getBuilds() {
		return this.builds;
	}

	/**
	 * Get destinationBranch
	 *
	 * @return destinationBranch
	 **/
	@JsonProperty("destinationBranch")
	public CiBuildRunRelationshipsSourceBranchOrTag getDestinationBranch() {
		return this.destinationBranch;
	}

	/**
	 * Get product
	 *
	 * @return product
	 **/
	@JsonProperty("product")
	public AppRelationshipsCiProduct getProduct() {
		return this.product;
	}

	/**
	 * Get pullRequest
	 *
	 * @return pullRequest
	 **/
	@JsonProperty("pullRequest")
	public CiBuildRunRelationshipsPullRequest getPullRequest() {
		return this.pullRequest;
	}

	/**
	 * Get sourceBranchOrTag
	 *
	 * @return sourceBranchOrTag
	 **/
	@JsonProperty("sourceBranchOrTag")
	public CiBuildRunRelationshipsSourceBranchOrTag getSourceBranchOrTag() {
		return this.sourceBranchOrTag;
	}

	/**
	 * Get workflow
	 *
	 * @return workflow
	 **/
	@JsonProperty("workflow")
	public CiBuildRunRelationshipsWorkflow getWorkflow() {
		return this.workflow;
	}

	public CiBuildRunRelationships product(AppRelationshipsCiProduct product) {
		this.product = product;
		return this;
	}

	public CiBuildRunRelationships pullRequest(CiBuildRunRelationshipsPullRequest pullRequest) {
		this.pullRequest = pullRequest;
		return this;
	}

	public void setBuilds(AppRelationshipsBuilds builds) {
		this.builds = builds;
	}

	public void setDestinationBranch(CiBuildRunRelationshipsSourceBranchOrTag destinationBranch) {
		this.destinationBranch = destinationBranch;
	}

	public void setProduct(AppRelationshipsCiProduct product) {
		this.product = product;
	}

	public void setPullRequest(CiBuildRunRelationshipsPullRequest pullRequest) {
		this.pullRequest = pullRequest;
	}

	public void setSourceBranchOrTag(CiBuildRunRelationshipsSourceBranchOrTag sourceBranchOrTag) {
		this.sourceBranchOrTag = sourceBranchOrTag;
	}

	public void setWorkflow(CiBuildRunRelationshipsWorkflow workflow) {
		this.workflow = workflow;
	}

	public CiBuildRunRelationships sourceBranchOrTag(CiBuildRunRelationshipsSourceBranchOrTag sourceBranchOrTag) {
		this.sourceBranchOrTag = sourceBranchOrTag;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiBuildRunRelationships {\n");

		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("    workflow: ").append(toIndentedString(this.workflow)).append("\n");
		sb.append("    product: ").append(toIndentedString(this.product)).append("\n");
		sb.append("    sourceBranchOrTag: ").append(toIndentedString(this.sourceBranchOrTag)).append("\n");
		sb.append("    destinationBranch: ").append(toIndentedString(this.destinationBranch)).append("\n");
		sb.append("    pullRequest: ").append(toIndentedString(this.pullRequest)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiBuildRunRelationships workflow(CiBuildRunRelationshipsWorkflow workflow) {
		this.workflow = workflow;
		return this;
	}
}
