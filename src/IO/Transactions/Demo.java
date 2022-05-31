package IO.Transactions;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) throws TransactionLoadException, TransactionObjectException {
        TransactionLoader tl = new TransactionLoader();
        ArrayList<Transaction> transactions = tl.loadTransactions("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\transactions.csv");
        Collections.sort(transactions, new PriceProductComparator());
        //System.out.println(transactions);
        TransactionObjectHandler.saveTransactionsManual(transactions, "C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\transactionsObjectManual.txt");
        System.out.println("-----------------------------------------------------------------------------------------");
        TransactionObjectHandler.loadTransactionsManual("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\transactionsObjectManual.txt");

        TransactionManager tm = new TransactionManager(transactions);
        System.out.println("------------------------------------------");
        //System.out.println(tm.getAverageTransactionAmountByPaymentType());
    }
}
