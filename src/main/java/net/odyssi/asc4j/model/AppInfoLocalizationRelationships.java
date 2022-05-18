package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfoLocalizationRelationships implements Serializable {

	private static final long serialVersionUID = -1716260814250075685L;

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

	private AppInfoLocalizationRelationshipsAppInfo appInfo;

	public AppInfoLocalizationRelationships appInfo(AppInfoLocalizationRelationshipsAppInfo appInfo) {
		this.appInfo = appInfo;
		return this;
	}

	/**
	 * Get appInfo
	 *
	 * @return appInfo
	 **/
	@JsonProperty("appInfo")
	public AppInfoLocalizationRelationshipsAppInfo getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(AppInfoLocalizationRelationshipsAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppInfoLocalizationRelationships {\n");

		sb.append("    appInfo: ").append(toIndentedString(this.appInfo)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
