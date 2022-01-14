package Bai4Ktra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyGiangVien implements Menu{
    private List<GiangVien> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void NhapGiangVienThingGiang()
    {
        System.out.println("Nhap ma giang vien");
        String magiangvien = sc.next();
        String tmp = "^PTIT[0-9]{4}";
        while(!magiangvien.matches(tmp))
        {
            System.out.println("Nhap sai dinh dang");
            System.out.println("Nhap lai!!!");
            magiangvien = sc.next();
        }
        sc.nextLine();
        System.out.println("Nhap ten giang vien");
        String tengiangvien = sc.nextLine();
        System.out.println("Nhap email");
        String email = sc.next();
        sc.nextLine();
        System.out.println("Nhap hoc ham");
        String hocham = sc.nextLine();
        System.out.println("Nhap hoc vi");
        String hocvi = sc.nextLine();
        System.out.println("Nhap dia chi");
        String diachi = sc.nextLine();
        System.out.println("Nhap dien thoai");
        String dienthoai = sc.next();
        System.out.println("Nhap so gio");
        int sogio = sc.nextInt();
        System.out.println("Nhap he so luong");
        double hesoluong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Dia chi co quan lam viec");
        String diachicoquanlamviec = sc.nextLine();
        System.out.println("Nhap dien thoai co quan lam viec");
        String dienthoaicoquanlamviec = sc.next();
        list.add(new GiangVienThinhGiang(magiangvien, tengiangvien, email, hocham, hocvi, diachi, dienthoai, sogio, hesoluong, diachicoquanlamviec, dienthoaicoquanlamviec));
    }
    
    @Override
    public void NhapGiangVienCoHuu() 
    {
        System.out.println("Nhap ma giang vien");
        String magiangvien = sc.next();
        String tmp = "^PTIT[0-9]{4}";
        while(!magiangvien.matches(tmp))
        {
            System.out.println("Nhap sai dinh dang");
            System.out.println("Nhap lai!!!");
            magiangvien = sc.next();
        }
        sc.nextLine();
        System.out.println("Nhap ten giang vien");
        String tengiangvien = sc.nextLine();
        System.out.println("Nhap email");
        String email = sc.next();
        sc.nextLine();
        System.out.println("Nhap hoc ham");
        String hocham = sc.nextLine();
        System.out.println("Nhap hoc vi");
        String hocvi = sc.nextLine();
        System.out.println("Nhap dia chi");
        String diachi = sc.nextLine();
        System.out.println("Nhap dien thoai");
        String dienthoai = sc.next();
        System.out.println("Nhap so gio");
        int sogio = sc.nextInt();
        System.out.println("Nhap luong cung");
        int luongcung = sc.nextInt();
        System.out.println("Nhap he so luong");
        double hesoluong = sc.nextDouble();
        System.out.println("Nhap so gio quy dinh");
        int sogioquydinh = sc.nextInt();
        list.add(new GiangVienCoHuu(magiangvien, tengiangvien, email, hocham, hocvi, diachi, dienthoai, sogio, hesoluong, luongcung , sogioquydinh));
    }

    @Override
    public void Inradanhsachgiangvien() 
    {
        for(int i=0 ; i<list.size() ; i++) System.out.println(list.get(i));
        System.out.println(list.size());
    }

    @Override
    public void XoaGiangVienTheoMa()
    {
        System.out.println("Nhap ma giang vien can xoa");
        String magiangvien = sc.next();
        boolean check = false;
        for(int i=0 ; i<list.size() ; i++)
        {
            if(list.get(i).getMagiangvien().equals(magiangvien))
            {
                list.remove(i);
                check = true;
                break;
            }
        }
        if(check) System.out.println("Xoa thanh cong");
        else System.out.println("Ma giang vien khong ton tai");
    }

    @Override
    public void Inradanhsachgiangviencohuu()
    {
        int count = 0;
        for(int i=0 ; i<list.size() ; i++)
        {
            if(list.get(i) instanceof GiangVienCoHuu) 
            {
                System.out.println(list.get(i));
                count ++;
            }
        }
        System.out.println(count);
    }

    @Override
    public void Inradanhsachgiangvienthinhgiang()
    {
        int count = 0;
        for(int i=0 ; i<list.size() ; i++)
        {
            if(list.get(i) instanceof GiangVienThinhGiang) 
            {
                System.out.println(list.get(i));
                count ++;
            }
        }
        System.out.println(count);
    }

    @Override
    public void Timkiemgiangviengandungtheoma() 
    {
        System.out.println("Nhap ma can tim kiem");
        String tmp = sc.next();
        tmp = tmp.toUpperCase();
        boolean check = false;
        for(int i=0 ; i<list.size() ; i++)
        {
            if(list.get(i).getMagiangvien().contains(tmp)) 
            {
                System.out.println(list.get(i));
                check = true;
            }
        }
        if(!check) System.out.println("Khong tim thay");
    }

    @Override
    public void Sapxeptheoten() 
    {
        Collections.sort(list , new Comparator<GiangVien>(){
            @Override
            public int compare(GiangVien o1 , GiangVien o2)
            {
                String[] tmp1 = o1.getTengiangvien().toLowerCase().split(" ");
                String[] tmp2 = o2.getTengiangvien().toLowerCase().split(" ");
                if(!tmp1[tmp1.length-1].equals(tmp2[tmp2.length-1])) return tmp1[tmp1.length-1].compareTo(tmp2[tmp2.length-1]);
                else
                {
                    String res1 = "";
                    String res2 = "";
                    for(int i=0 ; i<tmp1.length-1 ; i++)  res1 += tmp1[i] + " ";
                    for(int i=0 ; i<tmp2.length-1 ; i++)  res2 += tmp2[i] + " ";
                    return res1.compareTo(res2);
                }

            }
        });
        for(int i=0 ; i<list.size() ; i++) System.out.println(list.get(i));
    }

    @Override
    public void Tongsoluongtatcagiangvien() 
    {
        long res = 0;
        for(int i=0 ; i<list.size() ; i++) 
        {
            if(list.get(i) instanceof GiangVienCoHuu) 
            {
                GiangVienCoHuu cohuu = new GiangVienCoHuu();
                cohuu = (GiangVienCoHuu)list.get(i);
                res += cohuu.Laytienluong();
            }
            else
            {
                GiangVienThinhGiang thinhgiang = new GiangVienThinhGiang();
                thinhgiang = (GiangVienThinhGiang)list.get(i);
                res += thinhgiang.Laytienluong();
            }
        }
        System.out.println(res);
    }

    @Override
    public void Giangviencoluongcaonhat()
    {
        int x = 0;
        long tmp = 0;
        for(int i=0 ; i<list.size() ; i++)
        {
            if(list.get(i) instanceof GiangVienCoHuu) 
            {
                GiangVienCoHuu cohuu = new GiangVienCoHuu();
                cohuu = (GiangVienCoHuu)list.get(i);
                if(tmp < cohuu.Laytienluong()) 
                {
                    tmp = cohuu.Laytienluong();
                    x = i;
                }
            }
            else
            {
                GiangVienThinhGiang thinhgiang = new GiangVienThinhGiang();
                thinhgiang = (GiangVienThinhGiang)list.get(i);
                if(tmp < thinhgiang.Laytienluong()) 
                {
                    tmp = thinhgiang.Laytienluong();
                    x = i;
                }
            }
        }
        System.out.println(list.get(x));
    }
}
