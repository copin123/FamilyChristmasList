package FamilyMembers;

public enum FamilyXmlConstants {
	FAMILY("FAMILY"),UNIQUE_ID("UNIQUE_ID"),	FAMILY_ID("FAMILY_ID"), FAMILY_NAME("FAMILY_NAME"), FAMILY_PARENT_NAME_1(
			"FAMILY_PARENT_NAME_2"), FAMILY_PARENT_NAME_2(
			"FAMILY_PARENT_NAME_2"), FAMILY_LAST_NAME("FAMILY_LAST_NAME"), 
	FAMILY_MEMBER("FAMILY_MEMBER"),MEMBER_ID("MEMBER_ID"), MEMBER_F_NAME("MEMBER_F_NAME"), MEMBER_L_NAME(
			"MEMBER_L_NAME"), MEMBER_GENDER("MEMBER_GENDER"), MEMBER_IS_ADULT(
			"MEMBER_IS_ADULT"), MEMBER_AGE("MEMBER_AGE"), MEMBER_INTEREST_1(
			"MEMBER_INTEREST_1"), MEMBER_INTEREST_2("MEMBER_INTEREST_2"), MEMBER_INTEREST_3(
			"MEMBER_INTEREST_3"), AMAZON_LIST("AMAZON_LIST"), DROPBOX_INFO(
			"DROPBOX_INFO"), MEMBER_DROPBOX_USER_NAME(
			"MEMBER_DROPBOX_USER_NAME");
	private String familyXmlConstant;

	private FamilyXmlConstants(String familyXmlConstant) {
		this.familyXmlConstant = familyXmlConstant;

	}
}
