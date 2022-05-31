package IO.Logger;

public class Demo {
    public static void main(String[] args) {

        Logger logger1 = new Logger("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Logger.txt");
        //logger1.logFatal("FATAL");
        //logger1.logError("Error");
        logger1.logInfo("INFO");

    }
}
