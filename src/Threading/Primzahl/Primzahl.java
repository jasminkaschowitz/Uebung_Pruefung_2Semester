package Threading.Primzahl;

public class Primzahl implements Runnable {
    private long zahl;
    private boolean isPrim;

    public Primzahl(long zahl) {
        this.zahl = zahl;
        isPrim = true;
    }

    public void findPrimZahl() {
        int counter = 2;
        while (counter < zahl) {
            if (zahl % counter == 0) {
                System.out.println(zahl + " Ist keine Primzahl");
                isPrim = false;
                return;
            }
            else {
                counter++;
            }
        }
        System.out.println(zahl + " Ist eine Primzahl " + isPrim);
    }

   @Override
    public void run() {
        findPrimZahl();
    }

    @Override
    public String toString() {
        return "Primzahl{" +
                "zahl=" + zahl +
                ", isPrim=" + isPrim +
                '}';
    }
}
