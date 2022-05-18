package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipHeaderImageCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -3363682422013435127L;

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

	private AppClipHeaderImageCreateRequestDataRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization;

	public AppClipHeaderImageCreateRequestDataRelationships appClipDefaultExperienceLocalization(
			AppClipHeaderImageCreateRequestDataRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization) {
		this.appClipDefaultExperienceLocalization = appClipDefaultExperienceLocalization;
		return this;
	}

	/**
	 * Get appClipDefaultExperienceLocalization
	 *
	 * @return appClipDefaultExperienceLocalization
	 **/
	@JsonProperty("appClipDefaultExperienceLocalization")
	public AppClipHeaderImageCreateRequestDataRelationshipsAppClipDefaultExperienceLocalization getAppClipDefaultExperienceLocalization() {
		return this.appClipDefaultExperienceLocalization;
	}

	public void setAppClipDefaultExperienceLocalization(
			AppClipHeaderImageCreateRequestDataRelationshipsAppClipDefaultExperienceLocalization appClipDefaultExperienceLocalization) {
		this.appClipDefaultExperienceLocalization = appClipDefaultExperienceLocalization;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipHeaderImageCreateRequestDataRelationships {\n");

		sb.append("    appClipDefaultExperienceLocalization: ")
				.append(toIndentedString(this.appClipDefaultExperienceLocalization)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
