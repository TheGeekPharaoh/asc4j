package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage implements Serializable {

	private static final long serialVersionUID = 7101968281644627534L;

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

	private AppCustomProductPageVersionRelationshipsAppCustomProductPageData data;

	public AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage data(
			AppCustomProductPageVersionRelationshipsAppCustomProductPageData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppCustomProductPageVersionRelationshipsAppCustomProductPageData getData() {
		return this.data;
	}

	public void setData(AppCustomProductPageVersionRelationshipsAppCustomProductPageData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageVersionInlineCreateRelationshipsAppCustomProductPage {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
