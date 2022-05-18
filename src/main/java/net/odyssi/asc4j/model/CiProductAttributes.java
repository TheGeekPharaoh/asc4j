package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiProductAttributes implements Serializable {

	public enum ProductTypeEnum {

		APP(String.valueOf("APP")), FRAMEWORK(String.valueOf("FRAMEWORK"));

		public static ProductTypeEnum fromValue(String value) {
			for (ProductTypeEnum b : ProductTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ProductTypeEnum(String v) {
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

	private static final long serialVersionUID = -3904268857793093081L;

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

	private OffsetDateTime createdDate;

	private String name;
	private ProductTypeEnum productType;

	public CiProductAttributes createdDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	/**
	 * Get createdDate
	 *
	 * @return createdDate
	 **/
	@JsonProperty("createdDate")
	public OffsetDateTime getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	/**
	 * Get productType
	 *
	 * @return productType
	 **/
	@JsonProperty("productType")
	public String getProductType() {
		if (this.productType == null) {
			return null;
		}
		return this.productType.value();
	}

	public CiProductAttributes name(String name) {
		this.name = name;
		return this;
	}

	public CiProductAttributes productType(ProductTypeEnum productType) {
		this.productType = productType;
		return this;
	}

	public void setCreatedDate(OffsetDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductType(ProductTypeEnum productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiProductAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(this.createdDate)).append("\n");
		sb.append("    productType: ").append(toIndentedString(this.productType)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
