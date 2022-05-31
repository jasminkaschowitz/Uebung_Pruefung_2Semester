package Networking;

import java.io.*;
import java.net.Socket;

public class ClientProgramm {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("info.cern.ch", 80);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            bw.write("GET / HTTP/1.1");
            bw.newLine();
            bw.write("Host: info.cern.ch");
            bw.newLine();
            bw.flush();

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            socket.close();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
