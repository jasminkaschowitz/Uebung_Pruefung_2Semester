package Threading.SplitText;

import java.io.*;
import java.util.ArrayList;

public class FileSplitter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\adressen.txt");
        ArrayList<String> geradeZeilen = new ArrayList<>();
        ArrayList<String> ungeradeZeilen = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() % 2 == 0) {
                    geradeZeilen.add(line);
                }
                else {
                    ungeradeZeilen.add(line);
                }
            }

            TextAnalyzer ta = new TextAnalyzer(geradeZeilen);
            TextAnalyzer ta2 = new TextAnalyzer(ungeradeZeilen);
            TextAnalyzer ta3 = new TextAnalyzer(ungeradeZeilen);
            Thread thread1 = new Thread(ta);
            Thread thread2 = new Thread(ta2);
            Thread thread3 = new Thread(ta3);
           thread1.start();
            thread2.start();
            thread3.start();
           thread1.join();
            thread2.join();
            thread3.join();
            System.out.println(TextAnalyzer.anzahlZeichen);
            System.out.println(TextAnalyzer.map.toString());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
