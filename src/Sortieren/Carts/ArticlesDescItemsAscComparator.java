package Sortieren.Carts;

import java.util.Comparator;

public class ArticlesDescItemsAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        int result = Double.compare(o2.getTotalAmount(), o1.getTotalAmount());
        if (result == 0) {
            return Integer.compare(o1.getTotalItems(), o2.getTotalItems());
        }
        return result;
    }
}
