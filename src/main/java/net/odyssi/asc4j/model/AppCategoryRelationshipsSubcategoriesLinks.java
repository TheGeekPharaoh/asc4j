package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCategoryRelationshipsSubcategoriesLinks implements Serializable {

	private static final long serialVersionUID = 2789795317256022470L;

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

	private String related;
	private String self;

	/**
	 * Get related
	 *
	 * @return related
	 **/
	@JsonProperty("related")
	public String getRelated() {
		return this.related;
	}

	/**
	 * Get self
	 *
	 * @return self
	 **/
	@JsonProperty("self")
	public String getSelf() {
		return this.self;
	}

	public AppCategoryRelationshipsSubcategoriesLinks related(String related) {
		this.related = related;
		return this;
	}

	public AppCategoryRelationshipsSubcategoriesLinks self(String self) {
		this.self = self;
		return this;
	}

	public void setRelated(String related) {
		this.related = related;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCategoryRelationshipsSubcategoriesLinks {\n");

		sb.append("    self: ").append(toIndentedString(this.self)).append("\n");
		sb.append("    related: ").append(toIndentedString(this.related)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
