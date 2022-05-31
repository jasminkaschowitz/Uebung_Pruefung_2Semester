package Networking.Webproxy;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WebProxy {
    private PageCache cache;
    private int numCacheHits;
    private int numCacheMisses;

    public WebProxy() {
        cache = new PageCache();
    }

    public WebProxy(PageCache cache) {
        this.cache = cache;
    }

    public WebPage fetch(String url) throws UrlLoaderException {
        WebPage missingPage = null;


        try {
            missingPage = cache.readFromCache(url);
            numCacheHits++;


            } catch (CacheMissException cacheMissException) {
                missingPage = UrlLoader.loadWebPage(url);
                cache.writeToCache(missingPage);
                numCacheMisses++;
            }



        return missingPage;
    }





    public String statsHits() {
        return  "stats hits: " + numCacheHits;

    }

    public String statsMisses() {
        return "stats misses: " + numCacheMisses;
    }

    public boolean writePageCacheToFile(String pathToFile) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))){
            HashMap<String, WebPage> list = cache.getCache();
            for (String s:list.keySet()) {
                bw.write(s + ";" + list.get(s).toString());
                    bw.newLine();

                }
            bw.flush();
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        }
    }



