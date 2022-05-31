package IO.Logger;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class Logger {

    private String path;

    public Logger(String path) {
        this.path = path;
    }

    private void logMessage(ErrorMessage message) {
           try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
               bw.write(message.toLine());
               bw.newLine();
                bw.flush();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void logFatal(String message) {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        ErrorMessage em = new ErrorMessage("FATAL", message, timeStamp);
        logMessage(em);
    }

    public void logError(String message) {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        ErrorMessage em = new ErrorMessage("ERROR", message, timeStamp);
        logMessage(em);
    }

    public void logInfo(String message) {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        ErrorMessage em = new ErrorMessage("INFO", message, timeStamp);
        logMessage(em);
    }

    public void logDebug(String message) {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        ErrorMessage em = new ErrorMessage("DEBUG", message, timeStamp);
        logMessage(em);
    }
}
