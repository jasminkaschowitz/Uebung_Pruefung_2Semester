package Uebungsabende.Einwohner;

import java.io.*;
import java.net.Socket;

public class EinwohnerClient {
    public static void main(String[] args) {





        try (Socket client = new Socket("localhost",1111);
             BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
