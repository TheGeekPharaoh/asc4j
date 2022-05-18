package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiXcodeVersionAttributes implements Serializable {

	private static final long serialVersionUID = -2223592179720769520L;

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

	private List<CiXcodeVersionAttributesTestDestinations> testDestinations = null;
	private String version;

	public CiXcodeVersionAttributes addTestDestinationsItem(
			CiXcodeVersionAttributesTestDestinations testDestinationsItem) {
		this.testDestinations.add(testDestinationsItem);
		return this;
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

	/**
	 * Get testDestinations
	 *
	 * @return testDestinations
	 **/
	@JsonProperty("testDestinations")
	public List<CiXcodeVersionAttributesTestDestinations> getTestDestinations() {
		return this.testDestinations;
	}

	/**
	 * Get version
	 *
	 * @return version
	 **/
	@JsonProperty("version")
	public String getVersion() {
		return this.version;
	}

	public CiXcodeVersionAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTestDestinations(List<CiXcodeVersionAttributesTestDestinations> testDestinations) {
		this.testDestinations = testDestinations;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public CiXcodeVersionAttributes testDestinations(List<CiXcodeVersionAttributesTestDestinations> testDestinations) {
		this.testDestinations = testDestinations;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiXcodeVersionAttributes {\n");

		sb.append("    version: ").append(toIndentedString(this.version)).append("\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    testDestinations: ").append(toIndentedString(this.testDestinations)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiXcodeVersionAttributes version(String version) {
		this.version = version;
		return this;
	}
}
