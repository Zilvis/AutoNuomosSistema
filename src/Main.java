public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var nuoma = new Nuoma();
        var autoparkas = new AutoParkas();
        var ioManager = new IOManager();

        var auto1 = new ElektrinisAutomobilis("Tesla", "s90",50,2021,10);
        var auto2 = new NaftosKuroAutomobilis("Volvo", "s90",20,1995,5);
        nuoma.pridetiAuto(auto1);
        nuoma.pridetiAuto(auto2);

        ioManager.sukurtiAuto();

//       autoparkas.spauzdintiMasinuSarasa(nuoma);
//
//        System.out.println("//");
//       nuoma.pasiimtiAuto(auto1);
//       autoparkas.spauzdintiMasinuSarasa(nuoma);
//
//        System.out.println(auto2.getMarke() + " 100km sanaudos yra : "+ auto2.getKuroSanaudos() + " Ltr");




    }
}
















