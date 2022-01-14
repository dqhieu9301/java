package dinhquanghieu;

public class Bao extends TaiLieu implements ITinhGia{
    private String ngayphathanh ;

    public Bao() {

    }

    public Bao(String matailieu , String manhaxuatban , int sobanphathanh ,String ngayphathanh) {
        super(matailieu,manhaxuatban,sobanphathanh);
        this.ngayphathanh = ngayphathanh;
    }

    public void setNGAYPHATHANH(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    public String getNGAYPHATHANH() {
        return ngayphathanh;
    }

    @Override
    public String toString() 
    {
        return super.getMATAILIEU() + " " + super.getTENNHAXUATBAN() + " " + super.getSOBANPHATHANH() + " " + ngayphathanh + " " + getGia();
    }

    @Override
    public double getGia() {
        double res = 0;
        if(super.getSOBANPHATHANH() > 300) res = 10000 * super.getSOBANPHATHANH();
        else{
            res = 9000 * super.getSOBANPHATHANH();
        }
        return res;
    }
}
