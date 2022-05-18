package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail implements Serializable {

	private static final long serialVersionUID = -3063564209083783417L;

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

	private AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData data;

	public AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail data(
			AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData getData() {
		return this.data;
	}

	public void setData(AppStoreReviewAttachmentRelationshipsAppStoreReviewDetailData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreReviewAttachmentCreateRequestDataRelationshipsAppStoreReviewDetail {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
