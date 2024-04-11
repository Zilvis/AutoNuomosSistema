public class AutoParkas {
    public void spauzdintiMasinuSarasa(Nuoma nuoma){
        for (Automobilis auto : nuoma.getAutomobiliuSarasas()){
            System.out.println(auto);
        }
    }
}
