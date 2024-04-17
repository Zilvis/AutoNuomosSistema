package UI;

import Automobiliai.*;

import java.util.Scanner;

public class IOManager {

    private Scanner scanner;
    private int tipas;
    private boolean aktyvus;
    private String pasirinkimas;
    private int kuroSanaudos = 0;
    private int ikrovosLaikas = 0;
    private KlientasIO klientasIO;
    private AutoParkas autoParkas = new AutoParkas();
    private AutomobiliuDuomenuModifikatorius modifikatorius = new AutomobiliuDuomenuModifikatorius();

    public IOManager() {
        scanner = new Scanner(System.in);
        klientasIO = new KlientasIO(this,autoParkas);
    }

    public void iOMainMenu() {
        aktyvus = true;

        while (aktyvus) {
            System.out.println("1: Sukurti nauja auto");
            System.out.println("2: Istrinti esama auto");
            System.out.println("3: Modifikuoti rida");
            System.out.println("4: Modifikuoti ikrovos laika arba kuro sanaudas");
            System.out.println("5: Atspauzdinti auto sarasa");
            System.out.println("6: Klientu sistema");
            System.out.println("7: Iseiti");
            pasirinkimas = scanner.nextLine();

            switch (pasirinkimas) {
                case "1":
                    autoTipoPasirinkimas();
                    aktyvus = false;
                    break;
                case "2":
                    istrintiAutoPagalPavadinima();
                    aktyvus = false;
                    break;
                case "3":
                    modifikuotiRida();
                    aktyvus = false;
                    break;
                case "4":
                    modifikuotiIkrovosLaika();
                    aktyvus = false;
                    break;
                case "5":
                    autoParkas.spauzdintiAutoParkoMasinas();
                    aktyvus = true;
                    break;
                case "6":
                    klientasIO.klientoIoMainMenu();
                    aktyvus = false;
                    break;
                case "7":
                    aktyvus = false;
                    break;
                default:
                    System.out.println("Netinkamas pasirinkimas");
            }
        }
    }

    private void modifikuotiIkrovosLaika() {
        System.out.println("Pasirinkite kuri automobili norite modifikuoti: ");
        autoParkas.spauzdintiAutoParkoMasinas();
        int id = scanner.nextInt();
        System.out.println("Irasykite ikrovos laika arba kuro sanaudas:");
        int x = scanner.nextInt();
        autoParkas.modifikuotiAuto(id,x);
        iOMainMenu();
    }

    public void modifikuotiRida (){
        System.out.println("Pasirinkite kuri automobili norite modifikuoti: ");
        int id = scanner.nextInt();
        autoParkas.spauzdintiAutoParkoMasinas();
        System.out.println("Irasykite rida:");
        int rida = scanner.nextInt();
        autoParkas.modifikuotiRida(id,rida);
        iOMainMenu();
    }

    // TODO patikrinti jei toks id neegzistuoja ismestu exeption
    private void istrintiAutoPagalPavadinima(){
        System.out.println("Dabartiniai automobiliai auto parke: ");
        autoParkas.spauzdintiAutoParkoMasinas();

        System.out.println("Iveskite automobilio ID: ");
        int id = scanner.nextInt();
        autoParkas.spauzdintiInformacijaApieAutomobili(id);
        System.out.println(" Istrintas");
        autoParkas.istrintiAuto(id);

        iOMainMenu();
    }

    private void autoTipoPasirinkimas(){
        System.out.println("1: Naftos automobilis");
        System.out.println("2: Elektromobilis");
        pasirinkimas = scanner.nextLine();

        switch (pasirinkimas) {
            case "1":
                tipas = 1;
                aktyvus = false;
                autoKurimas();
                break;
            case "2":
                tipas = 2;
                aktyvus = false;
                autoKurimas();
                break;
            default:
                System.out.println("Netinkamas pasirinkimas");
        }
    }

    private void autoKurimas(){
        System.out.println("Iveskite automobilio modeli: ");
        String modelis = scanner.nextLine();
        System.out.println("Iveskite automobilio marke: ");
        String marke = scanner.nextLine();
        System.out.println("Iveskite kaina uz diena: ");
        double kainaUzDiena = scanner.nextDouble();
        System.out.println("Iveskite automobilio pagaminimo metus: ");
        int pagaminimoMetai = scanner.nextInt();
        System.out.println("Iveskite automobilio dabartine rida: ");
        int rida = scanner.nextInt();

        if (tipas == 1){
            System.out.println("Iveskite automobilio kuro sanaudas 100km: ");
            kuroSanaudos = scanner.nextInt();
            autoParkas.pridetiMasinaIAutoParka(new NaftosKuroAutomobilis(marke,modelis,kainaUzDiena,pagaminimoMetai,kuroSanaudos,rida));
        } else if (tipas == 2){
            System.out.println("Iveskite automobilio ikrovos laika: ");
            ikrovosLaikas = scanner.nextInt();
            autoParkas.pridetiMasinaIAutoParka(new ElektrinisAutomobilis(marke,modelis,kainaUzDiena,pagaminimoMetai,ikrovosLaikas,rida));
        } else {
            System.out.println("Blogas pasirinkimas !");
        }
        autoParkas.spauzdintiAutoParkoMasinas();

        iOMainMenu();
    }

}