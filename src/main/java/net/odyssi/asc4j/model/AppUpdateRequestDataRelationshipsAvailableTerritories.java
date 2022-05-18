package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppUpdateRequestDataRelationshipsAvailableTerritories implements Serializable {

	private static final long serialVersionUID = 5487765670034162538L;

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

	private List<AppPricePointV2RelationshipsTerritoryData> data = null;

	public AppUpdateRequestDataRelationshipsAvailableTerritories addDataItem(
			AppPricePointV2RelationshipsTerritoryData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public AppUpdateRequestDataRelationshipsAvailableTerritories data(
			List<AppPricePointV2RelationshipsTerritoryData> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<AppPricePointV2RelationshipsTerritoryData> getData() {
		return this.data;
	}

	public void setData(List<AppPricePointV2RelationshipsTerritoryData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppUpdateRequestDataRelationshipsAvailableTerritories {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
