package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceLocalizationUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 4993081191541185630L;

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

	private String subtitle;

	/**
	 * Get subtitle
	 *
	 * @return subtitle
	 **/
	@JsonProperty("subtitle")
	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public AppClipDefaultExperienceLocalizationUpdateRequestDataAttributes subtitle(String subtitle) {
		this.subtitle = subtitle;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceLocalizationUpdateRequestDataAttributes {\n");

		sb.append("    subtitle: ").append(toIndentedString(this.subtitle)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
