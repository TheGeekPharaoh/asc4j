package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventLocalizationRelationships implements Serializable {

	private static final long serialVersionUID = 2734877314037821097L;

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

	private AppEventLocalizationRelationshipsAppEvent appEvent;

	private AppEventLocalizationRelationshipsAppEventScreenshots appEventScreenshots;
	private AppEventLocalizationRelationshipsAppEventVideoClips appEventVideoClips;

	public AppEventLocalizationRelationships appEvent(AppEventLocalizationRelationshipsAppEvent appEvent) {
		this.appEvent = appEvent;
		return this;
	}

	public AppEventLocalizationRelationships appEventScreenshots(
			AppEventLocalizationRelationshipsAppEventScreenshots appEventScreenshots) {
		this.appEventScreenshots = appEventScreenshots;
		return this;
	}

	public AppEventLocalizationRelationships appEventVideoClips(
			AppEventLocalizationRelationshipsAppEventVideoClips appEventVideoClips) {
		this.appEventVideoClips = appEventVideoClips;
		return this;
	}

	/**
	 * Get appEvent
	 *
	 * @return appEvent
	 **/
	@JsonProperty("appEvent")
	public AppEventLocalizationRelationshipsAppEvent getAppEvent() {
		return this.appEvent;
	}

	/**
	 * Get appEventScreenshots
	 *
	 * @return appEventScreenshots
	 **/
	@JsonProperty("appEventScreenshots")
	public AppEventLocalizationRelationshipsAppEventScreenshots getAppEventScreenshots() {
		return this.appEventScreenshots;
	}

	/**
	 * Get appEventVideoClips
	 *
	 * @return appEventVideoClips
	 **/
	@JsonProperty("appEventVideoClips")
	public AppEventLocalizationRelationshipsAppEventVideoClips getAppEventVideoClips() {
		return this.appEventVideoClips;
	}

	public void setAppEvent(AppEventLocalizationRelationshipsAppEvent appEvent) {
		this.appEvent = appEvent;
	}

	public void setAppEventScreenshots(AppEventLocalizationRelationshipsAppEventScreenshots appEventScreenshots) {
		this.appEventScreenshots = appEventScreenshots;
	}

	public void setAppEventVideoClips(AppEventLocalizationRelationshipsAppEventVideoClips appEventVideoClips) {
		this.appEventVideoClips = appEventVideoClips;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventLocalizationRelationships {\n");

		sb.append("    appEvent: ").append(toIndentedString(this.appEvent)).append("\n");
		sb.append("    appEventScreenshots: ").append(toIndentedString(this.appEventScreenshots)).append("\n");
		sb.append("    appEventVideoClips: ").append(toIndentedString(this.appEventVideoClips)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
