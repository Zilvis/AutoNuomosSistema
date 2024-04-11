import lombok.Getter;
import lombok.Setter;
@Setter

@Getter

public class ElektrinisAutomobilis extends Automobilis{
    private int baterijosIkrovosLaikas;

    public ElektrinisAutomobilis(String marke, String modelis, double kainaUzDiena, int pagaminimoMetai, int baterijosIkrovosLaikas) {
        super(marke, modelis, kainaUzDiena, pagaminimoMetai);
        this.baterijosIkrovosLaikas = baterijosIkrovosLaikas;
    }
}
