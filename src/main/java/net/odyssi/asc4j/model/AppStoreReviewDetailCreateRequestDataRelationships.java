package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreReviewDetailCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -7754557099063434061L;

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

	private AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion;

	public AppStoreReviewDetailCreateRequestDataRelationships appStoreVersion(
			AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
		return this;
	}

	/**
	 * Get appStoreVersion
	 *
	 * @return appStoreVersion
	 **/
	@JsonProperty("appStoreVersion")
	public AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion getAppStoreVersion() {
		return this.appStoreVersion;
	}

	public void setAppStoreVersion(AppStoreReviewDetailCreateRequestDataRelationshipsAppStoreVersion appStoreVersion) {
		this.appStoreVersion = appStoreVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreReviewDetailCreateRequestDataRelationships {\n");

		sb.append("    appStoreVersion: ").append(toIndentedString(this.appStoreVersion)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
