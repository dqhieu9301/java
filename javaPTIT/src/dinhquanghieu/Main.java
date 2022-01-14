package dinhquanghieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kt = true;
        int choose;
        QLTV ql = new QLTV();
        while(kt) {
            System.out.println("-------Menu-------");
            System.out.println("0.Thoat");
            System.out.println("1.Nhap sach");
            System.out.println("2.Nhap bao");
            System.out.println("3.In ra danh sach cac tai lieu");
            System.out.println("4.Sap xep theo ten nha xuat ban");
            System.out.println("5.Tim kiem tai lieu theo so ban phat hanh tu a - b");
            System.out.println("6.Dua ra tong sach theo ten tac gia");
            choose = in.nextInt();
            in.nextLine();
            switch(choose) {
                case 0:
                     kt= false;
                     break;
                case 1:
                    ql.Nhapsach();
                    break;
                case 2:
                    ql.NhapBao();
                    break;
                case 3:
                    ql.Inradanhsach();;
                    break;
                case 4:
                    ql.Sapxeptheonhaxuatban();
                    break;
                case 5:
                    ql.Timkiem();
                    break;
                case 6:
                    ql.Duaratongsachtheotacgia();
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
        }
        in.close();
    }
}
