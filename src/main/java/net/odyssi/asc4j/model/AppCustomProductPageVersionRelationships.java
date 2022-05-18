package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageVersionRelationships implements Serializable {

	private static final long serialVersionUID = -4177283631182404210L;

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

	private AppCustomProductPageVersionRelationshipsAppCustomProductPage appCustomProductPage;
	private AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations;

	public AppCustomProductPageVersionRelationships appCustomProductPage(
			AppCustomProductPageVersionRelationshipsAppCustomProductPage appCustomProductPage) {
		this.appCustomProductPage = appCustomProductPage;
		return this;
	}

	public AppCustomProductPageVersionRelationships appCustomProductPageLocalizations(
			AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations) {
		this.appCustomProductPageLocalizations = appCustomProductPageLocalizations;
		return this;
	}

	/**
	 * Get appCustomProductPage
	 *
	 * @return appCustomProductPage
	 **/
	@JsonProperty("appCustomProductPage")
	public AppCustomProductPageVersionRelationshipsAppCustomProductPage getAppCustomProductPage() {
		return this.appCustomProductPage;
	}

	/**
	 * Get appCustomProductPageLocalizations
	 *
	 * @return appCustomProductPageLocalizations
	 **/
	@JsonProperty("appCustomProductPageLocalizations")
	public AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizations getAppCustomProductPageLocalizations() {
		return this.appCustomProductPageLocalizations;
	}

	public void setAppCustomProductPage(
			AppCustomProductPageVersionRelationshipsAppCustomProductPage appCustomProductPage) {
		this.appCustomProductPage = appCustomProductPage;
	}

	public void setAppCustomProductPageLocalizations(
			AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations) {
		this.appCustomProductPageLocalizations = appCustomProductPageLocalizations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageVersionRelationships {\n");

		sb.append("    appCustomProductPage: ").append(toIndentedString(this.appCustomProductPage)).append("\n");
		sb.append("    appCustomProductPageLocalizations: ")
				.append(toIndentedString(this.appCustomProductPageLocalizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
