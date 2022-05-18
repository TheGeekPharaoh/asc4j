package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceImageCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 1468513512991026899L;

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

	private String fileName;
	private Integer fileSize;

	public AppClipAdvancedExperienceImageCreateRequestDataAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public AppClipAdvancedExperienceImageCreateRequestDataAttributes fileSize(Integer fileSize) {
		this.fileSize = fileSize;
		return this;
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

	/**
	 * Get fileSize
	 *
	 * @return fileSize
	 **/
	@JsonProperty("fileSize")
	public Integer getFileSize() {
		return this.fileSize;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceImageCreateRequestDataAttributes {\n");

		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
