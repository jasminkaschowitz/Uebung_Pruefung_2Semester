package Threading.Primzahl;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Primzahl prim1 = new Primzahl(97841);
        Primzahl prim2 = new Primzahl(97842);
        Primzahl prim3 = new Primzahl(129475);
        Primzahl prim4 = new Primzahl(637264);
        Thread thread1 = new Thread(prim1);
        Thread thread2 = new Thread(prim2);
        Thread thread3 = new Thread(prim3);
        Thread thread4 = new Thread(prim4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("vorher " + prim2);
        thread2.join();
        System.out.println("nacher " + prim2);

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }
}
