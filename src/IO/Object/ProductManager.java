package IO.Object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private ArrayList<Product> liste;

    public ProductManager() {
        this.liste = new ArrayList<>();
    }

    public void add(Product p) {
        liste.add(p);
    }

    public void save(String path) {
        File file = new File(path);
        try (ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
        liste.add(null);
        os.writeObject(liste);
           /*for (Product p : liste) {

                os.writeObject(p);

            }*/
           os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public void load(String path) {
        File file = new File(path);
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){

            Product p = null;
            while ((p = (Product) ois.readObject()) != null) {

                liste.add(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
*/

    public void load(String path) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            liste = (ArrayList<Product>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

        @Override
    public String toString() {
        return "ProductManager{" +
                "liste=" + liste +
                '}';
    }
}
