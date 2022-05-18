package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceImageUpdateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = -5353653683713759130L;

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

	private String sourceFileChecksum;
	private Boolean uploaded;

	/**
	 * Get sourceFileChecksum
	 *
	 * @return sourceFileChecksum
	 **/
	@JsonProperty("sourceFileChecksum")
	public String getSourceFileChecksum() {
		return this.sourceFileChecksum;
	}

	/**
	 * Get uploaded
	 *
	 * @return uploaded
	 **/
	@JsonProperty("uploaded")
	public Boolean isUploaded() {
		return this.uploaded;
	}

	public void setSourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
	}

	public void setUploaded(Boolean uploaded) {
		this.uploaded = uploaded;
	}

	public AppClipAdvancedExperienceImageUpdateRequestDataAttributes sourceFileChecksum(String sourceFileChecksum) {
		this.sourceFileChecksum = sourceFileChecksum;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceImageUpdateRequestDataAttributes {\n");

		sb.append("    sourceFileChecksum: ").append(toIndentedString(this.sourceFileChecksum)).append("\n");
		sb.append("    uploaded: ").append(toIndentedString(this.uploaded)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AppClipAdvancedExperienceImageUpdateRequestDataAttributes uploaded(Boolean uploaded) {
		this.uploaded = uploaded;
		return this;
	}
}
