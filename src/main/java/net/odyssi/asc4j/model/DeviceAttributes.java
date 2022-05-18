package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceAttributes implements Serializable {

	public enum DeviceClassEnum {

		APPLE_TV(String.valueOf("APPLE_TV")), APPLE_WATCH(String.valueOf("APPLE_WATCH")), IPAD(String.valueOf("IPAD")),
		IPHONE(String.valueOf("IPHONE")), IPOD(String.valueOf("IPOD")), MAC(String.valueOf("MAC"));

		public static DeviceClassEnum fromValue(String value) {
			for (DeviceClassEnum b : DeviceClassEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		DeviceClassEnum(String v) {
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

		DISABLED(String.valueOf("DISABLED")), ENABLED(String.valueOf("ENABLED"));

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

	private static final long serialVersionUID = -235156171611655659L;

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

	private OffsetDateTime addedDate;

	private DeviceClassEnum deviceClass;

	private String model;

	private String name;

	private BundleIdPlatform platform;

	private StatusEnum status;
	private String udid;

	public DeviceAttributes addedDate(OffsetDateTime addedDate) {
		this.addedDate = addedDate;
		return this;
	}

	public DeviceAttributes deviceClass(DeviceClassEnum deviceClass) {
		this.deviceClass = deviceClass;
		return this;
	}

	/**
	 * Get addedDate
	 *
	 * @return addedDate
	 **/
	@JsonProperty("addedDate")
	public OffsetDateTime getAddedDate() {
		return this.addedDate;
	}

	/**
	 * Get deviceClass
	 *
	 * @return deviceClass
	 **/
	@JsonProperty("deviceClass")
	public String getDeviceClass() {
		if (this.deviceClass == null) {
			return null;
		}
		return this.deviceClass.value();
	}

	/**
	 * Get model
	 *
	 * @return model
	 **/
	@JsonProperty("model")
	public String getModel() {
		return this.model;
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
	 * Get platform
	 *
	 * @return platform
	 **/
	@JsonProperty("platform")
	public BundleIdPlatform getPlatform() {
		return this.platform;
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
	 * Get udid
	 *
	 * @return udid
	 **/
	@JsonProperty("udid")
	public String getUdid() {
		return this.udid;
	}

	public DeviceAttributes model(String model) {
		this.model = model;
		return this;
	}

	public DeviceAttributes name(String name) {
		this.name = name;
		return this;
	}

	public DeviceAttributes platform(BundleIdPlatform platform) {
		this.platform = platform;
		return this;
	}

	public void setAddedDate(OffsetDateTime addedDate) {
		this.addedDate = addedDate;
	}

	public void setDeviceClass(DeviceClassEnum deviceClass) {
		this.deviceClass = deviceClass;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlatform(BundleIdPlatform platform) {
		this.platform = platform;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public DeviceAttributes status(StatusEnum status) {
		this.status = status;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    platform: ").append(toIndentedString(this.platform)).append("\n");
		sb.append("    udid: ").append(toIndentedString(this.udid)).append("\n");
		sb.append("    deviceClass: ").append(toIndentedString(this.deviceClass)).append("\n");
		sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
		sb.append("    model: ").append(toIndentedString(this.model)).append("\n");
		sb.append("    addedDate: ").append(toIndentedString(this.addedDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public DeviceAttributes udid(String udid) {
		this.udid = udid;
		return this;
	}
}
