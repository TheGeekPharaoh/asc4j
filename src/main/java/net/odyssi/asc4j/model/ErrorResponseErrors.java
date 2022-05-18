package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponseErrors implements Serializable {

	private static final long serialVersionUID = -7853358409082533859L;

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

	private String code;

	private String detail;

	private String id;

	// FIXME Source
	private Object source;

	private String status;
	private String title;

	public ErrorResponseErrors code(String code) {
		this.code = code;
		return this;
	}

	public ErrorResponseErrors detail(String detail) {
		this.detail = detail;
		return this;
	}

	/**
	 * Get code
	 *
	 * @return code
	 **/
	@JsonProperty("code")
	public String getCode() {
		return this.code;
	}

	/**
	 * Get detail
	 *
	 * @return detail
	 **/
	@JsonProperty("detail")
	public String getDetail() {
		return this.detail;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	/**
	 * Get source
	 *
	 * @return source
	 **/
	@JsonProperty("source")
	public Object getSource() {
		return this.source;
	}

	/**
	 * Get status
	 *
	 * @return status
	 **/
	@JsonProperty("status")
	public String getStatus() {
		return this.status;
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

	public ErrorResponseErrors id(String id) {
		this.id = id;
		return this;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ErrorResponseErrors source(Object source) {
		this.source = source;
		return this;
	}

	public ErrorResponseErrors status(String status) {
		this.status = status;
		return this;
	}

	public ErrorResponseErrors title(String title) {
		this.title = title;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorResponseErrors {\n");

		sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
		sb.append("    status: ").append(toIndentedString(this.status)).append("\n");
		sb.append("    code: ").append(toIndentedString(this.code)).append("\n");
		sb.append("    title: ").append(toIndentedString(this.title)).append("\n");
		sb.append("    detail: ").append(toIndentedString(this.detail)).append("\n");
		sb.append("    source: ").append(toIndentedString(this.source)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
