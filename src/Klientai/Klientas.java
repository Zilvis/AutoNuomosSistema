package Klientai;

import Automobiliai.AutoParkas;
import Automobiliai.Automobilis;

import java.util.ArrayList;
import java.util.List;

public class Klientas {
    private String vardas, pavarde;
    private Automobilis dabartinisNuomojamasAutomobilis;
    private Automobilis paskutinisNuomuotasAutomobilis;
    private List<Automobilis> isnuomuotiAutomobiliai;

    private List<Klientas> klientuSarasas = new ArrayList<>();

    public Klientas(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        isnuomuotiAutomobiliai = new ArrayList<>();
    }

    public Klientas() {
        isnuomuotiAutomobiliai = new ArrayList<>();
    }


    public void dabartiniaiIsnuomuotiAuto() {
        System.out.println("Dabartiniai isnuomuoti automobiliai:");

        for (Object auto : isnuomuotiAutomobiliai) {
            System.out.println(auto);
        }

    }

    public void sukurtiNaujaKlienta(String vardas, String pavarde) {
        klientuSarasas.add(new Klientas(vardas, pavarde));
    }

    public void atspauzdintiKlientuSaras() {
        for (Object klientas : klientuSarasas) {
            System.out.println("ID: " + klientuSarasas.indexOf(klientas) + " " + klientas);
        }
    }

    public void isnuomuotiKlientuiMasina(int id, AutoParkas autoParkas) {
        autoParkas.spauzdintiAutoParkoMasinas();
        isnuomuotiAutomobiliai.add(autoParkas.getAutomobiliai().get(id));
    }

    public void grazintiAutoIAutoParka(int id, AutoParkas autoParkas) {
        autoParkas.pridetiMasinaIAutoParka(isnuomuotiAutomobiliai.indexOf(id));
    }

    public void istrintiKlienta(int id) {
        klientuSarasas.remove(id);
    }

    public void spauzdintiIsnuomuotusAutomobilius() {
        for (Object e : isnuomuotiAutomobiliai){
            System.out.println("ID: "+ isnuomuotiAutomobiliai.indexOf(e) +" "+e);
        }
    }

    public List<Klientas> getKlientuSarasas() {
        return klientuSarasas;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public Automobilis getDabartinisNuomojamasAutomobilis() {
        return dabartinisNuomojamasAutomobilis;
    }

    public void setDabartinisNuomojamasAutomobilis(Automobilis dabartinisNuomojamasAutomobilis) {
        this.dabartinisNuomojamasAutomobilis = dabartinisNuomojamasAutomobilis;
    }

    public Automobilis getPaskutinisNuomuotasAutomobilis() {
        return paskutinisNuomuotasAutomobilis;
    }

    public void setPaskutinisNuomuotasAutomobilis(Automobilis paskutinisNuomuotasAutomobilis) {
        this.paskutinisNuomuotasAutomobilis = paskutinisNuomuotasAutomobilis;
    }

    public List<Automobilis> getIsnuomuotiAutomobiliai() {
        return isnuomuotiAutomobiliai;
    }

    @Override
    public String toString() {
        return "Klientas{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", dabartinisNuomojamasAutomobilis=" + dabartinisNuomojamasAutomobilis +
                ", paskutinisNuomuotasAutomobilis=" + paskutinisNuomuotasAutomobilis +
                '}';
    }
}
