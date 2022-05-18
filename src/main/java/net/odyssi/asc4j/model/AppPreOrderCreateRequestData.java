package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreOrderCreateRequestData implements Serializable {

	public enum TypeEnum {

		APPPREORDERS(String.valueOf("appPreOrders"));

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

	private static final long serialVersionUID = -7814445928756677479L;

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

	private AppPreOrderCreateRequestDataAttributes attributes;

	private AppEventCreateRequestDataRelationships relationships;
	private TypeEnum type;

	public AppPreOrderCreateRequestData attributes(AppPreOrderCreateRequestDataAttributes attributes) {
		this.attributes = attributes;
		return this;
	}

	/**
	 * Get attributes
	 *
	 * @return attributes
	 **/
	@JsonProperty("attributes")
	public AppPreOrderCreateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	/**
	 * Get relationships
	 *
	 * @return relationships
	 **/
	@JsonProperty("relationships")
	public AppEventCreateRequestDataRelationships getRelationships() {
		return this.relationships;
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

	public AppPreOrderCreateRequestData relationships(AppEventCreateRequestDataRelationships relationships) {
		this.relationships = relationships;
		return this;
	}

	public void setAttributes(AppPreOrderCreateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(AppEventCreateRequestDataRelationships relationships) {
		this.relationships = relationships;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreOrderCreateRequestData {\n");

		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(this.attributes)).append("\n");
		sb.append("    relationships: ").append(toIndentedString(this.relationships)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppPreOrderCreateRequestData type(TypeEnum type) {
		this.type = type;
		return this;
	}
}
