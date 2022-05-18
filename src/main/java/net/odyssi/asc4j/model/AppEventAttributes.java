package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventAttributes implements Serializable {

	public enum BadgeEnum {

		CHALLENGE(String.valueOf("CHALLENGE")), COMPETITION(String.valueOf("COMPETITION")),
		LIVE_EVENT(String.valueOf("LIVE_EVENT")), MAJOR_UPDATE(String.valueOf("MAJOR_UPDATE")),
		NEW_SEASON(String.valueOf("NEW_SEASON")), PREMIERE(String.valueOf("PREMIERE")),
		SPECIAL_EVENT(String.valueOf("SPECIAL_EVENT"));

		public static BadgeEnum fromValue(String value) {
			for (BadgeEnum b : BadgeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		BadgeEnum(String v) {
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

	public enum EventStateEnum {

		ACCEPTED(String.valueOf("ACCEPTED")), APPROVED(String.valueOf("APPROVED")),
		ARCHIVED(String.valueOf("ARCHIVED")), DRAFT(String.valueOf("DRAFT")), IN_REVIEW(String.valueOf("IN_REVIEW")),
		PAST(String.valueOf("PAST")), PUBLISHED(String.valueOf("PUBLISHED")),
		READY_FOR_REVIEW(String.valueOf("READY_FOR_REVIEW")), REJECTED(String.valueOf("REJECTED")),
		WAITING_FOR_REVIEW(String.valueOf("WAITING_FOR_REVIEW"));

		public static EventStateEnum fromValue(String value) {
			for (EventStateEnum b : EventStateEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		EventStateEnum(String v) {
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

	public enum PriorityEnum {

		HIGH(String.valueOf("HIGH")), NORMAL(String.valueOf("NORMAL"));

		public static PriorityEnum fromValue(String value) {
			for (PriorityEnum b : PriorityEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		PriorityEnum(String v) {
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

	public enum PurchaseRequirementEnum {

		IN_APP_PURCHASE(String.valueOf("IN_APP_PURCHASE")),
		IN_APP_PURCHASE_AND_SUBSCRIPTION(String.valueOf("IN_APP_PURCHASE_AND_SUBSCRIPTION")),
		IN_APP_PURCHASE_OR_SUBSCRIPTION(String.valueOf("IN_APP_PURCHASE_OR_SUBSCRIPTION")),
		NO_COST_ASSOCIATED(String.valueOf("NO_COST_ASSOCIATED")), SUBSCRIPTION(String.valueOf("SUBSCRIPTION"));

		public static PurchaseRequirementEnum fromValue(String value) {
			for (PurchaseRequirementEnum b : PurchaseRequirementEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		PurchaseRequirementEnum(String v) {
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

	public enum PurposeEnum {

		APPROPRIATE_FOR_ALL_USERS(String.valueOf("APPROPRIATE_FOR_ALL_USERS")),
		ATTRACT_NEW_USERS(String.valueOf("ATTRACT_NEW_USERS")),
		BRING_BACK_LAPSED_USERS(String.valueOf("BRING_BACK_LAPSED_USERS")),
		KEEP_ACTIVE_USERS_INFORMED(String.valueOf("KEEP_ACTIVE_USERS_INFORMED"));

		public static PurposeEnum fromValue(String value) {
			for (PurposeEnum b : PurposeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		PurposeEnum(String v) {
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

	private static final long serialVersionUID = -5162174942710840264L;

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

	private List<AppEventAttributesTerritorySchedules> archivedTerritorySchedules = null;

	private BadgeEnum badge;

	private URI deepLink;

	private EventStateEnum eventState;

	private String primaryLocale;

	private PriorityEnum priority;

	private PurchaseRequirementEnum purchaseRequirement;

	private PurposeEnum purpose;

	private String referenceName;
	private List<AppEventAttributesTerritorySchedules> territorySchedules = null;

	public AppEventAttributes addArchivedTerritorySchedulesItem(
			AppEventAttributesTerritorySchedules archivedTerritorySchedulesItem) {
		this.archivedTerritorySchedules.add(archivedTerritorySchedulesItem);
		return this;
	}

	public AppEventAttributes addTerritorySchedulesItem(AppEventAttributesTerritorySchedules territorySchedulesItem) {
		this.territorySchedules.add(territorySchedulesItem);
		return this;
	}

	public AppEventAttributes archivedTerritorySchedules(
			List<AppEventAttributesTerritorySchedules> archivedTerritorySchedules) {
		this.archivedTerritorySchedules = archivedTerritorySchedules;
		return this;
	}

	public AppEventAttributes badge(BadgeEnum badge) {
		this.badge = badge;
		return this;
	}

	public AppEventAttributes deepLink(URI deepLink) {
		this.deepLink = deepLink;
		return this;
	}

	public AppEventAttributes eventState(EventStateEnum eventState) {
		this.eventState = eventState;
		return this;
	}

	/**
	 * Get archivedTerritorySchedules
	 *
	 * @return archivedTerritorySchedules
	 **/
	@JsonProperty("archivedTerritorySchedules")
	public List<AppEventAttributesTerritorySchedules> getArchivedTerritorySchedules() {
		return this.archivedTerritorySchedules;
	}

	/**
	 * Get badge
	 *
	 * @return badge
	 **/
	@JsonProperty("badge")
	public String getBadge() {
		if (this.badge == null) {
			return null;
		}
		return this.badge.value();
	}

	/**
	 * Get deepLink
	 *
	 * @return deepLink
	 **/
	@JsonProperty("deepLink")
	public URI getDeepLink() {
		return this.deepLink;
	}

	/**
	 * Get eventState
	 *
	 * @return eventState
	 **/
	@JsonProperty("eventState")
	public String getEventState() {
		if (this.eventState == null) {
			return null;
		}
		return this.eventState.value();
	}

	/**
	 * Get primaryLocale
	 *
	 * @return primaryLocale
	 **/
	@JsonProperty("primaryLocale")
	public String getPrimaryLocale() {
		return this.primaryLocale;
	}

	/**
	 * Get priority
	 *
	 * @return priority
	 **/
	@JsonProperty("priority")
	public String getPriority() {
		if (this.priority == null) {
			return null;
		}
		return this.priority.value();
	}

	/**
	 * Get purchaseRequirement
	 *
	 * @return purchaseRequirement
	 **/
	@JsonProperty("purchaseRequirement")
	public String getPurchaseRequirement() {
		if (this.purchaseRequirement == null) {
			return null;
		}
		return this.purchaseRequirement.value();
	}

	/**
	 * Get purpose
	 *
	 * @return purpose
	 **/
	@JsonProperty("purpose")
	public String getPurpose() {
		if (this.purpose == null) {
			return null;
		}
		return this.purpose.value();
	}

	/**
	 * Get referenceName
	 *
	 * @return referenceName
	 **/
	@JsonProperty("referenceName")
	public String getReferenceName() {
		return this.referenceName;
	}

	/**
	 * Get territorySchedules
	 *
	 * @return territorySchedules
	 **/
	@JsonProperty("territorySchedules")
	public List<AppEventAttributesTerritorySchedules> getTerritorySchedules() {
		return this.territorySchedules;
	}

	public AppEventAttributes primaryLocale(String primaryLocale) {
		this.primaryLocale = primaryLocale;
		return this;
	}

	public AppEventAttributes priority(PriorityEnum priority) {
		this.priority = priority;
		return this;
	}

	public AppEventAttributes purchaseRequirement(PurchaseRequirementEnum purchaseRequirement) {
		this.purchaseRequirement = purchaseRequirement;
		return this;
	}

	public AppEventAttributes purpose(PurposeEnum purpose) {
		this.purpose = purpose;
		return this;
	}

	public AppEventAttributes referenceName(String referenceName) {
		this.referenceName = referenceName;
		return this;
	}

	public void setArchivedTerritorySchedules(List<AppEventAttributesTerritorySchedules> archivedTerritorySchedules) {
		this.archivedTerritorySchedules = archivedTerritorySchedules;
	}

	public void setBadge(BadgeEnum badge) {
		this.badge = badge;
	}

	public void setDeepLink(URI deepLink) {
		this.deepLink = deepLink;
	}

	public void setEventState(EventStateEnum eventState) {
		this.eventState = eventState;
	}

	public void setPrimaryLocale(String primaryLocale) {
		this.primaryLocale = primaryLocale;
	}

	public void setPriority(PriorityEnum priority) {
		this.priority = priority;
	}

	public void setPurchaseRequirement(PurchaseRequirementEnum purchaseRequirement) {
		this.purchaseRequirement = purchaseRequirement;
	}

	public void setPurpose(PurposeEnum purpose) {
		this.purpose = purpose;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public void setTerritorySchedules(List<AppEventAttributesTerritorySchedules> territorySchedules) {
		this.territorySchedules = territorySchedules;
	}

	public AppEventAttributes territorySchedules(List<AppEventAttributesTerritorySchedules> territorySchedules) {
		this.territorySchedules = territorySchedules;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventAttributes {\n");

		sb.append("    referenceName: ").append(toIndentedString(this.referenceName)).append("\n");
		sb.append("    badge: ").append(toIndentedString(this.badge)).append("\n");
		sb.append("    eventState: ").append(toIndentedString(this.eventState)).append("\n");
		sb.append("    deepLink: ").append(toIndentedString(this.deepLink)).append("\n");
		sb.append("    purchaseRequirement: ").append(toIndentedString(this.purchaseRequirement)).append("\n");
		sb.append("    primaryLocale: ").append(toIndentedString(this.primaryLocale)).append("\n");
		sb.append("    priority: ").append(toIndentedString(this.priority)).append("\n");
		sb.append("    purpose: ").append(toIndentedString(this.purpose)).append("\n");
		sb.append("    territorySchedules: ").append(toIndentedString(this.territorySchedules)).append("\n");
		sb.append("    archivedTerritorySchedules: ").append(toIndentedString(this.archivedTerritorySchedules))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
