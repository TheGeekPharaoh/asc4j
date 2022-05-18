package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScmGitReferenceRelationships implements Serializable {

	private static final long serialVersionUID = -8221069544244394875L;

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

	private CiWorkflowRelationshipsRepository repository;

	/**
	 * Get repository
	 *
	 * @return repository
	 **/
	@JsonProperty("repository")
	public CiWorkflowRelationshipsRepository getRepository() {
		return this.repository;
	}

	public ScmGitReferenceRelationships repository(CiWorkflowRelationshipsRepository repository) {
		this.repository = repository;
		return this;
	}

	public void setRepository(CiWorkflowRelationshipsRepository repository) {
		this.repository = repository;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScmGitReferenceRelationships {\n");

		sb.append("    repository: ").append(toIndentedString(this.repository)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
