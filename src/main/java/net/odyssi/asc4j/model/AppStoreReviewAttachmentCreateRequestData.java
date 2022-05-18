package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreReviewAttachmentCreateRequestData implements Serializable {

	public enum TypeEnum {

		APPSTOREREVIEWATTACHMENTS(String.valueOf("appStoreReviewAttachments"));

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

	private static final long serialVersionUID = 5592192745621771098L;

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

	private AppClipAdvancedExperienceImageCreateRequestDataAttributes attributes;

	private AppStoreReviewAttachmentCreateRequestDataRelationships relationships;
	private TypeEnum type;

	public AppStoreReviewAttachmentCreateRequestData attributes(
			AppClipAdvancedExperienceImageCreateRequestDataAttributes attributes) {
		this.attributes = attributes;
		return this;
	}

	/**
	 * Get attributes
	 *
	 * @return attributes
	 **/
	@JsonProperty("attributes")
	public AppClipAdvancedExperienceImageCreateRequestDataAttributes getAttributes() {
		return this.attributes;
	}

	/**
	 * Get relationships
	 *
	 * @return relationships
	 **/
	@JsonProperty("relationships")
	public AppStoreReviewAttachmentCreateRequestDataRelationships getRelationships() {
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

	public AppStoreReviewAttachmentCreateRequestData relationships(
			AppStoreReviewAttachmentCreateRequestDataRelationships relationships) {
		this.relationships = relationships;
		return this;
	}

	public void setAttributes(AppClipAdvancedExperienceImageCreateRequestDataAttributes attributes) {
		this.attributes = attributes;
	}

	public void setRelationships(AppStoreReviewAttachmentCreateRequestDataRelationships relationships) {
		this.relationships = relationships;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreReviewAttachmentCreateRequestData {\n");

		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(this.attributes)).append("\n");
		sb.append("    relationships: ").append(toIndentedString(this.relationships)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreReviewAttachmentCreateRequestData type(TypeEnum type) {
		this.type = type;
		return this;
	}
}
