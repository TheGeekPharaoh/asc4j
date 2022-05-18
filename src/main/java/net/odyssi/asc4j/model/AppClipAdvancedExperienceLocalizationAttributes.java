package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipAdvancedExperienceLocalizationAttributes implements Serializable {

	private static final long serialVersionUID = 1998067724753000932L;

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

	private AppClipAdvancedExperienceLanguage language;

	private String subtitle;
	private String title;

	/**
	 * Get language
	 *
	 * @return language
	 **/
	@JsonProperty("language")
	public AppClipAdvancedExperienceLanguage getLanguage() {
		return this.language;
	}

	/**
	 * Get subtitle
	 *
	 * @return subtitle
	 **/
	@JsonProperty("subtitle")
	public String getSubtitle() {
		return this.subtitle;
	}

	/**
	 * Get title
	 *
	 * @return title
	 **/
	@JsonProperty("title")
	public String getTitle() {
		return this.title;
	}

	public AppClipAdvancedExperienceLocalizationAttributes language(AppClipAdvancedExperienceLanguage language) {
		this.language = language;
		return this;
	}

	public void setLanguage(AppClipAdvancedExperienceLanguage language) {
		this.language = language;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AppClipAdvancedExperienceLocalizationAttributes subtitle(String subtitle) {
		this.subtitle = subtitle;
		return this;
	}

	public AppClipAdvancedExperienceLocalizationAttributes title(String title) {
		this.title = title;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipAdvancedExperienceLocalizationAttributes {\n");

		sb.append("    language: ").append(toIndentedString(this.language)).append("\n");
		sb.append("    title: ").append(toIndentedString(this.title)).append("\n");
		sb.append("    subtitle: ").append(toIndentedString(this.subtitle)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
