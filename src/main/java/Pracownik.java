public class Pracownik {
    private String name;
    private String nazwisko;
    private double pesel;
    private int wiek;
    private int zarobki;

    public Pracownik(String name, String nazwisko, double pesel, int wiek, int zarobki) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.zarobki = zarobki;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel=" + pesel +
                ", wiek=" + wiek +
                ", zarobki=" + zarobki +
                '}';
    }
}
