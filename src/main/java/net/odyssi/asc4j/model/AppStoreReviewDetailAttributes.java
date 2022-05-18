package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreReviewDetailAttributes implements Serializable {

	private static final long serialVersionUID = -2916069019676957681L;

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

	private String contactEmail;

	private String contactFirstName;

	private String contactLastName;

	private String contactPhone;

	private String demoAccountName;

	private String demoAccountPassword;

	private Boolean demoAccountRequired;
	private String notes;

	public AppStoreReviewDetailAttributes contactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	public AppStoreReviewDetailAttributes contactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
		return this;
	}

	public AppStoreReviewDetailAttributes contactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
		return this;
	}

	public AppStoreReviewDetailAttributes contactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
		return this;
	}

	public AppStoreReviewDetailAttributes demoAccountName(String demoAccountName) {
		this.demoAccountName = demoAccountName;
		return this;
	}

	public AppStoreReviewDetailAttributes demoAccountPassword(String demoAccountPassword) {
		this.demoAccountPassword = demoAccountPassword;
		return this;
	}

	public AppStoreReviewDetailAttributes demoAccountRequired(Boolean demoAccountRequired) {
		this.demoAccountRequired = demoAccountRequired;
		return this;
	}

	/**
	 * Get contactEmail
	 *
	 * @return contactEmail
	 **/
	@JsonProperty("contactEmail")
	public String getContactEmail() {
		return this.contactEmail;
	}

	/**
	 * Get contactFirstName
	 *
	 * @return contactFirstName
	 **/
	@JsonProperty("contactFirstName")
	public String getContactFirstName() {
		return this.contactFirstName;
	}

	/**
	 * Get contactLastName
	 *
	 * @return contactLastName
	 **/
	@JsonProperty("contactLastName")
	public String getContactLastName() {
		return this.contactLastName;
	}

	/**
	 * Get contactPhone
	 *
	 * @return contactPhone
	 **/
	@JsonProperty("contactPhone")
	public String getContactPhone() {
		return this.contactPhone;
	}

	/**
	 * Get demoAccountName
	 *
	 * @return demoAccountName
	 **/
	@JsonProperty("demoAccountName")
	public String getDemoAccountName() {
		return this.demoAccountName;
	}

	/**
	 * Get demoAccountPassword
	 *
	 * @return demoAccountPassword
	 **/
	@JsonProperty("demoAccountPassword")
	public String getDemoAccountPassword() {
		return this.demoAccountPassword;
	}

	/**
	 * Get notes
	 *
	 * @return notes
	 **/
	@JsonProperty("notes")
	public String getNotes() {
		return this.notes;
	}

	/**
	 * Get demoAccountRequired
	 *
	 * @return demoAccountRequired
	 **/
	@JsonProperty("demoAccountRequired")
	public Boolean isDemoAccountRequired() {
		return this.demoAccountRequired;
	}

	public AppStoreReviewDetailAttributes notes(String notes) {
		this.notes = notes;
		return this;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public void setDemoAccountName(String demoAccountName) {
		this.demoAccountName = demoAccountName;
	}

	public void setDemoAccountPassword(String demoAccountPassword) {
		this.demoAccountPassword = demoAccountPassword;
	}

	public void setDemoAccountRequired(Boolean demoAccountRequired) {
		this.demoAccountRequired = demoAccountRequired;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreReviewDetailAttributes {\n");

		sb.append("    contactFirstName: ").append(toIndentedString(this.contactFirstName)).append("\n");
		sb.append("    contactLastName: ").append(toIndentedString(this.contactLastName)).append("\n");
		sb.append("    contactPhone: ").append(toIndentedString(this.contactPhone)).append("\n");
		sb.append("    contactEmail: ").append(toIndentedString(this.contactEmail)).append("\n");
		sb.append("    demoAccountName: ").append(toIndentedString(this.demoAccountName)).append("\n");
		sb.append("    demoAccountPassword: ").append(toIndentedString(this.demoAccountPassword)).append("\n");
		sb.append("    demoAccountRequired: ").append(toIndentedString(this.demoAccountRequired)).append("\n");
		sb.append("    notes: ").append(toIndentedString(this.notes)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
