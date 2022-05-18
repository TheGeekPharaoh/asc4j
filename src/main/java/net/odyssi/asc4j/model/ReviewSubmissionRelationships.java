package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReviewSubmissionRelationships implements Serializable {

	private static final long serialVersionUID = 3630741906196355260L;

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

	private AppClipRelationshipsApp app;

	private AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersionForReview;
	private ReviewSubmissionRelationshipsItems items;

	public ReviewSubmissionRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public ReviewSubmissionRelationships appStoreVersionForReview(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersionForReview) {
		this.appStoreVersionForReview = appStoreVersionForReview;
		return this;
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
	 * Get appStoreVersionForReview
	 *
	 * @return appStoreVersionForReview
	 **/
	@JsonProperty("appStoreVersionForReview")
	public AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion getAppStoreVersionForReview() {
		return this.appStoreVersionForReview;
	}

	/**
	 * Get items
	 *
	 * @return items
	 **/
	@JsonProperty("items")
	public ReviewSubmissionRelationshipsItems getItems() {
		return this.items;
	}

	public ReviewSubmissionRelationships items(ReviewSubmissionRelationshipsItems items) {
		this.items = items;
		return this;
	}

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setAppStoreVersionForReview(
			AppClipDefaultExperienceRelationshipsReleaseWithAppStoreVersion appStoreVersionForReview) {
		this.appStoreVersionForReview = appStoreVersionForReview;
	}

	public void setItems(ReviewSubmissionRelationshipsItems items) {
		this.items = items;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReviewSubmissionRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    items: ").append(toIndentedString(this.items)).append("\n");
		sb.append("    appStoreVersionForReview: ").append(toIndentedString(this.appStoreVersionForReview))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
