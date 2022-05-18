package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiBuildActionAttributes implements Serializable {

	private static final long serialVersionUID = 5993301110668175334L;

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

	private CiActionType actionType;

	private CiCompletionStatus completionStatus;

	private CiExecutionProgress executionProgress;

	private OffsetDateTime finishedDate;

	private Boolean isRequiredToPass;

	private CiIssueCounts issueCounts;

	private String name;
	private OffsetDateTime startedDate;

	public CiBuildActionAttributes actionType(CiActionType actionType) {
		this.actionType = actionType;
		return this;
	}

	public CiBuildActionAttributes completionStatus(CiCompletionStatus completionStatus) {
		this.completionStatus = completionStatus;
		return this;
	}

	public CiBuildActionAttributes executionProgress(CiExecutionProgress executionProgress) {
		this.executionProgress = executionProgress;
		return this;
	}

	public CiBuildActionAttributes finishedDate(OffsetDateTime finishedDate) {
		this.finishedDate = finishedDate;
		return this;
	}

	/**
	 * Get actionType
	 *
	 * @return actionType
	 **/
	@JsonProperty("actionType")
	public CiActionType getActionType() {
		return this.actionType;
	}

	/**
	 * Get completionStatus
	 *
	 * @return completionStatus
	 **/
	@JsonProperty("completionStatus")
	public CiCompletionStatus getCompletionStatus() {
		return this.completionStatus;
	}

	/**
	 * Get executionProgress
	 *
	 * @return executionProgress
	 **/
	@JsonProperty("executionProgress")
	public CiExecutionProgress getExecutionProgress() {
		return this.executionProgress;
	}

	/**
	 * Get finishedDate
	 *
	 * @return finishedDate
	 **/
	@JsonProperty("finishedDate")
	public OffsetDateTime getFinishedDate() {
		return this.finishedDate;
	}

	/**
	 * Get issueCounts
	 *
	 * @return issueCounts
	 **/
	@JsonProperty("issueCounts")
	public CiIssueCounts getIssueCounts() {
		return this.issueCounts;
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
	 * Get startedDate
	 *
	 * @return startedDate
	 **/
	@JsonProperty("startedDate")
	public OffsetDateTime getStartedDate() {
		return this.startedDate;
	}

	/**
	 * Get isRequiredToPass
	 *
	 * @return isRequiredToPass
	 **/
	@JsonProperty("isRequiredToPass")
	public Boolean isIsRequiredToPass() {
		return this.isRequiredToPass;
	}

	public CiBuildActionAttributes isRequiredToPass(Boolean isRequiredToPass) {
		this.isRequiredToPass = isRequiredToPass;
		return this;
	}

	public CiBuildActionAttributes issueCounts(CiIssueCounts issueCounts) {
		this.issueCounts = issueCounts;
		return this;
	}

	public CiBuildActionAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setActionType(CiActionType actionType) {
		this.actionType = actionType;
	}

	public void setCompletionStatus(CiCompletionStatus completionStatus) {
		this.completionStatus = completionStatus;
	}

	public void setExecutionProgress(CiExecutionProgress executionProgress) {
		this.executionProgress = executionProgress;
	}

	public void setFinishedDate(OffsetDateTime finishedDate) {
		this.finishedDate = finishedDate;
	}

	public void setIsRequiredToPass(Boolean isRequiredToPass) {
		this.isRequiredToPass = isRequiredToPass;
	}

	public void setIssueCounts(CiIssueCounts issueCounts) {
		this.issueCounts = issueCounts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartedDate(OffsetDateTime startedDate) {
		this.startedDate = startedDate;
	}

	public CiBuildActionAttributes startedDate(OffsetDateTime startedDate) {
		this.startedDate = startedDate;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiBuildActionAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    actionType: ").append(toIndentedString(this.actionType)).append("\n");
		sb.append("    startedDate: ").append(toIndentedString(this.startedDate)).append("\n");
		sb.append("    finishedDate: ").append(toIndentedString(this.finishedDate)).append("\n");
		sb.append("    issueCounts: ").append(toIndentedString(this.issueCounts)).append("\n");
		sb.append("    executionProgress: ").append(toIndentedString(this.executionProgress)).append("\n");
		sb.append("    completionStatus: ").append(toIndentedString(this.completionStatus)).append("\n");
		sb.append("    isRequiredToPass: ").append(toIndentedString(this.isRequiredToPass)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
