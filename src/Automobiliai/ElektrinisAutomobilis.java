package Automobiliai;

public class ElektrinisAutomobilis extends Automobilis{
    private int baterijosIkrovosLaikas;

    public ElektrinisAutomobilis(String marke, String modelis, double kainaUzDiena, int pagaminimoMetai, int rida, int baterijosIkrovosLaikas) {
        super(marke, modelis, kainaUzDiena, pagaminimoMetai, rida);
        this.baterijosIkrovosLaikas = baterijosIkrovosLaikas;
    }

    public int getBaterijosIkrovosLaikas() {
        return baterijosIkrovosLaikas;
    }

    public void setBaterijosIkrovosLaikas(int baterijosIkrovosLaikas) {
        this.baterijosIkrovosLaikas = baterijosIkrovosLaikas;
    }

    @Override
    public String toString() {
        return super.toString() + " ikrovos laikas: " + baterijosIkrovosLaikas;
    }
}
