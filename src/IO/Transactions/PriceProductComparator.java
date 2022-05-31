package IO.Transactions;

import java.util.Comparator;

public class PriceProductComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        if (Double.compare(o1.getPrice(), o2.getPrice()) == 0) {
           return o2.getProduct().compareTo(o1.getProduct());
        }
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
