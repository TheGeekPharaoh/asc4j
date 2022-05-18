package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppClipInvocationCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -4811086406618887153L;

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

	private BetaAppClipInvocationCreateRequestDataRelationshipsBetaAppClipInvocationLocalizations betaAppClipInvocationLocalizations;
	private BetaAppClipInvocationCreateRequestDataRelationshipsBuildBundle buildBundle;

	public BetaAppClipInvocationCreateRequestDataRelationships betaAppClipInvocationLocalizations(
			BetaAppClipInvocationCreateRequestDataRelationshipsBetaAppClipInvocationLocalizations betaAppClipInvocationLocalizations) {
		this.betaAppClipInvocationLocalizations = betaAppClipInvocationLocalizations;
		return this;
	}

	public BetaAppClipInvocationCreateRequestDataRelationships buildBundle(
			BetaAppClipInvocationCreateRequestDataRelationshipsBuildBundle buildBundle) {
		this.buildBundle = buildBundle;
		return this;
	}

	/**
	 * Get betaAppClipInvocationLocalizations
	 *
	 * @return betaAppClipInvocationLocalizations
	 **/
	@JsonProperty("betaAppClipInvocationLocalizations")
	public BetaAppClipInvocationCreateRequestDataRelationshipsBetaAppClipInvocationLocalizations getBetaAppClipInvocationLocalizations() {
		return this.betaAppClipInvocationLocalizations;
	}

	/**
	 * Get buildBundle
	 *
	 * @return buildBundle
	 **/
	@JsonProperty("buildBundle")
	public BetaAppClipInvocationCreateRequestDataRelationshipsBuildBundle getBuildBundle() {
		return this.buildBundle;
	}

	public void setBetaAppClipInvocationLocalizations(
			BetaAppClipInvocationCreateRequestDataRelationshipsBetaAppClipInvocationLocalizations betaAppClipInvocationLocalizations) {
		this.betaAppClipInvocationLocalizations = betaAppClipInvocationLocalizations;
	}

	public void setBuildBundle(BetaAppClipInvocationCreateRequestDataRelationshipsBuildBundle buildBundle) {
		this.buildBundle = buildBundle;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppClipInvocationCreateRequestDataRelationships {\n");

		sb.append("    buildBundle: ").append(toIndentedString(this.buildBundle)).append("\n");
		sb.append("    betaAppClipInvocationLocalizations: ")
				.append(toIndentedString(this.betaAppClipInvocationLocalizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
