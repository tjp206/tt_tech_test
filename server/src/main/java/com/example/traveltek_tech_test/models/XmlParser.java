package com.example.traveltek_tech_test.models;

import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class XmlParser {

    private static String line = "", str = "";

    public static void main(String[] args) throws IOException {

        String link = "src/main/resources/flighdata_A.xml";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(link));

        while ((line = bufferedReader.readLine()) != null) {
            str += line;
        }

        JSONObject jsonData = XML.toJSONObject(str);
        System.out.println(jsonData);

    }
}
