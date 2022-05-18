package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -133075673256227440L;

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

	private String name;

	private Boolean started;
	private Integer trafficProportion;

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get trafficProportion
	 *
	 * @return trafficProportion
	 **/
	@JsonProperty("trafficProportion")
	public Integer getTrafficProportion() {
		return this.trafficProportion;
	}

	/**
	 * Get started
	 *
	 * @return started
	 **/
	@JsonProperty("started")
	public Boolean isStarted() {
		return this.started;
	}

	public AppStoreVersionExperimentUpdateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

	public void setTrafficProportion(Integer trafficProportion) {
		this.trafficProportion = trafficProportion;
	}

	public AppStoreVersionExperimentUpdateRequestDataAttributes started(Boolean started) {
		this.started = started;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentUpdateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    trafficProportion: ").append(toIndentedString(this.trafficProportion)).append("\n");
		sb.append("    started: ").append(toIndentedString(this.started)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionExperimentUpdateRequestDataAttributes trafficProportion(Integer trafficProportion) {
		this.trafficProportion = trafficProportion;
		return this;
	}
}
