package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildBetaDetailAttributes implements Serializable {

	private static final long serialVersionUID = 4322932297954863511L;

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

	private Boolean autoNotifyEnabled;

	private ExternalBetaState externalBuildState;
	private InternalBetaState internalBuildState;

	public BuildBetaDetailAttributes autoNotifyEnabled(Boolean autoNotifyEnabled) {
		this.autoNotifyEnabled = autoNotifyEnabled;
		return this;
	}

	public BuildBetaDetailAttributes externalBuildState(ExternalBetaState externalBuildState) {
		this.externalBuildState = externalBuildState;
		return this;
	}

	/**
	 * Get externalBuildState
	 *
	 * @return externalBuildState
	 **/
	@JsonProperty("externalBuildState")
	public ExternalBetaState getExternalBuildState() {
		return this.externalBuildState;
	}

	/**
	 * Get internalBuildState
	 *
	 * @return internalBuildState
	 **/
	@JsonProperty("internalBuildState")
	public InternalBetaState getInternalBuildState() {
		return this.internalBuildState;
	}

	public BuildBetaDetailAttributes internalBuildState(InternalBetaState internalBuildState) {
		this.internalBuildState = internalBuildState;
		return this;
	}

	/**
	 * Get autoNotifyEnabled
	 *
	 * @return autoNotifyEnabled
	 **/
	@JsonProperty("autoNotifyEnabled")
	public Boolean isAutoNotifyEnabled() {
		return this.autoNotifyEnabled;
	}

	public void setAutoNotifyEnabled(Boolean autoNotifyEnabled) {
		this.autoNotifyEnabled = autoNotifyEnabled;
	}

	public void setExternalBuildState(ExternalBetaState externalBuildState) {
		this.externalBuildState = externalBuildState;
	}

	public void setInternalBuildState(InternalBetaState internalBuildState) {
		this.internalBuildState = internalBuildState;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BuildBetaDetailAttributes {\n");

		sb.append("    autoNotifyEnabled: ").append(toIndentedString(this.autoNotifyEnabled)).append("\n");
		sb.append("    internalBuildState: ").append(toIndentedString(this.internalBuildState)).append("\n");
		sb.append("    externalBuildState: ").append(toIndentedString(this.externalBuildState)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
