package Networking.Webproxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlLoader {

    public static WebPage loadWebPage(String url) throws UrlLoaderException {
        WebPage page = null;
        try {
            URL myUrl = new URL(url);

            try (BufferedReader br = new BufferedReader(new InputStreamReader(myUrl.openStream()));){
                String content = "";
                String line;
                while ((line = br.readLine()) != null) {
                  content = content + line;
                    page = new WebPage(url, content);
                }


            } catch (IOException e) {
            e.printStackTrace();
            throw new UrlLoaderException(e);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new UrlLoaderException(e);
        }

    return page;
    }
}
