package com.repeatedstrings;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import android.os.Environment;

public class XmlParser {

	XmlParser() {

	}

	public void parseXML() throws XmlPullParserException, IOException {
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);

		XmlPullParser xpp = factory.newPullParser();
		File file = new File(Environment.getExternalStorageDirectory()
				+ "FamilyChristmasList/family.xml");

		// create an input stream to be read by the stream reader.
		FileInputStream fis = new FileInputStream(file);
		// set the input for the parser using an InputStreamReader
		xpp.setInput(new InputStreamReader(fis));
		int eventType = xpp.getEventType();

		String nodeName = xpp.getName();
		// layout for family tree
//		if (nodeName.contentEquals(APPLICATIONS)) {
//
//		}

	}

}
