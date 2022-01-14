package Bai3Ktra2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kt = true;
        int choose;
        QuanLyTaiLieu ql = new QuanLyTaiLieu();
        while(kt) {
            System.out.println("-------Menu-------");
            System.out.println("1.Them Sach");
            System.out.println("2.Them Tap chi");
            System.out.println("3.Them bao");
            System.out.println("4.In ra tat ca cac loai sach");
            System.out.println("5.Thong ke sach theo tac gia");
            choose = in.nextInt();
            in.nextLine();
            switch(choose) {
                case 1:
                    ql.Nhapsach();;
                    break;
                case 2:
                    ql.Nhaptapchi();
                    break;
                case 3:
                    ql.NhapBao();
                    break;
                case 4:
                    ql.Inrathongtincactailieu();
                    break;
                case 5:
                    ql.Tongsosachtheotentacgia();
                    break;
                default:
                    kt = false;
                    break;
            }
        }
        in.close();
    }
}
