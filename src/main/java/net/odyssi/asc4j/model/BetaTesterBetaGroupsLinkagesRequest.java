package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaTesterBetaGroupsLinkagesRequest implements Serializable {

	private static final long serialVersionUID = -1208367030532891541L;

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

	private List<AppRelationshipsBetaGroupsData> data = new ArrayList<>();

	public BetaTesterBetaGroupsLinkagesRequest addDataItem(AppRelationshipsBetaGroupsData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public BetaTesterBetaGroupsLinkagesRequest data(List<AppRelationshipsBetaGroupsData> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<AppRelationshipsBetaGroupsData> getData() {
		return this.data;
	}

	public void setData(List<AppRelationshipsBetaGroupsData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaTesterBetaGroupsLinkagesRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
