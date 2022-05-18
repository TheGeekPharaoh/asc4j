package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiScheduledStartConditionSchedule implements Serializable {

	public enum DaysEnum {

		FRIDAY(String.valueOf("FRIDAY")), MONDAY(String.valueOf("MONDAY")), SATURDAY(String.valueOf("SATURDAY")),
		SUNDAY(String.valueOf("SUNDAY")), THURSDAY(String.valueOf("THURSDAY")), TUESDAY(String.valueOf("TUESDAY")),
		WEDNESDAY(String.valueOf("WEDNESDAY"));

		public static DaysEnum fromValue(String value) {
			for (DaysEnum b : DaysEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		DaysEnum(String v) {
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

	public enum FrequencyEnum {

		DAILY(String.valueOf("DAILY")), HOURLY(String.valueOf("HOURLY")), WEEKLY(String.valueOf("WEEKLY"));

		public static FrequencyEnum fromValue(String value) {
			for (FrequencyEnum b : FrequencyEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		FrequencyEnum(String v) {
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

	private static final long serialVersionUID = -7324542807660421872L;

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

	private List<DaysEnum> days = null;

	private FrequencyEnum frequency;

	private Integer hour;

	private Integer minute;
	private String timezone;

	public CiScheduledStartConditionSchedule addDaysItem(DaysEnum daysItem) {
		this.days.add(daysItem);
		return this;
	}

	public CiScheduledStartConditionSchedule days(List<DaysEnum> days) {
		this.days = days;
		return this;
	}

	public CiScheduledStartConditionSchedule frequency(FrequencyEnum frequency) {
		this.frequency = frequency;
		return this;
	}

	/**
	 * Get days
	 *
	 * @return days
	 **/
	@JsonProperty("days")
	public List<DaysEnum> getDays() {
		return this.days;
	}

	/**
	 * Get frequency
	 *
	 * @return frequency
	 **/
	@JsonProperty("frequency")
	public String getFrequency() {
		if (this.frequency == null) {
			return null;
		}
		return this.frequency.value();
	}

	/**
	 * Get hour
	 *
	 * @return hour
	 **/
	@JsonProperty("hour")
	public Integer getHour() {
		return this.hour;
	}

	/**
	 * Get minute
	 *
	 * @return minute
	 **/
	@JsonProperty("minute")
	public Integer getMinute() {
		return this.minute;
	}

	/**
	 * Get timezone
	 *
	 * @return timezone
	 **/
	@JsonProperty("timezone")
	public String getTimezone() {
		return this.timezone;
	}

	public CiScheduledStartConditionSchedule hour(Integer hour) {
		this.hour = hour;
		return this;
	}

	public CiScheduledStartConditionSchedule minute(Integer minute) {
		this.minute = minute;
		return this;
	}

	public void setDays(List<DaysEnum> days) {
		this.days = days;
	}

	public void setFrequency(FrequencyEnum frequency) {
		this.frequency = frequency;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public CiScheduledStartConditionSchedule timezone(String timezone) {
		this.timezone = timezone;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiScheduledStartConditionSchedule {\n");

		sb.append("    frequency: ").append(toIndentedString(this.frequency)).append("\n");
		sb.append("    days: ").append(toIndentedString(this.days)).append("\n");
		sb.append("    hour: ").append(toIndentedString(this.hour)).append("\n");
		sb.append("    minute: ").append(toIndentedString(this.minute)).append("\n");
		sb.append("    timezone: ").append(toIndentedString(this.timezone)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
