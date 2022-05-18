package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DiagnosticSignatureAttributes implements Serializable {

	public enum DiagnosticTypeEnum {

		DISK_WRITES(String.valueOf("DISK_WRITES"));

		public static DiagnosticTypeEnum fromValue(String value) {
			for (DiagnosticTypeEnum b : DiagnosticTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		DiagnosticTypeEnum(String v) {
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

	private static final long serialVersionUID = 1633988996116872495L;

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

	private DiagnosticTypeEnum diagnosticType;

	private String signature;
	private BigDecimal weight;

	public DiagnosticSignatureAttributes diagnosticType(DiagnosticTypeEnum diagnosticType) {
		this.diagnosticType = diagnosticType;
		return this;
	}

	/**
	 * Get diagnosticType
	 *
	 * @return diagnosticType
	 **/
	@JsonProperty("diagnosticType")
	public String getDiagnosticType() {
		if (this.diagnosticType == null) {
			return null;
		}
		return this.diagnosticType.value();
	}

	/**
	 * Get signature
	 *
	 * @return signature
	 **/
	@JsonProperty("signature")
	public String getSignature() {
		return this.signature;
	}

	/**
	 * Get weight
	 *
	 * @return weight
	 **/
	@JsonProperty("weight")
	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setDiagnosticType(DiagnosticTypeEnum diagnosticType) {
		this.diagnosticType = diagnosticType;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public DiagnosticSignatureAttributes signature(String signature) {
		this.signature = signature;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DiagnosticSignatureAttributes {\n");

		sb.append("    diagnosticType: ").append(toIndentedString(this.diagnosticType)).append("\n");
		sb.append("    signature: ").append(toIndentedString(this.signature)).append("\n");
		sb.append("    weight: ").append(toIndentedString(this.weight)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public DiagnosticSignatureAttributes weight(BigDecimal weight) {
		this.weight = weight;
		return this;
	}
}
