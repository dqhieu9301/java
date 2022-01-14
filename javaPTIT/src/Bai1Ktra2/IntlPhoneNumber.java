package Bai1Ktra2;

public class IntlPhoneNumber extends SoDienThoai {
      private String maquocgia;
    public IntlPhoneNumber() {

    }

    public IntlPhoneNumber(String mavung , String sdt , String maquocgia) {
        super(mavung , sdt);
        this.maquocgia = maquocgia;
    }

    public void setMAQUOCGIA(String maquocgia) {
        this.maquocgia = maquocgia;
    }

    public String getMAQUOCGIA() {
        return maquocgia;
    }
}
