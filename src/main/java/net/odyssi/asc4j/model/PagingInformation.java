package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PagingInformation implements Serializable {

	private static final long serialVersionUID = 3404629698212568942L;

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

	private PagingInformationPaging paging;

	/**
	 * Get paging
	 *
	 * @return paging
	 **/
	@JsonProperty("paging")
	public PagingInformationPaging getPaging() {
		return this.paging;
	}

	public PagingInformation paging(PagingInformationPaging paging) {
		this.paging = paging;
		return this;
	}

	public void setPaging(PagingInformationPaging paging) {
		this.paging = paging;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PagingInformation {\n");

		sb.append("    paging: ").append(toIndentedString(this.paging)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
