package dinhquanghieu;

public class Sach extends TaiLieu implements ITinhGia{
    private String tentacgia;
    private String tensach;
    private int sotrang;

    public Sach() {

    }

    public Sach(String matailieu , String tennhaxuatban , int sobanphathanh , String tentacgia , String tensach , int sotrang) {
        super(matailieu,tennhaxuatban,sobanphathanh);
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
        return super.getMATAILIEU() + " " + super.getTENNHAXUATBAN() + " " + super.getSOBANPHATHANH() + " " + tentacgia + " " +  tensach + " " + sotrang +getGia();
    }

    @Override
    public double getGia() {
        double res = 0;
        if(super.getSOBANPHATHANH() > 300) res = sotrang * 200 * super.getSOBANPHATHANH();
        else{
            res = sotrang * 200 * 0.8 * super.getSOBANPHATHANH();
        }
        return res;
    }
}
