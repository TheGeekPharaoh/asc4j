package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildBundleAttributes implements Serializable {

	public enum BundleTypeEnum {

		APP(String.valueOf("APP")), APP_CLIP(String.valueOf("APP_CLIP"));

		public static BundleTypeEnum fromValue(String value) {
			for (BundleTypeEnum b : BundleTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		BundleTypeEnum(String v) {
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

	private static final long serialVersionUID = -2587590733207297719L;

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

	private String bundleId;

	private BundleTypeEnum bundleType;

	private List<String> deviceProtocols = null;

	private URI dSYMUrl;

	private Map<String, Map<String, String>> entitlements = null;

	private String fileName;

	private Boolean hasOnDemandResources;

	private Boolean hasPrerenderedIcon;

	private Boolean hasSirikit;

	private Boolean includesSymbols;

	private Boolean isIosBuildMacAppStoreCompatible;

	private List<String> locales = null;

	private String platformBuild;

	private List<String> requiredCapabilities = null;

	private String sdkBuild;

	private List<String> supportedArchitectures = null;
	private Boolean usesLocationServices;

	public BuildBundleAttributes addDeviceProtocolsItem(String deviceProtocolsItem) {
		this.deviceProtocols.add(deviceProtocolsItem);
		return this;
	}

	public BuildBundleAttributes addLocalesItem(String localesItem) {
		this.locales.add(localesItem);
		return this;
	}

	public BuildBundleAttributes addRequiredCapabilitiesItem(String requiredCapabilitiesItem) {
		this.requiredCapabilities.add(requiredCapabilitiesItem);
		return this;
	}

	public BuildBundleAttributes addSupportedArchitecturesItem(String supportedArchitecturesItem) {
		this.supportedArchitectures.add(supportedArchitecturesItem);
		return this;
	}

	public BuildBundleAttributes bundleId(String bundleId) {
		this.bundleId = bundleId;
		return this;
	}

	public BuildBundleAttributes bundleType(BundleTypeEnum bundleType) {
		this.bundleType = bundleType;
		return this;
	}

	public BuildBundleAttributes deviceProtocols(List<String> deviceProtocols) {
		this.deviceProtocols = deviceProtocols;
		return this;
	}

	public BuildBundleAttributes dSYMUrl(URI dSYMUrl) {
		this.dSYMUrl = dSYMUrl;
		return this;
	}

	public BuildBundleAttributes entitlements(Map<String, Map<String, String>> entitlements) {
		this.entitlements = entitlements;
		return this;
	}

	public BuildBundleAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	/**
	 * Get bundleId
	 *
	 * @return bundleId
	 **/
	@JsonProperty("bundleId")
	public String getBundleId() {
		return this.bundleId;
	}

	/**
	 * Get bundleType
	 *
	 * @return bundleType
	 **/
	@JsonProperty("bundleType")
	public String getBundleType() {
		if (this.bundleType == null) {
			return null;
		}
		return this.bundleType.value();
	}

	/**
	 * Get deviceProtocols
	 *
	 * @return deviceProtocols
	 **/
	@JsonProperty("deviceProtocols")
	public List<String> getDeviceProtocols() {
		return this.deviceProtocols;
	}

	/**
	 * Get dSYMUrl
	 *
	 * @return dSYMUrl
	 **/
	@JsonProperty("dSYMUrl")
	public URI getdSYMUrl() {
		return this.dSYMUrl;
	}

	/**
	 * Get entitlements
	 *
	 * @return entitlements
	 **/
	@JsonProperty("entitlements")
	public Map<String, Map<String, String>> getEntitlements() {
		return this.entitlements;
	}

	/**
	 * Get fileName
	 *
	 * @return fileName
	 **/
	@JsonProperty("fileName")
	public String getFileName() {
		return this.fileName;
	}

	/**
	 * Get locales
	 *
	 * @return locales
	 **/
	@JsonProperty("locales")
	public List<String> getLocales() {
		return this.locales;
	}

	/**
	 * Get platformBuild
	 *
	 * @return platformBuild
	 **/
	@JsonProperty("platformBuild")
	public String getPlatformBuild() {
		return this.platformBuild;
	}

	/**
	 * Get requiredCapabilities
	 *
	 * @return requiredCapabilities
	 **/
	@JsonProperty("requiredCapabilities")
	public List<String> getRequiredCapabilities() {
		return this.requiredCapabilities;
	}

	/**
	 * Get sdkBuild
	 *
	 * @return sdkBuild
	 **/
	@JsonProperty("sdkBuild")
	public String getSdkBuild() {
		return this.sdkBuild;
	}

	/**
	 * Get supportedArchitectures
	 *
	 * @return supportedArchitectures
	 **/
	@JsonProperty("supportedArchitectures")
	public List<String> getSupportedArchitectures() {
		return this.supportedArchitectures;
	}

	public BuildBundleAttributes hasOnDemandResources(Boolean hasOnDemandResources) {
		this.hasOnDemandResources = hasOnDemandResources;
		return this;
	}

	public BuildBundleAttributes hasPrerenderedIcon(Boolean hasPrerenderedIcon) {
		this.hasPrerenderedIcon = hasPrerenderedIcon;
		return this;
	}

	public BuildBundleAttributes hasSirikit(Boolean hasSirikit) {
		this.hasSirikit = hasSirikit;
		return this;
	}

	public BuildBundleAttributes includesSymbols(Boolean includesSymbols) {
		this.includesSymbols = includesSymbols;
		return this;
	}

	/**
	 * Get hasOnDemandResources
	 *
	 * @return hasOnDemandResources
	 **/
	@JsonProperty("hasOnDemandResources")
	public Boolean isHasOnDemandResources() {
		return this.hasOnDemandResources;
	}

	/**
	 * Get hasPrerenderedIcon
	 *
	 * @return hasPrerenderedIcon
	 **/
	@JsonProperty("hasPrerenderedIcon")
	public Boolean isHasPrerenderedIcon() {
		return this.hasPrerenderedIcon;
	}

	/**
	 * Get hasSirikit
	 *
	 * @return hasSirikit
	 **/
	@JsonProperty("hasSirikit")
	public Boolean isHasSirikit() {
		return this.hasSirikit;
	}

	/**
	 * Get includesSymbols
	 *
	 * @return includesSymbols
	 **/
	@JsonProperty("includesSymbols")
	public Boolean isIncludesSymbols() {
		return this.includesSymbols;
	}

	public BuildBundleAttributes isIosBuildMacAppStoreCompatible(Boolean isIosBuildMacAppStoreCompatible) {
		this.isIosBuildMacAppStoreCompatible = isIosBuildMacAppStoreCompatible;
		return this;
	}

	/**
	 * Get isIosBuildMacAppStoreCompatible
	 *
	 * @return isIosBuildMacAppStoreCompatible
	 **/
	@JsonProperty("isIosBuildMacAppStoreCompatible")
	public Boolean isIsIosBuildMacAppStoreCompatible() {
		return this.isIosBuildMacAppStoreCompatible;
	}

	/**
	 * Get usesLocationServices
	 *
	 * @return usesLocationServices
	 **/
	@JsonProperty("usesLocationServices")
	public Boolean isUsesLocationServices() {
		return this.usesLocationServices;
	}

	public BuildBundleAttributes locales(List<String> locales) {
		this.locales = locales;
		return this;
	}

	public BuildBundleAttributes platformBuild(String platformBuild) {
		this.platformBuild = platformBuild;
		return this;
	}

	public BuildBundleAttributes putEntitlementsItem(String key, Map<String, String> entitlementsItem) {
		this.entitlements.put(key, entitlementsItem);
		return this;
	}

	public BuildBundleAttributes requiredCapabilities(List<String> requiredCapabilities) {
		this.requiredCapabilities = requiredCapabilities;
		return this;
	}

	public BuildBundleAttributes sdkBuild(String sdkBuild) {
		this.sdkBuild = sdkBuild;
		return this;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public void setBundleType(BundleTypeEnum bundleType) {
		this.bundleType = bundleType;
	}

	public void setDeviceProtocols(List<String> deviceProtocols) {
		this.deviceProtocols = deviceProtocols;
	}

	public void setdSYMUrl(URI dSYMUrl) {
		this.dSYMUrl = dSYMUrl;
	}

	public void setEntitlements(Map<String, Map<String, String>> entitlements) {
		this.entitlements = entitlements;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setHasOnDemandResources(Boolean hasOnDemandResources) {
		this.hasOnDemandResources = hasOnDemandResources;
	}

	public void setHasPrerenderedIcon(Boolean hasPrerenderedIcon) {
		this.hasPrerenderedIcon = hasPrerenderedIcon;
	}

	public void setHasSirikit(Boolean hasSirikit) {
		this.hasSirikit = hasSirikit;
	}

	public void setIncludesSymbols(Boolean includesSymbols) {
		this.includesSymbols = includesSymbols;
	}

	public void setIsIosBuildMacAppStoreCompatible(Boolean isIosBuildMacAppStoreCompatible) {
		this.isIosBuildMacAppStoreCompatible = isIosBuildMacAppStoreCompatible;
	}

	public void setLocales(List<String> locales) {
		this.locales = locales;
	}

	public void setPlatformBuild(String platformBuild) {
		this.platformBuild = platformBuild;
	}

	public void setRequiredCapabilities(List<String> requiredCapabilities) {
		this.requiredCapabilities = requiredCapabilities;
	}

	public void setSdkBuild(String sdkBuild) {
		this.sdkBuild = sdkBuild;
	}

	public void setSupportedArchitectures(List<String> supportedArchitectures) {
		this.supportedArchitectures = supportedArchitectures;
	}

	public void setUsesLocationServices(Boolean usesLocationServices) {
		this.usesLocationServices = usesLocationServices;
	}

	public BuildBundleAttributes supportedArchitectures(List<String> supportedArchitectures) {
		this.supportedArchitectures = supportedArchitectures;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildBundleAttributes {\n");

		sb.append("    bundleId: ").append(toIndentedString(this.bundleId)).append("\n");
		sb.append("    bundleType: ").append(toIndentedString(this.bundleType)).append("\n");
		sb.append("    sdkBuild: ").append(toIndentedString(this.sdkBuild)).append("\n");
		sb.append("    platformBuild: ").append(toIndentedString(this.platformBuild)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    hasSirikit: ").append(toIndentedString(this.hasSirikit)).append("\n");
		sb.append("    hasOnDemandResources: ").append(toIndentedString(this.hasOnDemandResources)).append("\n");
		sb.append("    hasPrerenderedIcon: ").append(toIndentedString(this.hasPrerenderedIcon)).append("\n");
		sb.append("    usesLocationServices: ").append(toIndentedString(this.usesLocationServices)).append("\n");
		sb.append("    isIosBuildMacAppStoreCompatible: ")
				.append(toIndentedString(this.isIosBuildMacAppStoreCompatible)).append("\n");
		sb.append("    includesSymbols: ").append(toIndentedString(this.includesSymbols)).append("\n");
		sb.append("    dSYMUrl: ").append(toIndentedString(this.dSYMUrl)).append("\n");
		sb.append("    supportedArchitectures: ").append(toIndentedString(this.supportedArchitectures)).append("\n");
		sb.append("    requiredCapabilities: ").append(toIndentedString(this.requiredCapabilities)).append("\n");
		sb.append("    deviceProtocols: ").append(toIndentedString(this.deviceProtocols)).append("\n");
		sb.append("    locales: ").append(toIndentedString(this.locales)).append("\n");
		sb.append("    entitlements: ").append(toIndentedString(this.entitlements)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BuildBundleAttributes usesLocationServices(Boolean usesLocationServices) {
		this.usesLocationServices = usesLocationServices;
		return this;
	}
}
