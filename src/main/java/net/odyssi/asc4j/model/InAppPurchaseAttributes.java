package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InAppPurchaseAttributes implements Serializable {

	public enum InAppPurchaseTypeEnum {

		AUTOMATICALLY_RENEWABLE_SUBSCRIPTION(String.valueOf("AUTOMATICALLY_RENEWABLE_SUBSCRIPTION")),
		CONSUMABLE(String.valueOf("CONSUMABLE")), FREE_SUBSCRIPTION(String.valueOf("FREE_SUBSCRIPTION")),
		NON_CONSUMABLE(String.valueOf("NON_CONSUMABLE")),
		NON_RENEWING_SUBSCRIPTION(String.valueOf("NON_RENEWING_SUBSCRIPTION"));

		public static InAppPurchaseTypeEnum fromValue(String value) {
			for (InAppPurchaseTypeEnum b : InAppPurchaseTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		InAppPurchaseTypeEnum(String v) {
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

	public enum StateEnum {

		APPROVED(String.valueOf("APPROVED")), CREATED(String.valueOf("CREATED")), DELETED(String.valueOf("DELETED")),
		DELETION_IN_PROGRESS(String.valueOf("DELETION_IN_PROGRESS")),
		DEVELOPER_ACTION_NEEDED(String.valueOf("DEVELOPER_ACTION_NEEDED")),
		DEVELOPER_REMOVED_FROM_SALE(String.valueOf("DEVELOPER_REMOVED_FROM_SALE")),
		DEVELOPER_SIGNED_OFF(String.valueOf("DEVELOPER_SIGNED_OFF")), IN_REVIEW(String.valueOf("IN_REVIEW")),
		MISSING_METADATA(String.valueOf("MISSING_METADATA")),
		PENDING_DEVELOPER_RELEASE(String.valueOf("PENDING_DEVELOPER_RELEASE")),
		PREPARE_FOR_SUBMISSION(String.valueOf("PREPARE_FOR_SUBMISSION")),
		PROCESSING_CONTENT(String.valueOf("PROCESSING_CONTENT")), READY_TO_SUBMIT(String.valueOf("READY_TO_SUBMIT")),
		REJECTED(String.valueOf("REJECTED")), REMOVED_FROM_SALE(String.valueOf("REMOVED_FROM_SALE")),
		REPLACED(String.valueOf("REPLACED")), WAITING_FOR_REVIEW(String.valueOf("WAITING_FOR_REVIEW")),
		WAITING_FOR_SCREENSHOT(String.valueOf("WAITING_FOR_SCREENSHOT")),
		WAITING_FOR_UPLOAD(String.valueOf("WAITING_FOR_UPLOAD"));

		public static StateEnum fromValue(String value) {
			for (StateEnum b : StateEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		StateEnum(String v) {
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

	private static final long serialVersionUID = -7128268560299153280L;

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

	private InAppPurchaseTypeEnum inAppPurchaseType;

	private String productId;

	private String referenceName;
	private StateEnum state;

	/**
	 * Get inAppPurchaseType
	 *
	 * @return inAppPurchaseType
	 **/
	@JsonProperty("inAppPurchaseType")
	public String getInAppPurchaseType() {
		if (this.inAppPurchaseType == null) {
			return null;
		}
		return this.inAppPurchaseType.value();
	}

	/**
	 * Get productId
	 *
	 * @return productId
	 **/
	@JsonProperty("productId")
	public String getProductId() {
		return this.productId;
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
	 * Get state
	 *
	 * @return state
	 **/
	@JsonProperty("state")
	public String getState() {
		if (this.state == null) {
			return null;
		}
		return this.state.value();
	}

	public InAppPurchaseAttributes inAppPurchaseType(InAppPurchaseTypeEnum inAppPurchaseType) {
		this.inAppPurchaseType = inAppPurchaseType;
		return this;
	}

	public InAppPurchaseAttributes productId(String productId) {
		this.productId = productId;
		return this;
	}

	public InAppPurchaseAttributes referenceName(String referenceName) {
		this.referenceName = referenceName;
		return this;
	}

	public void setInAppPurchaseType(InAppPurchaseTypeEnum inAppPurchaseType) {
		this.inAppPurchaseType = inAppPurchaseType;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}

	public InAppPurchaseAttributes state(StateEnum state) {
		this.state = state;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InAppPurchaseAttributes {\n");

		sb.append("    referenceName: ").append(toIndentedString(this.referenceName)).append("\n");
		sb.append("    productId: ").append(toIndentedString(this.productId)).append("\n");
		sb.append("    inAppPurchaseType: ").append(toIndentedString(this.inAppPurchaseType)).append("\n");
		sb.append("    state: ").append(toIndentedString(this.state)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
