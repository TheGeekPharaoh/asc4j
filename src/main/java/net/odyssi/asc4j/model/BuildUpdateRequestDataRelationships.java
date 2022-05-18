package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildUpdateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 1193248356944205489L;

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

	private BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration;

	public BuildUpdateRequestDataRelationships appEncryptionDeclaration(
			BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
		this.appEncryptionDeclaration = appEncryptionDeclaration;
		return this;
	}

	/**
	 * Get appEncryptionDeclaration
	 *
	 * @return appEncryptionDeclaration
	 **/
	@JsonProperty("appEncryptionDeclaration")
	public BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration getAppEncryptionDeclaration() {
		return this.appEncryptionDeclaration;
	}

	public void setAppEncryptionDeclaration(
			BuildUpdateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
		this.appEncryptionDeclaration = appEncryptionDeclaration;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildUpdateRequestDataRelationships {\n");

		sb.append("    appEncryptionDeclaration: ").append(toIndentedString(this.appEncryptionDeclaration))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
