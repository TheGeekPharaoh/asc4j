package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaGroupRelationships implements Serializable {

	private static final long serialVersionUID = -18133404044618589L;

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

	private AppClipRelationshipsApp app;

	private BetaGroupRelationshipsBetaTesters betaTesters;
	private AppRelationshipsBuilds builds;

	public BetaGroupRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public BetaGroupRelationships betaTesters(BetaGroupRelationshipsBetaTesters betaTesters) {
		this.betaTesters = betaTesters;
		return this;
	}

	public BetaGroupRelationships builds(AppRelationshipsBuilds builds) {
		this.builds = builds;
		return this;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/
	@JsonProperty("app")
	public AppClipRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get betaTesters
	 *
	 * @return betaTesters
	 **/
	@JsonProperty("betaTesters")
	public BetaGroupRelationshipsBetaTesters getBetaTesters() {
		return this.betaTesters;
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

	public void setApp(AppClipRelationshipsApp app) {
		this.app = app;
	}

	public void setBetaTesters(BetaGroupRelationshipsBetaTesters betaTesters) {
		this.betaTesters = betaTesters;
	}

	public void setBuilds(AppRelationshipsBuilds builds) {
		this.builds = builds;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaGroupRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("    betaTesters: ").append(toIndentedString(this.betaTesters)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
