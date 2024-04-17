package Automobiliai;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.List;

public class AutoParkas {

    private List<Automobilis> automobiliai = new ArrayList<>();

    public void modifikuotiRida (int id, int rida){
        ((Automobilis) automobiliai).setRida(rida);
    }

    public void modifikuotiAuto (int id, int x){

        if (automobiliai instanceof ElektrinisAutomobilis){
            ((ElektrinisAutomobilis) automobiliai).setBaterijosIkrovosLaikas(x);
        } else if (automobiliai instanceof NaftosKuroAutomobilis) {
            ((NaftosKuroAutomobilis) automobiliai).setKuroSanaudos(x);
        }
    }
    public void istrintiAuto(int id) {
        automobiliai.remove(automobiliai.get(id));
    }

    public void spauzdintiInformacijaApieAutomobili(int id) {
        System.out.println(automobiliai.get(id));
    }

    public void pridetiMasinaIAutoParka(NaftosKuroAutomobilis auto){
        automobiliai.add(auto);
    }

    public void pridetiMasinaIAutoParka(ElektrinisAutomobilis auto){
        automobiliai.add(auto);
    }

    public void pridetiMasinaIAutoParka(int id) {
        automobiliai.add(automobiliai.get(id));
    }

    public List<Automobilis> getAutomobiliai() {
        return automobiliai;
    }

    public void spauzdintiAutoParkoMasinas(){
        for (Object e : automobiliai){
            System.out.println("ID: "+ automobiliai.indexOf(e) +" "+e);
        }
    }
}
