package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventLocalizationCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 8866733287263058058L;

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

	private AppEventLocalizationCreateRequestDataRelationshipsAppEvent appEvent;

	public AppEventLocalizationCreateRequestDataRelationships appEvent(
			AppEventLocalizationCreateRequestDataRelationshipsAppEvent appEvent) {
		this.appEvent = appEvent;
		return this;
	}

	/**
	 * Get appEvent
	 *
	 * @return appEvent
	 **/
	@JsonProperty("appEvent")
	public AppEventLocalizationCreateRequestDataRelationshipsAppEvent getAppEvent() {
		return this.appEvent;
	}

	public void setAppEvent(AppEventLocalizationCreateRequestDataRelationshipsAppEvent appEvent) {
		this.appEvent = appEvent;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventLocalizationCreateRequestDataRelationships {\n");

		sb.append("    appEvent: ").append(toIndentedString(this.appEvent)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
