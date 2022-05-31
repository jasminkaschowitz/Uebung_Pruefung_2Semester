package Threading.Work;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable{

    private String path;
    public ArrayList<String>lines;

    public FileReadWorker(String name, String path) {
        super(name);
        this.path = path;
        lines = new ArrayList<>();
    }

    @Override
    public void run() {
    work();
    }

    @Override
    protected void work() {
        File file = new File(path);
        try ( BufferedReader br = new BufferedReader(new FileReader(file));){
           String line;
           while ((line = br.readLine())!= null) {
               lines.add(line);
               if (shouldRun == false) {
                   break;
               }
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
