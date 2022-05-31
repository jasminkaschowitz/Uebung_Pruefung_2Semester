package AbstrakteKlassen;

import java.util.ArrayList;

public class LogisticManager {
    private ArrayList<Moveable> moveableObjekte;

    public LogisticManager(ArrayList<Moveable> moveableObjekte) {
        this.moveableObjekte = new ArrayList<>();
    }

    public void add(Moveable m) {
      moveableObjekte.add(m);
    }

    public void moveAll(String destination) {
        for (Moveable m:moveableObjekte) {
            m.move(destination);

        }
    }
}
