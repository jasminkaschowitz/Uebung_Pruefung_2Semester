package Networking.Webproxy;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class PageCache {
    private HashMap<String, WebPage> cache;

    public PageCache() {
        cache = new HashMap<>();
    }

    public HashMap<String, WebPage> getCache() {
        return cache;
    }

    public WebPage readFromCache(String url) throws CacheMissException {
        if (cache.containsKey(url)) {
            return cache.get(url);
        } else {
            throw new CacheMissException("URL ist im Cache nicht vorhanden");

        }
    }

    public void writeToCache(WebPage webPage) {
        cache.put(webPage.getUrl(), webPage);
    }

    public void warmUp(String pathToUrls) {
        File file = new File(pathToUrls);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                WebPage page = UrlLoader.loadWebPage(line);
                cache.put(line, page);
            }
        } catch (UrlLoaderException e) {
            e.printStackTrace();
            System.out.println("Fehler beim Laden");
            return;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





    /*public void warmUp(String pathToUrls) {
        File file = new File(pathToUrls);
        if (file.isDirectory()) {
            File[] ordner = file.listFiles();
            for (int i = 0; i < ordner.length; i++) {
                try {
                    File fileUrl = new File(ordner[i].getPath());
                    WebPage page = UrlLoader.loadWebPage(fileUrl.toURL().toString());
                    cache.put(ordner[i].getName(), page);
                } catch (UrlLoaderException e) {
                    e.printStackTrace();
                    System.out.println("Fehler beim Laden");
                    return;

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }


            }*/


