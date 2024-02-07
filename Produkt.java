package main.ProduktDemo;

public class Produkt {


    protected int produktID;
    protected String namn;
    protected String Färg;
    protected String Märke;
    protected int StorlekID;
    protected int prisID;
    protected int beställID;
    protected int KategoriID;


    public Produkt(){}

    public Produkt(int produktID, String namn, String färg, String märke, int storlekID, int prisID, int beställID, int kategoriID) {
        this.produktID = produktID;
        this.namn = namn;
        Färg = färg;
        Märke = märke;
        StorlekID = storlekID;
        this.prisID = prisID;
        this.beställID = beställID;
        this.KategoriID = kategoriID;
    }

    public int getProduktID() {
        return produktID;
    }

    public void setProduktID(int produktID) {
        this.produktID = produktID;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getFärg() {
        return Färg;
    }

    public void setFärg(String färg) {
        Färg = färg;
    }

    public String getMärke() {
        return Märke;
    }

    public void setMärke(String märke) {
        Märke = märke;
    }

    public int getStorlekID() {
        return StorlekID;
    }

    public void setStorlekID(int storlekID) {
        StorlekID = storlekID;
    }

    public int getPrisID() {
        return prisID;
    }

    public void setPrisID(int prisID) {
        this.prisID = prisID;
    }

    public int getBeställID() {
        return beställID;
    }

    public void setBeställID(int beställID) {
        this.beställID = beställID;
    }

    public int getKategoriID() {return KategoriID;}

    public void setKategoriID(int kategoriID) {KategoriID = kategoriID;}

    public Produkt(int kategoriID) {KategoriID = kategoriID;}
}
