package com.repeatedstrings.FamilyMembers;

import java.util.ArrayList;
import java.util.Iterator;

public class Families implements Iterable<Family> {
	private ArrayList<Family> theFamilyList;

	public ArrayList<Family> getFamilies() {
		return theFamilyList;
	}

	public ArrayList<Family> addFamilyToFamilies(Family family) {
		theFamilyList.add(family);
		return theFamilyList;
	}

	public Iterator iterator() {
		return theFamilyList.iterator();
	}
}
