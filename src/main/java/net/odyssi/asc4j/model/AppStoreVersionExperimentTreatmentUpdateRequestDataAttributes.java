package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentTreatmentUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 4451269819018779078L;

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

	private String appIconName;
	private String name;

	public AppStoreVersionExperimentTreatmentUpdateRequestDataAttributes appIconName(String appIconName) {
		this.appIconName = appIconName;
		return this;
	}

	/**
	 * Get appIconName
	 *
	 * @return appIconName
	 **/
	@JsonProperty("appIconName")
	public String getAppIconName() {
		return this.appIconName;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	public AppStoreVersionExperimentTreatmentUpdateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setAppIconName(String appIconName) {
		this.appIconName = appIconName;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentTreatmentUpdateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    appIconName: ").append(toIndentedString(this.appIconName)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
