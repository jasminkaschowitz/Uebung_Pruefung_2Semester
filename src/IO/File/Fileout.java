package IO.File;

import java.io.*;
import java.util.Scanner;

public class Fileout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Ordner\\Konsole.txt");
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))){
          char c = 0;
            while ((c = (char) System.in.read()) != 'x') {
                bos.write(c);
            }
            bos.flush();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
