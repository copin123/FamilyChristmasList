package FamilyMembers;

public class FamilyMember {
	public String memberId;
	public String memberFName;
	public String memberLName;
	public String memberGender;
	public boolean memberIsAdult;
	public int memberAge;
	public String memberInterest1;
	public String memberInterest2;
	public String memberInterest3;
	public String amazonList;
	public String dropboxInfo;
	public String memberDropboxUserName;

	public FamilyMember() {
	}

	public String getMemberId() {
		return memberId;
	}

	public FamilyMember setMemberId(String memberId) {
		this.memberId = memberId;
		return this;
	}

	public String getMemberFName() {
		return memberFName;
	}

	public FamilyMember setMemberFName(String memberFName) {
		this.memberFName = memberFName;
		return this;
	}

	public String getMemberLName() {
		return memberLName;
	}

	public FamilyMember setMemberLName(String memberLName) {
		this.memberLName = memberLName;
		return this;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public FamilyMember setMemberGender(String memberGender) {
		this.memberGender = memberGender;
		return this;
	}

	public boolean isMemberIsAdult() {
		return memberIsAdult;
	}

	public FamilyMember setMemberIsAdult(boolean memberIsAdult) {
		this.memberIsAdult = memberIsAdult;
		return this;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public FamilyMember setMemberAge(int memberAge) {
		this.memberAge = memberAge;
		return this;
	}

	public String getMemberInterest1() {
		return memberInterest1;
	}

	public FamilyMember setMemberInterest1(String memberInterest1) {
		this.memberInterest1 = memberInterest1;
		return this;
	}

	public String getMemberInterest2() {
		return memberInterest2;
	}

	public FamilyMember setMemberInterest2(String memberInterest2) {
		this.memberInterest2 = memberInterest2;
		return this;
	}

	public String getMemberInterest3() {
		return memberInterest3;
	}

	public FamilyMember setMemberInterest3(String memberInterest3) {
		this.memberInterest3 = memberInterest3;
		return this;
	}

	public String getAmazonList() {
		return amazonList;
	}

	public FamilyMember setAmazonList(String amazonList) {
		this.amazonList = amazonList;
		return this;
	}

	public String getDropboxInfo() {
		return dropboxInfo;
	}

	public FamilyMember setDropboxInfo(String dropboxInfo) {
		this.dropboxInfo = dropboxInfo;
		return this;
	}

	public String getMemberDropboxUserName() {
		return memberDropboxUserName;
	}

	public FamilyMember setMemberDropboxUserName(String memberDropboxUserName) {
		this.memberDropboxUserName = memberDropboxUserName;
		return this;
	}

}
