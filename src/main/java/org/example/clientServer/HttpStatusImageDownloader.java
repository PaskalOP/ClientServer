package org.example.clientServer;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HttpStatusImageDownloader {
    private final static String absPath = "/Users/mac/IdeaProjects/ClientServer/src/main/java/org/example/clientServer/cats/";
    public void downloadStatusImage(int code) throws IOException {
        HttpStatusChecker statusCode = new HttpStatusChecker();
        String url= statusCode.getStatusImage(code);

        try (InputStream inputStream = new URL(url).openStream()){
            String pathForPicture = absPath  +code +".jpg";

            if(!new File(pathForPicture).exists()){
                Files.copy(inputStream, Paths.get(pathForPicture));
            } else {
                System.out.println("Picture with code " + code + " is already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException("You use not correct path");
        }
    }
}
