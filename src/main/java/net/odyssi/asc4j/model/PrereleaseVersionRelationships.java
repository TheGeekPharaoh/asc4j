package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrereleaseVersionRelationships implements Serializable {

	private static final long serialVersionUID = -1209954413870985404L;

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
	private AppRelationshipsBuilds builds;

	public PrereleaseVersionRelationships app(AppClipRelationshipsApp app) {
		this.app = app;
		return this;
	}

	public PrereleaseVersionRelationships builds(AppRelationshipsBuilds builds) {
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

	public void setBuilds(AppRelationshipsBuilds builds) {
		this.builds = builds;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PrereleaseVersionRelationships {\n");

		sb.append("    builds: ").append(toIndentedString(this.builds)).append("\n");
		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
