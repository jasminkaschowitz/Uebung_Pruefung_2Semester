package Networking;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL myUrl = new URL("https://www.campus02.at/");
            BufferedReader br = new BufferedReader(new InputStreamReader(myUrl.openStream()));
            File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\URL.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.flush();
            }
            br.close();
            bw.close();
            System.out.println(myUrl.getPort() + " " + myUrl.getProtocol() + " " + myUrl.getHost());



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

