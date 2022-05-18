package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppClipInvocationRelationships implements Serializable {

	private static final long serialVersionUID = 2115444078067715612L;

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

	private BetaAppClipInvocationRelationshipsBetaAppClipInvocationLocalizations betaAppClipInvocationLocalizations;

	public BetaAppClipInvocationRelationships betaAppClipInvocationLocalizations(
			BetaAppClipInvocationRelationshipsBetaAppClipInvocationLocalizations betaAppClipInvocationLocalizations) {
		this.betaAppClipInvocationLocalizations = betaAppClipInvocationLocalizations;
		return this;
	}

	/**
	 * Get betaAppClipInvocationLocalizations
	 *
	 * @return betaAppClipInvocationLocalizations
	 **/
	@JsonProperty("betaAppClipInvocationLocalizations")
	public BetaAppClipInvocationRelationshipsBetaAppClipInvocationLocalizations getBetaAppClipInvocationLocalizations() {
		return this.betaAppClipInvocationLocalizations;
	}

	public void setBetaAppClipInvocationLocalizations(
			BetaAppClipInvocationRelationshipsBetaAppClipInvocationLocalizations betaAppClipInvocationLocalizations) {
		this.betaAppClipInvocationLocalizations = betaAppClipInvocationLocalizations;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppClipInvocationRelationships {\n");

		sb.append("    betaAppClipInvocationLocalizations: ")
				.append(toIndentedString(this.betaAppClipInvocationLocalizations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
