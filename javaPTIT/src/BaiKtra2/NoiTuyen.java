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
public class NoiTuyen extends TuyenXe implements ITinhDThu{
    private String soHieuTuyen;
    private int soLuotDiDc;

    public NoiTuyen() {
    }

    public NoiTuyen(String soHieuTuyen, int soLuotDiDc) {
        this.soHieuTuyen = soHieuTuyen;
        this.soLuotDiDc = soLuotDiDc;
    }

    public NoiTuyen(String ma, String hoTenTX, double doanhThu, String soHieuTuyen, int soLuotDiDc) {
        super(ma, hoTenTX, doanhThu);
        this.soHieuTuyen = soHieuTuyen;
        this.soLuotDiDc = soLuotDiDc;
    }

    public String getSoHieuTuyen() {
        return soHieuTuyen;
    }

    public void setSoHieuTuyen(String soHieuTuyen) {
        this.soHieuTuyen = soHieuTuyen;
    }

    public int getSoLuotDiDc() {
        return soLuotDiDc;
    }

    public void setSoLuotDiDc(int soLuotDiDc) {
        this.soLuotDiDc = soLuotDiDc;
    }
    
    
    
}
