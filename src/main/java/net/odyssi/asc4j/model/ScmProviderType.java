package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScmProviderType implements Serializable {

	public enum KindEnum {

		BITBUCKET_CLOUD(String.valueOf("BITBUCKET_CLOUD")), BITBUCKET_SERVER(String.valueOf("BITBUCKET_SERVER")),
		GITHUB_CLOUD(String.valueOf("GITHUB_CLOUD")), GITHUB_ENTERPRISE(String.valueOf("GITHUB_ENTERPRISE")),
		GITLAB_CLOUD(String.valueOf("GITLAB_CLOUD")), GITLAB_SELF_MANAGED(String.valueOf("GITLAB_SELF_MANAGED"));

		public static KindEnum fromValue(String value) {
			for (KindEnum b : KindEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		KindEnum(String v) {
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

	private static final long serialVersionUID = 2772660731780192288L;

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

	private String displayName;

	private Boolean isOnPremise;
	private KindEnum kind;

	public ScmProviderType displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Get displayName
	 *
	 * @return displayName
	 **/
	@JsonProperty("displayName")
	public String getDisplayName() {
		return this.displayName;
	}

	/**
	 * Get kind
	 *
	 * @return kind
	 **/
	@JsonProperty("kind")
	public String getKind() {
		if (this.kind == null) {
			return null;
		}
		return this.kind.value();
	}

	/**
	 * Get isOnPremise
	 *
	 * @return isOnPremise
	 **/
	@JsonProperty("isOnPremise")
	public Boolean isIsOnPremise() {
		return this.isOnPremise;
	}

	public ScmProviderType isOnPremise(Boolean isOnPremise) {
		this.isOnPremise = isOnPremise;
		return this;
	}

	public ScmProviderType kind(KindEnum kind) {
		this.kind = kind;
		return this;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setIsOnPremise(Boolean isOnPremise) {
		this.isOnPremise = isOnPremise;
	}

	public void setKind(KindEnum kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ScmProviderType {\n");

		sb.append("    kind: ").append(toIndentedString(this.kind)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(this.displayName)).append("\n");
		sb.append("    isOnPremise: ").append(toIndentedString(this.isOnPremise)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
