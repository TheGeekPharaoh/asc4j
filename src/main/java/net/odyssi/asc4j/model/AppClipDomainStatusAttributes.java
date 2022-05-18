package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDomainStatusAttributes implements Serializable {

	private static final long serialVersionUID = -188518240063939455L;

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

	private List<AppClipDomainStatusAttributesDomains> domains = null;
	private OffsetDateTime lastUpdatedDate;

	public AppClipDomainStatusAttributes addDomainsItem(AppClipDomainStatusAttributesDomains domainsItem) {
		this.domains.add(domainsItem);
		return this;
	}

	public AppClipDomainStatusAttributes domains(List<AppClipDomainStatusAttributesDomains> domains) {
		this.domains = domains;
		return this;
	}

	/**
	 * Get domains
	 *
	 * @return domains
	 **/
	@JsonProperty("domains")
	public List<AppClipDomainStatusAttributesDomains> getDomains() {
		return this.domains;
	}

	/**
	 * Get lastUpdatedDate
	 *
	 * @return lastUpdatedDate
	 **/
	@JsonProperty("lastUpdatedDate")
	public OffsetDateTime getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public AppClipDomainStatusAttributes lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
		return this;
	}

	public void setDomains(List<AppClipDomainStatusAttributesDomains> domains) {
		this.domains = domains;
	}

	public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDomainStatusAttributes {\n");

		sb.append("    domains: ").append(toIndentedString(this.domains)).append("\n");
		sb.append("    lastUpdatedDate: ").append(toIndentedString(this.lastUpdatedDate)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
