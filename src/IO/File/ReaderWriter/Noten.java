package IO.File.ReaderWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Noten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Noten.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            String text;
            while ((text = scanner.next()) != null) {
                if (!text.equals("Stop")) {
                    bw.write(text + " ");
                    bw.flush();
                }
                else {
                    break;

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
