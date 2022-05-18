package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDomainStatusAttributesDomains implements Serializable {

	public enum ErrorCodeEnum {

		BAD_HTTP_RESPONSE(String.valueOf("BAD_HTTP_RESPONSE")), BAD_JSON_CONTENT(String.valueOf("BAD_JSON_CONTENT")),
		BAD_PKCS7_SIGNATURE(String.valueOf("BAD_PKCS7_SIGNATURE")),
		CANNOT_REACH_AASA_FILE(String.valueOf("CANNOT_REACH_AASA_FILE")), DNS_ERROR(String.valueOf("DNS_ERROR")),
		INSECURE_REDIRECTS_FORBIDDEN(String.valueOf("INSECURE_REDIRECTS_FORBIDDEN")),
		INVALID_ENTITLEMENT_MISSING_SECTION(String.valueOf("INVALID_ENTITLEMENT_MISSING_SECTION")),
		INVALID_ENTITLEMENT_SYNTAX_ERROR(String.valueOf("INVALID_ENTITLEMENT_SYNTAX_ERROR")),
		INVALID_ENTITLEMENT_UNHANDLED_SECTION(String.valueOf("INVALID_ENTITLEMENT_UNHANDLED_SECTION")),
		INVALID_ENTITLEMENT_UNKNOWN_ID(String.valueOf("INVALID_ENTITLEMENT_UNKNOWN_ID")),
		NETWORK_ERROR(String.valueOf("NETWORK_ERROR")),
		NETWORK_ERROR_TEMPORARY(String.valueOf("NETWORK_ERROR_TEMPORARY")), OTHER_ERROR(String.valueOf("OTHER_ERROR")),
		TIMEOUT(String.valueOf("TIMEOUT")), TLS_ERROR(String.valueOf("TLS_ERROR")),
		UNEXPECTED_ERROR(String.valueOf("UNEXPECTED_ERROR"));

		public static ErrorCodeEnum fromValue(String value) {
			for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ErrorCodeEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = 1456058192959779449L;

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

	private String domain;

	private ErrorCodeEnum errorCode;

	private Boolean isValid;
	private OffsetDateTime lastUpdatedDate;

	public AppClipDomainStatusAttributesDomains domain(String domain) {
		this.domain = domain;
		return this;
	}

	public AppClipDomainStatusAttributesDomains errorCode(ErrorCodeEnum errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	/**
	 * Get domain
	 *
	 * @return domain
	 **/
	@JsonProperty("domain")
	public String getDomain() {
		return this.domain;
	}

	/**
	 * Get errorCode
	 *
	 * @return errorCode
	 **/
	@JsonProperty("errorCode")
	public String getErrorCode() {
		if (this.errorCode == null) {
			return null;
		}
		return this.errorCode.value();
	}

	/**
	 * Get lastUpdatedDate
	 *
	 * @return lastUpdatedDate
	 **/
	@JsonProperty("lastUpdatedDate")
	public OffsetDateTime getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	/**
	 * Get isValid
	 *
	 * @return isValid
	 **/
	@JsonProperty("isValid")
	public Boolean isIsValid() {
		return this.isValid;
	}

	public AppClipDomainStatusAttributesDomains isValid(Boolean isValid) {
		this.isValid = isValid;
		return this;
	}

	public AppClipDomainStatusAttributesDomains lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
		return this;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public void setErrorCode(ErrorCodeEnum errorCode) {
		this.errorCode = errorCode;
	}

	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}

	public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDomainStatusAttributesDomains {\n");

		sb.append("    domain: ").append(toIndentedString(this.domain)).append("\n");
		sb.append("    isValid: ").append(toIndentedString(this.isValid)).append("\n");
		sb.append("    lastUpdatedDate: ").append(toIndentedString(this.lastUpdatedDate)).append("\n");
		sb.append("    errorCode: ").append(toIndentedString(this.errorCode)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
