package IO.File;

import java.io.*;

public class Filein {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Ordner\\Test.txt");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));){
            int sum = 0;
            int Byte;
            while ((Byte = bis.read()) != -1) {
                sum++;
                System.out.print((char) Byte);
            }
            System.out.println(sum);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
