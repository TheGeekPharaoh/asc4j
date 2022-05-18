package net.odyssi.asc4j.model;

/**
 * Gets or Sets UserRole
 */
public enum UserRole {

	ACCESS_TO_REPORTS("ACCESS_TO_REPORTS"),

	ACCOUNT_HOLDER("ACCOUNT_HOLDER"),

	ADMIN("ADMIN"),

	APP_MANAGER("APP_MANAGER"),

	CLOUD_MANAGED_APP_DISTRIBUTION("CLOUD_MANAGED_APP_DISTRIBUTION"),

	CLOUD_MANAGED_DEVELOPER_ID("CLOUD_MANAGED_DEVELOPER_ID"),

	CREATE_APPS("CREATE_APPS"),

	CUSTOMER_SUPPORT("CUSTOMER_SUPPORT"),

	DEVELOPER("DEVELOPER"),

	FINANCE("FINANCE"),

	IMAGE_MANAGER("IMAGE_MANAGER"),

	MARKETING("MARKETING"),

	SALES("SALES");

	public static UserRole fromValue(String value) {
		for (UserRole b : UserRole.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

	private String value;

	UserRole(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(this.value);
	}

}
