package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaGroupCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -76274118191798161L;

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

	private AppCustomProductPageCreateRequestDataRelationshipsApp app;

	private BetaGroupCreateRequestDataRelationshipsBetaTesters betaTesters;
	private BetaGroupCreateRequestDataRelationshipsBuilds builds;

	public BetaGroupCreateRequestDataRelationships app(AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public BetaGroupCreateRequestDataRelationships betaTesters(
			BetaGroupCreateRequestDataRelationshipsBetaTesters betaTesters) {
		this.betaTesters = betaTesters;
		return this;
	}

	public BetaGroupCreateRequestDataRelationships builds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
		this.builds = builds;
		return this;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/
	@JsonProperty("app")
	public AppCustomProductPageCreateRequestDataRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get betaTesters
	 *
	 * @return betaTesters
	 **/
	@JsonProperty("betaTesters")
	public BetaGroupCreateRequestDataRelationshipsBetaTesters getBetaTesters() {
		return this.betaTesters;
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

	public void setApp(AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
	}

	public void setBetaTesters(BetaGroupCreateRequestDataRelationshipsBetaTesters betaTesters) {
		this.betaTesters = betaTesters;
	}

	public void setBuilds(BetaGroupCreateRequestDataRelationshipsBuilds builds) {
		this.builds = builds;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaGroupCreateRequestDataRelationships {\n");

		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("    betaTesters: ").append(toIndentedString(this.betaTesters)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
