package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScmRepositoryRelationships implements Serializable {

	private static final long serialVersionUID = -1430978592423546834L;

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

	private CiBuildRunRelationshipsSourceBranchOrTag defaultBranch;
	private ScmRepositoryRelationshipsScmProvider scmProvider;

	public ScmRepositoryRelationships defaultBranch(CiBuildRunRelationshipsSourceBranchOrTag defaultBranch) {
		this.defaultBranch = defaultBranch;
		return this;
	}

	/**
	 * Get defaultBranch
	 *
	 * @return defaultBranch
	 **/
	@JsonProperty("defaultBranch")
	public CiBuildRunRelationshipsSourceBranchOrTag getDefaultBranch() {
		return this.defaultBranch;
	}

	/**
	 * Get scmProvider
	 *
	 * @return scmProvider
	 **/
	@JsonProperty("scmProvider")
	public ScmRepositoryRelationshipsScmProvider getScmProvider() {
		return this.scmProvider;
	}

	public ScmRepositoryRelationships scmProvider(ScmRepositoryRelationshipsScmProvider scmProvider) {
		this.scmProvider = scmProvider;
		return this;
	}

	public void setDefaultBranch(CiBuildRunRelationshipsSourceBranchOrTag defaultBranch) {
		this.defaultBranch = defaultBranch;
	}

	public void setScmProvider(ScmRepositoryRelationshipsScmProvider scmProvider) {
		this.scmProvider = scmProvider;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScmRepositoryRelationships {\n");

		sb.append("    scmProvider: ").append(toIndentedString(this.scmProvider)).append("\n");
		sb.append("    defaultBranch: ").append(toIndentedString(this.defaultBranch)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
