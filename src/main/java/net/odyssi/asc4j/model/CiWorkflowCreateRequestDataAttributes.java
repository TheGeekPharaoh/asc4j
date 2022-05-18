package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiWorkflowCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 8511139684049202317L;

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

	private List<CiAction> actions = new ArrayList<>();

	private CiBranchStartCondition branchStartCondition;

	private Boolean clean;

	private String containerFilePath;

	private String description;

	private Boolean isEnabled;

	private Boolean isLockedForEditing;

	private String name;

	private CiPullRequestStartCondition pullRequestStartCondition;

	private CiScheduledStartCondition scheduledStartCondition;
	private CiTagStartCondition tagStartCondition;

	public CiWorkflowCreateRequestDataAttributes actions(List<CiAction> actions) {
		this.actions = actions;
		return this;
	}

	public CiWorkflowCreateRequestDataAttributes addActionsItem(CiAction actionsItem) {
		this.actions.add(actionsItem);
		return this;
	}

	public CiWorkflowCreateRequestDataAttributes branchStartCondition(CiBranchStartCondition branchStartCondition) {
		this.branchStartCondition = branchStartCondition;
		return this;
	}

	public CiWorkflowCreateRequestDataAttributes clean(Boolean clean) {
		this.clean = clean;
		return this;
	}

	public CiWorkflowCreateRequestDataAttributes containerFilePath(String containerFilePath) {
		this.containerFilePath = containerFilePath;
		return this;
	}

	public CiWorkflowCreateRequestDataAttributes description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get actions
	 *
	 * @return actions
	 **/
	@JsonProperty("actions")
	public List<CiAction> getActions() {
		return this.actions;
	}

	/**
	 * Get branchStartCondition
	 *
	 * @return branchStartCondition
	 **/
	@JsonProperty("branchStartCondition")
	public CiBranchStartCondition getBranchStartCondition() {
		return this.branchStartCondition;
	}

	/**
	 * Get containerFilePath
	 *
	 * @return containerFilePath
	 **/
	@JsonProperty("containerFilePath")
	public String getContainerFilePath() {
		return this.containerFilePath;
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get pullRequestStartCondition
	 *
	 * @return pullRequestStartCondition
	 **/
	@JsonProperty("pullRequestStartCondition")
	public CiPullRequestStartCondition getPullRequestStartCondition() {
		return this.pullRequestStartCondition;
	}

	/**
	 * Get scheduledStartCondition
	 *
	 * @return scheduledStartCondition
	 **/
	@JsonProperty("scheduledStartCondition")
	public CiScheduledStartCondition getScheduledStartCondition() {
		return this.scheduledStartCondition;
	}

	/**
	 * Get tagStartCondition
	 *
	 * @return tagStartCondition
	 **/
	@JsonProperty("tagStartCondition")
	public CiTagStartCondition getTagStartCondition() {
		return this.tagStartCondition;
	}

	/**
	 * Get clean
	 *
	 * @return clean
	 **/
	@JsonProperty("clean")
	public Boolean isClean() {
		return this.clean;
	}

	public CiWorkflowCreateRequestDataAttributes isEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		return this;
	}

	/**
	 * Get isEnabled
	 *
	 * @return isEnabled
	 **/
	@JsonProperty("isEnabled")
	public Boolean isIsEnabled() {
		return this.isEnabled;
	}

	/**
	 * Get isLockedForEditing
	 *
	 * @return isLockedForEditing
	 **/
	@JsonProperty("isLockedForEditing")
	public Boolean isIsLockedForEditing() {
		return this.isLockedForEditing;
	}

	public CiWorkflowCreateRequestDataAttributes isLockedForEditing(Boolean isLockedForEditing) {
		this.isLockedForEditing = isLockedForEditing;
		return this;
	}

	public CiWorkflowCreateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public CiWorkflowCreateRequestDataAttributes pullRequestStartCondition(
			CiPullRequestStartCondition pullRequestStartCondition) {
		this.pullRequestStartCondition = pullRequestStartCondition;
		return this;
	}

	public CiWorkflowCreateRequestDataAttributes scheduledStartCondition(
			CiScheduledStartCondition scheduledStartCondition) {
		this.scheduledStartCondition = scheduledStartCondition;
		return this;
	}

	public void setActions(List<CiAction> actions) {
		this.actions = actions;
	}

	public void setBranchStartCondition(CiBranchStartCondition branchStartCondition) {
		this.branchStartCondition = branchStartCondition;
	}

	public void setClean(Boolean clean) {
		this.clean = clean;
	}

	public void setContainerFilePath(String containerFilePath) {
		this.containerFilePath = containerFilePath;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public void setIsLockedForEditing(Boolean isLockedForEditing) {
		this.isLockedForEditing = isLockedForEditing;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPullRequestStartCondition(CiPullRequestStartCondition pullRequestStartCondition) {
		this.pullRequestStartCondition = pullRequestStartCondition;
	}

	public void setScheduledStartCondition(CiScheduledStartCondition scheduledStartCondition) {
		this.scheduledStartCondition = scheduledStartCondition;
	}

	public void setTagStartCondition(CiTagStartCondition tagStartCondition) {
		this.tagStartCondition = tagStartCondition;
	}

	public CiWorkflowCreateRequestDataAttributes tagStartCondition(CiTagStartCondition tagStartCondition) {
		this.tagStartCondition = tagStartCondition;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiWorkflowCreateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    description: ").append(toIndentedString(this.description)).append("\n");
		sb.append("    branchStartCondition: ").append(toIndentedString(this.branchStartCondition)).append("\n");
		sb.append("    tagStartCondition: ").append(toIndentedString(this.tagStartCondition)).append("\n");
		sb.append("    pullRequestStartCondition: ").append(toIndentedString(this.pullRequestStartCondition))
				.append("\n");
		sb.append("    scheduledStartCondition: ").append(toIndentedString(this.scheduledStartCondition)).append("\n");
		sb.append("    actions: ").append(toIndentedString(this.actions)).append("\n");
		sb.append("    isEnabled: ").append(toIndentedString(this.isEnabled)).append("\n");
		sb.append("    isLockedForEditing: ").append(toIndentedString(this.isLockedForEditing)).append("\n");
		sb.append("    clean: ").append(toIndentedString(this.clean)).append("\n");
		sb.append("    containerFilePath: ").append(toIndentedString(this.containerFilePath)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
