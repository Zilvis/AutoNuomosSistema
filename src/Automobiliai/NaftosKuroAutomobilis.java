package Automobiliai;

public class NaftosKuroAutomobilis extends Automobilis {
    private int kuroSanaudos;

    public NaftosKuroAutomobilis(String marke, String modelis, double kainaUzDiena, int pagaminimoMetai, int rida, int kuroSanaudos) {
        super(marke, modelis, kainaUzDiena, pagaminimoMetai, rida);
        this.kuroSanaudos = kuroSanaudos;
    }

    public int getKuroSanaudos() {
        return kuroSanaudos;
    }

    public void setKuroSanaudos(int kuroSanaudos) {
        this.kuroSanaudos = kuroSanaudos;
    }

    @Override
    public String toString() {
        return super.toString() + " kuroSanaudos=" + kuroSanaudos;
    }
}
