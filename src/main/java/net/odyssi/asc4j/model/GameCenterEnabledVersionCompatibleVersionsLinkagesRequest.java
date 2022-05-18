package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameCenterEnabledVersionCompatibleVersionsLinkagesRequest implements Serializable {

	private static final long serialVersionUID = -5593961862779212862L;

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

	private List<AppRelationshipsGameCenterEnabledVersionsData> data = new ArrayList<>();

	public GameCenterEnabledVersionCompatibleVersionsLinkagesRequest addDataItem(
			AppRelationshipsGameCenterEnabledVersionsData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public GameCenterEnabledVersionCompatibleVersionsLinkagesRequest data(
			List<AppRelationshipsGameCenterEnabledVersionsData> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<AppRelationshipsGameCenterEnabledVersionsData> getData() {
		return this.data;
	}

	public void setData(List<AppRelationshipsGameCenterEnabledVersionsData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GameCenterEnabledVersionCompatibleVersionsLinkagesRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
