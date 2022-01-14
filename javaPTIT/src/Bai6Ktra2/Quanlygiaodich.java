package Bai6Ktra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Quanlygiaodich implements Menu {
    private List<Giaodich> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void Nhapgiaodichvang() {
        System.out.println("Nhap ma giao dich");
        String mgd = sc.next();
        System.out.println("Nhap ngay giao dich");
        String temp = "[0-9]{1,2}[,]{1}[0-9]{1,2}[,]{1}[0-9]{4}";
        String ngd = sc.next();
        while(!ngd.matches(temp)) {
            System.out.println("Nhap lai ngay giao dich");
            ngd = sc.next();
        }
        System.out.println("Nhap don gia");
        int dongia = sc.nextInt();
        System.out.println("Nhap so luong");
        int soluong = sc.nextInt();
        System.out.println("Nhap loai vang");
        String loaivang = sc.next();
        list.add(new Giaodichvang(mgd, ngd, dongia, soluong, loaivang));
    }

    @Override
    public void Nhapgiaodichtiente() {
        System.out.println("Nhap ma giao dich");
        String mgd = sc.next();
        System.out.println("Nhap ngay giao dich");
        String temp = "[0-9]{1,2}[,]{1}[0-9]{1,2}[,]{1}[0-9]{4}";
        String ngd = sc.next();
        while(!ngd.matches(temp)) {
            System.out.println("Nhap lai ngay giao dich");
            ngd = sc.next();
        }
        System.out.println("Nhap don gia");
        int dongia = sc.nextInt();
        System.out.println("Nhap so luong");
        int soluong = sc.nextInt();
        System.out.println("Nhap ti gia");
        int tigia = sc.nextInt();
        System.out.println("Nhap loai tien te");
        String loaitiente = sc.next();
        list.add(new Giaodichtiente(mgd, ngd, dongia, soluong, tigia, loaitiente));
    }

    @Override
    public void Hienthigiaodich() {
        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i) instanceof Giaodichvang) System.out.println("Giao dich vang " + list.get(i));
            else System.out.println("Giao dich tien te " + list.get(i));
        }
    }
    @Override
    public void Sapxeptheongay() {
        List<Giaodich> lt = new ArrayList<>();
        for(int i=0 ; i<list.size() ; i++) lt.add(list.get(i));
        Collections.sort(lt , new Comparator<Giaodich>() {
            @Override
            public int compare(Giaodich o1, Giaodich o2) {
                String[] tmp1 = o1.getNGAYGIAODICH().split(",");
                String[] tmp2 = o2.getNGAYGIAODICH().split(",");
                if(tmp1[2] == tmp2[2]) {
                    if(tmp1[1] == tmp2[1]) return tmp1[0].compareTo(tmp2[0]);
                    else return tmp1[1].compareTo(tmp2[1]); 
                }
                else return tmp1[2].compareTo(tmp2[2]);
            }
        });
        for(int i=0 ; i<lt.size() ; i++) {
            if(lt.get(i) instanceof Giaodichvang) System.out.println("Giao dich vang " + lt.get(i));
            else System.out.println("Giao dich tien te " + lt.get(i));
        }
    }

    @Override
    public void Laysoluongcacgiaodich() {
        long sum = 0;
        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i) instanceof Giaodichvang) {
                Giaodichvang v = new Giaodichvang();
                v = (Giaodichvang)list.get(i);
                sum += v.laygia();
            }
            else {
                Giaodichtiente t = new Giaodichtiente();
                t = (Giaodichtiente)list.get(i);
                sum += t.laygia();
            }
        }
        System.out.println(sum);
    }

}
