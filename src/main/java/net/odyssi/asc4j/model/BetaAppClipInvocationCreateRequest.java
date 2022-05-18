package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppClipInvocationCreateRequest implements Serializable {

	private static final long serialVersionUID = 6665242735114397762L;

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

	private BetaAppClipInvocationCreateRequestData data;
	private List<BetaAppClipInvocationLocalizationInlineCreate> included = null;

	public BetaAppClipInvocationCreateRequest addIncludedItem(
			BetaAppClipInvocationLocalizationInlineCreate includedItem) {
		this.included.add(includedItem);
		return this;
	}

	public BetaAppClipInvocationCreateRequest data(BetaAppClipInvocationCreateRequestData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public BetaAppClipInvocationCreateRequestData getData() {
		return this.data;
	}

	/**
	 * Get included
	 *
	 * @return included
	 **/
	@JsonProperty("included")
	public List<BetaAppClipInvocationLocalizationInlineCreate> getIncluded() {
		return this.included;
	}

	public BetaAppClipInvocationCreateRequest included(List<BetaAppClipInvocationLocalizationInlineCreate> included) {
		this.included = included;
		return this;
	}

	public void setData(BetaAppClipInvocationCreateRequestData data) {
		this.data = data;
	}

	public void setIncluded(List<BetaAppClipInvocationLocalizationInlineCreate> included) {
		this.included = included;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppClipInvocationCreateRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("    included: ").append(toIndentedString(this.included)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
