import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Automobilis {
    private String marke, modelis;
    private double kainaUzDiena;
    private int pagaminimoMetai;

    public Automobilis(String marke, String modelis, double kainaUzDiena, int pagaminimoMetai) {
        this.marke = marke;
        this.modelis = modelis;
        this.kainaUzDiena = kainaUzDiena;
        this.pagaminimoMetai = pagaminimoMetai;
    }
}
