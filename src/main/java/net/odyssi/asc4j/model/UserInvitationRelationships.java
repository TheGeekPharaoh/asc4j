package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInvitationRelationships implements Serializable {

	private static final long serialVersionUID = 5350853953186206212L;

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

	private BetaTesterRelationshipsApps visibleApps;

	/**
	 * Get visibleApps
	 *
	 * @return visibleApps
	 **/
	@JsonProperty("visibleApps")
	public BetaTesterRelationshipsApps getVisibleApps() {
		return this.visibleApps;
	}

	public void setVisibleApps(BetaTesterRelationshipsApps visibleApps) {
		this.visibleApps = visibleApps;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserInvitationRelationships {\n");

		sb.append("    visibleApps: ").append(toIndentedString(this.visibleApps)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public UserInvitationRelationships visibleApps(BetaTesterRelationshipsApps visibleApps) {
		this.visibleApps = visibleApps;
		return this;
	}
}
