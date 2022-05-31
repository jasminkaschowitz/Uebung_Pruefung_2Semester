package Threading.SplitText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class TextAnalyzer implements Runnable{

    private ArrayList<String> liste;
    public static HashMap<Character, Integer> map = new HashMap<>();
    public static int anzahlZeichen;
   // public static int anzahlProZeichen;
    public static String LockObject = "";

    public TextAnalyzer(ArrayList<String> liste) {
        this.liste = liste;
    }

    public void analyze() {
        for (String s : liste) {
            synchronized (LockObject) {
                anzahlZeichen += s.length();
            }
        }
    }

    public void countPerString(){
        int anzahlProZeichen = 0;
        for (String s:liste) {
            s = s.toLowerCase();
            char[] array = s.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (map.containsKey(array[i])) {
                    synchronized (LockObject) {
                        anzahlProZeichen = map.get(array[i]) + 1;
                        map.put(array[i], anzahlProZeichen);
                    }
                }
                else {
                    map.put(array[i], 1);
                }


        }
        }

    }


    @Override
    public void run() {
        analyze();
        countPerString();


        }



    }

