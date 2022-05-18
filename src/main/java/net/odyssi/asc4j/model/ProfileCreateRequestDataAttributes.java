package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfileCreateRequestDataAttributes implements Serializable {

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

	private static final long serialVersionUID = 1586744155485533090L;

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

	private String name;
	private ProfileTypeEnum profileType;

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

	public ProfileCreateRequestDataAttributes name(String name) {
		this.name = name;
		return this;
	}

	public ProfileCreateRequestDataAttributes profileType(ProfileTypeEnum profileType) {
		this.profileType = profileType;
		return this;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProfileType(ProfileTypeEnum profileType) {
		this.profileType = profileType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProfileCreateRequestDataAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    profileType: ").append(toIndentedString(this.profileType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
