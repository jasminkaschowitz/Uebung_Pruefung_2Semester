package IO.Object;

public class Demo {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.add(new Product("Laptop", 1200.0,"Consumer-Goods"));
        pm.add(new Product("Golf 8", 39_512.9,"Automobile"));
        pm.add(new Product("Banana", 2.89,"Fruits"));
        pm.save("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Ordner\\products.txt");

        System.out.println("loading entries ...");
        ProductManager pm2 = new ProductManager();
        pm2.load("C:\\Users\\Jassi\\Documents\\Campus02\\Wirtschaftsinformatik\\Programmieren\\Ordner\\products.txt");
        System.out.println("pm = " + pm2.toString());
    }
}
