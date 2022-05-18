package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppUpdateRequest implements Serializable {

	private static final long serialVersionUID = 7700983663123879727L;

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

	private AppUpdateRequestData data;
	private List<AppPriceInlineCreate> included = null;

	public AppUpdateRequest addIncludedItem(AppPriceInlineCreate includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppUpdateRequest data(AppUpdateRequestData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppUpdateRequestData getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<AppPriceInlineCreate> getIncluded() {
		return this.included;
	}

	public AppUpdateRequest included(List<AppPriceInlineCreate> included) {
		this.included = included;
		return this;
	}

	public void setData(AppUpdateRequestData data) {
		this.data = data;
	}

	public void setIncluded(List<AppPriceInlineCreate> included) {
		this.included = included;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppUpdateRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
