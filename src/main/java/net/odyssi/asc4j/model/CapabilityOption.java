package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CapabilityOption implements Serializable {

	public enum KeyEnum {

		COMPLETE_PROTECTION(String.valueOf("COMPLETE_PROTECTION")),
		PRIMARY_APP_CONSENT(String.valueOf("PRIMARY_APP_CONSENT")),
		PROTECTED_UNLESS_OPEN(String.valueOf("PROTECTED_UNLESS_OPEN")),
		PROTECTED_UNTIL_FIRST_USER_AUTH(String.valueOf("PROTECTED_UNTIL_FIRST_USER_AUTH")),
		XCODE_5(String.valueOf("XCODE_5")), XCODE_6(String.valueOf("XCODE_6"));

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

	private static final long serialVersionUID = 7895968972379800699L;

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

	private String description;

	private Boolean enabled;

	private Boolean enabledByDefault;

	private KeyEnum key;

	private String name;
	private Boolean supportsWildcard;

	public CapabilityOption description(String description) {
		this.description = description;
		return this;
	}

	public CapabilityOption enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	public CapabilityOption enabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
		return this;
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
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get enabled
	 *
	 * @return enabled
	 **/
	@JsonProperty("enabled")
	public Boolean isEnabled() {
		return this.enabled;
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
	 * Get supportsWildcard
	 *
	 * @return supportsWildcard
	 **/
	@JsonProperty("supportsWildcard")
	public Boolean isSupportsWildcard() {
		return this.supportsWildcard;
	}

	public CapabilityOption key(KeyEnum key) {
		this.key = key;
		return this;
	}

	public CapabilityOption name(String name) {
		this.name = name;
		return this;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public void setEnabledByDefault(Boolean enabledByDefault) {
		this.enabledByDefault = enabledByDefault;
	}

	public void setKey(KeyEnum key) {
		this.key = key;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSupportsWildcard(Boolean supportsWildcard) {
		this.supportsWildcard = supportsWildcard;
	}

	public CapabilityOption supportsWildcard(Boolean supportsWildcard) {
		this.supportsWildcard = supportsWildcard;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CapabilityOption {\n");

		sb.append("    key: ").append(toIndentedString(this.key)).append("\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    description: ").append(toIndentedString(this.description)).append("\n");
		sb.append("    enabledByDefault: ").append(toIndentedString(this.enabledByDefault)).append("\n");
		sb.append("    enabled: ").append(toIndentedString(this.enabled)).append("\n");
		sb.append("    supportsWildcard: ").append(toIndentedString(this.supportsWildcard)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
