package com.repeatedstrings.FamilyMembers;

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
	
	public FamilyMember(){}
	
	public static class Builder {
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

		public Builder memberId(String memberId) {
			this.memberId = memberId;
			return this;
		}

		public Builder memberFName(String memberFName) {
			this.memberFName = memberFName;
			return this;
		}

		public Builder memberLName(String memberLName) {
			this.memberLName = memberLName;
			return this;
		}
		public Builder memberGender(String memberGender) {
			this.memberGender = memberGender;
			return this;
		}
		public Builder memberIsAdult(Boolean memberIsAdult) {
			this.memberIsAdult = this.memberIsAdult;
			return this;
		}
		public Builder memberAge(int memberAge) {
			this.memberAge = memberAge;
			return this;
		}
		public Builder memberInterest1(String memberInterest1) {
			this.memberInterest1 = memberInterest1;
			return this;
		}
		public Builder memberInterest2(String memberInterest2) {
			this.memberInterest2 = memberInterest2;
			return this;
		}
		public Builder memberInterest3(String memberInterest3) {
			this.memberInterest3 = memberInterest3;
			return this;
		}
		public Builder amazonList(String amazonList) {
			this.amazonList = amazonList;
			return this;
		}
		public Builder dropboxInfo(String dropboxInfo) {
			this.dropboxInfo = dropboxInfo;
			return this;
		}
		public Builder memberDropboxUserName(String memberDropboxUserName) {
			this.memberDropboxUserName = memberDropboxUserName;
			return this;
		}
	}
	private FamilyMember(Builder builder) {
		memberId = builder.memberId;
		memberFName = builder.memberFName;
		memberLName = builder.memberLName;
		memberGender = builder.memberGender;
		memberIsAdult = builder.memberIsAdult;
		memberAge = builder.memberAge;
		memberInterest1 = builder.memberInterest1;
		memberInterest2 = builder.memberInterest2;
		memberInterest3 = builder.memberInterest3;
		amazonList = builder.amazonList;
		dropboxInfo = builder.dropboxInfo;
		memberDropboxUserName = builder.memberDropboxUserName;
	}

}
