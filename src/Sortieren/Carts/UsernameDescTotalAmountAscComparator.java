package Sortieren.Carts;

import java.util.Comparator;

public class UsernameDescTotalAmountAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        int result = o2.getUsername().compareTo(o1.getUsername());
        if (result == 0) {
            return Double.compare(o1.getTotalAmount(), o2.getTotalAmount());
        }
        return result;
    }
}
