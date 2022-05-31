package Threading.Work;

import javax.swing.table.TableRowSorter;
import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable{

    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    protected void work() {
        printStarted();
       while (shouldRun == true) {
           Date d = new Date();
           System.out.println(d.toString());
           if (shouldRun == false) {
               break;
           }
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        printStopped();
    }

    @Override
    public void run() {
       work();
    }
}
