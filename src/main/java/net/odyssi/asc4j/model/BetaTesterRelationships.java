package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaTesterRelationships implements Serializable {

	private static final long serialVersionUID = -4642311162379554413L;

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

	private BetaTesterRelationshipsApps apps;

	private AppRelationshipsBetaGroups betaGroups;
	private AppRelationshipsBuilds builds;

	public BetaTesterRelationships apps(BetaTesterRelationshipsApps apps) {
		this.apps = apps;
		return this;
	}

	public BetaTesterRelationships betaGroups(AppRelationshipsBetaGroups betaGroups) {
		this.betaGroups = betaGroups;
		return this;
	}

	public BetaTesterRelationships builds(AppRelationshipsBuilds builds) {
		this.builds = builds;
		return this;
	}

	/**
	 * Get apps
	 *
	 * @return apps
	 **/
	@JsonProperty("apps")
	public BetaTesterRelationshipsApps getApps() {
		return this.apps;
	}

	/**
	 * Get betaGroups
	 *
	 * @return betaGroups
	 **/
	@JsonProperty("betaGroups")
	public AppRelationshipsBetaGroups getBetaGroups() {
		return this.betaGroups;
	}

	/**
	 * Get builds
	 *
	 * @return builds
	 **/
	@JsonProperty("builds")
	public AppRelationshipsBuilds getBuilds() {
		return this.builds;
	}

	public void setApps(BetaTesterRelationshipsApps apps) {
		this.apps = apps;
	}

	public void setBetaGroups(AppRelationshipsBetaGroups betaGroups) {
		this.betaGroups = betaGroups;
	}

	public void setBuilds(AppRelationshipsBuilds builds) {
		this.builds = builds;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaTesterRelationships {\n");

		sb.append("    apps: ").append(toIndentedString(this.apps)).append("\n");
		sb.append("    betaGroups: ").append(toIndentedString(this.betaGroups)).append("\n");
		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
