package dinhquanghieu;

public abstract class TaiLieu {
    private String matailieu;
    private String tennhaxuatban;
    private int sobanphathanh;

    public TaiLieu() {

    }

    public TaiLieu(String matailieu , String tennhaxuatban , int sobanphathanh) {
        this.matailieu = matailieu;
        this.tennhaxuatban = tennhaxuatban;
        this.sobanphathanh = sobanphathanh;
    }

    public void setMATAILIEU(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getMATAILIEU() {
        return matailieu;
    }

    public void setTENNHAXUATBAN(String tennhaxuatban) {
        this.tennhaxuatban = tennhaxuatban;
    }

    public String getTENNHAXUATBAN() {
        return tennhaxuatban;
    }

    public void setsobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    public int getSOBANPHATHANH() {
        return sobanphathanh;
    }
}
