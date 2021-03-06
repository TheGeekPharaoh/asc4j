
package net.odyssi.asc4j.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "capabilityType", "settings" })
public class BundleIdCapabilityAttributes implements AttributesObject {

	public enum CapabilityType {

		ACCESS_WIFI_INFORMATION("ACCESS_WIFI_INFORMATION"), APP_GROUPS("APP_GROUPS"), APPLE_PAY("APPLE_PAY"),
		ASSOCIATED_DOMAINS("ASSOCIATED_DOMAINS"), AUTOFILL_CREDENTIAL_PROVIDER("AUTOFILL_CREDENTIAL_PROVIDER"),
		CLASSKIT("CLASSKIT"), DATA_PROTECTION("DATA_PROTECTION"), GAME_CENTER("GAME_CENTER"), HEALTHKIT("HEALTHKIT"),
		HOMEKIT("HOMEKIT"), HOT_SPOT("HOT_SPOT"), ICLOUD("ICLOUD"), IN_APP_PURCHASE("IN_APP_PURCHASE"),
		INTER_APP_AUDIO("INTER_APP_AUDIO"), MAPS("MAPS"), MULTIPATH("MULTIPATH"),
		NETWORK_EXTENSIONS("NETWORK_EXTENSIONS"), NFC_TAG_READING("NFC_TAG_READING"), PERSONAL_VPN("PERSONAL_VPN"),
		PUSH_NOTIFICATIONS("PUSH_NOTIFICATIONS"), SIRIKIT("SIRIKIT"), WALLET("WALLET"),
		WIRELESS_ACCESSORY_CONFIGURATION("WIRELESS_ACCESSORY_CONFIGURATION");

		private final static Map<String, BundleIdCapabilityAttributes.CapabilityType> CONSTANTS = new HashMap<String, BundleIdCapabilityAttributes.CapabilityType>();
		static {
			for (BundleIdCapabilityAttributes.CapabilityType c : values()) {
				CONSTANTS.put(c.value, c);
			}
		}

		@JsonCreator
		public static BundleIdCapabilityAttributes.CapabilityType fromValue(String value) {
			BundleIdCapabilityAttributes.CapabilityType constant = CONSTANTS.get(value);
			if (constant == null) {
				throw new IllegalArgumentException(value);
			} else {
				return constant;
			}
		}

		private final String value;

		private CapabilityType(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return this.value;
		}

		@JsonValue
		public String value() {
			return this.value;
		}

	}

	@JsonProperty("capabilityType")
	@JsonPropertyDescription("")
	private BundleIdCapabilityAttributes.CapabilityType capabilityType;

	@JsonProperty("settings")
	@JsonPropertyDescription("")
	private List<CapabilitySetting> settings = new ArrayList<CapabilitySetting>();

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		BundleIdCapabilityAttributes other = (BundleIdCapabilityAttributes) obj;
		if (this.capabilityType != other.capabilityType) {
			return false;
		}
		if (this.settings == null) {
			if (other.settings != null) {
				return false;
			}
		} else if (!this.settings.equals(other.settings)) {
			return false;
		}
		return true;
	}

	public BundleIdCapabilityAttributes.CapabilityType getCapabilityType() {
		return this.capabilityType;
	}

	public List<CapabilitySetting> getSettings() {
		return this.settings;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.capabilityType == null ? 0 : this.capabilityType.hashCode());
		result = prime * result + (this.settings == null ? 0 : this.settings.hashCode());
		return result;
	}

	public void setCapabilityType(BundleIdCapabilityAttributes.CapabilityType capabilityType) {
		this.capabilityType = capabilityType;
	}

	public void setSettings(List<CapabilitySetting> settings) {
		this.settings = settings;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BundleIdCapabilityAttributes [capabilityType=" + this.capabilityType + ", settings=" + this.settings
				+ "]";
	}

}
