package org.example.clientServer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class HttpStatusChecker {
    private final static String START__PART_URL = "https://http.cat/";
    private final static String END_PART_URL_ = ".jpg";


    public String getStatusImage(int code) throws IOException {
        String urlConection = START__PART_URL+code+END_PART_URL_;
        HttpURLConnection connection = (HttpURLConnection)new URL(urlConection).openConnection();
        int responseCode = connection.getResponseCode();
        if(responseCode==404){
            throw new RuntimeException("Page is not found");
        } else return urlConection;

    }

}
