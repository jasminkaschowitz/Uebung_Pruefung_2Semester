package Threading.Counter;

public class Counter implements Runnable {

    public static int Counter = 0;
    private static String LockObject = "";

    public void runMethod(){
            Counter = Counter + 1;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000;i++) {
           synchronized (LockObject) {
               runMethod();
           }
            }
        }
    }

