package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreReviewAttachmentRelationships implements Serializable {

	private static final long serialVersionUID = 3431396765150884692L;

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

	private AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail;

	public AppStoreReviewAttachmentRelationships appStoreReviewDetail(
			AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
		this.appStoreReviewDetail = appStoreReviewDetail;
		return this;
	}

	/**
	 * Get appStoreReviewDetail
	 *
	 * @return appStoreReviewDetail
	 **/
	@JsonProperty("appStoreReviewDetail")
	public AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail getAppStoreReviewDetail() {
		return this.appStoreReviewDetail;
	}

	public void setAppStoreReviewDetail(
			AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
		this.appStoreReviewDetail = appStoreReviewDetail;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreReviewAttachmentRelationships {\n");

		sb.append("    appStoreReviewDetail: ").append(toIndentedString(this.appStoreReviewDetail)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
