package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InAppPurchaseRelationships implements Serializable {

	private static final long serialVersionUID = 3165193544204677862L;

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

	private BetaTesterRelationshipsApps apps;

	public InAppPurchaseRelationships apps(BetaTesterRelationshipsApps apps) {
		this.apps = apps;
		return this;
	}

	/**
	 * Get apps
	 *
	 * @return apps
	 **/
	@JsonProperty("apps")
	public BetaTesterRelationshipsApps getApps() {
		return this.apps;
	}

	public void setApps(BetaTesterRelationshipsApps apps) {
		this.apps = apps;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InAppPurchaseRelationships {\n");

		sb.append("    apps: ").append(toIndentedString(this.apps)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
