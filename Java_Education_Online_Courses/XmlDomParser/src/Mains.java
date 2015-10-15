import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Mains {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuider = factory.newDocumentBuilder();
		Document doc = documentBuider.parse(new File("src/file.xml"));
		
		String el = doc.getDocumentElement().getNodeName();
		System.out.println("el = " + el);

		NodeList nodeList = doc.getElementsByTagName("product");
		
		String title = "";
		int price = 0, amount = 0;
		int department = 0;
		System.out.println("D title		price	amount");
		for(int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			title = element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue();
			price = Integer.parseInt(element.getElementsByTagName("price").item(0).getChildNodes().item(0).getNodeValue());
			amount = Integer.parseInt(element.getElementsByTagName("amount").item(0).getChildNodes().item(0).getNodeValue());
			department = Integer.parseInt(element.getParentNode().getAttributes().getNamedItem("id").getNodeValue());
			
			System.out.println(department + " " + title + "	" + price + "	" + amount);
		}
	}

}
