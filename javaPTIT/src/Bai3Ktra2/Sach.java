package Bai3Ktra2;

public class Sach extends TaiLieu{
    private String tentacgia;
    private String tensach;
    private int sotrang;

    public Sach() {

    }

    public Sach(String matailieu , String manhaxuatban , int sobanphathanh , String tentacgia , String tensach , int sotrang) {
        super(matailieu,manhaxuatban,sobanphathanh);
        this.tentacgia = tentacgia;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }

    public void setTENTACGIA(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getTENTACGIA() {
        return tentacgia;
    }

    public void setTENSACH(String tensach) {
        this.tensach = tensach;
    }

    public String getTENSACH() {
        return tensach;
    }

    public void setSOTRANG(int sotrang) {
        this.sotrang = sotrang;
    }

    public int getSOTRANG() {
        return sotrang;
    }

    @Override
    public String toString() 
    {
        return super.getMATAILIEU() + " " + super.getMANHAXUATBAN() + " " + super.getSOBANPHATHANH() + " " + tentacgia + " " +  tensach + " " + sotrang;
    }
}
