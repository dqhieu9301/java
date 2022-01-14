package Bai6Ktra2;


public abstract class Giaodich {
    private String magiaodich;
    private String ngaygiaodich;
    private int dongia;
    private int soluong;

    public Giaodich() {

    }


    public Giaodich(String magiaodich , String ngaygiaodich , int dongia , int soluong) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public void setMAGIAODICH(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public void setNGAYGIAODICH(String ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public void setDONGIA(int dongia) {
        this.dongia = dongia;
    }

    public void setSOLUONG(int soluong) {
        this.soluong = soluong;
    }

    public String getMAGIAODICH() {
        return magiaodich;
    }

    public String getNGAYGIAODICH() {
        return ngaygiaodich;
    }

    public int getDONGIA() {
        return dongia;
    }

    public int getSOLUONG() {
        return soluong;
    }

}
