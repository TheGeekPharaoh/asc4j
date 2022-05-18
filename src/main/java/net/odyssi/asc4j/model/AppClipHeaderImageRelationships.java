package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipHeaderImageRelationships implements Serializable {

	private static final long serialVersionUID = -263822227371265099L;

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

	private AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization;

	public AppClipHeaderImageRelationships appClipDefaultExperienceLocalization(
			AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization) {
		this.appClipDefaultExperienceLocalization = appClipDefaultExperienceLocalization;
		return this;
	}

	/**
	 * Get appClipDefaultExperienceLocalization
	 *
	 * @return appClipDefaultExperienceLocalization
	 **/
	@JsonProperty("appClipDefaultExperienceLocalization")
	public AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization getAppClipDefaultExperienceLocalization() {
		return this.appClipDefaultExperienceLocalization;
	}

	public void setAppClipDefaultExperienceLocalization(
			AppClipHeaderImageRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization) {
		this.appClipDefaultExperienceLocalization = appClipDefaultExperienceLocalization;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipHeaderImageRelationships {\n");

		sb.append("    appClipDefaultExperienceLocalization: ")
				.append(toIndentedString(this.appClipDefaultExperienceLocalization)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
