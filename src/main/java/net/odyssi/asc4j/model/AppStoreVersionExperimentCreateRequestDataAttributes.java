package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 753078434730642974L;

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

	public AppStoreVersionExperimentCreateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTrafficProportion(Integer trafficProportion) {
		this.trafficProportion = trafficProportion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentCreateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    trafficProportion: ").append(toIndentedString(this.trafficProportion)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionExperimentCreateRequestDataAttributes trafficProportion(Integer trafficProportion) {
		this.trafficProportion = trafficProportion;
		return this;
	}
}
