package com.company.inheritance.visitor.xml;

import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new ClassPathResource("members.xml").getInputStream());
        final NodeList members = document.getElementsByTagName("member");
        for (int i = 0; i < members.getLength(); i++) {
            Node node = members.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String id = element.getAttribute("id");
                System.out.println(id);
                final NodeList childs = element.getChildNodes();
                for (int j = 0; j < childs.getLength(); j++) {
                    Node childNode = childs.item(j);
                    if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element childElement = (Element) childNode;
                        System.out.println(childElement.getNodeName() + "  " + childElement.getTextContent());
                    }
                }
            }
        }
    }
}
