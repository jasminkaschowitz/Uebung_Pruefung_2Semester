package IO.Adressbuch;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) throws AddressExportException, AddressExportFileAlreadyExistsException, AddressLoadException, AddressLoadWrongFormatException {
        Address adresse1 = new Address("Rucker", "Dominik", "066456235", "dominik.rucker@gmail.com");
        Address adresse2 = new Address("Franz", "Ferdinand", "06503746373", "ferdinand.franz@gmail.com");
        Address adresse3 = new Address("Eveline", "Kaschowitz", "0664284458", "four.kaschis@a1.net");
        Address adresse4 = new Address("Michael", "Kaschowitz", "0664458477", "four.kaschis@a1.net");

        AddressManager am = new AddressManager(new ArrayList<>());
        am.add(adresse1);
        am.add(adresse2);
        am.add(adresse3);
        am.add(adresse4);
        am.exportToCsv("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\addresses.csv", ";");
        am.loadFromCsv("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\addresses.csv" , ";");



    }
}
