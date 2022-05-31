package IO.File.ReaderWriter.Personen;

import java.io.*;
import java.util.ArrayList;

public class PersonenManager {

    private ArrayList<Personen> personen;

    public PersonenManager() {
        this.personen = new ArrayList<>();
    }

    public void load(String path) {
        File file = new File(path);
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
           String line;
           while ((line = br.readLine()) != null) {
               String[] array = line.split(";");
               Personen p = new Personen(array[0], array[1], array[2]);
               personen.add(p);

           }
            //System.out.println(personen.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "PersonenManager{" +
                "personen=" + personen +
                '}';
    }
}
