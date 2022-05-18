package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceUpdateRequestDataAttributes implements Serializable {

	public enum BusinessCategoryEnum {

		AUTOMOTIVE(String.valueOf("AUTOMOTIVE")), BEAUTY(String.valueOf("BEAUTY")), BIKES(String.valueOf("BIKES")),
		BOOKS(String.valueOf("BOOKS")), CASINO(String.valueOf("CASINO")), EDUCATION(String.valueOf("EDUCATION")),
		EDUCATION_JAPAN(String.valueOf("EDUCATION_JAPAN")), ENTERTAINMENT(String.valueOf("ENTERTAINMENT")),
		EV_CHARGER(String.valueOf("EV_CHARGER")), FINANCIAL_CNY(String.valueOf("FINANCIAL_CNY")),
		FINANCIAL_EUR(String.valueOf("FINANCIAL_EUR")), FINANCIAL_GBP(String.valueOf("FINANCIAL_GBP")),
		FINANCIAL_JPY(String.valueOf("FINANCIAL_JPY")), FINANCIAL_USD(String.valueOf("FINANCIAL_USD")),
		FITNESS(String.valueOf("FITNESS")), FOOD_AND_DRINK(String.valueOf("FOOD_AND_DRINK")),
		GAS(String.valueOf("GAS")), GROCERY(String.valueOf("GROCERY")),
		HEALTH_AND_MEDICAL(String.valueOf("HEALTH_AND_MEDICAL")), HOTEL_AND_TRAVEL(String.valueOf("HOTEL_AND_TRAVEL")),
		MUSIC(String.valueOf("MUSIC")), PARKING(String.valueOf("PARKING")),
		PET_SERVICES(String.valueOf("PET_SERVICES")), PROFESSIONAL_SERVICES(String.valueOf("PROFESSIONAL_SERVICES")),
		SHOPPING(String.valueOf("SHOPPING")), TICKETING(String.valueOf("TICKETING")),
		TRANSIT(String.valueOf("TRANSIT"));

		public static BusinessCategoryEnum fromValue(String value) {
			for (BusinessCategoryEnum b : BusinessCategoryEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		BusinessCategoryEnum(String v) {
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

	private static final long serialVersionUID = 4652750956346219708L;

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

	private AppClipAction action;

	private BusinessCategoryEnum businessCategory;

	private AppClipAdvancedExperienceLanguage defaultLanguage;

	private Boolean isPoweredBy;

	private AppClipAdvancedExperienceAttributesPlace place;
	private Boolean removed;

	public AppClipAdvancedExperienceUpdateRequestDataAttributes action(AppClipAction action) {
		this.action = action;
		return this;
	}

	public AppClipAdvancedExperienceUpdateRequestDataAttributes businessCategory(
			BusinessCategoryEnum businessCategory) {
		this.businessCategory = businessCategory;
		return this;
	}

	public AppClipAdvancedExperienceUpdateRequestDataAttributes defaultLanguage(
			AppClipAdvancedExperienceLanguage defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
		return this;
	}

	/**
	 * Get action
	 *
	 * @return action
	 **/
	@JsonProperty("action")
	public AppClipAction getAction() {
		return this.action;
	}

	/**
	 * Get businessCategory
	 *
	 * @return businessCategory
	 **/
	@JsonProperty("businessCategory")
	public String getBusinessCategory() {
		if (this.businessCategory == null) {
			return null;
		}
		return this.businessCategory.value();
	}

	/**
	 * Get defaultLanguage
	 *
	 * @return defaultLanguage
	 **/
	@JsonProperty("defaultLanguage")
	public AppClipAdvancedExperienceLanguage getDefaultLanguage() {
		return this.defaultLanguage;
	}

	/**
	 * Get place
	 *
	 * @return place
	 **/
	@JsonProperty("place")
	public AppClipAdvancedExperienceAttributesPlace getPlace() {
		return this.place;
	}

	/**
	 * Get isPoweredBy
	 *
	 * @return isPoweredBy
	 **/
	@JsonProperty("isPoweredBy")
	public Boolean isIsPoweredBy() {
		return this.isPoweredBy;
	}

	public AppClipAdvancedExperienceUpdateRequestDataAttributes isPoweredBy(Boolean isPoweredBy) {
		this.isPoweredBy = isPoweredBy;
		return this;
	}

	/**
	 * Get removed
	 *
	 * @return removed
	 **/
	@JsonProperty("removed")
	public Boolean isRemoved() {
		return this.removed;
	}

	public AppClipAdvancedExperienceUpdateRequestDataAttributes place(AppClipAdvancedExperienceAttributesPlace place) {
		this.place = place;
		return this;
	}

	public AppClipAdvancedExperienceUpdateRequestDataAttributes removed(Boolean removed) {
		this.removed = removed;
		return this;
	}

	public void setAction(AppClipAction action) {
		this.action = action;
	}

	public void setBusinessCategory(BusinessCategoryEnum businessCategory) {
		this.businessCategory = businessCategory;
	}

	public void setDefaultLanguage(AppClipAdvancedExperienceLanguage defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public void setIsPoweredBy(Boolean isPoweredBy) {
		this.isPoweredBy = isPoweredBy;
	}

	public void setPlace(AppClipAdvancedExperienceAttributesPlace place) {
		this.place = place;
	}

	public void setRemoved(Boolean removed) {
		this.removed = removed;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceUpdateRequestDataAttributes {\n");

		sb.append("    action: ").append(toIndentedString(this.action)).append("\n");
		sb.append("    isPoweredBy: ").append(toIndentedString(this.isPoweredBy)).append("\n");
		sb.append("    place: ").append(toIndentedString(this.place)).append("\n");
		sb.append("    businessCategory: ").append(toIndentedString(this.businessCategory)).append("\n");
		sb.append("    defaultLanguage: ").append(toIndentedString(this.defaultLanguage)).append("\n");
		sb.append("    removed: ").append(toIndentedString(this.removed)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
