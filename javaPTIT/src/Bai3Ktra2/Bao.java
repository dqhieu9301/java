package Bai3Ktra2;

import java.util.Date;

public class Bao extends TaiLieu{
    private Date date ;

    public Bao() {

    }

    public Bao(String matailieu , String manhaxuatban , int sobanphathanh , Date date) {
        super(matailieu,manhaxuatban,sobanphathanh);
        this.date = date;
    }

    public void setDATE(Date date) {
        this.date = date;
    }

    public Date getDATE() {
        return date;
    }

    @Override
    public String toString() 
    {
        return super.getMATAILIEU() + " " + super.getMANHAXUATBAN() + " " + super.getSOBANPHATHANH() + " " + date;
    }
}
