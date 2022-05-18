package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -972544370765380748L;

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

	private Boolean allAppsVisible;

	private Boolean provisioningAllowed;
	private List<UserRole> roles = null;

	public UserUpdateRequestDataAttributes addRolesItem(UserRole rolesItem) {
		this.roles.add(rolesItem);
		return this;
	}

	public UserUpdateRequestDataAttributes allAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
		return this;
	}

	/**
	 * Get roles
	 *
	 * @return roles
	 **/
	@JsonProperty("roles")
	public List<UserRole> getRoles() {
		return this.roles;
	}

	/**
	 * Get allAppsVisible
	 *
	 * @return allAppsVisible
	 **/
	@JsonProperty("allAppsVisible")
	public Boolean isAllAppsVisible() {
		return this.allAppsVisible;
	}

	/**
	 * Get provisioningAllowed
	 *
	 * @return provisioningAllowed
	 **/
	@JsonProperty("provisioningAllowed")
	public Boolean isProvisioningAllowed() {
		return this.provisioningAllowed;
	}

	public UserUpdateRequestDataAttributes provisioningAllowed(Boolean provisioningAllowed) {
		this.provisioningAllowed = provisioningAllowed;
		return this;
	}

	public UserUpdateRequestDataAttributes roles(List<UserRole> roles) {
		this.roles = roles;
		return this;
	}

	public void setAllAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
	}

	public void setProvisioningAllowed(Boolean provisioningAllowed) {
		this.provisioningAllowed = provisioningAllowed;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserUpdateRequestDataAttributes {\n");

		sb.append("    roles: ").append(toIndentedString(this.roles)).append("\n");
		sb.append("    allAppsVisible: ").append(toIndentedString(this.allAppsVisible)).append("\n");
		sb.append("    provisioningAllowed: ").append(toIndentedString(this.provisioningAllowed)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
