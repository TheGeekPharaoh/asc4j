package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreOrderCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -8179225360487493678L;

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

	private LocalDate appReleaseDate;

	public AppPreOrderCreateRequestDataAttributes appReleaseDate(LocalDate appReleaseDate) {
		this.appReleaseDate = appReleaseDate;
		return this;
	}

	/**
	 * Get appReleaseDate
	 *
	 * @return appReleaseDate
	 **/
	@JsonProperty("appReleaseDate")
	public LocalDate getAppReleaseDate() {
		return this.appReleaseDate;
	}

	public void setAppReleaseDate(LocalDate appReleaseDate) {
		this.appReleaseDate = appReleaseDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreOrderCreateRequestDataAttributes {\n");

		sb.append("    appReleaseDate: ").append(toIndentedString(this.appReleaseDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
