package Bai1Ktra2;

public abstract class SoDienThoai {
    private String mavung;
    private String sdt;

    public SoDienThoai() {

    }

    public SoDienThoai(String mavung , String sdt) {
        this.mavung = mavung;
        this.sdt = sdt;
    }

    public void setMAVUNG(String mavung) {
        this.mavung = mavung;
    } 
    public void setSDT(String sdt) {
        this.sdt =sdt;
    } 

    public String getMAVUNG() {
        return mavung;
    } 

    public String getSDT() {
        return sdt;
    }

    public int laySDT() {
        return Integer.parseInt(sdt);
    }
}
