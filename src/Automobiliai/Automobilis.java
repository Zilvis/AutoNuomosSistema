package Automobiliai;

public class Automobilis {
    private String marke, modelis;
    private double kainaUzDiena;
    private int pagaminimoMetai;
    private int rida;

    public Automobilis(String marke, String modelis, double kainaUzDiena, int pagaminimoMetai, int rida) {
        this.marke = marke;
        this.modelis = modelis;
        this.kainaUzDiena = kainaUzDiena;
        this.pagaminimoMetai = pagaminimoMetai;
        this.rida = rida;
    }

    public double getKainaUzDiena() {
        return kainaUzDiena;
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

    public void setKainaUzDiena(double kainaUzDiena) {
        this.kainaUzDiena = kainaUzDiena;
    }

    public int getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public int getRida() {
        return rida;
    }

    public void setRida(int rida) {
        this.rida = rida;
    }

    @Override
    public String toString() {
        return "Automobiliai.Automobilis{" +
                "marke='" + marke + '\'' +
                ", modelis='" + modelis + '\'' +
                ", kainaUzDiena=" + kainaUzDiena +
                ", pagaminimoMetai=" + pagaminimoMetai +
                ", rida=" + rida +
                '}';
    }


}
