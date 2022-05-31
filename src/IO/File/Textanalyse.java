package IO.File;

import java.io.*;
import java.util.HashMap;

public class Textanalyse {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Ordner\\Test.txt");
        try ( BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
            HashMap<Character, Integer> amountOfCharacter = new HashMap<>();
            int byteReader;
            while ((byteReader = bis.read()) != -1) {
                char c = (char) byteReader;
                c = Character.toLowerCase(c);
                if (amountOfCharacter.containsKey(c)) {
                    int sum = amountOfCharacter.get(c);
                    amountOfCharacter.put(c, sum + 1);

                }
                else {
                    amountOfCharacter.put(c, 1);
                }
            }
            for (char c:amountOfCharacter.keySet()) {
                System.out.println(c + " " + amountOfCharacter.get(c));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
