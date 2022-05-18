package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppScreenshotSetCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 7150767352292244692L;

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

	private ScreenshotDisplayType screenshotDisplayType;

	/**
	 * Get screenshotDisplayType
	 *
	 * @return screenshotDisplayType
	 **/
	@JsonProperty("screenshotDisplayType")
	public ScreenshotDisplayType getScreenshotDisplayType() {
		return this.screenshotDisplayType;
	}

	public AppScreenshotSetCreateRequestDataAttributes screenshotDisplayType(
			ScreenshotDisplayType screenshotDisplayType) {
		this.screenshotDisplayType = screenshotDisplayType;
		return this;
	}

	public void setScreenshotDisplayType(ScreenshotDisplayType screenshotDisplayType) {
		this.screenshotDisplayType = screenshotDisplayType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppScreenshotSetCreateRequestDataAttributes {\n");

		sb.append("    screenshotDisplayType: ").append(toIndentedString(this.screenshotDisplayType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
