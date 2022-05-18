package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;



public class AppCustomProductPageCreateRequest implements Serializable {

	private static final long serialVersionUID = 349509991816530637L;

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

	private AppCustomProductPageCreateRequestData data;
	private List<Object> included = null;

	public AppCustomProductPageCreateRequest addIncludedItem(
			Object includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppCustomProductPageCreateRequest data(AppCustomProductPageCreateRequestData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppCustomProductPageCreateRequestData getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<Object> getIncluded() {
		return this.included;
	}

	public AppCustomProductPageCreateRequest included(
			List<Object> included) {
		this.included = included;
		return this;
	}

	public void setData(AppCustomProductPageCreateRequestData data) {
		this.data = data;
	}

	public void setIncluded(
			List<Object> included) {
		this.included = included;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageCreateRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
