package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CapabilitySetting implements Serializable {

	public enum AllowedInstancesEnum {

		ENTRY(String.valueOf("ENTRY")), MULTIPLE(String.valueOf("MULTIPLE")), SINGLE(String.valueOf("SINGLE"));

		public static AllowedInstancesEnum fromValue(String value) {
			for (AllowedInstancesEnum b : AllowedInstancesEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		AllowedInstancesEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	public enum KeyEnum {

		APPLE_ID_AUTH_APP_CONSENT(String.valueOf("APPLE_ID_AUTH_APP_CONSENT")),
		DATA_PROTECTION_PERMISSION_LEVEL(String.valueOf("DATA_PROTECTION_PERMISSION_LEVEL")),
		ICLOUD_VERSION(String.valueOf("ICLOUD_VERSION"));

		public static KeyEnum fromValue(String value) {
			for (KeyEnum b : KeyEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		KeyEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = -8223415647288934938L;

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

	private AllowedInstancesEnum allowedInstances;

	private String description;

	private Boolean enabledByDefault;

	private KeyEnum key;

	private Integer minInstances;

	private String name;

	private List<CapabilityOption> options = null;
	private Boolean visible;

	public CapabilitySetting addOptionsItem(CapabilityOption optionsItem) {
		this.options.add(optionsItem);
		return this;
	}

	public CapabilitySetting allowedInstances(AllowedInstancesEnum allowedInstances) {
		this.allowedInstances = allowedInstances;
		return this;
	}

	public CapabilitySetting description(String description) {
		this.description = description;
		return this;
	}

	public CapabilitySetting enabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
		return this;
	}

	/**
	 * Get allowedInstances
	 *
	 * @return allowedInstances
	 **/
	@JsonProperty("allowedInstances")
	public String getAllowedInstances() {
		if (this.allowedInstances == null) {
			return null;
		}
		return this.allowedInstances.value();
	}

	/**
	 * Get description
	 *
	 * @return description
	 **/
	@JsonProperty("description")
	public String getDescription() {
		return this.description;
	}

	/**
	 * Get key
	 *
	 * @return key
	 **/
	@JsonProperty("key")
	public String getKey() {
		if (this.key == null) {
			return null;
		}
		return this.key.value();
	}

	/**
	 * Get minInstances
	 *
	 * @return minInstances
	 **/
	@JsonProperty("minInstances")
	public Integer getMinInstances() {
		return this.minInstances;
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
	 * Get options
	 *
	 * @return options
	 **/
	@JsonProperty("options")
	public List<CapabilityOption> getOptions() {
		return this.options;
	}

	/**
	 * Get enabledByDefault
	 *
	 * @return enabledByDefault
	 **/
	@JsonProperty("enabledByDefault")
	public Boolean isEnabledByDefault() {
		return this.enabledByDefault;
	}

	/**
	 * Get visible
	 *
	 * @return visible
	 **/
	@JsonProperty("visible")
	public Boolean isVisible() {
		return this.visible;
	}

	public CapabilitySetting key(KeyEnum key) {
		this.key = key;
		return this;
	}

	public CapabilitySetting minInstances(Integer minInstances) {
		this.minInstances = minInstances;
		return this;
	}

	public CapabilitySetting name(String name) {
		this.name = name;
		return this;
	}

	public CapabilitySetting options(List<CapabilityOption> options) {
		this.options = options;
		return this;
	}

	public void setAllowedInstances(AllowedInstancesEnum allowedInstances) {
		this.allowedInstances = allowedInstances;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEnabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
	}

	public void setKey(KeyEnum key) {
		this.key = key;
	}

	public void setMinInstances(Integer minInstances) {
		this.minInstances = minInstances;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOptions(List<CapabilityOption> options) {
		this.options = options;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CapabilitySetting {\n");

		sb.append("    key: ").append(toIndentedString(this.key)).append("\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    description: ").append(toIndentedString(this.description)).append("\n");
		sb.append("    enabledByDefault: ").append(toIndentedString(this.enabledByDefault)).append("\n");
		sb.append("    visible: ").append(toIndentedString(this.visible)).append("\n");
		sb.append("    allowedInstances: ").append(toIndentedString(this.allowedInstances)).append("\n");
		sb.append("    minInstances: ").append(toIndentedString(this.minInstances)).append("\n");
		sb.append("    options: ").append(toIndentedString(this.options)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CapabilitySetting visible(Boolean visible) {
		this.visible = visible;
		return this;
	}
}
