package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCategoryRelationships implements Serializable {

	private static final long serialVersionUID = 700044813186274932L;

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

	private AppCategoryRelationshipsParent parent;
	private AppCategoryRelationshipsSubcategories subcategories;

	/**
	 * Get parent
	 *
	 * @return parent
	 **/
	@JsonProperty("parent")
	public AppCategoryRelationshipsParent getParent() {
		return this.parent;
	}

	/**
	 * Get subcategories
	 *
	 * @return subcategories
	 **/
	@JsonProperty("subcategories")
	public AppCategoryRelationshipsSubcategories getSubcategories() {
		return this.subcategories;
	}

	public AppCategoryRelationships parent(AppCategoryRelationshipsParent parent) {
		this.parent = parent;
		return this;
	}

	public void setParent(AppCategoryRelationshipsParent parent) {
		this.parent = parent;
	}

	public void setSubcategories(AppCategoryRelationshipsSubcategories subcategories) {
		this.subcategories = subcategories;
	}

	public AppCategoryRelationships subcategories(AppCategoryRelationshipsSubcategories subcategories) {
		this.subcategories = subcategories;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCategoryRelationships {\n");

		sb.append("    subcategories: ").append(toIndentedString(this.subcategories)).append("\n");
		sb.append("    parent: ").append(toIndentedString(this.parent)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
