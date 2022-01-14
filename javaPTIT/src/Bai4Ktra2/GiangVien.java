package Bai4Ktra2;

public abstract class GiangVien {
    private String magiangvien;
    private String tengiangvien;
    private String email;
    private String hocham;
    private String hocvi;
    private String diachi;
    private String dienthoai;
    private int sogio;
    private double hesoluong;


    public GiangVien() 
    {

    }

    public GiangVien(String magiangvien , String tengiangvien , String email , String hocham , String hocvi , String  diachi , String dienthoai , int sogio , double hesoluong)
    {
        this.magiangvien = magiangvien;
        this.tengiangvien = tengiangvien;
        this.email = email;
        this.hocham = hocham;
        this.hocvi = hocvi;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.sogio = sogio;
        this.hesoluong = hesoluong;
    }

    public String getMagiangvien() {
        return magiangvien;
    }

    public void setMagiangvien(String magiangvien) {
        this.magiangvien = magiangvien;
    }

    public String getTengiangvien() {
        return tengiangvien;
    }

    public void setTengiangvien(String tengiangvien) {
        this.tengiangvien = tengiangvien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHocham() {
        return hocham;
    }

    public void setHocham(String hocham) {
        this.hocham = hocham;
    }

    public String getHocvi() {
        return hocvi;
    }

    public void setHocvi(String hocvi) {
        this.hocvi = hocvi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public int getSogio() {
        return sogio;
    }

    public void setSogio(int sogio) {
        this.sogio = sogio;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

}
