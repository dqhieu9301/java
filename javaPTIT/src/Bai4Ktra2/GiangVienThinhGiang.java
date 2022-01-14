package Bai4Ktra2;

public class GiangVienThinhGiang extends GiangVien implements LayLuong{
    private String diachicoquanlamviec;
    private String dienthoaicoquanlamviec;

    public GiangVienThinhGiang()
    {

    }

    public GiangVienThinhGiang(String magiangvien , String tengiangvien , String email , String hocham , String hocvi , String  diachi , String dienthoai , int sogio , double hesoluong , String diachicoquanlamviec , String dienthoaicoquanlamviec)
    {
        super(magiangvien , tengiangvien , email , hocham , hocvi , diachi , dienthoai , sogio , hesoluong);
        this.diachicoquanlamviec = diachicoquanlamviec;
        this.dienthoaicoquanlamviec = dienthoaicoquanlamviec;
    }

    public String getDiachicoquanlamviec() {
        return diachicoquanlamviec;
    }

    public void setDiachicoquanlamviec(String diachicoquanlamviec) {
        this.diachicoquanlamviec = diachicoquanlamviec;
    }

    public String getDienthoaicoquanlamviec() {
        return dienthoaicoquanlamviec;
    }

    public void setSogioquydinh(String dienthoaicoquanlamviec) {
        this.dienthoaicoquanlamviec = dienthoaicoquanlamviec;
    }

    @Override
    public String toString()
    {
        return super.getMagiangvien() + " " + super.getTengiangvien() + " " + super.getEmail() + " " + super.getHocham() + " " + super.getHocvi() + " " + super.getDiachi() + " " + super.getDienthoai() + " " +super.getSogio() + " " + super.getHesoluong() + " " + diachicoquanlamviec + " " + dienthoaicoquanlamviec;
    }

    
    @Override
    public long Laytienluong()
    {
        long res = 0;
        res += 200000 * super.getSogio() ;
        return res;
    }
}
