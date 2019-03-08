public class Main {
    public static void main(String[] args) {

        Magazyn magazyn = new Magazyn();

        Pracownik pierwszy = new Pracownik("Kazik","SynStanislawa", 87956523,23,500);
        Pracownik drugi = new Pracownik("s","d", 3423432,43,2000);
        magazyn.dodajPracownia(pierwszy);
        magazyn.dodajPracownia(drugi);
        magazyn.zatrudnieni();



    }
}
