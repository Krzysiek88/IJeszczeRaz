import java.util.ArrayList;
import java.util.List;

public class Magazyn {

    List <Pracownik> listaPracownikow = new ArrayList<Pracownik>();
    List <Produkt> listaProduktow = new ArrayList<Produkt>();


    public void dodajPracownia (Pracownik pracownik){
        listaPracownikow.add(pracownik);
    }

    public void dodajProdukt (Produkt produkt){
        listaProduktow.add(produkt);
    }

    public void zatrudnieni (){
        for (Pracownik robol: listaPracownikow){
            System.out.println(robol);


        }
    }



}
