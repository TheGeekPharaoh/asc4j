package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceCreateRequest implements Serializable {

	private static final long serialVersionUID = -540191725016967647L;

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

	private AppClipAdvancedExperienceCreateRequestData data;
	private List<AppClipAdvancedExperienceLocalizationInlineCreate> included = null;

	public AppClipAdvancedExperienceCreateRequest addIncludedItem(
			AppClipAdvancedExperienceLocalizationInlineCreate includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppClipAdvancedExperienceCreateRequest data(AppClipAdvancedExperienceCreateRequestData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppClipAdvancedExperienceCreateRequestData getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<AppClipAdvancedExperienceLocalizationInlineCreate> getIncluded() {
		return this.included;
	}

	public AppClipAdvancedExperienceCreateRequest included(
			List<AppClipAdvancedExperienceLocalizationInlineCreate> included) {
		this.included = included;
		return this;
	}

	public void setData(AppClipAdvancedExperienceCreateRequestData data) {
		this.data = data;
	}

	public void setIncluded(List<AppClipAdvancedExperienceLocalizationInlineCreate> included) {
		this.included = included;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceCreateRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
