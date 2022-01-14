package Bai6Ktra2;

public class Giaodichtiente extends Giaodich implements Tinhgia{
    private int tigia;
    private String loaitiente;

    public Giaodichtiente(String magiaodich , String ngaygiaodich , int dongia , int soluong , int tigia , String loaitiente) {
        super(magiaodich,ngaygiaodich,dongia,soluong);
        this.tigia = tigia;
        this.loaitiente = loaitiente;
    }

    public Giaodichtiente() {

    }

    public void setTIGIA(int tigia) {
        this.tigia = tigia;
    }

    public int getTIGIA() {
        return tigia;
    }

    public void setLOAITIENTE(String loaitiente) {
        this.loaitiente = loaitiente;
    }

    public String getLOAITIENTE() {
        return loaitiente;
    }

    @Override
    public int laygia() {
        if(loaitiente == "Viet Nam") return super.getSOLUONG() * super.getDONGIA();
        else return super.getSOLUONG() * super.getDONGIA() * tigia;
    }
    @Override
    public String toString() {
        return super.getMAGIAODICH() + " " + super.getNGAYGIAODICH() + " " + super.getDONGIA() + " " + super.getSOLUONG() + " " + tigia + " " + loaitiente;
    }
}
