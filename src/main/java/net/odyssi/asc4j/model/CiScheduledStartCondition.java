package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiScheduledStartCondition implements Serializable {

	private static final long serialVersionUID = -2184886821772790612L;

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

	private CiScheduledStartConditionSchedule schedule;
	private CiBranchPatterns source;

	/**
	 * Get schedule
	 *
	 * @return schedule
	 **/
	@JsonProperty("schedule")
	public CiScheduledStartConditionSchedule getSchedule() {
		return this.schedule;
	}

	/**
	 * Get source
	 *
	 * @return source
	 **/
	@JsonProperty("source")
	public CiBranchPatterns getSource() {
		return this.source;
	}

	public CiScheduledStartCondition schedule(CiScheduledStartConditionSchedule schedule) {
		this.schedule = schedule;
		return this;
	}

	public void setSchedule(CiScheduledStartConditionSchedule schedule) {
		this.schedule = schedule;
	}

	public void setSource(CiBranchPatterns source) {
		this.source = source;
	}

	public CiScheduledStartCondition source(CiBranchPatterns source) {
		this.source = source;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiScheduledStartCondition {\n");

		sb.append("    source: ").append(toIndentedString(this.source)).append("\n");
		sb.append("    schedule: ").append(toIndentedString(this.schedule)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
