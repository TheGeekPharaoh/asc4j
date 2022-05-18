package net.odyssi.asc4j.model;

/**
 * Gets or Sets CertificateType
 */
public enum CertificateType {

	DEVELOPER_ID_APPLICATION("DEVELOPER_ID_APPLICATION"),

	DEVELOPER_ID_KEXT("DEVELOPER_ID_KEXT"),

	DEVELOPMENT("DEVELOPMENT"),

	DISTRIBUTION("DISTRIBUTION"),

	IOS_DEVELOPMENT("IOS_DEVELOPMENT"),

	IOS_DISTRIBUTION("IOS_DISTRIBUTION"),

	MAC_APP_DEVELOPMENT("MAC_APP_DEVELOPMENT"),

	MAC_APP_DISTRIBUTION("MAC_APP_DISTRIBUTION"),

	MAC_INSTALLER_DISTRIBUTION("MAC_INSTALLER_DISTRIBUTION"),

	PASS_TYPE_ID("PASS_TYPE_ID"),

	PASS_TYPE_ID_WITH_NFC("PASS_TYPE_ID_WITH_NFC");

	public static CertificateType fromValue(String value) {
		for (CertificateType b : CertificateType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	CertificateType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
