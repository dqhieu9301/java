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
public class TuyenXe {
    
    private String ma, hoTenTX;
    private double doanhThu;
    
    public TuyenXe(){
        
    }

    public TuyenXe(String ma, String hoTenTX, double doanhThu) {
        this.ma = ma;
        this.hoTenTX = hoTenTX;
        this.doanhThu = doanhThu;
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTenTX() {
        return hoTenTX;
    }

    public void setHoTenTX(String hoTenTX) {
        this.hoTenTX = hoTenTX;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
}
