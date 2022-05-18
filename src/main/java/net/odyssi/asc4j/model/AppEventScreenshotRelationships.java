package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventScreenshotRelationships implements Serializable {

	private static final long serialVersionUID = -6248279751440184211L;

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

	private AppEventScreenshotRelationshipsAppEventLocalization appEventLocalization;

	public AppEventScreenshotRelationships appEventLocalization(
			AppEventScreenshotRelationshipsAppEventLocalization appEventLocalization) {
		this.appEventLocalization = appEventLocalization;
		return this;
	}

	/**
	 * Get appEventLocalization
	 *
	 * @return appEventLocalization
	 **/
	@JsonProperty("appEventLocalization")
	public AppEventScreenshotRelationshipsAppEventLocalization getAppEventLocalization() {
		return this.appEventLocalization;
	}

	public void setAppEventLocalization(AppEventScreenshotRelationshipsAppEventLocalization appEventLocalization) {
		this.appEventLocalization = appEventLocalization;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventScreenshotRelationships {\n");

		sb.append("    appEventLocalization: ").append(toIndentedString(this.appEventLocalization)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
