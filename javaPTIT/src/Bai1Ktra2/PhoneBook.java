package Bai1Ktra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class PhoneBook implements Menu{
    private List<SoDienThoai> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public PhoneBook() {

    }
    @Override
    public void Nhapsdttrongnuoc() {
        System.out.println("Nhap mavung-sdt");
        String s = sc.next();
        String tmp1 = "\\d{3}-\\d{8}$";
        String tmp2 = "\\d{4}-\\d{7}$";
        while(!s.matches(tmp1) && !s.matches(tmp2)) {
            System.out.println("Nhap sai dinh dang !!!");
            System.out.println("Nhap lai");
            s = sc.next();
        }
        String[] res = s.split("-");
        list.add(new PhoneNumber(res[0],res[1]));
    }
    @Override 
    public void Nhapsdtquocte() {
        System.out.println("Nhap maquocgia-mavung-sdt");
        String s = sc.next();
        String tmp1 = "\\d{3}-\\d{3}-\\d{8}$";
        String tmp2 = "\\d{3}-\\d{4}-\\d{7}$";
        while(!s.matches(tmp1) && !s.matches(tmp2)) {
            System.out.println("Nhap sai dinh dang !!!");
            System.out.println("Nhap lai");
            s = sc.next();
        }
        String[] res = s.split("-");
        for(int i=0 ; i<=1 ; i++) {
            int temp = Integer.parseInt(res[i]);
            res[i] = String.valueOf(temp);
        }
        list.add(new IntlPhoneNumber(res[1], res[2] , res[0]));
    }

    @Override
    public void Timsdttheomavung() {
        System.out.println("Nhap ma vung can tim");
        String s = sc.next();
        boolean kt = false;
        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i) instanceof PhoneNumber && s.equals(list.get(i).getMAVUNG())) {
                System.out.println(list.get(i).getMAVUNG() +"-" + list.get(i).getSDT());
                kt = true;
            }
            else {
                if(list.get(i) instanceof IntlPhoneNumber) {
                    int tmp = Integer.parseInt(s);
                    if(tmp == Integer.parseInt(list.get(i).getMAVUNG())) {
                        IntlPhoneNumber p = new IntlPhoneNumber();
                        p = (IntlPhoneNumber)list.get(i);
                        System.out.println(p.getMAQUOCGIA() + "-" + p.getMAVUNG() + "-" +p.getSDT());
                        kt = true;
                    }
                }
            }
        }
        if(!kt) System.out.println("khong co sdt nao");
    }

    @Override
    public void Lietkesdttrongnuoc() {
        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i) instanceof PhoneNumber) {
                System.out.println(list.get(i).getMAVUNG() +"-" + list.get(i).getSDT());
            }
        }
    }

    @Override 
    public void Lietkesdtquocte() {
        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i) instanceof IntlPhoneNumber) {
                IntlPhoneNumber p = new IntlPhoneNumber();
                    p = (IntlPhoneNumber)list.get(i);
                    System.out.println(p.getMAQUOCGIA() + "-" + p.getMAVUNG() + "-" +p.getSDT());
            }
        }
    }

    @Override
    public void Lietketatcasdt() {
        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i) instanceof PhoneNumber) {
                System.out.println(list.get(i).getMAVUNG() +"-" + list.get(i).getSDT());
            }
            else {
                    IntlPhoneNumber p = new IntlPhoneNumber();
                    p = (IntlPhoneNumber)list.get(i);
                    System.out.println(p.getMAQUOCGIA() + "-" + p.getMAVUNG() + "-" +p.getSDT());
            }
        }
    }
    @Override
    public void Tinhtongtheovung() {
        Map<String,Integer>sum=list.stream().collect(Collectors.groupingBy(SoDienThoai::getMAVUNG,Collectors.summingInt(SoDienThoai::laySDT)));
        Set<String> set = sum.keySet();
        for(String key : set) {
            System.out.println(key + " " + sum.get(key));
        }
    }

    @Override
    public void Timsodienthoailonnhat() {
        Optional<SoDienThoai> result = list.stream().collect(Collectors.maxBy(Comparator.comparing(SoDienThoai::laySDT)));
        System.out.println(result.get());
    }


    @Override
    public void Timkiemtheoduoi() {
        System.out.println("Nhap duoi can tim kiem");
        String s = sc.next();
        Boolean kt = false;
        for(int i=0 ; i<list.size() ; i++) {
            String res = "";
            for(int j=list.get(i).getSDT().length() - s.length() ; j<list.get(i).getSDT().length() ; j++) res += list.get(i).getSDT().charAt(j);
            if(s.equals(res)) {
                if(list.get(i) instanceof PhoneNumber) {
                    System.out.println(list.get(i).getMAVUNG() +"-" + list.get(i).getSDT());
                }
                else {
                        IntlPhoneNumber p = new IntlPhoneNumber();
                        p = (IntlPhoneNumber)list.get(i);
                        System.out.println(p.getMAQUOCGIA() + "-" + p.getMAVUNG() + "-" +p.getSDT());
                }
                kt = true;
            }
        }
        if(!kt) System.out.println("khong co sdt nao");
    }


    @Override 
    public void Sapxepsdttheomavung() {
        List<SoDienThoai> lt = new ArrayList<>();
        for(int i=0 ; i<list.size() ; i++) lt.add(list.get(i));
        Collections.sort(lt , new Comparator<SoDienThoai>(){
            @Override
            public int compare(SoDienThoai o1 , SoDienThoai o2) {
                return o1.getMAVUNG().compareTo(o2.getMAVUNG());
            }
        });
        for(int i=0 ; i<lt.size() ; i++) {
            if(lt.get(i) instanceof PhoneNumber) {
                System.out.println(lt.get(i).getMAVUNG() +"-" + lt.get(i).getSDT());
            }
            else {
                    IntlPhoneNumber p = new IntlPhoneNumber();
                    p = (IntlPhoneNumber)lt.get(i);
                    System.out.println(p.getMAQUOCGIA() + "-" + p.getMAVUNG() + "-" +p.getSDT());
            }
        }
    }
}
