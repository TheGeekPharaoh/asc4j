package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInvitationCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -7215602859023962397L;

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

	private UserInvitationCreateRequestDataRelationshipsVisibleApps visibleApps;

	/**
	 * Get visibleApps
	 *
	 * @return visibleApps
	 **/
	@JsonProperty("visibleApps")
	public UserInvitationCreateRequestDataRelationshipsVisibleApps getVisibleApps() {
		return this.visibleApps;
	}

	public void setVisibleApps(UserInvitationCreateRequestDataRelationshipsVisibleApps visibleApps) {
		this.visibleApps = visibleApps;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserInvitationCreateRequestDataRelationships {\n");

		sb.append("    visibleApps: ").append(toIndentedString(this.visibleApps)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public UserInvitationCreateRequestDataRelationships visibleApps(
			UserInvitationCreateRequestDataRelationshipsVisibleApps visibleApps) {
		this.visibleApps = visibleApps;
		return this;
	}
}
