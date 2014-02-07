package com.repeatedstrings;

import java.io.IOException;
import java.io.StringReader;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class XmlParser {

	XmlParser() {

	}

	public void parseXML() throws XmlPullParserException, IOException {
		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
		factory.setNamespaceAware(true);

		XmlPullParser xpp = factory.newPullParser();
		
		 xpp.setInput(new StringReader ("<foo>Hello World!</foo>"));
         int eventType = xpp.getEventType();
         while (eventType != XmlPullParser.END_DOCUMENT) {
          if(eventType == XmlPullParser.START_DOCUMENT) {
              System.out.println("Start document");
          } else if(eventType == XmlPullParser.END_DOCUMENT) {
              System.out.println("End document");
          } else if(eventType == XmlPullParser.START_TAG) {
              System.out.println("Start tag "+xpp.getName());
          } else if(eventType == XmlPullParser.END_TAG) {
              System.out.println("End tag "+xpp.getName());
          } else if(eventType == XmlPullParser.TEXT) {
              System.out.println("Text "+xpp.getText());
          }
          eventType = xpp.next();
         }
//		File file = new File(Environment.getExternalStorageDirectory()
//				+ "FamilyChristmasList/family.xml");
//
//		// create an input stream to be read by the stream reader.
//		FileInputStream fis = new FileInputStream(file);
//		// set the input for the parser using an InputStreamReader
//		xpp.setInput(new InputStreamReader(fis));
//		int eventType = xpp.getEventType();
//		 Builder familyBuilder = new Family.Builder();
//		String nodeName = xpp.getName();
//		// layout for family tree
//		if (nodeName.contentEquals(FamilyXmlConstants.FAMILY.toString())) {
//			familyBuilder.uniqueId(xpp.get)
//
//		}

	}
}
