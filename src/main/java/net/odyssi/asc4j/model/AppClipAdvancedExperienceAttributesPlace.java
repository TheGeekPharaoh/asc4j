package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceAttributesPlace implements Serializable {

	public enum MapActionEnum {

		BUY_TICKETS(String.valueOf("BUY_TICKETS")), HOTEL_BOOK_ROOM(String.valueOf("HOTEL_BOOK_ROOM")),
		PARKING_RESERVE_PARKING(String.valueOf("PARKING_RESERVE_PARKING")),
		RESTAURANT_JOIN_WAITLIST(String.valueOf("RESTAURANT_JOIN_WAITLIST")),
		RESTAURANT_ORDER_DELIVERY(String.valueOf("RESTAURANT_ORDER_DELIVERY")),
		RESTAURANT_ORDER_FOOD(String.valueOf("RESTAURANT_ORDER_FOOD")),
		RESTAURANT_ORDER_TAKEOUT(String.valueOf("RESTAURANT_ORDER_TAKEOUT")),
		RESTAURANT_RESERVATION(String.valueOf("RESTAURANT_RESERVATION")),
		RESTAURANT_VIEW_MENU(String.valueOf("RESTAURANT_VIEW_MENU")),
		SCHEDULE_APPOINTMENT(String.valueOf("SCHEDULE_APPOINTMENT")),
		THEATER_NOW_PLAYING(String.valueOf("THEATER_NOW_PLAYING")),
		VIEW_AVAILABILITY(String.valueOf("VIEW_AVAILABILITY")), VIEW_PRICING(String.valueOf("VIEW_PRICING"));

		public static MapActionEnum fromValue(String value) {
			for (MapActionEnum b : MapActionEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		MapActionEnum(String v) {
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

	public enum RelationshipEnum {

		AUTHORIZED(String.valueOf("AUTHORIZED")), OTHER(String.valueOf("OTHER")), OWNER(String.valueOf("OWNER"));

		public static RelationshipEnum fromValue(String value) {
			for (RelationshipEnum b : RelationshipEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		RelationshipEnum(String v) {
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

	private static final long serialVersionUID = -5985987588150125375L;

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

	private List<String> categories = null;

	private AppClipAdvancedExperienceAttributesPlaceDisplayPoint displayPoint;

	private String homePage;

	private AppClipAdvancedExperienceAttributesPlaceMainAddress mainAddress;

	private MapActionEnum mapAction;

	private List<String> names = null;

	private AppClipAdvancedExperienceAttributesPlacePhoneNumber phoneNumber;

	private String placeId;
	private RelationshipEnum relationship;

	public AppClipAdvancedExperienceAttributesPlace addCategoriesItem(String categoriesItem) {
		this.categories.add(categoriesItem);
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace addNamesItem(String namesItem) {
		this.names.add(namesItem);
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace categories(List<String> categories) {
		this.categories = categories;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace displayPoint(
			AppClipAdvancedExperienceAttributesPlaceDisplayPoint displayPoint) {
		this.displayPoint = displayPoint;
		return this;
	}

	/**
	 * Get categories
	 *
	 * @return categories
	 **/
	@JsonProperty("categories")
	public List<String> getCategories() {
		return this.categories;
	}

	/**
	 * Get displayPoint
	 *
	 * @return displayPoint
	 **/
	@JsonProperty("displayPoint")
	public AppClipAdvancedExperienceAttributesPlaceDisplayPoint getDisplayPoint() {
		return this.displayPoint;
	}

	/**
	 * Get homePage
	 *
	 * @return homePage
	 **/
	@JsonProperty("homePage")
	public String getHomePage() {
		return this.homePage;
	}

	/**
	 * Get mainAddress
	 *
	 * @return mainAddress
	 **/
	@JsonProperty("mainAddress")
	public AppClipAdvancedExperienceAttributesPlaceMainAddress getMainAddress() {
		return this.mainAddress;
	}

	/**
	 * Get mapAction
	 *
	 * @return mapAction
	 **/
	@JsonProperty("mapAction")
	public String getMapAction() {
		if (this.mapAction == null) {
			return null;
		}
		return this.mapAction.value();
	}

	/**
	 * Get names
	 *
	 * @return names
	 **/
	@JsonProperty("names")
	public List<String> getNames() {
		return this.names;
	}

	/**
	 * Get phoneNumber
	 *
	 * @return phoneNumber
	 **/
	@JsonProperty("phoneNumber")
	public AppClipAdvancedExperienceAttributesPlacePhoneNumber getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * Get placeId
	 *
	 * @return placeId
	 **/
	@JsonProperty("placeId")
	public String getPlaceId() {
		return this.placeId;
	}

	/**
	 * Get relationship
	 *
	 * @return relationship
	 **/
	@JsonProperty("relationship")
	public String getRelationship() {
		if (this.relationship == null) {
			return null;
		}
		return this.relationship.value();
	}

	public AppClipAdvancedExperienceAttributesPlace homePage(String homePage) {
		this.homePage = homePage;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace mainAddress(
			AppClipAdvancedExperienceAttributesPlaceMainAddress mainAddress) {
		this.mainAddress = mainAddress;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace mapAction(MapActionEnum mapAction) {
		this.mapAction = mapAction;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace names(List<String> names) {
		this.names = names;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace phoneNumber(
			AppClipAdvancedExperienceAttributesPlacePhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace placeId(String placeId) {
		this.placeId = placeId;
		return this;
	}

	public AppClipAdvancedExperienceAttributesPlace relationship(RelationshipEnum relationship) {
		this.relationship = relationship;
		return this;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public void setDisplayPoint(AppClipAdvancedExperienceAttributesPlaceDisplayPoint displayPoint) {
		this.displayPoint = displayPoint;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public void setMainAddress(AppClipAdvancedExperienceAttributesPlaceMainAddress mainAddress) {
		this.mainAddress = mainAddress;
	}

	public void setMapAction(MapActionEnum mapAction) {
		this.mapAction = mapAction;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setPhoneNumber(AppClipAdvancedExperienceAttributesPlacePhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public void setRelationship(RelationshipEnum relationship) {
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceAttributesPlace {\n");

		sb.append("    placeId: ").append(toIndentedString(this.placeId)).append("\n");
		sb.append("    names: ").append(toIndentedString(this.names)).append("\n");
		sb.append("    mainAddress: ").append(toIndentedString(this.mainAddress)).append("\n");
		sb.append("    displayPoint: ").append(toIndentedString(this.displayPoint)).append("\n");
		sb.append("    mapAction: ").append(toIndentedString(this.mapAction)).append("\n");
		sb.append("    relationship: ").append(toIndentedString(this.relationship)).append("\n");
		sb.append("    phoneNumber: ").append(toIndentedString(this.phoneNumber)).append("\n");
		sb.append("    homePage: ").append(toIndentedString(this.homePage)).append("\n");
		sb.append("    categories: ").append(toIndentedString(this.categories)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
