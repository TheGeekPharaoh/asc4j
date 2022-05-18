package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppPreviewCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 7164010023343356595L;

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

	private AppPreviewCreateRequestDataRelationshipsAppPreviewSet appPreviewSet;

	public AppPreviewCreateRequestDataRelationships appPreviewSet(
			AppPreviewCreateRequestDataRelationshipsAppPreviewSet appPreviewSet) {
		this.appPreviewSet = appPreviewSet;
		return this;
	}

	/**
	 * Get appPreviewSet
	 *
	 * @return appPreviewSet
	 **/
	@JsonProperty("appPreviewSet")
	public AppPreviewCreateRequestDataRelationshipsAppPreviewSet getAppPreviewSet() {
		return this.appPreviewSet;
	}

	public void setAppPreviewSet(AppPreviewCreateRequestDataRelationshipsAppPreviewSet appPreviewSet) {
		this.appPreviewSet = appPreviewSet;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppPreviewCreateRequestDataRelationships {\n");

		sb.append("    appPreviewSet: ").append(toIndentedString(this.appPreviewSet)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
