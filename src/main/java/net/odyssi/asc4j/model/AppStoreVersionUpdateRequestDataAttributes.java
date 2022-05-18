package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionUpdateRequestDataAttributes implements Serializable {

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

	private static final long serialVersionUID = 1413707998597876148L;

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

	private Boolean downloadable;

	private OffsetDateTime earliestReleaseDate;

	private ReleaseTypeEnum releaseType;

	private Boolean usesIdfa;
	private String versionString;

	public AppStoreVersionUpdateRequestDataAttributes copyright(String copyright) {
		this.copyright = copyright;
		return this;
	}

	public AppStoreVersionUpdateRequestDataAttributes downloadable(Boolean downloadable) {
		this.downloadable = downloadable;
		return this;
	}

	public AppStoreVersionUpdateRequestDataAttributes earliestReleaseDate(OffsetDateTime earliestReleaseDate) {
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

	public AppStoreVersionUpdateRequestDataAttributes releaseType(ReleaseTypeEnum releaseType) {
		this.releaseType = releaseType;
		return this;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public void setDownloadable(Boolean downloadable) {
		this.downloadable = downloadable;
	}

	public void setEarliestReleaseDate(OffsetDateTime earliestReleaseDate) {
		this.earliestReleaseDate = earliestReleaseDate;
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
		sb.append("class AppStoreVersionUpdateRequestDataAttributes {\n");

		sb.append("    versionString: ").append(toIndentedString(this.versionString)).append("\n");
		sb.append("    copyright: ").append(toIndentedString(this.copyright)).append("\n");
		sb.append("    releaseType: ").append(toIndentedString(this.releaseType)).append("\n");
		sb.append("    earliestReleaseDate: ").append(toIndentedString(this.earliestReleaseDate)).append("\n");
		sb.append("    usesIdfa: ").append(toIndentedString(this.usesIdfa)).append("\n");
		sb.append("    downloadable: ").append(toIndentedString(this.downloadable)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionUpdateRequestDataAttributes usesIdfa(Boolean usesIdfa) {
		this.usesIdfa = usesIdfa;
		return this;
	}

	public AppStoreVersionUpdateRequestDataAttributes versionString(String versionString) {
		this.versionString = versionString;
		return this;
	}
}
