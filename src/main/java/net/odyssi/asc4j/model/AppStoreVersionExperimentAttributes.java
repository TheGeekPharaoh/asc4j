package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentAttributes implements Serializable {

	public enum StateEnum {

		ACCEPTED(String.valueOf("ACCEPTED")), APPROVED(String.valueOf("APPROVED")),
		COMPLETED(String.valueOf("COMPLETED")), IN_REVIEW(String.valueOf("IN_REVIEW")),
		PREPARE_FOR_SUBMISSION(String.valueOf("PREPARE_FOR_SUBMISSION")),
		READY_FOR_REVIEW(String.valueOf("READY_FOR_REVIEW")), REJECTED(String.valueOf("REJECTED")),
		STOPPED(String.valueOf("STOPPED")), WAITING_FOR_REVIEW(String.valueOf("WAITING_FOR_REVIEW"));

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

	private static final long serialVersionUID = -4270330541947722747L;

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

	private OffsetDateTime endDate;

	private String name;

	private Boolean reviewRequired;

	private OffsetDateTime startDate;

	private StateEnum state;
	private Integer trafficProportion;

	public AppStoreVersionExperimentAttributes endDate(OffsetDateTime endDate) {
		this.endDate = endDate;
		return this;
	}

	/**
	 * Get endDate
	 *
	 * @return endDate
	 **/
	@JsonProperty("endDate")
	public OffsetDateTime getEndDate() {
		return this.endDate;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get startDate
	 *
	 * @return startDate
	 **/
	@JsonProperty("startDate")
	public OffsetDateTime getStartDate() {
		return this.startDate;
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

	/**
	 * Get trafficProportion
	 *
	 * @return trafficProportion
	 **/
	@JsonProperty("trafficProportion")
	public Integer getTrafficProportion() {
		return this.trafficProportion;
	}

	/**
	 * Get reviewRequired
	 *
	 * @return reviewRequired
	 **/
	@JsonProperty("reviewRequired")
	public Boolean isReviewRequired() {
		return this.reviewRequired;
	}

	public AppStoreVersionExperimentAttributes name(String name) {
		this.name = name;
		return this;
	}

	public AppStoreVersionExperimentAttributes reviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
		return this;
	}

	public void setEndDate(OffsetDateTime endDate) {
		this.endDate = endDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
	}

	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}

	public void setState(StateEnum state) {
		this.state = state;
	}

	public void setTrafficProportion(Integer trafficProportion) {
		this.trafficProportion = trafficProportion;
	}

	public AppStoreVersionExperimentAttributes startDate(OffsetDateTime startDate) {
		this.startDate = startDate;
		return this;
	}

	public AppStoreVersionExperimentAttributes state(StateEnum state) {
		this.state = state;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    trafficProportion: ").append(toIndentedString(this.trafficProportion)).append("\n");
		sb.append("    state: ").append(toIndentedString(this.state)).append("\n");
		sb.append("    reviewRequired: ").append(toIndentedString(this.reviewRequired)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(this.startDate)).append("\n");
		sb.append("    endDate: ").append(toIndentedString(this.endDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionExperimentAttributes trafficProportion(Integer trafficProportion) {
		this.trafficProportion = trafficProportion;
		return this;
	}
}
