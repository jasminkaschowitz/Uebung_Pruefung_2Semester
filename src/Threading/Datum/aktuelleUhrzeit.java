package Threading.Datum;

import java.util.Date;
import java.util.Scanner;

public class aktuelleUhrzeit implements Runnable {
    private Date d;
    public boolean flag = false;

    /*public aktuelleUhrzeit() {
        d = new Date();
    }*/





    @Override
    public void run() {
    while (true) {
        d = new Date();
        System.out.println(d.toString());
        if(flag == true) {
            break;
        }

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


}


    }
}

