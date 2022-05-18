package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiTestResultAttributes implements Serializable {

	private static final long serialVersionUID = 3447094406431141583L;

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

	private String className;

	private List<CiTestResultAttributesDestinationTestResults> destinationTestResults = null;

	private FileLocation fileSource;

	private String message;

	private String name;
	private CiTestStatus status;

	public CiTestResultAttributes addDestinationTestResultsItem(
			CiTestResultAttributesDestinationTestResults destinationTestResultsItem) {
		this.destinationTestResults.add(destinationTestResultsItem);
		return this;
	}

	public CiTestResultAttributes className(String className) {
		this.className = className;
		return this;
	}

	public CiTestResultAttributes destinationTestResults(
			List<CiTestResultAttributesDestinationTestResults> destinationTestResults) {
		this.destinationTestResults = destinationTestResults;
		return this;
	}

	public CiTestResultAttributes fileSource(FileLocation fileSource) {
		this.fileSource = fileSource;
		return this;
	}

	/**
	 * Get className
	 *
	 * @return className
	 **/
	@JsonProperty("className")
	public String getClassName() {
		return this.className;
	}

	/**
	 * Get destinationTestResults
	 *
	 * @return destinationTestResults
	 **/
	@JsonProperty("destinationTestResults")
	public List<CiTestResultAttributesDestinationTestResults> getDestinationTestResults() {
		return this.destinationTestResults;
	}

	/**
	 * Get fileSource
	 *
	 * @return fileSource
	 **/
	@JsonProperty("fileSource")
	public FileLocation getFileSource() {
		return this.fileSource;
	}

	/**
	 * Get message
	 *
	 * @return message
	 **/
	@JsonProperty("message")
	public String getMessage() {
		return this.message;
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
	 * Get status
	 *
	 * @return status
	 **/
	@JsonProperty("status")
	public CiTestStatus getStatus() {
		return this.status;
	}

	public CiTestResultAttributes message(String message) {
		this.message = message;
		return this;
	}

	public CiTestResultAttributes name(String name) {
		this.name = name;
		return this;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setDestinationTestResults(List<CiTestResultAttributesDestinationTestResults> destinationTestResults) {
		this.destinationTestResults = destinationTestResults;
	}

	public void setFileSource(FileLocation fileSource) {
		this.fileSource = fileSource;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(CiTestStatus status) {
		this.status = status;
	}

	public CiTestResultAttributes status(CiTestStatus status) {
		this.status = status;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiTestResultAttributes {\n");

		sb.append("    className: ").append(toIndentedString(this.className)).append("\n");
		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
		sb.append("    fileSource: ").append(toIndentedString(this.fileSource)).append("\n");
		sb.append("    message: ").append(toIndentedString(this.message)).append("\n");
		sb.append("    destinationTestResults: ").append(toIndentedString(this.destinationTestResults)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
