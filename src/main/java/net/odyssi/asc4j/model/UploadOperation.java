package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UploadOperation implements Serializable {

	private static final long serialVersionUID = -1446309895758251255L;

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

	private Integer length;

	private String method;

	private Integer offset;

	private List<HttpHeader> requestHeaders = null;
	private String url;

	public UploadOperation addRequestHeadersItem(HttpHeader requestHeadersItem) {
		this.requestHeaders.add(requestHeadersItem);
		return this;
	}

	/**
	 * Get length
	 *
	 * @return length
	 **/
	@JsonProperty("length")
	public Integer getLength() {
		return this.length;
	}

	/**
	 * Get method
	 *
	 * @return method
	 **/
	@JsonProperty("method")
	public String getMethod() {
		return this.method;
	}

	/**
	 * Get offset
	 *
	 * @return offset
	 **/
	@JsonProperty("offset")
	public Integer getOffset() {
		return this.offset;
	}

	/**
	 * Get requestHeaders
	 *
	 * @return requestHeaders
	 **/
	@JsonProperty("requestHeaders")
	public List<HttpHeader> getRequestHeaders() {
		return this.requestHeaders;
	}

	/**
	 * Get url
	 *
	 * @return url
	 **/
	@JsonProperty("url")
	public String getUrl() {
		return this.url;
	}

	public UploadOperation length(Integer length) {
		this.length = length;
		return this;
	}

	public UploadOperation method(String method) {
		this.method = method;
		return this;
	}

	public UploadOperation offset(Integer offset) {
		this.offset = offset;
		return this;
	}

	public UploadOperation requestHeaders(List<HttpHeader> requestHeaders) {
		this.requestHeaders = requestHeaders;
		return this;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public void setRequestHeaders(List<HttpHeader> requestHeaders) {
		this.requestHeaders = requestHeaders;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UploadOperation {\n");

		sb.append("    method: ").append(toIndentedString(this.method)).append("\n");
		sb.append("    url: ").append(toIndentedString(this.url)).append("\n");
		sb.append("    length: ").append(toIndentedString(this.length)).append("\n");
		sb.append("    offset: ").append(toIndentedString(this.offset)).append("\n");
		sb.append("    requestHeaders: ").append(toIndentedString(this.requestHeaders)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public UploadOperation url(String url) {
		this.url = url;
		return this;
	}
}
