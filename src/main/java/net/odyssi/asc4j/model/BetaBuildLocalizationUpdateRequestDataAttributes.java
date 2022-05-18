package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaBuildLocalizationUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 5860416153855922630L;

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

	private String whatsNew;

	/**
	 * Get whatsNew
	 *
	 * @return whatsNew
	 **/
	@JsonProperty("whatsNew")
	public String getWhatsNew() {
		return this.whatsNew;
	}

	public void setWhatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaBuildLocalizationUpdateRequestDataAttributes {\n");

		sb.append("    whatsNew: ").append(toIndentedString(this.whatsNew)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public BetaBuildLocalizationUpdateRequestDataAttributes whatsNew(String whatsNew) {
		this.whatsNew = whatsNew;
		return this;
	}
}
