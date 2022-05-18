package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource's attributes.
 **/

public class UserAttributes implements Serializable {

	private static final long serialVersionUID = -4136971087237308789L;

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

	private String firstName;

	private String lastName;

	private Boolean provisioningAllowed;

	private List<UserRole> roles = null;
	private String username;

	public UserAttributes addRolesItem(UserRole rolesItem) {
		this.roles.add(rolesItem);
		return this;
	}

	public UserAttributes allAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
		return this;
	}

	public UserAttributes firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Get firstName
	 *
	 * @return firstName
	 **/
	@JsonProperty("firstName")
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Get lastName
	 *
	 * @return lastName
	 **/
	@JsonProperty("lastName")
	public String getLastName() {
		return this.lastName;
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
	 * Get username
	 *
	 * @return username
	 **/
	@JsonProperty("username")
	public String getUsername() {
		return this.username;
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

	public UserAttributes lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserAttributes provisioningAllowed(Boolean provisioningAllowed) {
		this.provisioningAllowed = provisioningAllowed;
		return this;
	}

	public UserAttributes roles(List<UserRole> roles) {
		this.roles = roles;
		return this;
	}

	public void setAllAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setProvisioningAllowed(Boolean provisioningAllowed) {
		this.provisioningAllowed = provisioningAllowed;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserAttributes {\n");

		sb.append("    username: ").append(toIndentedString(this.username)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(this.firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(this.lastName)).append("\n");
		sb.append("    roles: ").append(toIndentedString(this.roles)).append("\n");
		sb.append("    allAppsVisible: ").append(toIndentedString(this.allAppsVisible)).append("\n");
		sb.append("    provisioningAllowed: ").append(toIndentedString(this.provisioningAllowed)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public UserAttributes username(String username) {
		this.username = username;
		return this;
	}
}
