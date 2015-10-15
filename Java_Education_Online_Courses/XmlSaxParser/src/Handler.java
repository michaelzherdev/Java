import java.util.HashMap;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Handler extends DefaultHandler{
	
	private int id;
	private String element;
	private Map<Integer, String> data = new HashMap<Integer, String>();

	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("start parsing...");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("end parsing...");
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		element = qName;
		if(element.equals("product")) {
			id = Integer.parseInt(attributes.getValue(0));
			if(element.equals("title")) element = qName;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		element = "";
		id=-1;
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(element.equals("title")){
			String str = new String(ch, start, length);
			data.put(id, str);
		}
	}

	public Map<Integer, String> getData(){
		return data;
	}
}
