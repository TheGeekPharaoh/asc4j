package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentTreatmentLocalizationAttributes implements Serializable {

	private static final long serialVersionUID = 7791173245974490920L;

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

	private String locale;

	/**
	 * Get locale
	 *
	 * @return locale
	 **/
	@JsonProperty("locale")
	public String getLocale() {
		return this.locale;
	}

	public AppStoreVersionExperimentTreatmentLocalizationAttributes locale(String locale) {
		this.locale = locale;
		return this;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentTreatmentLocalizationAttributes {\n");

		sb.append("    locale: ").append(toIndentedString(this.locale)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
