package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiMacOsVersionRelationshipsXcodeVersions implements Serializable {

	private static final long serialVersionUID = -4234180421044390176L;

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

	private List<CiMacOsVersionRelationshipsXcodeVersionsData> data = null;

	private AppCategoryRelationshipsSubcategoriesLinks links;
	private PagingInformation meta;

	public CiMacOsVersionRelationshipsXcodeVersions addDataItem(CiMacOsVersionRelationshipsXcodeVersionsData dataItem) {
		this.data.add(dataItem);
		return this;
	}

	public CiMacOsVersionRelationshipsXcodeVersions data(List<CiMacOsVersionRelationshipsXcodeVersionsData> data) {
		this.data = data;
		return this;
	}

	/**
	 * Get data
	 *
	 * @return data
	 **/
	@JsonProperty("data")
	public List<CiMacOsVersionRelationshipsXcodeVersionsData> getData() {
		return this.data;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/
	@JsonProperty("links")
	public AppCategoryRelationshipsSubcategoriesLinks getLinks() {
		return this.links;
	}

	/**
	 * Get meta
	 *
	 * @return meta
	 **/
	@JsonProperty("meta")
	public PagingInformation getMeta() {
		return this.meta;
	}

	public CiMacOsVersionRelationshipsXcodeVersions links(AppCategoryRelationshipsSubcategoriesLinks links) {
		this.links = links;
		return this;
	}

	public CiMacOsVersionRelationshipsXcodeVersions meta(PagingInformation meta) {
		this.meta = meta;
		return this;
	}

	public void setData(List<CiMacOsVersionRelationshipsXcodeVersionsData> data) {
		this.data = data;
	}

	public void setLinks(AppCategoryRelationshipsSubcategoriesLinks links) {
		this.links = links;
	}

	public void setMeta(PagingInformation meta) {
		this.meta = meta;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiMacOsVersionRelationshipsXcodeVersions {\n");

		sb.append("    links: ").append(toIndentedString(this.links)).append("\n");
		sb.append("    meta: ").append(toIndentedString(this.meta)).append("\n");
		sb.append("    data: ").append(toIndentedString(this.data)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
