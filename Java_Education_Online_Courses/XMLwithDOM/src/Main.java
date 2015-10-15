import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuider = factory.newDocumentBuilder();
		
		Document doc = documentBuider.newDocument();
		
		Element marketEl = doc.createElement("market");
		doc.appendChild(marketEl);
		
		Element departmentEl = doc.createElement("department");
		Attr attrDepartment = doc.createAttribute("id");
		attrDepartment.setValue("1");
		departmentEl.setAttributeNode(attrDepartment);
		marketEl.appendChild(departmentEl);
		
		Element productEl = doc.createElement("product");
		Attr attrProduct = doc.createAttribute("id");
		attrProduct.setValue("1");
		productEl.setAttributeNode(attrProduct);
		departmentEl.appendChild(productEl);
		
		Element titleEl = doc.createElement("title");
		titleEl.appendChild(doc.createTextNode("Product1"));
		productEl.appendChild(titleEl);
		
		Element priceEl = doc.createElement("price");
		priceEl.appendChild(doc.createTextNode("300"));
		productEl.appendChild(priceEl);
		
		Element amountEl = doc.createElement("amount");
		amountEl.appendChild(doc.createTextNode("100"));
		Attr attrAmount = doc.createAttribute("type");
		attrAmount.setValue("шт");
		amountEl.setAttributeNode(attrAmount);
		productEl.appendChild(amountEl);

		// запись в файл
		TransformerFactory factoryTr = TransformerFactory.newInstance();
		try {
			Transformer transformer = factoryTr.newTransformer();
			DOMSource domSource = new DOMSource(doc);
			StreamResult streamFile = new StreamResult(new File("market.xml"));
			transformer.transform(domSource, streamFile);
			System.out.println("Document saved!");
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

}
