package dinhquanghieu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class QLTV implements IChucNang{
    private List<TaiLieu> list = new ArrayList<>();
    private List<String> masach = new ArrayList<>();
    private List<String> mabao = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void Nhapsach()
    {
        System.out.println("Nhap ma tai lieu");
        String matailieu = sc.next();
        while(masach.contains(matailieu)) {
            System.out.println("Ma da ton tai");
            matailieu = sc.next();
        }
        masach.add(matailieu);
        System.out.println("Nhap ten nha xuat ban");
        String tennhaxuatban = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap so ban phat hanh");
        int sobanphathanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten tac gia");
        String tentacgia = sc.nextLine();
        System.out.println("Nhap ten sach");
        String tensach = sc.nextLine();
        System.out.println("Nhap so trang");
        int sotrang = sc.nextInt();
        list.add(new Sach(matailieu, tennhaxuatban, sobanphathanh, tentacgia, tensach, sotrang));
    }

    @Override
    public void NhapBao() {
        System.out.println("Nhap ma tai lieu");
        String matailieu = sc.next();
        while(masach.contains(matailieu)) {
            System.out.println("Ma da ton tai");
            matailieu = sc.next();
            mabao.add(matailieu);
        }
        mabao.add(matailieu);
        System.out.println("Nhap ma nha xuat ban");
        String manhaxuatban = sc.next();
        System.out.println("Nhap so ban phat hanh");
        int sobanphathanh = sc.nextInt();
        System.out.println("Nhap ngay phat hanh");
        String ngayphathanh = sc.next();
        String tmp = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        while(!ngayphathanh.matches(tmp)) {
            System.out.println("Nhap sai");
            ngayphathanh = sc.next();
        }
        list.add(new Bao(matailieu, manhaxuatban, sobanphathanh, ngayphathanh));
    }

    @Override
    public void Inradanhsach() {
        for(int i=0 ; i<list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
    }

    @Override
    public void Sapxeptheonhaxuatban() {
        Collections.sort( list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1 , TaiLieu o2) {
                return o1.getTENNHAXUATBAN().compareTo(o2.getTENNHAXUATBAN());
            }
        });
        for(int i=0 ; i<list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    @Override
    public void Timkiem() {
        boolean kt= false;
        System.out.println("Nhap tim kiem tu a - b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i).getSOBANPHATHANH() >= a && list.get(i).getSOBANPHATHANH() <= b) {
                System.out.println(list.get(i));
                kt =true;
            }
        }
        if(kt == false) System.out.println("Khong tim thay");
    }

    @Override
    public void Duaratongsachtheotacgia() {
        List<String> namebook = new ArrayList<>();
        int[] arr = new int[100000];
        Arrays.fill(arr, 1);
        for(int i=0 ; i<list.size() ; i++)
        {
            if(list.get(i) instanceof Sach)
            {
                Sach book = new Sach();
                book = (Sach)list.get(i);
                if(!namebook.contains(book.getTENTACGIA())) namebook.add(book.getTENTACGIA());
                else
                {
                    arr[namebook.indexOf(book.getTENTACGIA())] ++;
                }
            }
        }
        for(int i=0 ; i<namebook.size() ; i++)
        {
            System.out.println(namebook.get(i) + " " + arr[i]);
        }
    }
}
