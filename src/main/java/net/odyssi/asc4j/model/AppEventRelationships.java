package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventRelationships implements Serializable {

	private static final long serialVersionUID = 2231113329944278113L;

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

	private AppEventRelationshipsLocalizations localizations;

	/**
	 * Get localizations
	 *
	 * @return localizations
	 **/
	@JsonProperty("localizations")
	public AppEventRelationshipsLocalizations getLocalizations() {
		return this.localizations;
	}

	public AppEventRelationships localizations(AppEventRelationshipsLocalizations localizations) {
		this.localizations = localizations;
		return this;
	}

	public void setLocalizations(AppEventRelationshipsLocalizations localizations) {
		this.localizations = localizations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventRelationships {\n");

		sb.append("    localizations: ").append(toIndentedString(this.localizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
