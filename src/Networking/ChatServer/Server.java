package Networking.ChatServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(1111)){

        while (true) {
            Socket client = server.accept();
            ArrayList<ChatClient> clientList = new ArrayList<>();
            ChatClient cc = new ChatClient(clientList, client);
            clientList.add(cc);
            System.out.println(clientList);
            Thread thread1 = new Thread(cc);
            thread1.start();


        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
