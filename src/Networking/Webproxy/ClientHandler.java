package Networking.Webproxy;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.nio.Buffer;

public class ClientHandler implements Runnable{

    private Socket client;
    private WebProxy proxy;

    public ClientHandler(Socket client, WebProxy proxy) {
        this.client = client;
        this.proxy = proxy;
    }

    @Override
    public void run() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(" ");
                if (array[0].equals("bye")) {
                    client.close();
                }
                else if (array.length == 2) {

                    if (array[0].equals("fetch")) {
                        proxy.fetch(array[1]);
                        bw.write(proxy.fetch(array[1]).toString());
                        bw.newLine();
                        bw.flush();



                    } if (array[0].equals("stats")) {
                        switch (array[1]) {
                            case "misses":
                                bw.write(proxy.statsMisses());
                                bw.newLine();
                                bw.flush();
                                break;

                            case "hits":
                                bw.write(proxy.statsHits());
                                bw.newLine();
                                bw.flush();
                                break;

                            default:
                                bw.write("error: invalid command");
                                bw.newLine();
                                bw.flush();
                                break;

                        }
                    }

                } else {
                    bw.write("error: command invalid");
                    break;

                }
            }


        } catch (IOException e) {
            e.printStackTrace();


        } catch (UrlLoaderException e) {
            e.printStackTrace();
        }
    }
        }




