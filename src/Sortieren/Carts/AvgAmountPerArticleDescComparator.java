package Sortieren.Carts;

import java.util.Comparator;

public class AvgAmountPerArticleDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        double averageo1 = o1.getTotalAmount()/ (double) o1.getNumArticles();
        double averageo2 = o2.getTotalAmount()/ (double) o2.getNumArticles();
        return Double.compare(averageo2,averageo1);
    }
}
