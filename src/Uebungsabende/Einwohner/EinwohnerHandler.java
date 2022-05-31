package Uebungsabende.Einwohner;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class EinwohnerHandler {

    private Socket client;

    public EinwohnerHandler(Socket client) {
        this.client = client;
    }

    public void start() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(" ");

                if (array.length == 2) {
                    switch (array[1]) {
                        case "Wien":
                           bundesland("Wien", bw);
                           break;
                        case "Steiermark":
                            bundesland("Steiermark", bw);
                            break;
                        default:
                            bundesland(array[1], bw);
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

    public void bundesland (String bundesland, BufferedWriter bw) {
        EinwohnerManager em = new EinwohnerManager();
        try {
            for (Einwohner e: em.load()) {
                if (e.getBundesland().equals(bundesland)) {
                    bw.write(e.toString());
                    bw.newLine();
                    bw.flush();
                }

            }
        } catch (DataFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
