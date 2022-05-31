package ExceptionHandling.Transporter;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {
        double zahl = Math.random();
        if (zahl < 0.5 && urgent == true){
            throw new TransporterMalfunctionException("Transporter ist ausgefallen");
        }
        System.out.println(person + " wurde von " + from + "nach " + to + " gebeamt");

    }

  public void shutdown() {
      System.out.println("shutdown");
  }
}
