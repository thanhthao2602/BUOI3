package buoi3_b3;

import java.util.Scanner;

public class Buoi3_b3 {

    public static Scanner s = new Scanner(System.in);
    public static void Buoi3_b3(){
        int n; 
        do{
           System.out.print("Nhap so phan tu mang ");
         n = s.nextInt(); 
        }
        while(n<=0);
        int[] a = new int[n];
        System.out.print("nhap cac phan tu mang ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int tg;
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
                    
                if (a[i] > a[j]) {
                    tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
                
                
                for (int i:a)
                     System.out.print(i + " ");
    
        
    }

    public static void main(String[] args){
        
        Buoi3_b3();
        
     
    }

}
