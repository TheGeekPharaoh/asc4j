package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceAttributes implements Serializable {

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

	public enum PlaceStatusEnum {

		MATCHED(String.valueOf("MATCHED")), NO_MATCH(String.valueOf("NO_MATCH")), PENDING(String.valueOf("PENDING"));

		public static PlaceStatusEnum fromValue(String value) {
			for (PlaceStatusEnum b : PlaceStatusEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		PlaceStatusEnum(String v) {
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

	public enum StatusEnum {

		APP_TRANSFER_IN_PROGRESS(String.valueOf("APP_TRANSFER_IN_PROGRESS")),
		DEACTIVATED(String.valueOf("DEACTIVATED")), RECEIVED(String.valueOf("RECEIVED"));

		public static StatusEnum fromValue(String value) {
			for (StatusEnum b : StatusEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		StatusEnum(String v) {
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

	private static final long serialVersionUID = -6387591586160046751L;

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

	private URI link;

	private AppClipAdvancedExperienceAttributesPlace place;

	private PlaceStatusEnum placeStatus;

	private StatusEnum status;
	private Integer version;

	public AppClipAdvancedExperienceAttributes action(AppClipAction action) {
		this.action = action;
		return this;
	}

	public AppClipAdvancedExperienceAttributes businessCategory(BusinessCategoryEnum businessCategory) {
		this.businessCategory = businessCategory;
		return this;
	}

	public AppClipAdvancedExperienceAttributes defaultLanguage(AppClipAdvancedExperienceLanguage defaultLanguage) {
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
	 * Get link
	 *
	 * @return link
	 **/
	@JsonProperty("link")
	public URI getLink() {
		return this.link;
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
	 * Get placeStatus
	 *
	 * @return placeStatus
	 **/
	@JsonProperty("placeStatus")
	public String getPlaceStatus() {
		if (this.placeStatus == null) {
			return null;
		}
		return this.placeStatus.value();
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@JsonProperty("status")
	public String getStatus() {
		if (this.status == null) {
			return null;
		}
		return this.status.value();
	}

	/**
	 * Get version
	 *
	 * @return version
	 **/
	@JsonProperty("version")
	public Integer getVersion() {
		return this.version;
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

	public AppClipAdvancedExperienceAttributes isPoweredBy(Boolean isPoweredBy) {
		this.isPoweredBy = isPoweredBy;
		return this;
	}

	public AppClipAdvancedExperienceAttributes link(URI link) {
		this.link = link;
		return this;
	}

	public AppClipAdvancedExperienceAttributes place(AppClipAdvancedExperienceAttributesPlace place) {
		this.place = place;
		return this;
	}

	public AppClipAdvancedExperienceAttributes placeStatus(PlaceStatusEnum placeStatus) {
		this.placeStatus = placeStatus;
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

	public void setLink(URI link) {
		this.link = link;
	}

	public void setPlace(AppClipAdvancedExperienceAttributesPlace place) {
		this.place = place;
	}

	public void setPlaceStatus(PlaceStatusEnum placeStatus) {
		this.placeStatus = placeStatus;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public AppClipAdvancedExperienceAttributes status(StatusEnum status) {
		this.status = status;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceAttributes {\n");

		sb.append("    link: ").append(toIndentedString(this.link)).append("\n");
		sb.append("    version: ").append(toIndentedString(this.version)).append("\n");
		sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
		sb.append("    action: ").append(toIndentedString(this.action)).append("\n");
		sb.append("    isPoweredBy: ").append(toIndentedString(this.isPoweredBy)).append("\n");
		sb.append("    place: ").append(toIndentedString(this.place)).append("\n");
		sb.append("    placeStatus: ").append(toIndentedString(this.placeStatus)).append("\n");
		sb.append("    businessCategory: ").append(toIndentedString(this.businessCategory)).append("\n");
		sb.append("    defaultLanguage: ").append(toIndentedString(this.defaultLanguage)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppClipAdvancedExperienceAttributes version(Integer version) {
		this.version = version;
		return this;
	}
}
