package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppEventCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -7238162657771704798L;

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

	private AppCustomProductPageCreateRequestDataRelationshipsApp app;

	public AppEventCreateRequestDataRelationships app(AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
		return this;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/
	@JsonProperty("app")
	public AppCustomProductPageCreateRequestDataRelationshipsApp getApp() {
		return this.app;
	}

	public void setApp(AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppEventCreateRequestDataRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
