package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BundleIdRelationshipsProfilesData implements Serializable {

	public enum TypeEnum {

		PROFILES(String.valueOf("profiles"));

		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		TypeEnum(String v) {
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

	private static final long serialVersionUID = 6571136778901232220L;

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

	private String id;
	private TypeEnum type;

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@JsonProperty("type")
	public String getType() {
		if (this.type == null) {
			return null;
		}
		return this.type.value();
	}

	public BundleIdRelationshipsProfilesData id(String id) {
		this.id = id;
		return this;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BundleIdRelationshipsProfilesData {\n");

		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BundleIdRelationshipsProfilesData type(TypeEnum type) {
		this.type = type;
		return this;
	}
}
