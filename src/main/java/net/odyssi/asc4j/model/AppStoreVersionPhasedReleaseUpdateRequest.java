package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionPhasedReleaseUpdateRequest implements Serializable {

	private static final long serialVersionUID = 6872479691642420408L;

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

	private AppStoreVersionPhasedReleaseUpdateRequestData data;

	public AppStoreVersionPhasedReleaseUpdateRequest data(AppStoreVersionPhasedReleaseUpdateRequestData data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public AppStoreVersionPhasedReleaseUpdateRequestData getData() {
		return this.data;
	}

	public void setData(AppStoreVersionPhasedReleaseUpdateRequestData data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionPhasedReleaseUpdateRequest {\n");

		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
