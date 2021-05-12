package com.example.traveltek_tech_test.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XmlParser {

    XmlMapper xmlMapper = new XmlMapper();
    private byte[] xml;
    Flight flight = xmlMapper.readValue(xml, Flight.class);

    ObjectMapper mapper = new ObjectMapper();
    String json; {
        try {
            json = mapper.writeValueAsString(flight);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public XmlParser() throws IOException {
    }
}
