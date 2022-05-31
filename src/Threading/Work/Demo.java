package Threading.Work;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        TimePrintWorker tpw = new TimePrintWorker("Worker1");
        FileReadWorker frw = new FileReadWorker("Worker2", "C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\URL.txt");
        Thread thread1 = new Thread(tpw);
        Thread thread2 = new Thread(frw);

        thread1.start();
        thread2.start();
        thread2.join();

        Thread.sleep(5000);


        System.out.println("jetzt abbrechen");
        tpw.stopWorker();
        //thread1.join();
       // thread2.join();





        /*if (!thread2.isAlive()) {
            tpw.stopWorker();
        }*/


        System.out.println(frw.lines);
    }
}
