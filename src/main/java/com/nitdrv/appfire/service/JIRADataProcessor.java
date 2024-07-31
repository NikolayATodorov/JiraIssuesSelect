package com.nitdrv.appfire.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.nitdrv.appfire.domain.Issue;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JIRADataProcessor {

    private final ObjectMapper objectMapper;
    private final XmlMapper xmlMapper;

    public JIRADataProcessor() {
        this.objectMapper = new ObjectMapper();
        this.xmlMapper = new XmlMapper();
    }

    public List<Issue> parseIssues(String jsonData) throws IOException {
        return objectMapper.readValue(jsonData, objectMapper.getTypeFactory().constructCollectionType(List.class, Issue.class));
    }

    public void writeJson(List<Issue> issues, String filePath) throws IOException {
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), issues);
    }

    public void writeXml(List<Issue> issues, String filePath) throws IOException {
        xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), issues);
    }
}
