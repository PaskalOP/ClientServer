package org.example.clientServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//       HttpStatusChecker statusChecker= new HttpStatusChecker();
//        try {
//            System.out.println(statusChecker.getStatusImage(200));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
//        try {
//            downloader.downloadStatusImage(200);
//            downloader.downloadStatusImage(404);
//            downloader.downloadStatusImage(-1);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        HttpImageStatusCli statusCli = new HttpImageStatusCli();
        statusCli.askStatus();
    }
}