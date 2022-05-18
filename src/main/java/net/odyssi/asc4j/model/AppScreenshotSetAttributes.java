package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppScreenshotSetAttributes implements Serializable {

	private static final long serialVersionUID = -4646888132891652899L;

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

	public AppScreenshotSetAttributes screenshotDisplayType(ScreenshotDisplayType screenshotDisplayType) {
		this.screenshotDisplayType = screenshotDisplayType;
		return this;
	}

	public void setScreenshotDisplayType(ScreenshotDisplayType screenshotDisplayType) {
		this.screenshotDisplayType = screenshotDisplayType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppScreenshotSetAttributes {\n");

		sb.append("    screenshotDisplayType: ").append(toIndentedString(this.screenshotDisplayType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
