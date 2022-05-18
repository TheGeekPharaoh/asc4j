package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations
		implements Serializable {

	private static final long serialVersionUID = -6504493096148622969L;

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

	private List<AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsData> data = null;

	public AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations addDataItem(
			AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations data(
			List<AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsData> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsData> getData() {
		return this.data;
	}

	public void setData(List<AppCustomProductPageVersionRelationshipsAppCustomProductPageLocalizationsData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPageLocalizations {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
