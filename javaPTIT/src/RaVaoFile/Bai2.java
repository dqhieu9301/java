package RaVaoFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bai2 {
    public static void main(String[] args) {
        String filename = "E:/JAVA VS/javaPTIT/src/RaVaoFile/in.txt";
        BufferedReader r ;
        try {
            FileWriter fw = new FileWriter("E:/JAVA VS/javaPTIT/src/RaVaoFile/out.txt");
            r = new BufferedReader(new FileReader(filename));
            String line = null;
            while((line = r.readLine()) != null) {
                line = line.trim();
                line = line.replaceAll("  ", " ");
                String[] tmp = line.split(" ");
                int a = Integer.parseInt(tmp[0]);
                int b = Integer.parseInt(tmp[1]);
                int c = Integer.parseInt(tmp[2]);
                int d = Integer.parseInt(tmp[3]);
                int res1 = a * d + b * c;
                int res2 = b * d;
                int x = Math.abs(res1);
                int y = Math.abs(res2);
                while(x!=y){
                    if(x>y){
                        x=x-y;
                    }
                    else{
                        y=y-x;
                    }
                }
                res1 = res1/x;
                res2 = res2/x;
                fw.write(res1 + " " + res2 + "\n");
            }
            fw.close();
        } catch(FileNotFoundException f) {
            System.out.println(f);
        } catch(IOException i) {
            System.out.println(i);
        } catch(NumberFormatException n) {
            System.out.println(n);
        }
    }
}
