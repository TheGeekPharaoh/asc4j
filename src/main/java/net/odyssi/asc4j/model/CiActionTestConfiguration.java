package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CiActionTestConfiguration implements Serializable {

	public enum KindEnum {

		SPECIFIC_TEST_PLANS(String.valueOf("SPECIFIC_TEST_PLANS")),
		USE_SCHEME_SETTINGS(String.valueOf("USE_SCHEME_SETTINGS"));

		public static KindEnum fromValue(String value) {
			for (KindEnum b : KindEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		KindEnum(String v) {
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

	private static final long serialVersionUID = -6953621340301370198L;

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

	private KindEnum kind;

	private List<CiTestDestination> testDestinations = null;
	private String testPlanName;

	public CiActionTestConfiguration addTestDestinationsItem(CiTestDestination testDestinationsItem) {
		this.testDestinations.add(testDestinationsItem);
		return this;
	}

	/**
	 * Get kind
	 *
	 * @return kind
	 **/
	@JsonProperty("kind")
	public String getKind() {
		if (this.kind == null) {
			return null;
		}
		return this.kind.value();
	}

	/**
	 * Get testDestinations
	 *
	 * @return testDestinations
	 **/
	@JsonProperty("testDestinations")
	public List<CiTestDestination> getTestDestinations() {
		return this.testDestinations;
	}

	/**
	 * Get testPlanName
	 *
	 * @return testPlanName
	 **/
	@JsonProperty("testPlanName")
	public String getTestPlanName() {
		return this.testPlanName;
	}

	public CiActionTestConfiguration kind(KindEnum kind) {
		this.kind = kind;
		return this;
	}

	public void setKind(KindEnum kind) {
		this.kind = kind;
	}

	public void setTestDestinations(List<CiTestDestination> testDestinations) {
		this.testDestinations = testDestinations;
	}

	public void setTestPlanName(String testPlanName) {
		this.testPlanName = testPlanName;
	}

	public CiActionTestConfiguration testDestinations(List<CiTestDestination> testDestinations) {
		this.testDestinations = testDestinations;
		return this;
	}

	public CiActionTestConfiguration testPlanName(String testPlanName) {
		this.testPlanName = testPlanName;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CiActionTestConfiguration {\n");

		sb.append("    kind: ").append(toIndentedString(this.kind)).append("\n");
		sb.append("    testPlanName: ").append(toIndentedString(this.testPlanName)).append("\n");
		sb.append("    testDestinations: ").append(toIndentedString(this.testDestinations)).append("\n");
		sb.append("}");
		return sb.toString();
	}
}
