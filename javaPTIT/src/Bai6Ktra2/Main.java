package Bai6Ktra2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kt = true;
        int choose;
        Quanlygiaodich ql = new Quanlygiaodich();
        while(kt) {
            System.out.println("-------Menu-------");
            System.out.println("1.Them Giao Dich Vang");
            System.out.println("2.Them Giao Dich Tien Te");
            System.out.println("3.Hien thi tat ca giao dich");
            System.out.println("4.Hien thi cac giao dich theo ngay");
            System.out.println("5.Tinh tong so tien tat ca giao dich");
            choose = in.nextInt();
            in.nextLine();
            switch(choose) {
                case 1:
                    ql.Nhapgiaodichvang();
                    break;
                case 2:
                    ql.Nhapgiaodichtiente();
                    break;
                case 3:
                    ql.Hienthigiaodich();
                    break;
                case 4:
                    ql.Sapxeptheongay();
                    break;
                case 5:
                    ql.Laysoluongcacgiaodich();
                    break;
                default:
                    kt = false;
                    break;
            }
        }
        in.close();
    }
}
