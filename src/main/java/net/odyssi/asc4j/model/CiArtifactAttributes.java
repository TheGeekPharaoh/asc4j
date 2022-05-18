package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.net.URI;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiArtifactAttributes implements Serializable {

	public enum FileTypeEnum {

		ARCHIVE(String.valueOf("ARCHIVE")), ARCHIVE_EXPORT(String.valueOf("ARCHIVE_EXPORT")),
		LOG_BUNDLE(String.valueOf("LOG_BUNDLE")), RESULT_BUNDLE(String.valueOf("RESULT_BUNDLE")),
		TEST_PRODUCTS(String.valueOf("TEST_PRODUCTS")), XCODEBUILD_PRODUCTS(String.valueOf("XCODEBUILD_PRODUCTS"));

		public static FileTypeEnum fromValue(String value) {
			for (FileTypeEnum b : FileTypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		FileTypeEnum(String v) {
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

	private static final long serialVersionUID = 5224702411744285884L;

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

	private URI downloadUrl;

	private String fileName;

	private Integer fileSize;
	private FileTypeEnum fileType;

	public CiArtifactAttributes downloadUrl(URI downloadUrl) {
		this.downloadUrl = downloadUrl;
		return this;
	}

	public CiArtifactAttributes fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	public CiArtifactAttributes fileSize(Integer fileSize) {
		this.fileSize = fileSize;
		return this;
	}

	public CiArtifactAttributes fileType(FileTypeEnum fileType) {
		this.fileType = fileType;
		return this;
	}

	/**
	 * Get downloadUrl
	 *
	 * @return downloadUrl
	 **/
	@JsonProperty("downloadUrl")
	public URI getDownloadUrl() {
		return this.downloadUrl;
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

	/**
	 * Get fileType
	 *
	 * @return fileType
	 **/
	@JsonProperty("fileType")
	public String getFileType() {
		if (this.fileType == null) {
			return null;
		}
		return this.fileType.value();
	}

	public void setDownloadUrl(URI downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public void setFileType(FileTypeEnum fileType) {
		this.fileType = fileType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiArtifactAttributes {\n");

		sb.append("    fileType: ").append(toIndentedString(this.fileType)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(this.fileName)).append("\n");
		sb.append("    fileSize: ").append(toIndentedString(this.fileSize)).append("\n");
		sb.append("    downloadUrl: ").append(toIndentedString(this.downloadUrl)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
