package net.odyssi.asc4j.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgeRatingDeclarationAttributes implements Serializable {

	public enum AlcoholTobaccoOrDrugUseOrReferencesEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static AlcoholTobaccoOrDrugUseOrReferencesEnum fromValue(String value) {
			for (AlcoholTobaccoOrDrugUseOrReferencesEnum b : AlcoholTobaccoOrDrugUseOrReferencesEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		AlcoholTobaccoOrDrugUseOrReferencesEnum(String v) {
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

	public enum ContestsEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static ContestsEnum fromValue(String value) {
			for (ContestsEnum b : ContestsEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ContestsEnum(String v) {
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

	public enum GamblingSimulatedEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static GamblingSimulatedEnum fromValue(String value) {
			for (GamblingSimulatedEnum b : GamblingSimulatedEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		GamblingSimulatedEnum(String v) {
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

	public enum HorrorOrFearThemesEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static HorrorOrFearThemesEnum fromValue(String value) {
			for (HorrorOrFearThemesEnum b : HorrorOrFearThemesEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		HorrorOrFearThemesEnum(String v) {
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

	public enum MatureOrSuggestiveThemesEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static MatureOrSuggestiveThemesEnum fromValue(String value) {
			for (MatureOrSuggestiveThemesEnum b : MatureOrSuggestiveThemesEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		MatureOrSuggestiveThemesEnum(String v) {
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

	public enum MedicalOrTreatmentInformationEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static MedicalOrTreatmentInformationEnum fromValue(String value) {
			for (MedicalOrTreatmentInformationEnum b : MedicalOrTreatmentInformationEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		MedicalOrTreatmentInformationEnum(String v) {
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

	public enum ProfanityOrCrudeHumorEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static ProfanityOrCrudeHumorEnum fromValue(String value) {
			for (ProfanityOrCrudeHumorEnum b : ProfanityOrCrudeHumorEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ProfanityOrCrudeHumorEnum(String v) {
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

	public enum SexualContentGraphicAndNudityEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static SexualContentGraphicAndNudityEnum fromValue(String value) {
			for (SexualContentGraphicAndNudityEnum b : SexualContentGraphicAndNudityEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		SexualContentGraphicAndNudityEnum(String v) {
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

	public enum SexualContentOrNudityEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static SexualContentOrNudityEnum fromValue(String value) {
			for (SexualContentOrNudityEnum b : SexualContentOrNudityEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		SexualContentOrNudityEnum(String v) {
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

	public enum ViolenceCartoonOrFantasyEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static ViolenceCartoonOrFantasyEnum fromValue(String value) {
			for (ViolenceCartoonOrFantasyEnum b : ViolenceCartoonOrFantasyEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ViolenceCartoonOrFantasyEnum(String v) {
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

	public enum ViolenceRealisticEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static ViolenceRealisticEnum fromValue(String value) {
			for (ViolenceRealisticEnum b : ViolenceRealisticEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ViolenceRealisticEnum(String v) {
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

	public enum ViolenceRealisticProlongedGraphicOrSadisticEnum {

		FREQUENT_OR_INTENSE(String.valueOf("FREQUENT_OR_INTENSE")),
		INFREQUENT_OR_MILD(String.valueOf("INFREQUENT_OR_MILD")), NONE(String.valueOf("NONE"));

		public static ViolenceRealisticProlongedGraphicOrSadisticEnum fromValue(String value) {
			for (ViolenceRealisticProlongedGraphicOrSadisticEnum b : ViolenceRealisticProlongedGraphicOrSadisticEnum
					.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException("Unexpected value '" + value + "'");
		}

		private String value;

		ViolenceRealisticProlongedGraphicOrSadisticEnum(String v) {
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

	private static final long serialVersionUID = 6169748031193803281L;

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

	private AlcoholTobaccoOrDrugUseOrReferencesEnum alcoholTobaccoOrDrugUseOrReferences;

	private ContestsEnum contests;

	private Boolean gambling;

	private Boolean gamblingAndContests;

	private GamblingSimulatedEnum gamblingSimulated;

	private HorrorOrFearThemesEnum horrorOrFearThemes;

	private KidsAgeBand kidsAgeBand;

	private MatureOrSuggestiveThemesEnum matureOrSuggestiveThemes;

	private MedicalOrTreatmentInformationEnum medicalOrTreatmentInformation;

	private ProfanityOrCrudeHumorEnum profanityOrCrudeHumor;

	private Boolean seventeenPlus;

	private SexualContentGraphicAndNudityEnum sexualContentGraphicAndNudity;

	private SexualContentOrNudityEnum sexualContentOrNudity;

	private Boolean unrestrictedWebAccess;

	private ViolenceCartoonOrFantasyEnum violenceCartoonOrFantasy;

	private ViolenceRealisticEnum violenceRealistic;
	private ViolenceRealisticProlongedGraphicOrSadisticEnum violenceRealisticProlongedGraphicOrSadistic;

	public AgeRatingDeclarationAttributes alcoholTobaccoOrDrugUseOrReferences(
			AlcoholTobaccoOrDrugUseOrReferencesEnum alcoholTobaccoOrDrugUseOrReferences) {
		this.alcoholTobaccoOrDrugUseOrReferences = alcoholTobaccoOrDrugUseOrReferences;
		return this;
	}

	public AgeRatingDeclarationAttributes contests(ContestsEnum contests) {
		this.contests = contests;
		return this;
	}

	public AgeRatingDeclarationAttributes gambling(Boolean gambling) {
		this.gambling = gambling;
		return this;
	}

	public AgeRatingDeclarationAttributes gamblingAndContests(Boolean gamblingAndContests) {
		this.gamblingAndContests = gamblingAndContests;
		return this;
	}

	public AgeRatingDeclarationAttributes gamblingSimulated(GamblingSimulatedEnum gamblingSimulated) {
		this.gamblingSimulated = gamblingSimulated;
		return this;
	}

	/**
	 * Get alcoholTobaccoOrDrugUseOrReferences
	 *
	 * @return alcoholTobaccoOrDrugUseOrReferences
	 **/
	@JsonProperty("alcoholTobaccoOrDrugUseOrReferences")
	public String getAlcoholTobaccoOrDrugUseOrReferences() {
		if (this.alcoholTobaccoOrDrugUseOrReferences == null) {
			return null;
		}
		return this.alcoholTobaccoOrDrugUseOrReferences.value();
	}

	/**
	 * Get contests
	 *
	 * @return contests
	 **/
	@JsonProperty("contests")
	public String getContests() {
		if (this.contests == null) {
			return null;
		}
		return this.contests.value();
	}

	/**
	 * Get gamblingSimulated
	 *
	 * @return gamblingSimulated
	 **/
	@JsonProperty("gamblingSimulated")
	public String getGamblingSimulated() {
		if (this.gamblingSimulated == null) {
			return null;
		}
		return this.gamblingSimulated.value();
	}

	/**
	 * Get horrorOrFearThemes
	 *
	 * @return horrorOrFearThemes
	 **/
	@JsonProperty("horrorOrFearThemes")
	public String getHorrorOrFearThemes() {
		if (this.horrorOrFearThemes == null) {
			return null;
		}
		return this.horrorOrFearThemes.value();
	}

	/**
	 * Get kidsAgeBand
	 *
	 * @return kidsAgeBand
	 **/
	@JsonProperty("kidsAgeBand")
	public KidsAgeBand getKidsAgeBand() {
		return this.kidsAgeBand;
	}

	/**
	 * Get matureOrSuggestiveThemes
	 *
	 * @return matureOrSuggestiveThemes
	 **/
	@JsonProperty("matureOrSuggestiveThemes")
	public String getMatureOrSuggestiveThemes() {
		if (this.matureOrSuggestiveThemes == null) {
			return null;
		}
		return this.matureOrSuggestiveThemes.value();
	}

	/**
	 * Get medicalOrTreatmentInformation
	 *
	 * @return medicalOrTreatmentInformation
	 **/
	@JsonProperty("medicalOrTreatmentInformation")
	public String getMedicalOrTreatmentInformation() {
		if (this.medicalOrTreatmentInformation == null) {
			return null;
		}
		return this.medicalOrTreatmentInformation.value();
	}

	/**
	 * Get profanityOrCrudeHumor
	 *
	 * @return profanityOrCrudeHumor
	 **/
	@JsonProperty("profanityOrCrudeHumor")
	public String getProfanityOrCrudeHumor() {
		if (this.profanityOrCrudeHumor == null) {
			return null;
		}
		return this.profanityOrCrudeHumor.value();
	}

	/**
	 * Get sexualContentGraphicAndNudity
	 *
	 * @return sexualContentGraphicAndNudity
	 **/
	@JsonProperty("sexualContentGraphicAndNudity")
	public String getSexualContentGraphicAndNudity() {
		if (this.sexualContentGraphicAndNudity == null) {
			return null;
		}
		return this.sexualContentGraphicAndNudity.value();
	}

	/**
	 * Get sexualContentOrNudity
	 *
	 * @return sexualContentOrNudity
	 **/
	@JsonProperty("sexualContentOrNudity")
	public String getSexualContentOrNudity() {
		if (this.sexualContentOrNudity == null) {
			return null;
		}
		return this.sexualContentOrNudity.value();
	}

	/**
	 * Get violenceCartoonOrFantasy
	 *
	 * @return violenceCartoonOrFantasy
	 **/
	@JsonProperty("violenceCartoonOrFantasy")
	public String getViolenceCartoonOrFantasy() {
		if (this.violenceCartoonOrFantasy == null) {
			return null;
		}
		return this.violenceCartoonOrFantasy.value();
	}

	/**
	 * Get violenceRealistic
	 *
	 * @return violenceRealistic
	 **/
	@JsonProperty("violenceRealistic")
	public String getViolenceRealistic() {
		if (this.violenceRealistic == null) {
			return null;
		}
		return this.violenceRealistic.value();
	}

	/**
	 * Get violenceRealisticProlongedGraphicOrSadistic
	 *
	 * @return violenceRealisticProlongedGraphicOrSadistic
	 **/
	@JsonProperty("violenceRealisticProlongedGraphicOrSadistic")
	public String getViolenceRealisticProlongedGraphicOrSadistic() {
		if (this.violenceRealisticProlongedGraphicOrSadistic == null) {
			return null;
		}
		return this.violenceRealisticProlongedGraphicOrSadistic.value();
	}

	public AgeRatingDeclarationAttributes horrorOrFearThemes(HorrorOrFearThemesEnum horrorOrFearThemes) {
		this.horrorOrFearThemes = horrorOrFearThemes;
		return this;
	}

	/**
	 * Get gambling
	 *
	 * @return gambling
	 **/
	@JsonProperty("gambling")
	public Boolean isGambling() {
		return this.gambling;
	}

	/**
	 * Get gamblingAndContests
	 *
	 * @return gamblingAndContests
	 **/
	@JsonProperty("gamblingAndContests")
	public Boolean isGamblingAndContests() {
		return this.gamblingAndContests;
	}

	/**
	 * Get seventeenPlus
	 *
	 * @return seventeenPlus
	 **/
	@JsonProperty("seventeenPlus")
	public Boolean isSeventeenPlus() {
		return this.seventeenPlus;
	}

	/**
	 * Get unrestrictedWebAccess
	 *
	 * @return unrestrictedWebAccess
	 **/
	@JsonProperty("unrestrictedWebAccess")
	public Boolean isUnrestrictedWebAccess() {
		return this.unrestrictedWebAccess;
	}

	public AgeRatingDeclarationAttributes kidsAgeBand(KidsAgeBand kidsAgeBand) {
		this.kidsAgeBand = kidsAgeBand;
		return this;
	}

	public AgeRatingDeclarationAttributes matureOrSuggestiveThemes(
			MatureOrSuggestiveThemesEnum matureOrSuggestiveThemes) {
		this.matureOrSuggestiveThemes = matureOrSuggestiveThemes;
		return this;
	}

	public AgeRatingDeclarationAttributes medicalOrTreatmentInformation(
			MedicalOrTreatmentInformationEnum medicalOrTreatmentInformation) {
		this.medicalOrTreatmentInformation = medicalOrTreatmentInformation;
		return this;
	}

	public AgeRatingDeclarationAttributes profanityOrCrudeHumor(ProfanityOrCrudeHumorEnum profanityOrCrudeHumor) {
		this.profanityOrCrudeHumor = profanityOrCrudeHumor;
		return this;
	}

	public void setAlcoholTobaccoOrDrugUseOrReferences(
			AlcoholTobaccoOrDrugUseOrReferencesEnum alcoholTobaccoOrDrugUseOrReferences) {
		this.alcoholTobaccoOrDrugUseOrReferences = alcoholTobaccoOrDrugUseOrReferences;
	}

	public void setContests(ContestsEnum contests) {
		this.contests = contests;
	}

	public void setGambling(Boolean gambling) {
		this.gambling = gambling;
	}

	public void setGamblingAndContests(Boolean gamblingAndContests) {
		this.gamblingAndContests = gamblingAndContests;
	}

	public void setGamblingSimulated(GamblingSimulatedEnum gamblingSimulated) {
		this.gamblingSimulated = gamblingSimulated;
	}

	public void setHorrorOrFearThemes(HorrorOrFearThemesEnum horrorOrFearThemes) {
		this.horrorOrFearThemes = horrorOrFearThemes;
	}

	public void setKidsAgeBand(KidsAgeBand kidsAgeBand) {
		this.kidsAgeBand = kidsAgeBand;
	}

	public void setMatureOrSuggestiveThemes(MatureOrSuggestiveThemesEnum matureOrSuggestiveThemes) {
		this.matureOrSuggestiveThemes = matureOrSuggestiveThemes;
	}

	public void setMedicalOrTreatmentInformation(MedicalOrTreatmentInformationEnum medicalOrTreatmentInformation) {
		this.medicalOrTreatmentInformation = medicalOrTreatmentInformation;
	}

	public void setProfanityOrCrudeHumor(ProfanityOrCrudeHumorEnum profanityOrCrudeHumor) {
		this.profanityOrCrudeHumor = profanityOrCrudeHumor;
	}

	public void setSeventeenPlus(Boolean seventeenPlus) {
		this.seventeenPlus = seventeenPlus;
	}

	public void setSexualContentGraphicAndNudity(SexualContentGraphicAndNudityEnum sexualContentGraphicAndNudity) {
		this.sexualContentGraphicAndNudity = sexualContentGraphicAndNudity;
	}

	public void setSexualContentOrNudity(SexualContentOrNudityEnum sexualContentOrNudity) {
		this.sexualContentOrNudity = sexualContentOrNudity;
	}

	public void setUnrestrictedWebAccess(Boolean unrestrictedWebAccess) {
		this.unrestrictedWebAccess = unrestrictedWebAccess;
	}

	public void setViolenceCartoonOrFantasy(ViolenceCartoonOrFantasyEnum violenceCartoonOrFantasy) {
		this.violenceCartoonOrFantasy = violenceCartoonOrFantasy;
	}

	public void setViolenceRealistic(ViolenceRealisticEnum violenceRealistic) {
		this.violenceRealistic = violenceRealistic;
	}

	public void setViolenceRealisticProlongedGraphicOrSadistic(
			ViolenceRealisticProlongedGraphicOrSadisticEnum violenceRealisticProlongedGraphicOrSadistic) {
		this.violenceRealisticProlongedGraphicOrSadistic = violenceRealisticProlongedGraphicOrSadistic;
	}

	public AgeRatingDeclarationAttributes seventeenPlus(Boolean seventeenPlus) {
		this.seventeenPlus = seventeenPlus;
		return this;
	}

	public AgeRatingDeclarationAttributes sexualContentGraphicAndNudity(
			SexualContentGraphicAndNudityEnum sexualContentGraphicAndNudity) {
		this.sexualContentGraphicAndNudity = sexualContentGraphicAndNudity;
		return this;
	}

	public AgeRatingDeclarationAttributes sexualContentOrNudity(SexualContentOrNudityEnum sexualContentOrNudity) {
		this.sexualContentOrNudity = sexualContentOrNudity;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AgeRatingDeclarationAttributes {\n");

		sb.append("    alcoholTobaccoOrDrugUseOrReferences: ")
				.append(toIndentedString(this.alcoholTobaccoOrDrugUseOrReferences)).append("\n");
		sb.append("    contests: ").append(toIndentedString(this.contests)).append("\n");
		sb.append("    gamblingAndContests: ").append(toIndentedString(this.gamblingAndContests)).append("\n");
		sb.append("    gambling: ").append(toIndentedString(this.gambling)).append("\n");
		sb.append("    gamblingSimulated: ").append(toIndentedString(this.gamblingSimulated)).append("\n");
		sb.append("    kidsAgeBand: ").append(toIndentedString(this.kidsAgeBand)).append("\n");
		sb.append("    medicalOrTreatmentInformation: ").append(toIndentedString(this.medicalOrTreatmentInformation))
				.append("\n");
		sb.append("    profanityOrCrudeHumor: ").append(toIndentedString(this.profanityOrCrudeHumor)).append("\n");
		sb.append("    sexualContentGraphicAndNudity: ").append(toIndentedString(this.sexualContentGraphicAndNudity))
				.append("\n");
		sb.append("    sexualContentOrNudity: ").append(toIndentedString(this.sexualContentOrNudity)).append("\n");
		sb.append("    seventeenPlus: ").append(toIndentedString(this.seventeenPlus)).append("\n");
		sb.append("    horrorOrFearThemes: ").append(toIndentedString(this.horrorOrFearThemes)).append("\n");
		sb.append("    matureOrSuggestiveThemes: ").append(toIndentedString(this.matureOrSuggestiveThemes))
				.append("\n");
		sb.append("    unrestrictedWebAccess: ").append(toIndentedString(this.unrestrictedWebAccess)).append("\n");
		sb.append("    violenceCartoonOrFantasy: ").append(toIndentedString(this.violenceCartoonOrFantasy))
				.append("\n");
		sb.append("    violenceRealisticProlongedGraphicOrSadistic: ")
				.append(toIndentedString(this.violenceRealisticProlongedGraphicOrSadistic)).append("\n");
		sb.append("    violenceRealistic: ").append(toIndentedString(this.violenceRealistic)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	public AgeRatingDeclarationAttributes unrestrictedWebAccess(Boolean unrestrictedWebAccess) {
		this.unrestrictedWebAccess = unrestrictedWebAccess;
		return this;
	}

	public AgeRatingDeclarationAttributes violenceCartoonOrFantasy(
			ViolenceCartoonOrFantasyEnum violenceCartoonOrFantasy) {
		this.violenceCartoonOrFantasy = violenceCartoonOrFantasy;
		return this;
	}

	public AgeRatingDeclarationAttributes violenceRealistic(ViolenceRealisticEnum violenceRealistic) {
		this.violenceRealistic = violenceRealistic;
		return this;
	}

	public AgeRatingDeclarationAttributes violenceRealisticProlongedGraphicOrSadistic(
			ViolenceRealisticProlongedGraphicOrSadisticEnum violenceRealisticProlongedGraphicOrSadistic) {
		this.violenceRealisticProlongedGraphicOrSadistic = violenceRealisticProlongedGraphicOrSadistic;
		return this;
	}
}
