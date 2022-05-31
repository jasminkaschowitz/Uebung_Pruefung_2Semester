package Uebungsabende.Einwohner;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class EinwohnerManager {

    public ArrayList<Einwohner> load() throws DataFileException {
       ArrayList<Einwohner> liste = new ArrayList<>();
       File file = new File("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\testdata-einwohner.csv");
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(";");
                String name = array[1];
                String bundesland = array[2];
                int id = Integer.parseInt(array[0]);
                int geburt = Integer.parseInt(array[3]);
                Einwohner einwohner = new Einwohner(id, name, bundesland, geburt);
                liste.add(einwohner);
            }

        Collections.sort(liste, new GeburtsjahrNameComparator());
        System.out.println(liste);
        return liste;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new DataFileException("File not found", e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataFileException("IO Exception", e);
        }
    }
}
