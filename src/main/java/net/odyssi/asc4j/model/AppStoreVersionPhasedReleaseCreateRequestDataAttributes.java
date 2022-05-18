package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppStoreVersionPhasedReleaseCreateRequestDataAttributes implements Serializable {

	private static final long serialVersionUID = 6937970834242699013L;

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

	private PhasedReleaseState phasedReleaseState;

	/**
	 * Get phasedReleaseState
	 *
	 * @return phasedReleaseState
	 **/
	@JsonProperty("phasedReleaseState")
	public PhasedReleaseState getPhasedReleaseState() {
		return this.phasedReleaseState;
	}

	public AppStoreVersionPhasedReleaseCreateRequestDataAttributes phasedReleaseState(
			PhasedReleaseState phasedReleaseState) {
		this.phasedReleaseState = phasedReleaseState;
		return this;
	}

	public void setPhasedReleaseState(PhasedReleaseState phasedReleaseState) {
		this.phasedReleaseState = phasedReleaseState;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionPhasedReleaseCreateRequestDataAttributes {\n");

		sb.append("    phasedReleaseState: ").append(toIndentedString(this.phasedReleaseState)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
