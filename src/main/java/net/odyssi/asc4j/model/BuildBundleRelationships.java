package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildBundleRelationships implements Serializable {

	private static final long serialVersionUID = -6268369156951741263L;

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

	private BuildBundleRelationshipsAppClipDomainCacheStatus appClipDomainCacheStatus;

	private BuildBundleRelationshipsAppClipDomainCacheStatus appClipDomainDebugStatus;

	private BuildBundleRelationshipsBetaAppClipInvocations betaAppClipInvocations;
	private BuildBundleRelationshipsBuildBundleFileSizes buildBundleFileSizes;

	public BuildBundleRelationships appClipDomainCacheStatus(
			BuildBundleRelationshipsAppClipDomainCacheStatus appClipDomainCacheStatus) {
		this.appClipDomainCacheStatus = appClipDomainCacheStatus;
		return this;
	}

	public BuildBundleRelationships appClipDomainDebugStatus(
			BuildBundleRelationshipsAppClipDomainCacheStatus appClipDomainDebugStatus) {
		this.appClipDomainDebugStatus = appClipDomainDebugStatus;
		return this;
	}

	public BuildBundleRelationships betaAppClipInvocations(
			BuildBundleRelationshipsBetaAppClipInvocations betaAppClipInvocations) {
		this.betaAppClipInvocations = betaAppClipInvocations;
		return this;
	}

	public BuildBundleRelationships buildBundleFileSizes(
			BuildBundleRelationshipsBuildBundleFileSizes buildBundleFileSizes) {
		this.buildBundleFileSizes = buildBundleFileSizes;
		return this;
	}

	/**
	 * Get appClipDomainCacheStatus
	 *
	 * @return appClipDomainCacheStatus
	 **/
	@JsonProperty("appClipDomainCacheStatus")
	public BuildBundleRelationshipsAppClipDomainCacheStatus getAppClipDomainCacheStatus() {
		return this.appClipDomainCacheStatus;
	}

	/**
	 * Get appClipDomainDebugStatus
	 *
	 * @return appClipDomainDebugStatus
	 **/
	@JsonProperty("appClipDomainDebugStatus")
	public BuildBundleRelationshipsAppClipDomainCacheStatus getAppClipDomainDebugStatus() {
		return this.appClipDomainDebugStatus;
	}

	/**
	 * Get betaAppClipInvocations
	 *
	 * @return betaAppClipInvocations
	 **/
	@JsonProperty("betaAppClipInvocations")
	public BuildBundleRelationshipsBetaAppClipInvocations getBetaAppClipInvocations() {
		return this.betaAppClipInvocations;
	}

	/**
	 * Get buildBundleFileSizes
	 *
	 * @return buildBundleFileSizes
	 **/
	@JsonProperty("buildBundleFileSizes")
	public BuildBundleRelationshipsBuildBundleFileSizes getBuildBundleFileSizes() {
		return this.buildBundleFileSizes;
	}

	public void setAppClipDomainCacheStatus(BuildBundleRelationshipsAppClipDomainCacheStatus appClipDomainCacheStatus) {
		this.appClipDomainCacheStatus = appClipDomainCacheStatus;
	}

	public void setAppClipDomainDebugStatus(BuildBundleRelationshipsAppClipDomainCacheStatus appClipDomainDebugStatus) {
		this.appClipDomainDebugStatus = appClipDomainDebugStatus;
	}

	public void setBetaAppClipInvocations(BuildBundleRelationshipsBetaAppClipInvocations betaAppClipInvocations) {
		this.betaAppClipInvocations = betaAppClipInvocations;
	}

	public void setBuildBundleFileSizes(BuildBundleRelationshipsBuildBundleFileSizes buildBundleFileSizes) {
		this.buildBundleFileSizes = buildBundleFileSizes;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildBundleRelationships {\n");

		sb.append("    appClipDomainCacheStatus: ").append(toIndentedString(this.appClipDomainCacheStatus))
				.append("\n");
		sb.append("    appClipDomainDebugStatus: ").append(toIndentedString(this.appClipDomainDebugStatus))
				.append("\n");
		sb.append("    betaAppClipInvocations: ").append(toIndentedString(this.betaAppClipInvocations)).append("\n");
		sb.append("    buildBundleFileSizes: ").append(toIndentedString(this.buildBundleFileSizes)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
