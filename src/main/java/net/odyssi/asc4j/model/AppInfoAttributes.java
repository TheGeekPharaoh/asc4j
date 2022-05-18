package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfoAttributes implements Serializable {

	private static final long serialVersionUID = 38473227137433362L;

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

	private AppStoreAgeRating appStoreAgeRating;

	private AppStoreVersionState appStoreState;

	private BrazilAgeRating brazilAgeRating;
	private KidsAgeBand kidsAgeBand;

	public AppInfoAttributes appStoreAgeRating(AppStoreAgeRating appStoreAgeRating) {
		this.appStoreAgeRating = appStoreAgeRating;
		return this;
	}

	public AppInfoAttributes appStoreState(AppStoreVersionState appStoreState) {
		this.appStoreState = appStoreState;
		return this;
	}

	public AppInfoAttributes brazilAgeRating(BrazilAgeRating brazilAgeRating) {
		this.brazilAgeRating = brazilAgeRating;
		return this;
	}

	/**
	 * Get appStoreAgeRating
	 *
	 * @return appStoreAgeRating
	 **/
	@JsonProperty("appStoreAgeRating")
	public AppStoreAgeRating getAppStoreAgeRating() {
		return this.appStoreAgeRating;
	}

	/**
	 * Get appStoreState
	 *
	 * @return appStoreState
	 **/
	@JsonProperty("appStoreState")
	public AppStoreVersionState getAppStoreState() {
		return this.appStoreState;
	}

	/**
	 * Get brazilAgeRating
	 *
	 * @return brazilAgeRating
	 **/
	@JsonProperty("brazilAgeRating")
	public BrazilAgeRating getBrazilAgeRating() {
		return this.brazilAgeRating;
	}

	/**
	 * Get kidsAgeBand
	 *
	 * @return kidsAgeBand
	 **/
	@JsonProperty("kidsAgeBand")
	public KidsAgeBand getKidsAgeBand() {
		return this.kidsAgeBand;
	}

	public AppInfoAttributes kidsAgeBand(KidsAgeBand kidsAgeBand) {
		this.kidsAgeBand = kidsAgeBand;
		return this;
	}

	public void setAppStoreAgeRating(AppStoreAgeRating appStoreAgeRating) {
		this.appStoreAgeRating = appStoreAgeRating;
	}

	public void setAppStoreState(AppStoreVersionState appStoreState) {
		this.appStoreState = appStoreState;
	}

	public void setBrazilAgeRating(BrazilAgeRating brazilAgeRating) {
		this.brazilAgeRating = brazilAgeRating;
	}

	public void setKidsAgeBand(KidsAgeBand kidsAgeBand) {
		this.kidsAgeBand = kidsAgeBand;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppInfoAttributes {\n");

		sb.append("    appStoreState: ").append(toIndentedString(this.appStoreState)).append("\n");
		sb.append("    appStoreAgeRating: ").append(toIndentedString(this.appStoreAgeRating)).append("\n");
		sb.append("    brazilAgeRating: ").append(toIndentedString(this.brazilAgeRating)).append("\n");
		sb.append("    kidsAgeBand: ").append(toIndentedString(this.kidsAgeBand)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
