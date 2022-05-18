package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfoUpdateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -2694231326275885821L;

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

	private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory;

	private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne;

	private AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo;

	private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory;

	private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne;
	private AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo;

	/**
	 * Get primaryCategory
	 *
	 * @return primaryCategory
	 **/
	@JsonProperty("primaryCategory")
	public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimaryCategory() {
		return this.primaryCategory;
	}

	/**
	 * Get primarySubcategoryOne
	 *
	 * @return primarySubcategoryOne
	 **/
	@JsonProperty("primarySubcategoryOne")
	public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimarySubcategoryOne() {
		return this.primarySubcategoryOne;
	}

	/**
	 * Get primarySubcategoryTwo
	 *
	 * @return primarySubcategoryTwo
	 **/
	@JsonProperty("primarySubcategoryTwo")
	public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getPrimarySubcategoryTwo() {
		return this.primarySubcategoryTwo;
	}

	/**
	 * Get secondaryCategory
	 *
	 * @return secondaryCategory
	 **/
	@JsonProperty("secondaryCategory")
	public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondaryCategory() {
		return this.secondaryCategory;
	}

	/**
	 * Get secondarySubcategoryOne
	 *
	 * @return secondarySubcategoryOne
	 **/
	@JsonProperty("secondarySubcategoryOne")
	public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondarySubcategoryOne() {
		return this.secondarySubcategoryOne;
	}

	/**
	 * Get secondarySubcategoryTwo
	 *
	 * @return secondarySubcategoryTwo
	 **/
	@JsonProperty("secondarySubcategoryTwo")
	public AppInfoUpdateRequestDataRelationshipsPrimaryCategory getSecondarySubcategoryTwo() {
		return this.secondarySubcategoryTwo;
	}

	public AppInfoUpdateRequestDataRelationships primaryCategory(
			AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory) {
		this.primaryCategory = primaryCategory;
		return this;
	}

	public AppInfoUpdateRequestDataRelationships primarySubcategoryOne(
			AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne) {
		this.primarySubcategoryOne = primarySubcategoryOne;
		return this;
	}

	public AppInfoUpdateRequestDataRelationships primarySubcategoryTwo(
			AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo) {
		this.primarySubcategoryTwo = primarySubcategoryTwo;
		return this;
	}

	public AppInfoUpdateRequestDataRelationships secondaryCategory(
			AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
		return this;
	}

	public AppInfoUpdateRequestDataRelationships secondarySubcategoryOne(
			AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne) {
		this.secondarySubcategoryOne = secondarySubcategoryOne;
		return this;
	}

	public AppInfoUpdateRequestDataRelationships secondarySubcategoryTwo(
			AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo) {
		this.secondarySubcategoryTwo = secondarySubcategoryTwo;
		return this;
	}

	public void setPrimaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primaryCategory) {
		this.primaryCategory = primaryCategory;
	}

	public void setPrimarySubcategoryOne(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryOne) {
		this.primarySubcategoryOne = primarySubcategoryOne;
	}

	public void setPrimarySubcategoryTwo(AppInfoUpdateRequestDataRelationshipsPrimaryCategory primarySubcategoryTwo) {
		this.primarySubcategoryTwo = primarySubcategoryTwo;
	}

	public void setSecondaryCategory(AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}

	public void setSecondarySubcategoryOne(
			AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryOne) {
		this.secondarySubcategoryOne = secondarySubcategoryOne;
	}

	public void setSecondarySubcategoryTwo(
			AppInfoUpdateRequestDataRelationshipsPrimaryCategory secondarySubcategoryTwo) {
		this.secondarySubcategoryTwo = secondarySubcategoryTwo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppInfoUpdateRequestDataRelationships {\n");

		sb.append("    primaryCategory: ").append(toIndentedString(this.primaryCategory)).append("\n");
		sb.append("    primarySubcategoryOne: ").append(toIndentedString(this.primarySubcategoryOne)).append("\n");
		sb.append("    primarySubcategoryTwo: ").append(toIndentedString(this.primarySubcategoryTwo)).append("\n");
		sb.append("    secondaryCategory: ").append(toIndentedString(this.secondaryCategory)).append("\n");
		sb.append("    secondarySubcategoryOne: ").append(toIndentedString(this.secondarySubcategoryOne)).append("\n");
		sb.append("    secondarySubcategoryTwo: ").append(toIndentedString(this.secondarySubcategoryTwo)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
