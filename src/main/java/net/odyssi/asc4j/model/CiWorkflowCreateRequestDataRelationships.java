package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiWorkflowCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 155269873115100878L;

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

	private CiWorkflowCreateRequestDataRelationshipsMacOsVersion macOsVersion;

	private CiWorkflowCreateRequestDataRelationshipsProduct product;

	private CiWorkflowCreateRequestDataRelationshipsRepository repository;
	private CiWorkflowCreateRequestDataRelationshipsXcodeVersion xcodeVersion;

	/**
	 * Get macOsVersion
	 *
	 * @return macOsVersion
	 **/
	@JsonProperty("macOsVersion")
	public CiWorkflowCreateRequestDataRelationshipsMacOsVersion getMacOsVersion() {
		return this.macOsVersion;
	}

	/**
	 * Get product
	 *
	 * @return product
	 **/
	@JsonProperty("product")
	public CiWorkflowCreateRequestDataRelationshipsProduct getProduct() {
		return this.product;
	}

	/**
	 * Get repository
	 *
	 * @return repository
	 **/
	@JsonProperty("repository")
	public CiWorkflowCreateRequestDataRelationshipsRepository getRepository() {
		return this.repository;
	}

	/**
	 * Get xcodeVersion
	 *
	 * @return xcodeVersion
	 **/
	@JsonProperty("xcodeVersion")
	public CiWorkflowCreateRequestDataRelationshipsXcodeVersion getXcodeVersion() {
		return this.xcodeVersion;
	}

	public CiWorkflowCreateRequestDataRelationships macOsVersion(
			CiWorkflowCreateRequestDataRelationshipsMacOsVersion macOsVersion) {
		this.macOsVersion = macOsVersion;
		return this;
	}

	public CiWorkflowCreateRequestDataRelationships product(CiWorkflowCreateRequestDataRelationshipsProduct product) {
		this.product = product;
		return this;
	}

	public CiWorkflowCreateRequestDataRelationships repository(
			CiWorkflowCreateRequestDataRelationshipsRepository repository) {
		this.repository = repository;
		return this;
	}

	public void setMacOsVersion(CiWorkflowCreateRequestDataRelationshipsMacOsVersion macOsVersion) {
		this.macOsVersion = macOsVersion;
	}

	public void setProduct(CiWorkflowCreateRequestDataRelationshipsProduct product) {
		this.product = product;
	}

	public void setRepository(CiWorkflowCreateRequestDataRelationshipsRepository repository) {
		this.repository = repository;
	}

	public void setXcodeVersion(CiWorkflowCreateRequestDataRelationshipsXcodeVersion xcodeVersion) {
		this.xcodeVersion = xcodeVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiWorkflowCreateRequestDataRelationships {\n");

		sb.append("    product: ").append(toIndentedString(this.product)).append("\n");
		sb.append("    repository: ").append(toIndentedString(this.repository)).append("\n");
		sb.append("    xcodeVersion: ").append(toIndentedString(this.xcodeVersion)).append("\n");
		sb.append("    macOsVersion: ").append(toIndentedString(this.macOsVersion)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiWorkflowCreateRequestDataRelationships xcodeVersion(
			CiWorkflowCreateRequestDataRelationshipsXcodeVersion xcodeVersion) {
		this.xcodeVersion = xcodeVersion;
		return this;
	}
}
