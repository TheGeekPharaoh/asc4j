package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreReviewAttachmentCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 3122989363950500672L;

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

	private AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail appStoreReviewDetail;

	public AppStoreReviewAttachmentCreateRequestDataRelationships appStoreReviewDetail(
			AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
		this.appStoreReviewDetail = appStoreReviewDetail;
		return this;
	}

	/**
	 * Get appStoreReviewDetail
	 *
	 * @return appStoreReviewDetail
	 **/
	@JsonProperty("appStoreReviewDetail")
	public AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail getAppStoreReviewDetail() {
		return this.appStoreReviewDetail;
	}

	public void setAppStoreReviewDetail(
			AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
		this.appStoreReviewDetail = appStoreReviewDetail;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreReviewAttachmentCreateRequestDataRelationships {\n");

		sb.append("    appStoreReviewDetail: ").append(toIndentedString(this.appStoreReviewDetail)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
