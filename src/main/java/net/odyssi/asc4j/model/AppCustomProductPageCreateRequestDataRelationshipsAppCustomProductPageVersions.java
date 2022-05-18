package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions implements Serializable {

	private static final long serialVersionUID = 3683036917459984390L;

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

	private List<AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersionData> data = null;

	public AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions addDataItem(
			AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersionData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions data(
			List<AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersionData> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersionData> getData() {
		return this.data;
	}

	public void setData(List<AppCustomProductPageLocalizationRelationshipsAppCustomProductPageVersionData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppCustomProductPageCreateRequestDataRelationshipsAppCustomProductPageVersions {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
