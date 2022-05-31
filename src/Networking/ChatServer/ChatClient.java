package Networking.ChatServer;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ChatClient implements Runnable{

    private ArrayList<ChatClient> clients;
    private Socket client;
    private BufferedReader reader;
    private PrintWriter printWriter;
    private String name;

    public ChatClient(ArrayList<ChatClient> clients, Socket client) {
        this.clients = clients;
        this.client = client;
        try {
            reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

   public void sendMessage(String message) {
        printWriter.println(message);
        printWriter.flush();
   }

    @Override
    public void run() {
        String line;
            try {
                while ((line = reader.readLine()) != null) {
                  String[] text = line.split(":");
                  if (text[1].equals("Name")) {
                    name = text[0];}
                  else if (text[1].equals("Message")) {
                      for (ChatClient c : clients) {
                          c.sendMessage(text[0]);
                      }
                  }
                  else if (text.length == 3) {
                      for (ChatClient c : clients) {
                          if (c.name.equals(text[1])) {
                              sendMessage(text[0]);
                          }
                      }
                  }
                  else if(text[0].equals("bye")) {
                      for (ChatClient c:clients) {
                          if (client.isConnected() == true) {
                              clients.remove(c);
                          }
                      }

                      client.close();
                  }
                  else {
                      printWriter.println("ungültiger Befehl");
                      printWriter.flush();
                  }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        public void close() {
            try {
                reader.close();
            printWriter.close();
            for (ChatClient c:clients) {
                if (client.isConnected() == true) {
                    clients.remove(c);

                }
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
