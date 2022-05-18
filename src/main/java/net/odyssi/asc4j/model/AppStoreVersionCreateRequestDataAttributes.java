package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionCreateRequestDataAttributes implements Serializable {

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

	private static final long serialVersionUID = 1893876805401161903L;

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

	private String copyright;

	private OffsetDateTime earliestReleaseDate;

	private Platform platform;

	private ReleaseTypeEnum releaseType;

	private Boolean usesIdfa;
	private String versionString;

	public AppStoreVersionCreateRequestDataAttributes copyright(String copyright) {
		this.copyright = copyright;
		return this;
	}

	public AppStoreVersionCreateRequestDataAttributes earliestReleaseDate(OffsetDateTime earliestReleaseDate) {
		this.earliestReleaseDate = earliestReleaseDate;
		return this;
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
	 * Get usesIdfa
	 *
	 * @return usesIdfa
	 **/
	@JsonProperty("usesIdfa")
	public Boolean isUsesIdfa() {
		return this.usesIdfa;
	}

	public AppStoreVersionCreateRequestDataAttributes platform(Platform platform) {
		this.platform = platform;
		return this;
	}

	public AppStoreVersionCreateRequestDataAttributes releaseType(ReleaseTypeEnum releaseType) {
		this.releaseType = releaseType;
		return this;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
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
		sb.append("class AppStoreVersionCreateRequestDataAttributes {\n");

		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    versionString: ").append(toIndentedString(this.versionString)).append("\n");
		sb.append("    copyright: ").append(toIndentedString(this.copyright)).append("\n");
		sb.append("    releaseType: ").append(toIndentedString(this.releaseType)).append("\n");
		sb.append("    earliestReleaseDate: ").append(toIndentedString(this.earliestReleaseDate)).append("\n");
		sb.append("    usesIdfa: ").append(toIndentedString(this.usesIdfa)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionCreateRequestDataAttributes usesIdfa(Boolean usesIdfa) {
		this.usesIdfa = usesIdfa;
		return this;
	}

	public AppStoreVersionCreateRequestDataAttributes versionString(String versionString) {
		this.versionString = versionString;
		return this;
	}
}
