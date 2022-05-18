package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInvitationCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 7010585675407422764L;

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

	private String email;

	private String firstName;

	private String lastName;

	private Boolean provisioningAllowed;
	private List<UserRole> roles = new ArrayList<>();

	public UserInvitationCreateRequestDataAttributes addRolesItem(UserRole rolesItem) {
		this.roles.add(rolesItem);
		return this;
	}

	public UserInvitationCreateRequestDataAttributes allAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
		return this;
	}

	public UserInvitationCreateRequestDataAttributes email(String email) {
		this.email = email;
		return this;
	}

	public UserInvitationCreateRequestDataAttributes firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Get email
	 *
	 * @return email
	 **/
	@JsonProperty("email")
	public String getEmail() {
		return this.email;
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

	public UserInvitationCreateRequestDataAttributes lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserInvitationCreateRequestDataAttributes provisioningAllowed(Boolean provisioningAllowed) {
		this.provisioningAllowed = provisioningAllowed;
		return this;
	}

	public UserInvitationCreateRequestDataAttributes roles(List<UserRole> roles) {
		this.roles = roles;
		return this;
	}

	public void setAllAppsVisible(Boolean allAppsVisible) {
		this.allAppsVisible = allAppsVisible;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserInvitationCreateRequestDataAttributes {\n");

		sb.append("    email: ").append(toIndentedString(this.email)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(this.firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(this.lastName)).append("\n");
		sb.append("    roles: ").append(toIndentedString(this.roles)).append("\n");
		sb.append("    allAppsVisible: ").append(toIndentedString(this.allAppsVisible)).append("\n");
		sb.append("    provisioningAllowed: ").append(toIndentedString(this.provisioningAllowed)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
