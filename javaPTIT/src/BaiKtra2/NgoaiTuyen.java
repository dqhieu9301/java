/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiKtra2;

/**
 *
 * @author Admin
 */
public class NgoaiTuyen extends TuyenXe implements ITinhDThu{
    private String noiDen;
    private double soKmDiDc;

    public NgoaiTuyen() {
    }

    public NgoaiTuyen(String noiDen, double soKmDiDc) {
        this.noiDen = noiDen;
        this.soKmDiDc = soKmDiDc;
    }

    public NgoaiTuyen(String ma, String hoTenTX, double doanhThu, String noiDen, double soKmDiDc) {
        super(ma, hoTenTX, doanhThu);
        this.noiDen = noiDen;
        this.soKmDiDc = soKmDiDc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getSoKmDiDc() {
        return soKmDiDc;
    }

    public void setSoKmDiDc(double soKmDiDc) {
        this.soKmDiDc = soKmDiDc;
    }
    
    
    
    
}
