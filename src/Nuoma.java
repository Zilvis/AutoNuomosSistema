import java.util.ArrayList;

public class Nuoma {
    private ArrayList<Automobilis> automobiliuSarasas;

    public Nuoma() {
        automobiliuSarasas = new ArrayList<>();
    }

    public void pridetiAuto (Automobilis auto){
        automobiliuSarasas.add(auto);
    }

    public void pasiimtiAuto (Automobilis auto){
        automobiliuSarasas.remove(auto);
    }

    public double apskaiciuotiNuomosKaina(Automobilis auto, double nuomosLaikasDienomis){
        return auto.getKainaUzDiena() * nuomosLaikasDienomis;
    }

    public ArrayList<Automobilis> getAutomobiliuSarasas() {
        return automobiliuSarasas;
    }
}
