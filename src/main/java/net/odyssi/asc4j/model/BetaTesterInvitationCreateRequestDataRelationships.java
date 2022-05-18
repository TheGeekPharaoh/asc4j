package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BetaTesterInvitationCreateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = 6754353758180734992L;

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
	private BetaTesterInvitationCreateRequestDataRelationshipsBetaTester betaTester;

	public BetaTesterInvitationCreateRequestDataRelationships app(
			AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public BetaTesterInvitationCreateRequestDataRelationships betaTester(
			BetaTesterInvitationCreateRequestDataRelationshipsBetaTester betaTester) {
		this.betaTester = betaTester;
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
	 * Get betaTester
	 *
	 * @return betaTester
	 **/
	@JsonProperty("betaTester")
	public BetaTesterInvitationCreateRequestDataRelationshipsBetaTester getBetaTester() {
		return this.betaTester;
	}

	public void setApp(AppCustomProductPageCreateRequestDataRelationshipsApp app) {
		this.app = app;
	}

	public void setBetaTester(BetaTesterInvitationCreateRequestDataRelationshipsBetaTester betaTester) {
		this.betaTester = betaTester;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BetaTesterInvitationCreateRequestDataRelationships {\n");

		sb.append("    betaTester: ").append(toIndentedString(this.betaTester)).append("\n");
		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
