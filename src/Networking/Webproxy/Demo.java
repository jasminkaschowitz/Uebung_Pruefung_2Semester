package Networking.Webproxy;

public class Demo {
    public static void main(String[] args) throws UrlLoaderException, CacheMissException {
        //WebPage page = UrlLoader.loadWebPage("https://www.wikipedia.org");
        //System.out.println(page.toString());

        PageCache pc = new PageCache();
        pc.warmUp("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\URLs\\demo_urls.txt");



        WebProxy wp = new WebProxy(pc);
        wp.fetch("https://www.wikipedia.org");
        System.out.println(wp.statsMisses());
        System.out.println(wp.statsHits());
        //System.out.println(wp.writePageCacheToFile("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\WebProxy.txt"));
    }
}
