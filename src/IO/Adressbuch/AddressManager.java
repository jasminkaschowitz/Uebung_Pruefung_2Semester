package IO.Adressbuch;

import java.io.*;
import java.util.ArrayList;

public class AddressManager {
    private ArrayList<Address> liste;

    public AddressManager(ArrayList<Address> liste) {
        this.liste = new ArrayList<>();
    }

    public ArrayList<Address> getListe() {
        return liste;
    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException, AddressLoadWrongFormatException {
    File file = new File(path);
        try (BufferedReader br = new BufferedReader(new FileReader(file))){

       String text;
            while ((text = br.readLine()) != null){
               String[] array = text.split(";");
               if (array.length == 4) {
               Address adresse = new Address(array[0], array[1], array[2], array[3]);
               liste.add(adresse);
                   System.out.println(adresse.toString());
               }
               else {
                   throw new AddressLoadWrongFormatException();
               }

            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new AddressLoadException();
        }

    }

    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportFileAlreadyExistsException {
        File file = new File(path);
        if (file.exists()) {
            throw new AddressExportFileAlreadyExistsException();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)); PrintWriter pw = new PrintWriter(bw)) {
            for (Address a:liste) {
                pw.println(a.getFirstname() + separator + a.getLastname() + separator + a.getMobilNumber() + separator + a.getEmail());
                pw.flush();

            }


        } catch (IOException e) {
            e.printStackTrace();
            throw new AddressExportException();
        }
    }
    public void add(Address a) {
        liste.add(a);
    }
}
