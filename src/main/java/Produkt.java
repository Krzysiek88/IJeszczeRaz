public class Produkt {
    private String nazwa;
    private double cenaNetto;
    private double vat;

    public Produkt(String nazwa, double cenaNetto, double vat) {
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cenaNetto=" + cenaNetto +
                ", vat=" + vat +
                '}';
    }
}

