package Bai4Ktra2;


public class GiangVienCoHuu extends GiangVien implements LayLuong{
    private int luongcung;
    private int sogioquydinh;

    public GiangVienCoHuu()
    {

    }

    public GiangVienCoHuu(String magiangvien , String tengiangvien , String email , String hocham , String hocvi , String  diachi , String dienthoai , int sogio , double hesoluong , int luongcung , int sogioquydinh)
    {
        super(magiangvien , tengiangvien , email , hocham , hocvi , diachi , dienthoai , sogio , hesoluong);
        this.luongcung = luongcung;
        this.sogioquydinh = sogioquydinh;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    public int getSogioquydinh() {
        return sogioquydinh;
    }

    public void setSogioquydinh(int sogioquydinh) {
        this.sogioquydinh = sogioquydinh;
    }

    @Override
    public String toString()
    {
        return super.getMagiangvien() + " " + super.getTengiangvien() + " " + super.getEmail() + " " + super.getHocham() + " " + super.getHocvi() + " " + super.getDiachi() + " " + super.getDienthoai() + " " +super.getSogio() + " " + super.getHesoluong() + " " + sogioquydinh;
    }

    @Override
    public long Laytienluong()
    {
        long res = 0;
        res += luongcung * super.getHesoluong();
        if(sogioquydinh <= super.getSogio()) res += 50000 * ( super.getSogio() - sogioquydinh);
        return res;
    }
}
