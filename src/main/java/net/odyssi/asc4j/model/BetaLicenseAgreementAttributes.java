package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaLicenseAgreementAttributes implements Serializable {

	private static final long serialVersionUID = -90317056553211575L;

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

	private String agreementText;

	public BetaLicenseAgreementAttributes agreementText(String agreementText) {
		this.agreementText = agreementText;
		return this;
	}

	/**
	 * Get agreementText
	 *
	 * @return agreementText
	 **/
	@JsonProperty("agreementText")
	public String getAgreementText() {
		return this.agreementText;
	}

	public void setAgreementText(String agreementText) {
		this.agreementText = agreementText;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaLicenseAgreementAttributes {\n");

		sb.append("    agreementText: ").append(toIndentedString(this.agreementText)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
