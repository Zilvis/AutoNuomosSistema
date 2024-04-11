import java.util.Scanner;

public class IOManager {

    private Scanner scanner;
    private int tipas;
    boolean iseitiIsPasirinkimu = true;

    public IOManager() {
        scanner = new Scanner(System.in);

    }

    public void sukurtiAuto () {

        while (iseitiIsPasirinkimu) {
            System.out.println("Pasirinkite naujo auto tipa 1): Elektromobilis 2): Kuru vaziuojantis ");
            String pasirinkimas = scanner.nextLine();

            switch (pasirinkimas) {
                case "1":
                    setTipas("1");
                    iseitiIsPasirinkimu = false;
                    break;
                case "2":
                    setTipas("2");
                    iseitiIsPasirinkimu = false;
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