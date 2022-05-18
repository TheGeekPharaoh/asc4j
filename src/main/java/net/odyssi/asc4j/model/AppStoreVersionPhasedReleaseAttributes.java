package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionPhasedReleaseAttributes implements Serializable {

	private static final long serialVersionUID = 6208281951625856301L;

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

	private Integer currentDayNumber;

	private PhasedReleaseState phasedReleaseState;

	private OffsetDateTime startDate;
	private Integer totalPauseDuration;

	public AppStoreVersionPhasedReleaseAttributes currentDayNumber(Integer currentDayNumber) {
		this.currentDayNumber = currentDayNumber;
		return this;
	}

	/**
	 * Get currentDayNumber
	 *
	 * @return currentDayNumber
	 **/
	@JsonProperty("currentDayNumber")
	public Integer getCurrentDayNumber() {
		return this.currentDayNumber;
	}

	/**
	 * Get phasedReleaseState
	 *
	 * @return phasedReleaseState
	 **/
	@JsonProperty("phasedReleaseState")
	public PhasedReleaseState getPhasedReleaseState() {
		return this.phasedReleaseState;
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
	 * Get totalPauseDuration
	 *
	 * @return totalPauseDuration
	 **/
	@JsonProperty("totalPauseDuration")
	public Integer getTotalPauseDuration() {
		return this.totalPauseDuration;
	}

	public AppStoreVersionPhasedReleaseAttributes phasedReleaseState(PhasedReleaseState phasedReleaseState) {
		this.phasedReleaseState = phasedReleaseState;
		return this;
	}

	public void setCurrentDayNumber(Integer currentDayNumber) {
		this.currentDayNumber = currentDayNumber;
	}

	public void setPhasedReleaseState(PhasedReleaseState phasedReleaseState) {
		this.phasedReleaseState = phasedReleaseState;
	}

	public void setStartDate(OffsetDateTime startDate) {
		this.startDate = startDate;
	}

	public void setTotalPauseDuration(Integer totalPauseDuration) {
		this.totalPauseDuration = totalPauseDuration;
	}

	public AppStoreVersionPhasedReleaseAttributes startDate(OffsetDateTime startDate) {
		this.startDate = startDate;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionPhasedReleaseAttributes {\n");

		sb.append("    phasedReleaseState: ").append(toIndentedString(this.phasedReleaseState)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(this.startDate)).append("\n");
		sb.append("    totalPauseDuration: ").append(toIndentedString(this.totalPauseDuration)).append("\n");
		sb.append("    currentDayNumber: ").append(toIndentedString(this.currentDayNumber)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppStoreVersionPhasedReleaseAttributes totalPauseDuration(Integer totalPauseDuration) {
		this.totalPauseDuration = totalPauseDuration;
		return this;
	}
}
