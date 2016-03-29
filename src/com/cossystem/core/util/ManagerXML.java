/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

import com.cossystem.core.exception.EnlazadorException;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author TMXIDSJPINAM
 */
public class ManagerXML {

    public static <T extends Serializable> String getXMLFromObject(T instance) throws EnlazadorException {
        StringWriter sw = new StringWriter();
        String xmlResult;
        try {
            JAXBContext context = JAXBContext.newInstance(instance.getClass());
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(instance, sw);
            xmlResult = sw.toString();
            sw.close();
        } catch (JAXBException | IOException e) {
            String message = e.getMessage();
            throw new EnlazadorException("Error al convertir a xml: " + message);
        }
        return xmlResult;
    }

    public static <T extends Serializable> T getObjectFromXML(final Class clase, final String xml) throws EnlazadorException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        JAXBContext jaxbContext;
        Document document;
        Unmarshaller jaxbUnmarshaller;
        T resultado;
        InputSource inputSource;
        if (Serializable.class.isAssignableFrom(clase)) {
            try (StringReader reader = new StringReader(xml)) {
                inputSource = new InputSource(reader);
                builder = factory.newDocumentBuilder();
                document = builder.parse(inputSource);
                jaxbContext = JAXBContext.newInstance(clase);
                jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                resultado = (T) jaxbUnmarshaller.unmarshal(document);
            } catch (SAXException | ParserConfigurationException | IOException | JAXBException e) {
                throw new EnlazadorException("Error al construir el objeto, xml no válido: " + e.getMessage());
            }
        } else {
            String nombreClase = clase != null ? clase.getName() : "null";
            throw new EnlazadorException("Error al construir el objeto, clase " + nombreClase + " no válida");
        }
        return resultado;
    }
}
