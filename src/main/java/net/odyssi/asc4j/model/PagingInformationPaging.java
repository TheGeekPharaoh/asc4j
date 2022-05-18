package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PagingInformationPaging implements Serializable {

	private static final long serialVersionUID = 2701540096766856381L;

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

	private Integer limit;
	private Integer total;

	/**
	 * Get limit
	 *
	 * @return limit
	 **/
	@JsonProperty("limit")
	public Integer getLimit() {
		return this.limit;
	}

	/**
	 * Get total
	 *
	 * @return total
	 **/
	@JsonProperty("total")
	public Integer getTotal() {
		return this.total;
	}

	public PagingInformationPaging limit(Integer limit) {
		this.limit = limit;
		return this;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PagingInformationPaging {\n");

		sb.append("    total: ").append(toIndentedString(this.total)).append("\n");
		sb.append("    limit: ").append(toIndentedString(this.limit)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public PagingInformationPaging total(Integer total) {
		this.total = total;
		return this;
	}
}
