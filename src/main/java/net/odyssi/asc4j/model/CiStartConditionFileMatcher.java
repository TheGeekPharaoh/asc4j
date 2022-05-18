package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiStartConditionFileMatcher implements Serializable {

	private static final long serialVersionUID = 3686071330509555381L;

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

	private String directory;

	private String fileExtension;
	private String fileName;

	public CiStartConditionFileMatcher directory(String directory) {
		this.directory = directory;
		return this;
	}

	public CiStartConditionFileMatcher fileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
		return this;
	}

	public CiStartConditionFileMatcher fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	/**
	 * Get directory
	 *
	 * @return directory
	 **/
	@JsonProperty("directory")
	public String getDirectory() {
		return this.directory;
	}

	/**
	 * Get fileExtension
	 *
	 * @return fileExtension
	 **/
	@JsonProperty("fileExtension")
	public String getFileExtension() {
		return this.fileExtension;
	}

	/**
	 * Get fileName
	 *
	 * @return fileName
	 **/
	@JsonProperty("fileName")
	public String getFileName() {
		return this.fileName;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiStartConditionFileMatcher {\n");

		sb.append("    directory: ").append(toIndentedString(this.directory)).append("\n");
		sb.append("    fileExtension: ").append(toIndentedString(this.fileExtension)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
