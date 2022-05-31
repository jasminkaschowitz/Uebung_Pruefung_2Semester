package AbstrakteKlassen;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Moveable> list = new ArrayList<>();
        LogisticManager lm = new LogisticManager(list);
        Moveable car1 =  new Car("BMW", "Schwarz", 5);
        Moveable shirt1 = new Shirt("Nike", 34, "Weiß");
        lm.add(car1);
        lm.add(shirt1);
        lm.moveAll("Graz");
    }
}
