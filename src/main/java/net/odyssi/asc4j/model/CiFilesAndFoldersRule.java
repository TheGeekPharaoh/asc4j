package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiFilesAndFoldersRule implements Serializable {

	public enum ModeEnum {

		DO_NOT_START_IF_ALL_FILES_MATCH(String.valueOf("DO_NOT_START_IF_ALL_FILES_MATCH")),
		START_IF_ANY_FILE_MATCHES(String.valueOf("START_IF_ANY_FILE_MATCHES"));

		public static ModeEnum fromValue(String value) {
			for (ModeEnum b : ModeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ModeEnum(String v) {
			this.value = v;
		}

		@Override
		public String toString() {
			return String.valueOf(this.value);
		}

		public String value() {
			return this.value;
		}
	}

	private static final long serialVersionUID = -4608012503842901532L;

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

	private List<CiStartConditionFileMatcher> matchers = null;
	private ModeEnum mode;

	public CiFilesAndFoldersRule addMatchersItem(CiStartConditionFileMatcher matchersItem) {
		this.matchers.add(matchersItem);
		return this;
	}

	/**
	 * Get matchers
	 *
	 * @return matchers
	 **/
	@JsonProperty("matchers")
	public List<CiStartConditionFileMatcher> getMatchers() {
		return this.matchers;
	}

	/**
	 * Get mode
	 *
	 * @return mode
	 **/
	@JsonProperty("mode")
	public String getMode() {
		if (this.mode == null) {
			return null;
		}
		return this.mode.value();
	}

	public CiFilesAndFoldersRule matchers(List<CiStartConditionFileMatcher> matchers) {
		this.matchers = matchers;
		return this;
	}

	public CiFilesAndFoldersRule mode(ModeEnum mode) {
		this.mode = mode;
		return this;
	}

	public void setMatchers(List<CiStartConditionFileMatcher> matchers) {
		this.matchers = matchers;
	}

	public void setMode(ModeEnum mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiFilesAndFoldersRule {\n");

		sb.append("    mode: ").append(toIndentedString(this.mode)).append("\n");
		sb.append("    matchers: ").append(toIndentedString(this.matchers)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
