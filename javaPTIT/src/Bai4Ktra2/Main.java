package Bai4Ktra2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kt = true;
        int choose;
        QuanLyGiangVien gv = new QuanLyGiangVien();
        while(kt)
        {
            System.out.println("-------Menu-------");
            System.out.println("0.Thoat");
            System.out.println("1.Them giang vien co huu");
            System.out.println("2.Them giang vien thinh giang");
            System.out.println("3.in ra danh sach giang vien");
            System.out.println("4.in ra danh sach giang vien co huu");
            System.out.println("5.on ra danh sach giang vien thinh giang");
            System.out.println("6.tim kiem giang vien gan dung theo ma");
            System.out.println("7.sap xep theo ho ten");
            System.out.println("8.Tong so luong cac giang vien");
            System.out.println("9.Giang vien co so luong cao nhat");
            choose = in.nextInt();
            in.nextLine();
            switch(choose) {
                case 0:
                    kt = false;
                    break;
                case 1:
                    gv.NhapGiangVienCoHuu();
                    break;
                case 2:
                    gv.NhapGiangVienThingGiang();
                    break;
                case 3:
                    gv.Inradanhsachgiangvien();
                    break;
                case 4:
                    gv.Inradanhsachgiangviencohuu();
                    break;
                case 5:
                    gv.Inradanhsachgiangvienthinhgiang();
                    break;
                case 6:
                    gv.Timkiemgiangviengandungtheoma();
                    break;
                case 7:
                    gv.Sapxeptheoten();
                    break;
                case 8:
                    gv.Tongsoluongtatcagiangvien();
                    break;
                case 9:
                    gv.Giangviencoluongcaonhat();
                    break;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
        }
        in.close();
    }
}