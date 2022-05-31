package IO.File.ReaderWriter.Personen;

public class Demo {

    public static void main(String[] args) {
        PersonenManager pm = new PersonenManager();
        pm.load("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Personen.csv");
        System.out.println(pm);
    }
}
