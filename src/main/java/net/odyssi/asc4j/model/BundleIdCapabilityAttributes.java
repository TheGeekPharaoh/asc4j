package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleIdCapabilityAttributes implements Serializable {

	private static final long serialVersionUID = -3422740855023460057L;

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

	private CapabilityType capabilityType;
	private List<CapabilitySetting> settings = null;

	public BundleIdCapabilityAttributes addSettingsItem(CapabilitySetting settingsItem) {
		this.settings.add(settingsItem);
		return this;
	}

	public BundleIdCapabilityAttributes capabilityType(CapabilityType capabilityType) {
		this.capabilityType = capabilityType;
		return this;
	}

	/**
	 * Get capabilityType
	 *
	 * @return capabilityType
	 **/
	@JsonProperty("capabilityType")
	public CapabilityType getCapabilityType() {
		return this.capabilityType;
	}

	/**
	 * Get settings
	 *
	 * @return settings
	 **/
	@JsonProperty("settings")
	public List<CapabilitySetting> getSettings() {
		return this.settings;
	}

	public void setCapabilityType(CapabilityType capabilityType) {
		this.capabilityType = capabilityType;
	}

	public void setSettings(List<CapabilitySetting> settings) {
		this.settings = settings;
	}

	public BundleIdCapabilityAttributes settings(List<CapabilitySetting> settings) {
		this.settings = settings;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BundleIdCapabilityAttributes {\n");

		sb.append("    capabilityType: ").append(toIndentedString(this.capabilityType)).append("\n");
		sb.append("    settings: ").append(toIndentedString(this.settings)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
