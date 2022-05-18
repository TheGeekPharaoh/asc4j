package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageLocalizationInlineCreateRelationships implements Serializable {

	private static final long serialVersionUID = -5429719947940731522L;

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

	private AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion;

	public AppCustomProductPageLocalizationInlineCreateRelationships appCustomProductPageVersion(
			AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
		this.appCustomProductPageVersion = appCustomProductPageVersion;
		return this;
	}

	/**
	 * Get appCustomProductPageVersion
	 *
	 * @return appCustomProductPageVersion
	 **/
	@JsonProperty("appCustomProductPageVersion")
	public AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion getAppCustomProductPageVersion() {
		return this.appCustomProductPageVersion;
	}

	public void setAppCustomProductPageVersion(
			AppCustomProductPageLocalizationInlineCreateRelationshipsAppCustomProductPageVersion appCustomProductPageVersion) {
		this.appCustomProductPageVersion = appCustomProductPageVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageLocalizationInlineCreateRelationships {\n");

		sb.append("    appCustomProductPageVersion: ").append(toIndentedString(this.appCustomProductPageVersion))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
