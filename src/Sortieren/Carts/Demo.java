package Sortieren.Carts;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {
        Cart cart1 = new Cart("ddacy", 5, 10, 200);
        Cart cart2 = new Cart("morgan_4", 2, 2, 20);
        Cart cart3 = new Cart("michelleking", 4, 5, 50);
        Cart cart4 = new Cart("ddacy", 4, 7, 150);

        ArrayList<Cart> warenkorb = new ArrayList<>();
        warenkorb.add(cart1);
        warenkorb.add(cart2);
        warenkorb.add(cart3);
        warenkorb.add(cart4);
        Collections.sort(warenkorb, new ArticlesDescItemsAscComparator());
        System.out.println(warenkorb.toString());
        Collections.sort(warenkorb, new AvgAmountPerArticleDescComparator());
        System.out.println(warenkorb.toString());
        Collections.sort(warenkorb, new AvgAmountPerItemAscComparator());
        System.out.println(warenkorb.toString());
        Collections.sort(warenkorb, new UsernameDescTotalAmountAscComparator());
        System.out.println(warenkorb.toString());
    }
}
