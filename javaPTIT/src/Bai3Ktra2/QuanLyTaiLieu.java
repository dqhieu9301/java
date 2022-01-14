package Bai3Ktra2;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class QuanLyTaiLieu implements Menu{
    private List<TaiLieu> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void Nhapsach()
    {
        System.out.println("Nhap ma tai lieu");
        String matailieu = sc.next();
        System.out.println("Nhap ma nha xuat ban");
        String manhaxuatban = sc.next();
        System.out.println("Nhap so ban phat hanh");
        int sobanphathanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten tac gia");
        String tentacgia = sc.nextLine();
        System.out.println("Nhap ten sach");
        String tensach = sc.nextLine();
        System.out.println("Nhap so trang");
        int sotrang = sc.nextInt();
        list.add(new Sach(matailieu, manhaxuatban, sobanphathanh, tentacgia, tensach, sotrang));
    }

    @Override
    public void Nhaptapchi()
    {
        
        System.out.println("Nhap ma tai lieu");
        String matailieu = sc.next();
        System.out.println("Nhap ma nha xuat ban");
        String manhaxuatban = sc.next();
        System.out.println("Nhap so ban phat hanh");
        int sobanphathanh = sc.nextInt();
        System.out.println("Nhap so phat hanh");
        int sophathanh = sc.nextInt();
        System.out.println("Nhap thang phat hanh");
        int thangphathanh = sc.nextInt();
        list.add(new TapChi(matailieu, manhaxuatban, sobanphathanh, sophathanh, thangphathanh));
    }


    @Override
    public void NhapBao() {
        System.out.println("Nhap ma tai lieu");
        String matailieu = sc.next();
        System.out.println("Nhap ma nha xuat ban");
        String manhaxuatban = sc.next();
        System.out.println("Nhap so ban phat hanh");
        int sobanphathanh = sc.nextInt();
        System.out.println("Nhap ngay phat hanh");
        String time = sc.next();
        String tmp = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        while(!time.matches(tmp))
        {
            System.out.println("Nhap sai dinh dang!!!");
            System.out.println("Nhao lai");
            sc.next();
        }
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(time);
            list.add(new Bao(matailieu, manhaxuatban, sobanphathanh, date));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Inrathongtincactailieu()
    {
        for(int i=0 ; i<list.size() ; i++) System.out.println(list.get(i));
        System.out.println(list.size());
    }

    @Override
    public void Tongsosachtheotentacgia()
    {
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
