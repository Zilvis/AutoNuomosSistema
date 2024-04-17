package UI;

import Automobiliai.AutoParkas;
import Klientai.Klientas;

import java.util.Scanner;

public class KlientasIO {

    private boolean aktyvus = true;
    private String pasirinkimas;
    private Scanner scanner = new Scanner(System.in);
    private IOManager ioManager;
    private AutoParkas autoParkas;
    private Klientas klientas = new Klientas();
    public KlientasIO(IOManager ioManager , AutoParkas autoParkas) {
        this.ioManager = ioManager;
        this.autoParkas = autoParkas;
    }

    public void klientoIoMainMenu() {
        aktyvus = true;

        while (aktyvus) {
            System.out.println("1: Sukurti nauja klienta");
            System.out.println("2: Istrinti esama klienta");
            System.out.println("3: Atspauzdinti esamus klientus");
            System.out.println("4: Isnuomuoti klientui masina");
            System.out.println("5: Klientas grazina masina");
            System.out.println("6: Gryzti atgal i pagrindini meniu");
            System.out.println("7: Iseiti");
            pasirinkimas = scanner.nextLine();

            switch (pasirinkimas) {
                case "1":
                    sukurtiNaujaKlienta();
                    aktyvus = false;
                    break;
                case "2":
                    istrintiEsamaKlienta();
                    aktyvus = false;
                    break;
                case "3":
                    klientas.atspauzdintiKlientuSaras();
                    aktyvus = true;
                    break;
                case "4":
                    isnuomuotiMasina();
                    aktyvus = true;
                    break;
                case "5":
                    grazintiMasina();
                    aktyvus = true;
                    break;
                case "6":
                    ioManager.iOMainMenu();
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

    private void grazintiMasina() {
        klientas.spauzdintiIsnuomuotusAutomobilius();
        System.out.println("Isirinkite masina kuria norite grazinti");
        System.out.println("Iveskite ID:");
        int id = scanner.nextInt();
        klientas.grazintiAutoIAutoParka(id,autoParkas);
        klientoIoMainMenu();
    }

    private void isnuomuotiMasina() {
        autoParkas.spauzdintiAutoParkoMasinas();
        System.out.println("Isirinkite masina kuria norite nuomuotis");
        System.out.println("Iveskite ID:");
        int id = scanner.nextInt();
        klientas.isnuomuotiKlientuiMasina(id,autoParkas);

        klientoIoMainMenu();
    }

    private void istrintiEsamaKlienta() {
        System.out.println("Iveskite kliento ID kuri norite istrinti:");
        klientas.atspauzdintiKlientuSaras();
        int id = scanner.nextInt();
        klientas.istrintiKlienta(id);
        klientoIoMainMenu();
    }

    private void sukurtiNaujaKlienta() {
        System.out.println("Iveskite kliento varda:");
        String vardas = scanner.nextLine();
        System.out.println("Iveskite kliento pavarde:");
        String pavarde = scanner.nextLine();
        klientas.sukurtiNaujaKlienta(vardas,pavarde);
        klientoIoMainMenu();
    }
}
