package ExceptionHandling.Transporter;

public class Demo {
    public static void main(String[] args) {
        Transporter transporter = new Transporter();
        Starship Enterprise = new Starship("Enterprise", transporter);
        Enterprise.beamUp("Captain Kirk", "Riga IV");
    }
}
