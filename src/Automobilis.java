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

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public double getKainaUzDiena() {
        return kainaUzDiena;
    }

    public void setKainaUzDiena(double kainaUzDiena) {
        this.kainaUzDiena = kainaUzDiena;
    }

    public int getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "marke='" + marke + '\'' +
                ", modelis='" + modelis + '\'' +
                ", kainaUzDiena=" + kainaUzDiena +
                ", pagaminimoMetai=" + pagaminimoMetai +
                '}';
    }
}
