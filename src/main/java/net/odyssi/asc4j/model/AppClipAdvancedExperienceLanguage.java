package net.odyssi.asc4j.model;

/**
 * Gets or Sets AppClipAdvancedExperienceLanguage
 */
public enum AppClipAdvancedExperienceLanguage {

	AR("AR"),

	CA("CA"),

	CS("CS"),

	DA("DA"),

	DE("DE"),

	EL("EL"),

	EN("EN"),

	ES("ES"),

	FI("FI"),

	FR("FR"),

	HE("HE"),

	HI("HI"),

	HR("HR"),

	HU("HU"),

	ID("ID"),

	IT("IT"),

	JA("JA"),

	KO("KO"),

	MS("MS"),

	NL("NL"),

	NO("NO"),

	PL("PL"),

	PT("PT"),

	RO("RO"),

	RU("RU"),

	SK("SK"),

	SV("SV"),

	TH("TH"),

	TR("TR"),

	UK("UK"),

	VI("VI"),

	ZH("ZH");

	public static AppClipAdvancedExperienceLanguage fromValue(String value) {
		for (AppClipAdvancedExperienceLanguage b : AppClipAdvancedExperienceLanguage.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	AppClipAdvancedExperienceLanguage(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
