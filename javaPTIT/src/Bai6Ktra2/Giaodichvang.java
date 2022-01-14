package Bai6Ktra2;

public class Giaodichvang extends Giaodich implements Tinhgia{
    private String loaivang;

    public Giaodichvang(String magiaodich , String ngaygiaodich , int dongia , int soluong , String loaivang) {
        super(magiaodich,ngaygiaodich,dongia,soluong);
        this.loaivang = loaivang;
    }

    public Giaodichvang() {

    }

    public void setLOAIVANG(String loaivang) {
        this.loaivang = loaivang;
    }

    public String getLOAIVANG() {
        return loaivang;
    }

    @Override
    public int laygia() {
        return super.getDONGIA() * super.getSOLUONG();
    }
    @Override
    public String toString() {
        return super.getMAGIAODICH() + " " + super.getNGAYGIAODICH() + " " + super.getDONGIA() + " " + super.getSOLUONG() + " " + loaivang;
    }

}
