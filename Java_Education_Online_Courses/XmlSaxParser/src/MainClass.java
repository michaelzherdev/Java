import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


public class MainClass {

	public static void main(String[] args){
		
		SAXParserFactory parserF = SAXParserFactory.newInstance();
		Handler handler = new Handler();
		try {
			SAXParser saxparser = parserF.newSAXParser();
			saxparser.parse(new File("src/myXMLFile.xml"), handler);
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Map<Integer, String> data = handler.getData();
		for(Map.Entry<Integer, String> m : data.entrySet()){
			
			System.out.println(m.getKey() + " - " + m.getValue());
		}
			
	}
	
}
