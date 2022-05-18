package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiPullRequestStartCondition implements Serializable {

	private static final long serialVersionUID = -27556281429522835L;

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

	private Boolean autoCancel;

	private CiBranchPatterns destination;

	private CiFilesAndFoldersRule filesAndFoldersRule;
	private CiBranchPatterns source;

	public CiPullRequestStartCondition autoCancel(Boolean autoCancel) {
		this.autoCancel = autoCancel;
		return this;
	}

	public CiPullRequestStartCondition destination(CiBranchPatterns destination) {
		this.destination = destination;
		return this;
	}

	public CiPullRequestStartCondition filesAndFoldersRule(CiFilesAndFoldersRule filesAndFoldersRule) {
		this.filesAndFoldersRule = filesAndFoldersRule;
		return this;
	}

	/**
	 * Get destination
	 *
	 * @return destination
	 **/
	@JsonProperty("destination")
	public CiBranchPatterns getDestination() {
		return this.destination;
	}

	/**
	 * Get filesAndFoldersRule
	 *
	 * @return filesAndFoldersRule
	 **/
	@JsonProperty("filesAndFoldersRule")
	public CiFilesAndFoldersRule getFilesAndFoldersRule() {
		return this.filesAndFoldersRule;
	}

	/**
	 * Get source
	 *
	 * @return source
	 **/
	@JsonProperty("source")
	public CiBranchPatterns getSource() {
		return this.source;
	}

	/**
	 * Get autoCancel
	 *
	 * @return autoCancel
	 **/
	@JsonProperty("autoCancel")
	public Boolean isAutoCancel() {
		return this.autoCancel;
	}

	public void setAutoCancel(Boolean autoCancel) {
		this.autoCancel = autoCancel;
	}

	public void setDestination(CiBranchPatterns destination) {
		this.destination = destination;
	}

	public void setFilesAndFoldersRule(CiFilesAndFoldersRule filesAndFoldersRule) {
		this.filesAndFoldersRule = filesAndFoldersRule;
	}

	public void setSource(CiBranchPatterns source) {
		this.source = source;
	}

	public CiPullRequestStartCondition source(CiBranchPatterns source) {
		this.source = source;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiPullRequestStartCondition {\n");

		sb.append("    source: ").append(toIndentedString(this.source)).append("\n");
		sb.append("    destination: ").append(toIndentedString(this.destination)).append("\n");
		sb.append("    filesAndFoldersRule: ").append(toIndentedString(this.filesAndFoldersRule)).append("\n");
		sb.append("    autoCancel: ").append(toIndentedString(this.autoCancel)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
