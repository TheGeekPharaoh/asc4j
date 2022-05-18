package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaTesterCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -8905904955897585822L;

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

	private BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups;
	private BetaGroupCreateRequestDataRelationshipsBuilds builds;

	public BetaTesterCreateRequestDataRelationships betaGroups(
			BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups) {
		this.betaGroups = betaGroups;
		return this;
	}

	public BetaTesterCreateRequestDataRelationships builds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
		this.builds = builds;
		return this;
	}

	/**
	 * Get betaGroups
	 *
	 * @return betaGroups
	 **/
	@JsonProperty("betaGroups")
	public BetaTesterCreateRequestDataRelationshipsBetaGroups getBetaGroups() {
		return this.betaGroups;
	}

	/**
	 * Get builds
	 *
	 * @return builds
	 **/
	@JsonProperty("builds")
	public BetaGroupCreateRequestDataRelationshipsBuilds getBuilds() {
		return this.builds;
	}

	public void setBetaGroups(BetaTesterCreateRequestDataRelationshipsBetaGroups betaGroups) {
		this.betaGroups = betaGroups;
	}

	public void setBuilds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
		this.builds = builds;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaTesterCreateRequestDataRelationships {\n");

		sb.append("    betaGroups: ").append(toIndentedString(this.betaGroups)).append("\n");
		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
