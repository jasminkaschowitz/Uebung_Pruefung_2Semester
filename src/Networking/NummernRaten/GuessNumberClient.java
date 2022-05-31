package Networking.NummernRaten;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class GuessNumberClient {
    public static void main(String[] args) {

        try (Socket client = new Socket("localhost", 2222);) {

            Scanner scanner = new Scanner(System.in);
            String number = scanner.next();
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
                 BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));) {

            bw.write(number);
            bw.newLine();
            bw.flush();

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                //if (line.startsWith("Gratulation")) {
                    //client.close();
                //}
            }

        }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
