package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionAttributes implements Serializable {

	public enum ReleaseTypeEnum {

		AFTER_APPROVAL(String.valueOf("AFTER_APPROVAL")), MANUAL(String.valueOf("MANUAL")),
		SCHEDULED(String.valueOf("SCHEDULED"));

		public static ReleaseTypeEnum fromValue(String value) {
			for (ReleaseTypeEnum b : ReleaseTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ReleaseTypeEnum(String v) {
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

	private static final long serialVersionUID = 7363182814957965888L;

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

	private AppStoreVersionState appStoreState;

	private String copyright;

	private OffsetDateTime createdDate;

	private Boolean downloadable;

	private OffsetDateTime earliestReleaseDate;

	private Platform platform;

	private ReleaseTypeEnum releaseType;

	private Boolean usesIdfa;
	private String versionString;

	public AppStoreVersionAttributes appStoreState(AppStoreVersionState appStoreState) {
		this.appStoreState = appStoreState;
		return this;
	}

	public AppStoreVersionAttributes copyright(String copyright) {
		this.copyright = copyright;
		return this;
	}

	public AppStoreVersionAttributes createdDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public AppStoreVersionAttributes downloadable(Boolean downloadable) {
		this.downloadable = downloadable;
		return this;
	}

	public AppStoreVersionAttributes earliestReleaseDate(OffsetDateTime earliestReleaseDate) {
		this.earliestReleaseDate = earliestReleaseDate;
		return this;
	}

	/**
	 * Get appStoreState
	 *
	 * @return appStoreState
	 **/
	@JsonProperty("appStoreState")
	public AppStoreVersionState getAppStoreState() {
		return this.appStoreState;
	}

	/**
	 * Get copyright
	 *
	 * @return copyright
	 **/
	@JsonProperty("copyright")
	public String getCopyright() {
		return this.copyright;
	}

	/**
	 * Get createdDate
	 *
	 * @return createdDate
	 **/
	@JsonProperty("createdDate")
	public OffsetDateTime getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Get earliestReleaseDate
	 *
	 * @return earliestReleaseDate
	 **/
	@JsonProperty("earliestReleaseDate")
	public OffsetDateTime getEarliestReleaseDate() {
		return this.earliestReleaseDate;
	}

	/**
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public Platform getPlatform() {
		return this.platform;
	}

	/**
	 * Get releaseType
	 *
	 * @return releaseType
	 **/
	@JsonProperty("releaseType")
	public String getReleaseType() {
		if (this.releaseType == null) {
			return null;
		}
		return this.releaseType.value();
	}

	/**
	 * Get versionString
	 *
	 * @return versionString
	 **/
	@JsonProperty("versionString")
	public String getVersionString() {
		return this.versionString;
	}

	/**
	 * Get downloadable
	 *
	 * @return downloadable
	 **/
	@JsonProperty("downloadable")
	public Boolean isDownloadable() {
		return this.downloadable;
	}

	/**
	 * Get usesIdfa
	 *
	 * @return usesIdfa
	 **/
	@JsonProperty("usesIdfa")
	public Boolean isUsesIdfa() {
		return this.usesIdfa;
	}

	public AppStoreVersionAttributes platform(Platform platform) {
		this.platform = platform;
		return this;
	}

	public AppStoreVersionAttributes releaseType(ReleaseTypeEnum releaseType) {
		this.releaseType = releaseType;
		return this;
	}

	public void setAppStoreState(AppStoreVersionState appStoreState) {
		this.appStoreState = appStoreState;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setDownloadable(Boolean downloadable) {
		this.downloadable = downloadable;
	}

	public void setEarliestReleaseDate(OffsetDateTime earliestReleaseDate) {
		this.earliestReleaseDate = earliestReleaseDate;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public void setReleaseType(ReleaseTypeEnum releaseType) {
		this.releaseType = releaseType;
	}

	public void setUsesIdfa(Boolean usesIdfa) {
		this.usesIdfa = usesIdfa;
	}

	public void setVersionString(String versionString) {
		this.versionString = versionString;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionAttributes {\n");

		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    versionString: ").append(toIndentedString(this.versionString)).append("\n");
		sb.append("    appStoreState: ").append(toIndentedString(this.appStoreState)).append("\n");
		sb.append("    copyright: ").append(toIndentedString(this.copyright)).append("\n");
		sb.append("    releaseType: ").append(toIndentedString(this.releaseType)).append("\n");
		sb.append("    earliestReleaseDate: ").append(toIndentedString(this.earliestReleaseDate)).append("\n");
		sb.append("    usesIdfa: ").append(toIndentedString(this.usesIdfa)).append("\n");
		sb.append("    downloadable: ").append(toIndentedString(this.downloadable)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(this.createdDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionAttributes usesIdfa(Boolean usesIdfa) {
		this.usesIdfa = usesIdfa;
		return this;
	}

	public AppStoreVersionAttributes versionString(String versionString) {
		this.versionString = versionString;
		return this;
	}
}
