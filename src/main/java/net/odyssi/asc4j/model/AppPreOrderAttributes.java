package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreOrderAttributes implements Serializable {

	private static final long serialVersionUID = 8164175193297889439L;

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
	private LocalDate preOrderAvailableDate;

	public AppPreOrderAttributes appReleaseDate(LocalDate appReleaseDate) {
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

	/**
	 * Get preOrderAvailableDate
	 *
	 * @return preOrderAvailableDate
	 **/
	@JsonProperty("preOrderAvailableDate")
	public LocalDate getPreOrderAvailableDate() {
		return this.preOrderAvailableDate;
	}

	public AppPreOrderAttributes preOrderAvailableDate(LocalDate preOrderAvailableDate) {
		this.preOrderAvailableDate = preOrderAvailableDate;
		return this;
	}

	public void setAppReleaseDate(LocalDate appReleaseDate) {
		this.appReleaseDate = appReleaseDate;
	}

	public void setPreOrderAvailableDate(LocalDate preOrderAvailableDate) {
		this.preOrderAvailableDate = preOrderAvailableDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreOrderAttributes {\n");

		sb.append("    preOrderAvailableDate: ").append(toIndentedString(this.preOrderAvailableDate)).append("\n");
		sb.append("    appReleaseDate: ").append(toIndentedString(this.appReleaseDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
