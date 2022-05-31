package IO.Transactions;

import java.io.*;
import java.util.ArrayList;

public class TransactionLoader {

    public ArrayList<Transaction> loadTransactions(String path) throws TransactionLoadException {

        File file = new File(path);
        try (BufferedReader br = new BufferedReader(new FileReader(file));){
            ArrayList<Transaction> transactions = new ArrayList<>();
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(";");
                double preis = Double.parseDouble(array[2]);
                Transaction t = new Transaction(array[0], array[1], preis, array[3], array[4], array[5], array[6], array[7]);
                transactions.add(t);
            }
            return transactions;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new TransactionLoadException();
        } catch (IOException e) {
            e.printStackTrace();
            throw new TransactionLoadException();
        }
    }
}
