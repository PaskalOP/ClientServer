package org.example.clientServer;

import java.io.IOException;
import java.util.Scanner;


public class HttpImageStatusCli {
    public void askStatus(){
        boolean isValide = false;
        int userCode=-1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your HTTP status  code");

                if (sc.hasNextInt()){
                    userCode = sc.nextInt();
                    isValide = true;
                } else {
                    System.out.println("Enter correct code. It is digit");
                    sc.nextLine();
                }
        }
        while (!isValide);
        sc.close();
            HttpStatusChecker statusChecker = new HttpStatusChecker();
            try {
                String url = statusChecker.getStatusImage(userCode);
                HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
                downloader.downloadStatusImage(userCode);
            } catch (IOException e) {
                throw new RuntimeException("There is not image for HTTP status " + userCode);
            }
    }
}
