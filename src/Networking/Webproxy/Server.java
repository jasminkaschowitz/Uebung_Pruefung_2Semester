package Networking.Webproxy;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        PageCache pc = new PageCache();
        pc.warmUp("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\URLs\\demo_urls.txt");
        WebProxy wproxy = new WebProxy(pc);

        try (ServerSocket server = new ServerSocket(5678);){
            while (true) {
                Socket client = server.accept();
                ClientHandler ch = new ClientHandler(client, wproxy);
                Thread thread1 = new Thread(ch);
                thread1.start();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
