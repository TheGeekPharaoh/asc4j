package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiWorkflowUpdateRequestData implements Serializable {

	public enum TypeEnum {

		CIWORKFLOWS(String.valueOf("ciWorkflows"));

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

	private static final long serialVersionUID = -100113471036854207L;

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

	private CiWorkflowUpdateRequestDataAttributes attributes;

	private String id;

	private CiWorkflowUpdateRequestDataRelationships relationships;
	private TypeEnum type;

	public CiWorkflowUpdateRequestData attributes(CiWorkflowUpdateRequestDataAttributes attributes) {
		this.attributes = attributes;
		return this;
	}

	/**
	 * Get attributes
	 *
	 * @return attributes
	 **/
	@JsonProperty("attributes")
	public CiWorkflowUpdateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

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
	 * Get relationships
	 *
	 * @return relationships
	 **/
	@JsonProperty("relationships")
	public CiWorkflowUpdateRequestDataRelationships getRelationships() {
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

	public CiWorkflowUpdateRequestData id(String id) {
		this.id = id;
		return this;
	}

	public CiWorkflowUpdateRequestData relationships(CiWorkflowUpdateRequestDataRelationships relationships) {
		this.relationships = relationships;
		return this;
	}

	public void setAttributes(CiWorkflowUpdateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRelationships(CiWorkflowUpdateRequestDataRelationships relationships) {
		this.relationships = relationships;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiWorkflowUpdateRequestData {\n");

		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(this.attributes)).append("\n");
		sb.append("    relationships: ").append(toIndentedString(this.relationships)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiWorkflowUpdateRequestData type(TypeEnum type) {
		this.type = type;
		return this;
	}
}
