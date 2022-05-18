package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfoLocalizationCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 8569341700655274764L;

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

	private AppInfoLocalizationCreateRequestDataRelationshipsAppInfo appInfo;

	public AppInfoLocalizationCreateRequestDataRelationships appInfo(
			AppInfoLocalizationCreateRequestDataRelationshipsAppInfo appInfo) {
		this.appInfo = appInfo;
		return this;
	}

	/**
	 * Get appInfo
	 *
	 * @return appInfo
	 **/
	@JsonProperty("appInfo")
	public AppInfoLocalizationCreateRequestDataRelationshipsAppInfo getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(AppInfoLocalizationCreateRequestDataRelationshipsAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppInfoLocalizationCreateRequestDataRelationships {\n");

		sb.append("    appInfo: ").append(toIndentedString(this.appInfo)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
