package Uebungsabende.Einwohner;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EinwohnerServer {
    public static void main(String[] args) {


        try (ServerSocket server = new ServerSocket(1111);) {
           while (true) {
               Socket client = server.accept();

               EinwohnerHandler1 eh = new EinwohnerHandler1(client);
               Thread thread1 = new Thread(eh);
               thread1.start();

           }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




