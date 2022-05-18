package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileAttributes implements Serializable {

	public enum ProfileStateEnum {

		ACTIVE(String.valueOf("ACTIVE")), INVALID(String.valueOf("INVALID"));

		public static ProfileStateEnum fromValue(String value) {
			for (ProfileStateEnum b : ProfileStateEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ProfileStateEnum(String v) {
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

	public enum ProfileTypeEnum {

		IOS_APP_ADHOC(String.valueOf("IOS_APP_ADHOC")), IOS_APP_DEVELOPMENT(String.valueOf("IOS_APP_DEVELOPMENT")),
		IOS_APP_INHOUSE(String.valueOf("IOS_APP_INHOUSE")), IOS_APP_STORE(String.valueOf("IOS_APP_STORE")),
		MAC_APP_DEVELOPMENT(String.valueOf("MAC_APP_DEVELOPMENT")), MAC_APP_DIRECT(String.valueOf("MAC_APP_DIRECT")),
		MAC_APP_STORE(String.valueOf("MAC_APP_STORE")),
		MAC_CATALYST_APP_DEVELOPMENT(String.valueOf("MAC_CATALYST_APP_DEVELOPMENT")),
		MAC_CATALYST_APP_DIRECT(String.valueOf("MAC_CATALYST_APP_DIRECT")),
		MAC_CATALYST_APP_STORE(String.valueOf("MAC_CATALYST_APP_STORE")),
		TVOS_APP_ADHOC(String.valueOf("TVOS_APP_ADHOC")), TVOS_APP_DEVELOPMENT(String.valueOf("TVOS_APP_DEVELOPMENT")),
		TVOS_APP_INHOUSE(String.valueOf("TVOS_APP_INHOUSE")), TVOS_APP_STORE(String.valueOf("TVOS_APP_STORE"));

		public static ProfileTypeEnum fromValue(String value) {
			for (ProfileTypeEnum b : ProfileTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ProfileTypeEnum(String v) {
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

	private static final long serialVersionUID = -1286461866727354618L;

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

	private OffsetDateTime createdDate;

	private OffsetDateTime expirationDate;

	private String name;

	private BundleIdPlatform platform;

	private String profileContent;

	private ProfileStateEnum profileState;

	private ProfileTypeEnum profileType;
	private String uuid;

	public ProfileAttributes createdDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public ProfileAttributes expirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
		return this;
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
	 * Get expirationDate
	 *
	 * @return expirationDate
	 **/
	@JsonProperty("expirationDate")
	public OffsetDateTime getExpirationDate() {
		return this.expirationDate;
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
	public BundleIdPlatform getPlatform() {
		return this.platform;
	}

	/**
	 * Get profileContent
	 *
	 * @return profileContent
	 **/
	@JsonProperty("profileContent")
	public String getProfileContent() {
		return this.profileContent;
	}

	/**
	 * Get profileState
	 *
	 * @return profileState
	 **/
	@JsonProperty("profileState")
	public String getProfileState() {
		if (this.profileState == null) {
			return null;
		}
		return this.profileState.value();
	}

	/**
	 * Get profileType
	 *
	 * @return profileType
	 **/
	@JsonProperty("profileType")
	public String getProfileType() {
		if (this.profileType == null) {
			return null;
		}
		return this.profileType.value();
	}

	/**
	 * Get uuid
	 *
	 * @return uuid
	 **/
	@JsonProperty("uuid")
	public String getUuid() {
		return this.uuid;
	}

	public ProfileAttributes name(String name) {
		this.name = name;
		return this;
	}

	public ProfileAttributes platform(BundleIdPlatform platform) {
		this.platform = platform;
		return this;
	}

	public ProfileAttributes profileContent(String profileContent) {
		this.profileContent = profileContent;
		return this;
	}

	public ProfileAttributes profileState(ProfileStateEnum profileState) {
		this.profileState = profileState;
		return this;
	}

	public ProfileAttributes profileType(ProfileTypeEnum profileType) {
		this.profileType = profileType;
		return this;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setExpirationDate(OffsetDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setProfileContent(String profileContent) {
		this.profileContent = profileContent;
	}

	public void setProfileState(ProfileStateEnum profileState) {
		this.profileState = profileState;
	}

	public void setProfileType(ProfileTypeEnum profileType) {
		this.profileType = profileType;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProfileAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    profileType: ").append(toIndentedString(this.profileType)).append("\n");
		sb.append("    profileState: ").append(toIndentedString(this.profileState)).append("\n");
		sb.append("    profileContent: ").append(toIndentedString(this.profileContent)).append("\n");
		sb.append("    uuid: ").append(toIndentedString(this.uuid)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(this.createdDate)).append("\n");
		sb.append("    expirationDate: ").append(toIndentedString(this.expirationDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public ProfileAttributes uuid(String uuid) {
		this.uuid = uuid;
		return this;
	}
}
