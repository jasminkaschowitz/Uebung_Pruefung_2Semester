package IO.Transactions;

import java.io.*;
import java.util.ArrayList;

public class TransactionObjectHandler {

    public static void saveTransactions(ArrayList<Transaction> list, String path) throws TransactionObjectException {
        File file = new File(path);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));){
           oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
            throw new TransactionObjectException();
        }

    }

    public static void loadTransactions(String path) {
        File file = new File(path);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));){
            System.out.println(ois.readObject());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void saveTransactionsManual(ArrayList<Transaction> list, String path) throws TransactionObjectException {
        File file = new File(path);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));){
            for (Transaction t:list) {
               oos.writeObject(t);
               oos.flush();
            }
            oos.writeObject(null);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
            throw new TransactionObjectException();
        }

    }
    public static void loadTransactionsManual(String path) {
        File file = new File(path);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));){
            Transaction t;
            while ((t = (Transaction) ois.readObject()) != null){
                System.out.println(t);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
