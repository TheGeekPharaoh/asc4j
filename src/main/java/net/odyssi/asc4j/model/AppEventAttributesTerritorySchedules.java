package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventAttributesTerritorySchedules implements Serializable {

	private static final long serialVersionUID = 4032436649742980923L;

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

	private OffsetDateTime eventEnd;

	private OffsetDateTime eventStart;

	private OffsetDateTime publishStart;
	private List<String> territories = null;

	public AppEventAttributesTerritorySchedules addTerritoriesItem(String territoriesItem) {
		this.territories.add(territoriesItem);
		return this;
	}

	public AppEventAttributesTerritorySchedules eventEnd(OffsetDateTime eventEnd) {
		this.eventEnd = eventEnd;
		return this;
	}

	public AppEventAttributesTerritorySchedules eventStart(OffsetDateTime eventStart) {
		this.eventStart = eventStart;
		return this;
	}

	/**
	 * Get eventEnd
	 *
	 * @return eventEnd
	 **/
	@JsonProperty("eventEnd")
	public OffsetDateTime getEventEnd() {
		return this.eventEnd;
	}

	/**
	 * Get eventStart
	 *
	 * @return eventStart
	 **/
	@JsonProperty("eventStart")
	public OffsetDateTime getEventStart() {
		return this.eventStart;
	}

	/**
	 * Get publishStart
	 *
	 * @return publishStart
	 **/
	@JsonProperty("publishStart")
	public OffsetDateTime getPublishStart() {
		return this.publishStart;
	}

	/**
	 * Get territories
	 *
	 * @return territories
	 **/
	@JsonProperty("territories")
	public List<String> getTerritories() {
		return this.territories;
	}

	public AppEventAttributesTerritorySchedules publishStart(OffsetDateTime publishStart) {
		this.publishStart = publishStart;
		return this;
	}

	public void setEventEnd(OffsetDateTime eventEnd) {
		this.eventEnd = eventEnd;
	}

	public void setEventStart(OffsetDateTime eventStart) {
		this.eventStart = eventStart;
	}

	public void setPublishStart(OffsetDateTime publishStart) {
		this.publishStart = publishStart;
	}

	public void setTerritories(List<String> territories) {
		this.territories = territories;
	}

	public AppEventAttributesTerritorySchedules territories(List<String> territories) {
		this.territories = territories;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventAttributesTerritorySchedules {\n");

		sb.append("    territories: ").append(toIndentedString(this.territories)).append("\n");
		sb.append("    publishStart: ").append(toIndentedString(this.publishStart)).append("\n");
		sb.append("    eventStart: ").append(toIndentedString(this.eventStart)).append("\n");
		sb.append("    eventEnd: ").append(toIndentedString(this.eventEnd)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
