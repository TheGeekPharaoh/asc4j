package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppScreenshotCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -2584222818433047829L;

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

	private AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet appScreenshotSet;

	public AppScreenshotCreateRequestDataRelationships appScreenshotSet(
			AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet appScreenshotSet) {
		this.appScreenshotSet = appScreenshotSet;
		return this;
	}

	/**
	 * Get appScreenshotSet
	 *
	 * @return appScreenshotSet
	 **/
	@JsonProperty("appScreenshotSet")
	public AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet getAppScreenshotSet() {
		return this.appScreenshotSet;
	}

	public void setAppScreenshotSet(AppScreenshotCreateRequestDataRelationshipsAppScreenshotSet appScreenshotSet) {
		this.appScreenshotSet = appScreenshotSet;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppScreenshotCreateRequestDataRelationships {\n");

		sb.append("    appScreenshotSet: ").append(toIndentedString(this.appScreenshotSet)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
