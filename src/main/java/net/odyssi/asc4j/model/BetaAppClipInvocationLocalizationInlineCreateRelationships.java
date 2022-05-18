package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaAppClipInvocationLocalizationInlineCreateRelationships implements Serializable {

	private static final long serialVersionUID = -4475553662824787298L;

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

	private BetaAppClipInvocationLocalizationInlineCreateRelationshipsBetaAppClipInvocation betaAppClipInvocation;

	public BetaAppClipInvocationLocalizationInlineCreateRelationships betaAppClipInvocation(
			BetaAppClipInvocationLocalizationInlineCreateRelationshipsBetaAppClipInvocation betaAppClipInvocation) {
		this.betaAppClipInvocation = betaAppClipInvocation;
		return this;
	}

	/**
	 * Get betaAppClipInvocation
	 *
	 * @return betaAppClipInvocation
	 **/
	@JsonProperty("betaAppClipInvocation")
	public BetaAppClipInvocationLocalizationInlineCreateRelationshipsBetaAppClipInvocation getBetaAppClipInvocation() {
		return this.betaAppClipInvocation;
	}

	public void setBetaAppClipInvocation(
			BetaAppClipInvocationLocalizationInlineCreateRelationshipsBetaAppClipInvocation betaAppClipInvocation) {
		this.betaAppClipInvocation = betaAppClipInvocation;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaAppClipInvocationLocalizationInlineCreateRelationships {\n");

		sb.append("    betaAppClipInvocation: ").append(toIndentedString(this.betaAppClipInvocation)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
