package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScmGitReferenceAttributes implements Serializable {

	private static final long serialVersionUID = 5186635059036175421L;

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

	private String canonicalName;

	private Boolean isDeleted;

	private CiGitRefKind kind;
	private String name;

	public ScmGitReferenceAttributes canonicalName(String canonicalName) {
		this.canonicalName = canonicalName;
		return this;
	}

	/**
	 * Get canonicalName
	 *
	 * @return canonicalName
	 **/
	@JsonProperty("canonicalName")
	public String getCanonicalName() {
		return this.canonicalName;
	}

	/**
	 * Get kind
	 *
	 * @return kind
	 **/
	@JsonProperty("kind")
	public CiGitRefKind getKind() {
		return this.kind;
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

	public ScmGitReferenceAttributes isDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
		return this;
	}

	/**
	 * Get isDeleted
	 *
	 * @return isDeleted
	 **/
	@JsonProperty("isDeleted")
	public Boolean isIsDeleted() {
		return this.isDeleted;
	}

	public ScmGitReferenceAttributes kind(CiGitRefKind kind) {
		this.kind = kind;
		return this;
	}

	public ScmGitReferenceAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setCanonicalName(String canonicalName) {
		this.canonicalName = canonicalName;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public void setKind(CiGitRefKind kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScmGitReferenceAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    canonicalName: ").append(toIndentedString(this.canonicalName)).append("\n");
		sb.append("    isDeleted: ").append(toIndentedString(this.isDeleted)).append("\n");
		sb.append("    kind: ").append(toIndentedString(this.kind)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
