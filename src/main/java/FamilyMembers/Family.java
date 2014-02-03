package FamilyMembers;

public class Family {
	public int familyId;
	public String familyName;
	public String familyParentName1;
	public String familyParentName2;
	public String familyLastName;
	public int getFamilyId() {
		return familyId;
	}
	public Family setFamilyId(int familyId) {
		this.familyId = familyId;
		return this;
	}
	public String getFamilyName() {
		return familyName;
	}
	public Family setFamilyName(String familyName) {
		this.familyName = familyName;
		return this;
	}
	public String getFamilyParentName1() {
		return familyParentName1;
	}
	public Family setFamilyParentName1(String familyParentName1) {
		this.familyParentName1 = familyParentName1;
		return this;
	}
	public String getFamilyParentName2() {
		return familyParentName2;
	}
	public Family setFamilyParentName2(String familyParentName2) {
		this.familyParentName2 = familyParentName2;
		return this;
	}
	public String getFamilyLastName() {
		return familyLastName;
	}
	public Family setFamilyLastName(String familyLastName) {
		this.familyLastName = familyLastName;
		return this;
	}
}
