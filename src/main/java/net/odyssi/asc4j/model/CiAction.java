package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiAction implements Serializable {

	public enum DestinationEnum {

		IOS_DEVICE(String.valueOf("ANY_IOS_DEVICE")), IOS_SIMULATOR(String.valueOf("ANY_IOS_SIMULATOR")),
		MAC(String.valueOf("ANY_MAC")), MAC_CATALYST(String.valueOf("ANY_MAC_CATALYST")),
		TVOS_DEVICE(String.valueOf("ANY_TVOS_DEVICE")), TVOS_SIMULATOR(String.valueOf("ANY_TVOS_SIMULATOR")),
		WATCHOS_DEVICE(String.valueOf("ANY_WATCHOS_DEVICE")),
		WATCHOS_SIMULATOR(String.valueOf("ANY_WATCHOS_SIMULATOR"));

		public static DestinationEnum fromValue(String value) {
			for (DestinationEnum b : DestinationEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		DestinationEnum(String v) {
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

	public enum PlatformEnum {

		IOS(String.valueOf("IOS")), MACOS(String.valueOf("MACOS")), TVOS(String.valueOf("TVOS")),
		WATCHOS(String.valueOf("WATCHOS"));

		public static PlatformEnum fromValue(String value) {
			for (PlatformEnum b : PlatformEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		PlatformEnum(String v) {
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

	private static final long serialVersionUID = -2806091927950163193L;

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

	private CiActionType actionType;

	private BuildAudienceType buildDistributionAudience;

	private DestinationEnum destination;

	private Boolean isRequiredToPass;

	private String name;

	private PlatformEnum platform;

	private String scheme;
	private CiActionTestConfiguration testConfiguration;

	public CiAction actionType(CiActionType actionType) {
		this.actionType = actionType;
		return this;
	}

	public CiAction buildDistributionAudience(BuildAudienceType buildDistributionAudience) {
		this.buildDistributionAudience = buildDistributionAudience;
		return this;
	}

	public CiAction destination(DestinationEnum destination) {
		this.destination = destination;
		return this;
	}

	/**
	 * Get actionType
	 *
	 * @return actionType
	 **/
	@JsonProperty("actionType")
	public CiActionType getActionType() {
		return this.actionType;
	}

	/**
	 * Get buildDistributionAudience
	 *
	 * @return buildDistributionAudience
	 **/
	@JsonProperty("buildDistributionAudience")
	public BuildAudienceType getBuildDistributionAudience() {
		return this.buildDistributionAudience;
	}

	/**
	 * Get destination
	 *
	 * @return destination
	 **/
	@JsonProperty("destination")
	public String getDestination() {
		if (this.destination == null) {
			return null;
		}
		return this.destination.value();
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
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public String getPlatform() {
		if (this.platform == null) {
			return null;
		}
		return this.platform.value();
	}

	/**
	 * Get scheme
	 *
	 * @return scheme
	 **/
	@JsonProperty("scheme")
	public String getScheme() {
		return this.scheme;
	}

	/**
	 * Get testConfiguration
	 *
	 * @return testConfiguration
	 **/
	@JsonProperty("testConfiguration")
	public CiActionTestConfiguration getTestConfiguration() {
		return this.testConfiguration;
	}

	/**
	 * Get isRequiredToPass
	 *
	 * @return isRequiredToPass
	 **/
	@JsonProperty("isRequiredToPass")
	public Boolean isIsRequiredToPass() {
		return this.isRequiredToPass;
	}

	public CiAction isRequiredToPass(Boolean isRequiredToPass) {
		this.isRequiredToPass = isRequiredToPass;
		return this;
	}

	public CiAction name(String name) {
		this.name = name;
		return this;
	}

	public CiAction platform(PlatformEnum platform) {
		this.platform = platform;
		return this;
	}

	public CiAction scheme(String scheme) {
		this.scheme = scheme;
		return this;
	}

	public void setActionType(CiActionType actionType) {
		this.actionType = actionType;
	}

	public void setBuildDistributionAudience(BuildAudienceType buildDistributionAudience) {
		this.buildDistributionAudience = buildDistributionAudience;
	}

	public void setDestination(DestinationEnum destination) {
		this.destination = destination;
	}

	public void setIsRequiredToPass(Boolean isRequiredToPass) {
		this.isRequiredToPass = isRequiredToPass;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(PlatformEnum platform) {
		this.platform = platform;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public void setTestConfiguration(CiActionTestConfiguration testConfiguration) {
		this.testConfiguration = testConfiguration;
	}

	public CiAction testConfiguration(CiActionTestConfiguration testConfiguration) {
		this.testConfiguration = testConfiguration;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiAction {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    actionType: ").append(toIndentedString(this.actionType)).append("\n");
		sb.append("    destination: ").append(toIndentedString(this.destination)).append("\n");
		sb.append("    buildDistributionAudience: ").append(toIndentedString(this.buildDistributionAudience))
				.append("\n");
		sb.append("    testConfiguration: ").append(toIndentedString(this.testConfiguration)).append("\n");
		sb.append("    scheme: ").append(toIndentedString(this.scheme)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    isRequiredToPass: ").append(toIndentedString(this.isRequiredToPass)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
