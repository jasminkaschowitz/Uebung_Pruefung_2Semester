package Networking.NummernRaten;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class GuessNumberServer {

    public static void main(String[] args) throws NumberException {

        try (ServerSocket socket = new ServerSocket(2222);) {
            while (true) {
                try (Socket client = socket.accept(); BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));) {
                    int number = new Random().nextInt(32) + 1;
                    int guessNumber = 0;
                    String line;

                        while ((line = br.readLine()) != null) {
                            try {
                            guessNumber = Integer.parseInt(line);
                            if (guessNumber < 32) {

                                if (guessNumber == number) {
                                    bw.write("Gratulation. Die Zahl wurde gefunden");
                                    bw.newLine();
                                    bw.flush();
                                    break;
                                } else if (guessNumber > number) {
                                    bw.write("Die Zahl ist zu groß");
                                    bw.newLine();
                                    bw.flush();
                                    continue;
                                } else {
                                    bw.write("Die Zahl ist zu klein");
                                    bw.newLine();
                                    bw.flush();
                                    continue;
                                }
                            } else {
                                bw.write("Bitte eine Zahl von 0 bis 32 eingeben");
                                bw.newLine();
                                bw.flush();
                                continue;
                            }



                    } catch (NumberFormatException e) {
                                bw.write("Zahlen");
                                bw.newLine();
                                bw.flush();
                                continue;
                            }

                    }
                    }


            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
