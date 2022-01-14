/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiKtra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLXeBus implements IChucNang{
    private List<TuyenXe> list = new ArrayList<>();
    private List<String> manoituyen = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void Nhapxenoithanh() {
        System.err.println("Nhap ma xe");
        String ma = sc.next();
        String tmp = "^NONG[0-9]{2}";
        while(!ma.contains(tmp) || !manoituyen.contains(ma)) {
            System.out.println("Nhap lai");
            ma = sc.next();
        }
        System.out.println("Nhap ho ten");
        String hoten = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap so hieu");
        String sohieu = sc.next();
        System.out.println("Nhap so luot di duoc");
        int soluot = sc.nextInt();
        list.add(new NoiTuyen(ma, hoten, 0.0, sohieu, soluot));
    }

    @Override
    public void Inradanhsach() {
        List<TuyenXe> noituyen = new ArrayList<>();
        List<TuyenXe> ngoaituyen = new ArrayList<>();

        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i) instanceof NoiTuyen) noituyen.add(list.get(i));
            else ngoaituyen.add(list.get(i));
        }

        System.out.println("danh sach xe noi tuyen");
        for(int i=0 ; i<noituyen.size() ; i++) {
            System.out.println(noituyen.get(i));
        }
        System.out.println(noituyen.size());
        System.out.println("danh sach xe ngoai tuyen");
        for(int i=0 ; i<ngoaituyen.size() ; i++) {
            System.out.println(ngoaituyen.get(i));
        }
        System.out.println(ngoaituyen.size());
    }

    @Override
    public void Suatuyenxe() {
        System.out.println("Nhap ma xe noi thanh muon sua");
        String maxe = sc.next();
        sc.nextLine();
        boolean check = false;
        for(int i=0 ; i<list.size() ; i++) {
            if(maxe.toUpperCase().equals(list.get(i).getMa()) && list.get(i) instanceof NoiTuyen) {
                NoiTuyen noi = new NoiTuyen();
                System.out.println("Nhap ho ten muon sua");
                String hoten = sc.nextLine();
                sc.nextLine();
                noi.setHoTenTX(hoten);
                System.out.println("Nhap so hieu tuyen muon sua ");
                String sohieu = sc.next();
                noi.setSoHieuTuyen(sohieu);
                System.out.println("Nhap so luot di duoc muon sua");
                int soluot = sc.nextInt();
                noi.setSoLuotDiDc(soluot);
                list.remove(list.get(i));
                list.add(noi);
                check = true;
                break;
            }
        }
        if(!check) System.out.println("ma khong ton tai");
    }

}
