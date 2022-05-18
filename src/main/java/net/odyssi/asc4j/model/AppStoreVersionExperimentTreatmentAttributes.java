package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionExperimentTreatmentAttributes implements Serializable {

	private static final long serialVersionUID = -6448099995179738106L;

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

	private ImageAsset appIcon;

	private String appIconName;

	private String name;
	private OffsetDateTime promotedDate;

	public AppStoreVersionExperimentTreatmentAttributes appIcon(ImageAsset appIcon) {
		this.appIcon = appIcon;
		return this;
	}

	public AppStoreVersionExperimentTreatmentAttributes appIconName(String appIconName) {
		this.appIconName = appIconName;
		return this;
	}

	/**
	 * Get appIcon
	 *
	 * @return appIcon
	 **/
	@JsonProperty("appIcon")
	public ImageAsset getAppIcon() {
		return this.appIcon;
	}

	/**
	 * Get appIconName
	 *
	 * @return appIconName
	 **/
	@JsonProperty("appIconName")
	public String getAppIconName() {
		return this.appIconName;
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
	 * Get promotedDate
	 *
	 * @return promotedDate
	 **/
	@JsonProperty("promotedDate")
	public OffsetDateTime getPromotedDate() {
		return this.promotedDate;
	}

	public AppStoreVersionExperimentTreatmentAttributes name(String name) {
		this.name = name;
		return this;
	}

	public AppStoreVersionExperimentTreatmentAttributes promotedDate(OffsetDateTime promotedDate) {
		this.promotedDate = promotedDate;
		return this;
	}

	public void setAppIcon(ImageAsset appIcon) {
		this.appIcon = appIcon;
	}

	public void setAppIconName(String appIconName) {
		this.appIconName = appIconName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPromotedDate(OffsetDateTime promotedDate) {
		this.promotedDate = promotedDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionExperimentTreatmentAttributes {\n");

		sb.append("    name: ").append(toIndentedString(this.name)).append("\n");
		sb.append("    appIcon: ").append(toIndentedString(this.appIcon)).append("\n");
		sb.append("    appIconName: ").append(toIndentedString(this.appIconName)).append("\n");
		sb.append("    promotedDate: ").append(toIndentedString(this.promotedDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
