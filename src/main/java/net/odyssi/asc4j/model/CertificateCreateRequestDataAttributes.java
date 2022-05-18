package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CertificateCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -7214239363131185556L;

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

	private CertificateType certificateType;
	private String csrContent;

	public CertificateCreateRequestDataAttributes certificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
		return this;
	}

	public CertificateCreateRequestDataAttributes csrContent(String csrContent) {
		this.csrContent = csrContent;
		return this;
	}

	/**
	 * Get certificateType
	 *
	 * @return certificateType
	 **/
	@JsonProperty("certificateType")
	public CertificateType getCertificateType() {
		return this.certificateType;
	}

	/**
	 * Get csrContent
	 *
	 * @return csrContent
	 **/
	@JsonProperty("csrContent")
	public String getCsrContent() {
		return this.csrContent;
	}

	public void setCertificateType(CertificateType certificateType) {
		this.certificateType = certificateType;
	}

	public void setCsrContent(String csrContent) {
		this.csrContent = csrContent;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CertificateCreateRequestDataAttributes {\n");

		sb.append("    csrContent: ").append(toIndentedString(this.csrContent)).append("\n");
		sb.append("    certificateType: ").append(toIndentedString(this.certificateType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
