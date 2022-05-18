package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerfPowerMetricAttributes implements Serializable {

	public enum MetricTypeEnum {

		ANIMATION(String.valueOf("ANIMATION")), BATTERY(String.valueOf("BATTERY")), DISK(String.valueOf("DISK")),
		HANG(String.valueOf("HANG")), LAUNCH(String.valueOf("LAUNCH")), MEMORY(String.valueOf("MEMORY")),
		TERMINATION(String.valueOf("TERMINATION"));

		public static MetricTypeEnum fromValue(String value) {
			for (MetricTypeEnum b : MetricTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		MetricTypeEnum(String v) {
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

	public enum PlatformEnum {

		IOS(String.valueOf("IOS"));

		public static PlatformEnum fromValue(String value) {
			for (PlatformEnum b : PlatformEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		PlatformEnum(String v) {
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

	private static final long serialVersionUID = -3543808901958745766L;

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

	private String deviceType;

	private MetricTypeEnum metricType;
	private PlatformEnum platform;

	public PerfPowerMetricAttributes deviceType(String deviceType) {
		this.deviceType = deviceType;
		return this;
	}

	/**
	 * Get deviceType
	 *
	 * @return deviceType
	 **/
	@JsonProperty("deviceType")
	public String getDeviceType() {
		return this.deviceType;
	}

	/**
	 * Get metricType
	 *
	 * @return metricType
	 **/
	@JsonProperty("metricType")
	public String getMetricType() {
		if (this.metricType == null) {
			return null;
		}
		return this.metricType.value();
	}

	/**
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public String getPlatform() {
		if (this.platform == null) {
			return null;
		}
		return this.platform.value();
	}

	public PerfPowerMetricAttributes metricType(MetricTypeEnum metricType) {
		this.metricType = metricType;
		return this;
	}

	public PerfPowerMetricAttributes platform(PlatformEnum platform) {
		this.platform = platform;
		return this;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public void setMetricType(MetricTypeEnum metricType) {
		this.metricType = metricType;
	}

	public void setPlatform(PlatformEnum platform) {
		this.platform = platform;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PerfPowerMetricAttributes {\n");

		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    metricType: ").append(toIndentedString(this.metricType)).append("\n");
		sb.append("    deviceType: ").append(toIndentedString(this.deviceType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
