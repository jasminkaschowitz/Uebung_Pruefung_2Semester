package IO.File;

import java.io.*;
import java.util.Arrays;

public class Kopieren {
    public static void main(String[] args) {


        File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Ordner\\Test.txt");
        File file2 = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Ordner\\TestKopie.txt");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2))) {

            int read;
            while ((read = bis.read()) != -1) {
                System.out.print((char) read);
                bos.write(read);
                bos.flush();
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


