package Threading.Datum;

import java.io.IOException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws InterruptedException, IOException {
        aktuelleUhrzeit u1 = new aktuelleUhrzeit();
       aktuelleUhrzeit u2 = new aktuelleUhrzeit();
       aktuelleUhrzeit u3 = new aktuelleUhrzeit();
        Thread thread1 = new Thread(u1);
       Thread thread2 = new Thread(u2);
        Thread thread3 = new Thread(u3);

        thread1.start();
       thread2.start();
       thread3.start();

        System.out.println(Thread.currentThread().getName() + " Thread");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("")) {
        //System.in.read();
            u1.flag = true;
            System.out.println(Thread.currentThread().getName() + " Stop");
            u2.flag = true;
            System.out.println(Thread.currentThread().getName() + "Stop");
            u3.flag = true;
            System.out.println(Thread.currentThread().getName() + "Stop");
        }


        }




    }

