package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaGroupCreateRequestDataRelationshipsBetaTesters implements Serializable {

	private static final long serialVersionUID = -9195891736580849477L;

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

	private List<BetaGroupRelationshipsBetaTestersData> data = null;

	public BetaGroupCreateRequestDataRelationshipsBetaTesters addDataItem(
			BetaGroupRelationshipsBetaTestersData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public BetaGroupCreateRequestDataRelationshipsBetaTesters data(List<BetaGroupRelationshipsBetaTestersData> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<BetaGroupRelationshipsBetaTestersData> getData() {
		return this.data;
	}

	public void setData(List<BetaGroupRelationshipsBetaTestersData> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaGroupCreateRequestDataRelationshipsBetaTesters {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
