import java.util.Scanner;

public class IOManager {

    private Scanner scanner;
    private int tipas;
    boolean aktyvus = true;

    public IOManager() {
        scanner = new Scanner(System.in);

    }

    public void sukurtiAuto () {

        while (aktyvus) {
            System.out.println("Naujo auto kurimas: ");
            System.out.println("Elektromobilis: ");
            System.out.println("Nafta varomas: ");
            String pasirinkimas = scanner.nextLine();

            switch (pasirinkimas) {
                case "1":
                    setTipas("1");
                    aktyvus = false;
                    break;
                case "2":
                    setTipas("2");
                    aktyvus = false;
                    break;
                default:
                    System.out.println("Netinkamas pasirinkimas");
            }
        }
    }

    private void setTipas (String tipas){
        this.tipas = Integer.parseInt(tipas);
    }

}