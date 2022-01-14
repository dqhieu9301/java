package Bai3Ktra2;

public class TapChi extends TaiLieu{
    private int sophathanh;
    private int thangphathanh;

    public TapChi() {

    }

    public TapChi(String matailieu , String manhaxuatban , int sobanphathanh , int sophathanh , int thangphathanh) {
        super(matailieu,manhaxuatban,sobanphathanh);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public void setSOPHATHANH(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getSOPHATHANH() {
        return sophathanh;
    }


    public void setTHANGPHATHANH(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }

    public int getTHANGPHATHANH() {
        return thangphathanh;
    }

    @Override
    public String toString() 
    {
        return super.getMATAILIEU() + " " + super.getMANHAXUATBAN() + " " + super.getSOBANPHATHANH() + " " + sophathanh + " " + thangphathanh;
    }
}
