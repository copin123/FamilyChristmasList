package FamilyMembers;

import java.util.ArrayList;

public class Family {
	public String uniqueId;
	public int familyId;
	public String familyName;
	public String familyParentName1;
	public String familyParentName2;
	public String familyLastName;
	public ArrayList<FamilyMember> familyMembers;

	public static class Builder {
		public String uniqueId;
		public int familyId;
		public String familyName;
		public String familyParentName1;
		public String familyParentName2;
		public String familyLastName;

		public Builder uniqueId(String uniqueId) {
			this.uniqueId = uniqueId;
			return this;
		}
		public Builder familyId(int familyId) {
			this.familyId = familyId;
			return this;
		}

		public Builder familyName(String familyName) {
			this.familyName = familyName;
			return this;
		}

		public Builder familyParentName1(String familyParentName1) {
			this.familyParentName1 = familyParentName1;
			return this;
		}

		public Builder familyParentName2(String familyParentName2) {
			this.familyParentName2 = familyParentName2;
			return this;
		}

		public Builder familyLastName(String familyLastName) {
			this.familyLastName = familyLastName;
			return this;
		}

		public Family build() {
			return new Family(this);
		}

	}

	private Family(Builder builder) {
		uniqueId = builder.uniqueId;
		familyId = builder.familyId;
		familyName = builder.familyName;
		familyParentName1 = builder.familyParentName1;
		familyParentName2 = builder.familyParentName2;
		familyLastName = builder.familyLastName;
	}
}
