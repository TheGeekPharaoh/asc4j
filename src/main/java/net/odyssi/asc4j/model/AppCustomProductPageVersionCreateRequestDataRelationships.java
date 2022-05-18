package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageVersionCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 3996862883441799774L;

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

	private AppCustomProductPageVersionCreateRequestDataRelationshipsAppCustomProductPage appCustomProductPage;
	private AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations;

	public AppCustomProductPageVersionCreateRequestDataRelationships appCustomProductPage(
			AppCustomProductPageVersionCreateRequestDataRelationshipsAppCustomProductPage appCustomProductPage) {
		this.appCustomProductPage = appCustomProductPage;
		return this;
	}

	public AppCustomProductPageVersionCreateRequestDataRelationships appCustomProductPageLocalizations(
			AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations) {
		this.appCustomProductPageLocalizations = appCustomProductPageLocalizations;
		return this;
	}

	/**
	 * Get appCustomProductPage
	 *
	 * @return appCustomProductPage
	 **/
	@JsonProperty("appCustomProductPage")
	public AppCustomProductPageVersionCreateRequestDataRelationshipsAppCustomProductPage getAppCustomProductPage() {
		return this.appCustomProductPage;
	}

	/**
	 * Get appCustomProductPageLocalizations
	 *
	 * @return appCustomProductPageLocalizations
	 **/
	@JsonProperty("appCustomProductPageLocalizations")
	public AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations getAppCustomProductPageLocalizations() {
		return this.appCustomProductPageLocalizations;
	}

	public void setAppCustomProductPage(
			AppCustomProductPageVersionCreateRequestDataRelationshipsAppCustomProductPage appCustomProductPage) {
		this.appCustomProductPage = appCustomProductPage;
	}

	public void setAppCustomProductPageLocalizations(
			AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations appCustomProductPageLocalizations) {
		this.appCustomProductPageLocalizations = appCustomProductPageLocalizations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageVersionCreateRequestDataRelationships {\n");

		sb.append("    appCustomProductPage: ").append(toIndentedString(this.appCustomProductPage)).append("\n");
		sb.append("    appCustomProductPageLocalizations: ")
				.append(toIndentedString(this.appCustomProductPageLocalizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
