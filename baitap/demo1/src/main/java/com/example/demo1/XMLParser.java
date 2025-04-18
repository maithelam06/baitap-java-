package com.example.demo1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    public static List<NguoiDung> importUsersFromXML(String filePath) throws Exception {
        List<NguoiDung> users = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(filePath));

        NodeList nodeList = document.getElementsByTagName("user");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String username = element.getElementsByTagName("username").item(0).getTextContent();
            String email = element.getElementsByTagName("email").item(0).getTextContent();
            String fullName = element.getElementsByTagName("fullName").item(0).getTextContent();

            users.add(new NguoiDung(username, null, email, fullName));
        }

        return users;
    }

    public static void exportUsersToXML(List<NguoiDung> users, String filePath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element root = document.createElement("users");
        document.appendChild(root);

        for (NguoiDung user : users) {
            Element userElement = document.createElement("user");

            Element username = document.createElement("username");
            username.appendChild(document.createTextNode(user.getUsername()));
            userElement.appendChild(username);

            Element email = document.createElement("email");
            email.appendChild(document.createTextNode(user.getEmail()));
            userElement.appendChild(email);

            Element fullName = document.createElement("fullName");
            fullName.appendChild(document.createTextNode(user.getFullName()));
            userElement.appendChild(fullName);

            root.appendChild(userElement);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(filePath));
        transformer.transform(source, result);
    }
}
