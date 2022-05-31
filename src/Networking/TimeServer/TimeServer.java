package Networking.TimeServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1111);){
            int count = 0;

            while (count < 5) {
                try (Socket client = serverSocket.accept();
                     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));) {
                    LocalDateTime datetime = LocalDateTime.now();
                    bw.write(datetime.toString());
                    bw.flush();
                    count++;
                    System.out.println(count);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
