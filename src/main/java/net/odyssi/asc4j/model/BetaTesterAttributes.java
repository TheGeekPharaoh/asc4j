package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaTesterAttributes implements Serializable {

	private static final long serialVersionUID = -6888322877484624887L;

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

	private String email;

	private String firstName;

	private BetaInviteType inviteType;
	private String lastName;

	public BetaTesterAttributes email(String email) {
		this.email = email;
		return this;
	}

	public BetaTesterAttributes firstName(String firstName) {
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
	 * Get inviteType
	 *
	 * @return inviteType
	 **/
	@JsonProperty("inviteType")
	public BetaInviteType getInviteType() {
		return this.inviteType;
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

	public BetaTesterAttributes inviteType(BetaInviteType inviteType) {
		this.inviteType = inviteType;
		return this;
	}

	public BetaTesterAttributes lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setInviteType(BetaInviteType inviteType) {
		this.inviteType = inviteType;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaTesterAttributes {\n");

		sb.append("    firstName: ").append(toIndentedString(this.firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(this.lastName)).append("\n");
		sb.append("    email: ").append(toIndentedString(this.email)).append("\n");
		sb.append("    inviteType: ").append(toIndentedString(this.inviteType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
