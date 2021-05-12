package com.example.traveltek_tech_test.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlParser {

    XmlMapper xmlMapper = new XmlMapper();
    FlightData flightData = xmlMapper.readValue(xml, FlightData.class);

    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(flightData);

}
