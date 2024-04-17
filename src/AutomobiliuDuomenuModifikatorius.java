import java.util.InputMismatchException;
import java.util.Scanner;

public class AutomobiliuDuomenuModifikatorius {
    private Scanner scanner = new Scanner(System.in);

    public void modifikuotiAuto (NaftosKuroAutomobilis auto){
        System.out.println(auto.toString());
        System.out.println("Iveskite naujas kuro sanaudas");
        try {
            auto.setKuroSanaudos(scanner.nextInt());
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Turite ivesti skaiciu!");
        }
        System.out.println(auto);
    }

    public void modifikuotiAuto (ElektrinisAutomobilis auto){
        System.out.println(auto.toString());
        System.out.println("Iveskite nauja ikrovos laika");
        try {
            auto.setBaterijosIkrovosLaikas(scanner.nextInt());
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Turite ivesti skaiciu!");
        }
        System.out.println(auto);
    }

    public void keistiRida (Automobilis auto){
        System.out.println(auto.toString());
        System.out.println("Nauja rida: ");

        try {
            auto.setRida(scanner.nextInt());
        } catch (InputMismatchException e ){
            throw new InputMismatchException("Turite ivesti skaiciu!");
        }
        System.out.println(auto);
    }
}
