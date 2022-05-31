package Uebungsabende.Einwohner;

import java.io.*;
import java.net.Socket;

public class EinwohnerHandler1 implements Runnable{

    private Socket client;

    public EinwohnerHandler1(Socket client) {
        this.client = client;
    }

    public void start() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(" ");

                if (array.length == 2) {
                    EinwohnerManager em = new EinwohnerManager();
                    for (Einwohner e : em.load()) {
                        if (array[1].equals(e.getBundesland())) {
                            bw.write(e.toString());
                            bw.newLine();
                            bw.flush();
                        }
                    }

                } else if (array.length == 5) {
                    EinwohnerManager em = new EinwohnerManager();
                    for (Einwohner e : em.load()) {
                        int gj = Integer.parseInt(array[1]);
                        if (gj == e.getGeburtsjahr()) {
                            bw.write(e.toString());
                            bw.newLine();
                            bw.flush();
                        }
                    }



                }
                else if (array[0].equals("Exit")){
                    client.close();
                }

            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (DataFileException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void run() {
        start();
    }
}



