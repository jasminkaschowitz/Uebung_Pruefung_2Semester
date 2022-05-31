package IO.File.ReaderWriter.Personen;

public class Personen {
    private String nachname;
    private String vorname;
    private String email;

    public Personen(String nachname, String vorname, String email) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.email = email;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Personen{" +
                "nachname='" + nachname + '\'' +
                ", vorname='" + vorname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
