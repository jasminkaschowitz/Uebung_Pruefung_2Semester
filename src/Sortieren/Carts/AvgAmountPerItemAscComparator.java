package Sortieren.Carts;

import java.util.Comparator;

public class AvgAmountPerItemAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        double averageo1 = o1.getTotalAmount()/ (double) o1.getTotalItems();
        double averageo2 = o2.getTotalAmount()/ (double) o2.getTotalItems();
        return Double.compare(averageo1, averageo2);
    }
}
