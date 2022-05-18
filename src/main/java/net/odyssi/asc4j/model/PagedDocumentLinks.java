package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PagedDocumentLinks implements Serializable {

	private static final long serialVersionUID = 7750979370924883530L;

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

	private String first;

	private String next;
	private String self;

	public PagedDocumentLinks first(String first) {
		this.first = first;
		return this;
	}

	/**
	 * Get first
	 *
	 * @return first
	 **/
	@JsonProperty("first")
	public String getFirst() {
		return this.first;
	}

	/**
	 * Get next
	 *
	 * @return next
	 **/
	@JsonProperty("next")
	public String getNext() {
		return this.next;
	}

	/**
	 * Get self
	 *
	 * @return self
	 **/
	@JsonProperty("self")
	public String getSelf() {
		return this.self;
	}

	public PagedDocumentLinks next(String next) {
		this.next = next;
		return this;
	}

	public PagedDocumentLinks self(String self) {
		this.self = self;
		return this;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PagedDocumentLinks {\n");

		sb.append("    self: ").append(toIndentedString(this.self)).append("\n");
		sb.append("    first: ").append(toIndentedString(this.first)).append("\n");
		sb.append("    next: ").append(toIndentedString(this.next)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
