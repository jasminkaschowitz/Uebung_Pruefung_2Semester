package IO.File;

import java.io.File;

public class FileBeispiel {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Ordner");
        printAndGetSize(file);
    }

    public static int printAndGetSize(File f) {
        int size = 0;

        if (f.isDirectory()) {
            File[] dokumente = f.listFiles();
            for (int i = 0; i < dokumente.length; i++) {
                if (!dokumente[i].isDirectory()) {
                    size += dokumente[i].length();
                    //System.out.println(dokumente[i].getName() + " " + dokumente[i].length());
                }
               else {
                    f = dokumente[i];
                    size += printAndGetSize(f);


              }
            }
            System.out.println(size);
        }


        System.out.println(size);
        return size;


    }
    }
