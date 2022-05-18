package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceUpdateRequest implements Serializable {

	private static final long serialVersionUID = -3835742673946568132L;

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

	private AppClipAdvancedExperienceUpdateRequestData data;
	private List<AppClipAdvancedExperienceLocalizationInlineCreate> included = null;

	public AppClipAdvancedExperienceUpdateRequest addIncludedItem(
			AppClipAdvancedExperienceLocalizationInlineCreate includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public AppClipAdvancedExperienceUpdateRequest data(AppClipAdvancedExperienceUpdateRequestData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppClipAdvancedExperienceUpdateRequestData getData() {
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

	public AppClipAdvancedExperienceUpdateRequest included(
			List<AppClipAdvancedExperienceLocalizationInlineCreate> included) {
		this.included = included;
		return this;
	}

	public void setData(AppClipAdvancedExperienceUpdateRequestData data) {
		this.data = data;
	}

	public void setIncluded(List<AppClipAdvancedExperienceLocalizationInlineCreate> included) {
		this.included = included;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceUpdateRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
