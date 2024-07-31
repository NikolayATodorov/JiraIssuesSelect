package com.nitdrv.appfire.service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.IOException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class JIRAClient {

    //    private static final String JIRA_URL = "https://jira.atlassian.com/rest/api/2/search?jql=issuetype+in+(Bug,Documentation,Enhancement)+and+updated>startOfWeek()";
    //    private static final String JIRA_URL = "https://jira.atlassian.com/ManageFilters.jspa?search=search&searchName=issuetype+in+(Bug%2C+Documentation%2C+Enhancement)+&searchShareType=&groupShare=&projectShare=&roleShare=&userShare=&returnUrl=ManageFilters.jspa&decorator=none&contentOnly=true&Search=Search&_=1722303952662";

    private static final String JIRA_URL =
        "https://jira.atlassian.com/rest/api/2/search?jql=issuetype+in+(Bug,Documentation,Enhancement)+AND+updated>'2024-07-26 09:35'";

    public String fetchIssues() throws IOException {
        HttpResponse<JsonNode> response;

        try {
            response = Unirest.get("https://nitdrv.atlassian.net/rest/api/2/search")
                .basicAuth("ni.tdrv@gmail.com", "<api_token>")
                .header("Accept", "application/json")
                .queryString("jql", "project = HSP")
                .asJson();
            System.out.println(response.getBody());
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    public String fetchIssues2() throws IOException, UnirestException {
        Unirest.setTimeouts(1000000, 10000);
        HttpResponse<String> response = Unirest.get(
            "https://jira.atlassian.com/rest/api/2/search?jql=issuetype+in+(Bug%2CDocumentation%2CEnhancement)+AND+updated%3E%272024-07-26%2009%3A35%27"
        )
            .header(
                "Cookie",
                "AWSALB=GmvvlXno27IhRvfo1PmsX8mZEv9QFEsNnkGzox847+wtgOPsZSqHkgYWwbj3Ze8vrb6l7PXpsvKMQI5W1dFkdG9fQOvb+nJohLsLaMX6Ihlj/2fa3i8d4dmFB+zK; AWSALBCORS=GmvvlXno27IhRvfo1PmsX8mZEv9QFEsNnkGzox847+wtgOPsZSqHkgYWwbj3Ze8vrb6l7PXpsvKMQI5W1dFkdG9fQOvb+nJohLsLaMX6Ihlj/2fa3i8d4dmFB+zK; JSESSIONID=ABA24FC085C7C62C5B1222C167552AC7; atlassian.xsrf.token=AKVY-YUFR-9LM7-97AB_ff12ce4faa33a6bd9f9385a13b2f6100b019096b_lout"
            )
            .asString();

        String body = response.getBody();
        return response.getBody();
    }

    public String fetchIssues1() throws IOException {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(JIRA_URL);
            try (CloseableHttpResponse response = client.execute(request)) {
                return EntityUtils.toString(response.getEntity());
            }
        }
    }
}
