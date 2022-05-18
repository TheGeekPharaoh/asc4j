package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceAttributesPlacePhoneNumber implements Serializable {

	public enum TypeEnum {

		FAX(String.valueOf("FAX")), LANDLINE(String.valueOf("LANDLINE")), MOBILE(String.valueOf("MOBILE")),
		TOLLFREE(String.valueOf("TOLLFREE"));

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

	private static final long serialVersionUID = 1311608174643976049L;

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

	private String intent;

	private String number;
	private TypeEnum type;

	/**
	 * Get intent
	 *
	 * @return intent
	 **/
	@JsonProperty("intent")
	public String getIntent() {
		return this.intent;
	}

	/**
	 * Get number
	 *
	 * @return number
	 **/
	@JsonProperty("number")
	public String getNumber() {
		return this.number;
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

	public AppClipAdvancedExperienceAttributesPlacePhoneNumber intent(String intent) {
		this.intent = intent;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlacePhoneNumber number(String number) {
		this.number = number;
		return this;
	}

	public void setIntent(String intent) {
		this.intent = intent;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceAttributesPlacePhoneNumber {\n");

		sb.append("    number: ").append(toIndentedString(this.number)).append("\n");
		sb.append("    type: ").append(toIndentedString(this.type)).append("\n");
		sb.append("    intent: ").append(toIndentedString(this.intent)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppClipAdvancedExperienceAttributesPlacePhoneNumber type(TypeEnum type) {
		this.type = type;
		return this;
	}
}
