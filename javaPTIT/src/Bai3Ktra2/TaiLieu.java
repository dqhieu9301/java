package Bai3Ktra2;

public abstract class TaiLieu {
    private String matailieu;
    private String manhaxuatban;
    private int sobanphathanh;

    public TaiLieu() {

    }

    public TaiLieu(String matailieu , String manhaxuatban , int sobanphathanh) {
        this.matailieu = matailieu;
        this.manhaxuatban = manhaxuatban;
        this.sobanphathanh = sobanphathanh;
    }

    public void setMATAILIEU(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getMATAILIEU() {
        return matailieu;
    }

    public void setMaNHAXUATBAN(String manhaxuatban) {
        this.manhaxuatban = manhaxuatban;
    }

    public String getMANHAXUATBAN() {
        return manhaxuatban;
    }

    public void setsobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    public int getSOBANPHATHANH() {
        return sobanphathanh;
    }
}
