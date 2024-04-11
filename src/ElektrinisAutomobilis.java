public class ElektrinisAutomobilis extends Automobilis{
    private int baterijosIkrovosLaikas;

    public int getBaterijosIkrovosLaikas() {
        return baterijosIkrovosLaikas;
    }

    public void setBaterijosIkrovosLaikas(int baterijosIkrovosLaikas) {
        this.baterijosIkrovosLaikas = baterijosIkrovosLaikas;
    }

    public ElektrinisAutomobilis(String marke, String modelis, double kainaUzDiena, int pagaminimoMetai, int baterijosIkrovosLaikas) {
        super(marke, modelis, kainaUzDiena, pagaminimoMetai);
        this.baterijosIkrovosLaikas = baterijosIkrovosLaikas;
    }
}
