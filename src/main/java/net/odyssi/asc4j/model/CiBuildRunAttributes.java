package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiBuildRunAttributes implements Serializable {

	public enum CancelReasonEnum {

		AUTOMATICALLY_BY_NEWER_BUILD(String.valueOf("AUTOMATICALLY_BY_NEWER_BUILD")),
		MANUALLY_BY_USER(String.valueOf("MANUALLY_BY_USER"));

		public static CancelReasonEnum fromValue(String value) {
			for (CancelReasonEnum b : CancelReasonEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		CancelReasonEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	public enum StartReasonEnum {

		GIT_REF_CHANGE(String.valueOf("GIT_REF_CHANGE")), MANUAL(String.valueOf("MANUAL")),
		MANUAL_REBUILD(String.valueOf("MANUAL_REBUILD")), PULL_REQUEST_OPEN(String.valueOf("PULL_REQUEST_OPEN")),
		PULL_REQUEST_UPDATE(String.valueOf("PULL_REQUEST_UPDATE")), SCHEDULE(String.valueOf("SCHEDULE"));

		public static StartReasonEnum fromValue(String value) {
			for (StartReasonEnum b : StartReasonEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		StartReasonEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = -3529461217402451060L;

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

	private CancelReasonEnum cancelReason;

	private CiCompletionStatus completionStatus;

	private OffsetDateTime createdDate;

	private CiBuildRunAttributesSourceCommit destinationCommit;

	private CiExecutionProgress executionProgress;

	private OffsetDateTime finishedDate;

	private Boolean isPullRequestBuild;

	private CiIssueCounts issueCounts;

	private Integer number;

	private CiBuildRunAttributesSourceCommit sourceCommit;

	private OffsetDateTime startedDate;
	private StartReasonEnum startReason;

	public CiBuildRunAttributes cancelReason(CancelReasonEnum cancelReason) {
		this.cancelReason = cancelReason;
		return this;
	}

	public CiBuildRunAttributes completionStatus(CiCompletionStatus completionStatus) {
		this.completionStatus = completionStatus;
		return this;
	}

	public CiBuildRunAttributes createdDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public CiBuildRunAttributes destinationCommit(CiBuildRunAttributesSourceCommit destinationCommit) {
		this.destinationCommit = destinationCommit;
		return this;
	}

	public CiBuildRunAttributes executionProgress(CiExecutionProgress executionProgress) {
		this.executionProgress = executionProgress;
		return this;
	}

	public CiBuildRunAttributes finishedDate(OffsetDateTime finishedDate) {
		this.finishedDate = finishedDate;
		return this;
	}

	/**
	 * Get cancelReason
	 *
	 * @return cancelReason
	 **/
	@JsonProperty("cancelReason")
	public String getCancelReason() {
		if (this.cancelReason == null) {
			return null;
		}
		return this.cancelReason.value();
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
	 * Get createdDate
	 *
	 * @return createdDate
	 **/
	@JsonProperty("createdDate")
	public OffsetDateTime getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Get destinationCommit
	 *
	 * @return destinationCommit
	 **/
	@JsonProperty("destinationCommit")
	public CiBuildRunAttributesSourceCommit getDestinationCommit() {
		return this.destinationCommit;
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
	 * Get number
	 *
	 * @return number
	 **/
	@JsonProperty("number")
	public Integer getNumber() {
		return this.number;
	}

	/**
	 * Get sourceCommit
	 *
	 * @return sourceCommit
	 **/
	@JsonProperty("sourceCommit")
	public CiBuildRunAttributesSourceCommit getSourceCommit() {
		return this.sourceCommit;
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
	 * Get startReason
	 *
	 * @return startReason
	 **/
	@JsonProperty("startReason")
	public String getStartReason() {
		if (this.startReason == null) {
			return null;
		}
		return this.startReason.value();
	}

	/**
	 * Get isPullRequestBuild
	 *
	 * @return isPullRequestBuild
	 **/
	@JsonProperty("isPullRequestBuild")
	public Boolean isIsPullRequestBuild() {
		return this.isPullRequestBuild;
	}

	public CiBuildRunAttributes isPullRequestBuild(Boolean isPullRequestBuild) {
		this.isPullRequestBuild = isPullRequestBuild;
		return this;
	}

	public CiBuildRunAttributes issueCounts(CiIssueCounts issueCounts) {
		this.issueCounts = issueCounts;
		return this;
	}

	public CiBuildRunAttributes number(Integer number) {
		this.number = number;
		return this;
	}

	public void setCancelReason(CancelReasonEnum cancelReason) {
		this.cancelReason = cancelReason;
	}

	public void setCompletionStatus(CiCompletionStatus completionStatus) {
		this.completionStatus = completionStatus;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setDestinationCommit(CiBuildRunAttributesSourceCommit destinationCommit) {
		this.destinationCommit = destinationCommit;
	}

	public void setExecutionProgress(CiExecutionProgress executionProgress) {
		this.executionProgress = executionProgress;
	}

	public void setFinishedDate(OffsetDateTime finishedDate) {
		this.finishedDate = finishedDate;
	}

	public void setIsPullRequestBuild(Boolean isPullRequestBuild) {
		this.isPullRequestBuild = isPullRequestBuild;
	}

	public void setIssueCounts(CiIssueCounts issueCounts) {
		this.issueCounts = issueCounts;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setSourceCommit(CiBuildRunAttributesSourceCommit sourceCommit) {
		this.sourceCommit = sourceCommit;
	}

	public void setStartedDate(OffsetDateTime startedDate) {
		this.startedDate = startedDate;
	}

	public void setStartReason(StartReasonEnum startReason) {
		this.startReason = startReason;
	}

	public CiBuildRunAttributes sourceCommit(CiBuildRunAttributesSourceCommit sourceCommit) {
		this.sourceCommit = sourceCommit;
		return this;
	}

	public CiBuildRunAttributes startedDate(OffsetDateTime startedDate) {
		this.startedDate = startedDate;
		return this;
	}

	public CiBuildRunAttributes startReason(StartReasonEnum startReason) {
		this.startReason = startReason;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiBuildRunAttributes {\n");

		sb.append("    number: ").append(toIndentedString(this.number)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(this.createdDate)).append("\n");
		sb.append("    startedDate: ").append(toIndentedString(this.startedDate)).append("\n");
		sb.append("    finishedDate: ").append(toIndentedString(this.finishedDate)).append("\n");
		sb.append("    sourceCommit: ").append(toIndentedString(this.sourceCommit)).append("\n");
		sb.append("    destinationCommit: ").append(toIndentedString(this.destinationCommit)).append("\n");
		sb.append("    isPullRequestBuild: ").append(toIndentedString(this.isPullRequestBuild)).append("\n");
		sb.append("    issueCounts: ").append(toIndentedString(this.issueCounts)).append("\n");
		sb.append("    executionProgress: ").append(toIndentedString(this.executionProgress)).append("\n");
		sb.append("    completionStatus: ").append(toIndentedString(this.completionStatus)).append("\n");
		sb.append("    startReason: ").append(toIndentedString(this.startReason)).append("\n");
		sb.append("    cancelReason: ").append(toIndentedString(this.cancelReason)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
