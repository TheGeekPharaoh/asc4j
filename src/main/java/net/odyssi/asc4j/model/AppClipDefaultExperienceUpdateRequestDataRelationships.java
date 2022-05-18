package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppClipDefaultExperienceUpdateRequestDataRelationships implements Serializable {

	private static final long serialVersionUID = -7406032452300058879L;

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

	private AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion;

	/**
	 * Get releaseWithAppStoreVersion
	 *
	 * @return releaseWithAppStoreVersion
	 **/
	@JsonProperty("releaseWithAppStoreVersion")
	public AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion getReleaseWithAppStoreVersion() {
		return this.releaseWithAppStoreVersion;
	}

	public AppClipDefaultExperienceUpdateRequestDataRelationships releaseWithAppStoreVersion(
			AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion) {
		this.releaseWithAppStoreVersion = releaseWithAppStoreVersion;
		return this;
	}

	public void setReleaseWithAppStoreVersion(
			AppClipDefaultExperienceCreateRequestDataRelationshipsReleaseWithAppStoreVersion releaseWithAppStoreVersion) {
		this.releaseWithAppStoreVersion = releaseWithAppStoreVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppClipDefaultExperienceUpdateRequestDataRelationships {\n");

		sb.append("    releaseWithAppStoreVersion: ").append(toIndentedString(this.releaseWithAppStoreVersion))
				.append("\n");
		sb.append("}");
		return sb.toString();
	}
}
