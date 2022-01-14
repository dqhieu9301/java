package BaiKtra2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");    
            
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->9):");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:
                       break;
                case 2:
                       break;
                case 3:
                       break;
                case 4:
                    break;
                case 5:
                       break; 
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;   
                default:System.out.println("Chi chon 0->9");
                      break; 
            }
            sc.close();
        }
        
    }
}
