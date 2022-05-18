package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiWorkflowRelationships implements Serializable {

	private static final long serialVersionUID = -7214506555061174620L;

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

	private CiWorkflowRelationshipsMacOsVersion macOsVersion;

	private AppRelationshipsCiProduct product;

	private CiWorkflowRelationshipsRepository repository;
	private CiWorkflowRelationshipsXcodeVersion xcodeVersion;

	/**
	 * Get macOsVersion
	 *
	 * @return macOsVersion
	 **/
	@JsonProperty("macOsVersion")
	public CiWorkflowRelationshipsMacOsVersion getMacOsVersion() {
		return this.macOsVersion;
	}

	/**
	 * Get product
	 *
	 * @return product
	 **/
	@JsonProperty("product")
	public AppRelationshipsCiProduct getProduct() {
		return this.product;
	}

	/**
	 * Get repository
	 *
	 * @return repository
	 **/
	@JsonProperty("repository")
	public CiWorkflowRelationshipsRepository getRepository() {
		return this.repository;
	}

	/**
	 * Get xcodeVersion
	 *
	 * @return xcodeVersion
	 **/
	@JsonProperty("xcodeVersion")
	public CiWorkflowRelationshipsXcodeVersion getXcodeVersion() {
		return this.xcodeVersion;
	}

	public CiWorkflowRelationships macOsVersion(CiWorkflowRelationshipsMacOsVersion macOsVersion) {
		this.macOsVersion = macOsVersion;
		return this;
	}

	public CiWorkflowRelationships product(AppRelationshipsCiProduct product) {
		this.product = product;
		return this;
	}

	public CiWorkflowRelationships repository(CiWorkflowRelationshipsRepository repository) {
		this.repository = repository;
		return this;
	}

	public void setMacOsVersion(CiWorkflowRelationshipsMacOsVersion macOsVersion) {
		this.macOsVersion = macOsVersion;
	}

	public void setProduct(AppRelationshipsCiProduct product) {
		this.product = product;
	}

	public void setRepository(CiWorkflowRelationshipsRepository repository) {
		this.repository = repository;
	}

	public void setXcodeVersion(CiWorkflowRelationshipsXcodeVersion xcodeVersion) {
		this.xcodeVersion = xcodeVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiWorkflowRelationships {\n");

		sb.append("    product: ").append(toIndentedString(this.product)).append("\n");
		sb.append("    repository: ").append(toIndentedString(this.repository)).append("\n");
		sb.append("    xcodeVersion: ").append(toIndentedString(this.xcodeVersion)).append("\n");
		sb.append("    macOsVersion: ").append(toIndentedString(this.macOsVersion)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public CiWorkflowRelationships xcodeVersion(CiWorkflowRelationshipsXcodeVersion xcodeVersion) {
		this.xcodeVersion = xcodeVersion;
		return this;
	}
}
