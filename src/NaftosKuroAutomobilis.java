import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NaftosKuroAutomobilis extends Automobilis {
    private int kuroSanaudos;

    public NaftosKuroAutomobilis(String marke, String modelis, double kainaUzDiena, int pagaminimoMetai, int kuroSanaudos) {
        super(marke, modelis, kainaUzDiena, pagaminimoMetai);
        this.kuroSanaudos = kuroSanaudos;
    }
}
