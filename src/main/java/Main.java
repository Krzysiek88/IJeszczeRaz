public class Main {
    public static void main(String[] args) {

        Magazyn magazyn = new Magazyn();

        Pracownik pierwszy = new Pracownik("Kazik","SynStanislawa", 87956523,23,500);
        magazyn.dodajPracownia(pierwszy);
        magazyn.zatrudnieni();


    }
}
