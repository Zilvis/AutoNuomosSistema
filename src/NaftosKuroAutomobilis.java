public class NaftosKuroAutomobilis extends Automobilis {
    private int kuroSanaudos;

    public NaftosKuroAutomobilis(String marke, String modelis, double kainaUzDiena, int pagaminimoMetai, int kuroSanaudos) {
        super(marke, modelis, kainaUzDiena, pagaminimoMetai);
        this.kuroSanaudos = kuroSanaudos;
    }

    public int getKuroSanaudos() {
        return kuroSanaudos;
    }

    public void setKuroSanaudos(int kuroSanaudos) {
        this.kuroSanaudos = kuroSanaudos;
    }
}
