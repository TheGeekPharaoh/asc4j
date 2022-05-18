package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfoRelationships implements Serializable {

	private static final long serialVersionUID = -1354968813499999454L;

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

	private AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration;

	private AppClipRelationshipsApp app;

	private AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations;

	private AppCategoryRelationshipsParent primaryCategory;

	private AppCategoryRelationshipsParent primarySubcategoryOne;

	private AppCategoryRelationshipsParent primarySubcategoryTwo;

	private AppCategoryRelationshipsParent secondaryCategory;

	private AppCategoryRelationshipsParent secondarySubcategoryOne;
	private AppCategoryRelationshipsParent secondarySubcategoryTwo;

	public AppInfoRelationships ageRatingDeclaration(AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
		this.ageRatingDeclaration = ageRatingDeclaration;
		return this;
	}

	public AppInfoRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public AppInfoRelationships appInfoLocalizations(AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations) {
		this.appInfoLocalizations = appInfoLocalizations;
		return this;
	}

	/**
	 * Get ageRatingDeclaration
	 *
	 * @return ageRatingDeclaration
	 **/
	@JsonProperty("ageRatingDeclaration")
	public AppInfoRelationshipsAgeRatingDeclaration getAgeRatingDeclaration() {
		return this.ageRatingDeclaration;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/
	@JsonProperty("app")
	public AppClipRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get appInfoLocalizations
	 *
	 * @return appInfoLocalizations
	 **/
	@JsonProperty("appInfoLocalizations")
	public AppInfoRelationshipsAppInfoLocalizations getAppInfoLocalizations() {
		return this.appInfoLocalizations;
	}

	/**
	 * Get primaryCategory
	 *
	 * @return primaryCategory
	 **/
	@JsonProperty("primaryCategory")
	public AppCategoryRelationshipsParent getPrimaryCategory() {
		return this.primaryCategory;
	}

	/**
	 * Get primarySubcategoryOne
	 *
	 * @return primarySubcategoryOne
	 **/
	@JsonProperty("primarySubcategoryOne")
	public AppCategoryRelationshipsParent getPrimarySubcategoryOne() {
		return this.primarySubcategoryOne;
	}

	/**
	 * Get primarySubcategoryTwo
	 *
	 * @return primarySubcategoryTwo
	 **/
	@JsonProperty("primarySubcategoryTwo")
	public AppCategoryRelationshipsParent getPrimarySubcategoryTwo() {
		return this.primarySubcategoryTwo;
	}

	/**
	 * Get secondaryCategory
	 *
	 * @return secondaryCategory
	 **/
	@JsonProperty("secondaryCategory")
	public AppCategoryRelationshipsParent getSecondaryCategory() {
		return this.secondaryCategory;
	}

	/**
	 * Get secondarySubcategoryOne
	 *
	 * @return secondarySubcategoryOne
	 **/
	@JsonProperty("secondarySubcategoryOne")
	public AppCategoryRelationshipsParent getSecondarySubcategoryOne() {
		return this.secondarySubcategoryOne;
	}

	/**
	 * Get secondarySubcategoryTwo
	 *
	 * @return secondarySubcategoryTwo
	 **/
	@JsonProperty("secondarySubcategoryTwo")
	public AppCategoryRelationshipsParent getSecondarySubcategoryTwo() {
		return this.secondarySubcategoryTwo;
	}

	public AppInfoRelationships primaryCategory(AppCategoryRelationshipsParent primaryCategory) {
		this.primaryCategory = primaryCategory;
		return this;
	}

	public AppInfoRelationships primarySubcategoryOne(AppCategoryRelationshipsParent primarySubcategoryOne) {
		this.primarySubcategoryOne = primarySubcategoryOne;
		return this;
	}

	public AppInfoRelationships primarySubcategoryTwo(AppCategoryRelationshipsParent primarySubcategoryTwo) {
		this.primarySubcategoryTwo = primarySubcategoryTwo;
		return this;
	}

	public AppInfoRelationships secondaryCategory(AppCategoryRelationshipsParent secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
		return this;
	}

	public AppInfoRelationships secondarySubcategoryOne(AppCategoryRelationshipsParent secondarySubcategoryOne) {
		this.secondarySubcategoryOne = secondarySubcategoryOne;
		return this;
	}

	public AppInfoRelationships secondarySubcategoryTwo(AppCategoryRelationshipsParent secondarySubcategoryTwo) {
		this.secondarySubcategoryTwo = secondarySubcategoryTwo;
		return this;
	}

	public void setAgeRatingDeclaration(AppInfoRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
		this.ageRatingDeclaration = ageRatingDeclaration;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setAppInfoLocalizations(AppInfoRelationshipsAppInfoLocalizations appInfoLocalizations) {
		this.appInfoLocalizations = appInfoLocalizations;
	}

	public void setPrimaryCategory(AppCategoryRelationshipsParent primaryCategory) {
		this.primaryCategory = primaryCategory;
	}

	public void setPrimarySubcategoryOne(AppCategoryRelationshipsParent primarySubcategoryOne) {
		this.primarySubcategoryOne = primarySubcategoryOne;
	}

	public void setPrimarySubcategoryTwo(AppCategoryRelationshipsParent primarySubcategoryTwo) {
		this.primarySubcategoryTwo = primarySubcategoryTwo;
	}

	public void setSecondaryCategory(AppCategoryRelationshipsParent secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}

	public void setSecondarySubcategoryOne(AppCategoryRelationshipsParent secondarySubcategoryOne) {
		this.secondarySubcategoryOne = secondarySubcategoryOne;
	}

	public void setSecondarySubcategoryTwo(AppCategoryRelationshipsParent secondarySubcategoryTwo) {
		this.secondarySubcategoryTwo = secondarySubcategoryTwo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppInfoRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    ageRatingDeclaration: ").append(toIndentedString(this.ageRatingDeclaration)).append("\n");
		sb.append("    appInfoLocalizations: ").append(toIndentedString(this.appInfoLocalizations)).append("\n");
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
