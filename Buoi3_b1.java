package buoi3_b1;

import java.util.Scanner;


public class Buoi3_b1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang n = ");
        int n = s.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
    }
        final int Max =1000;
        int[] count = new int[Max +1];
        
       for(int i=0 ; i<n ; i++){
           count[a[i]]++;
       }
       System.out.println(" So lan xuat hien cua cac phan tu : ");
       for(int i=0 ; i<= Max ; i++){
           if(count[i]>0){
           System.out.println(i + ": " + count[i] + " lan");    
           }
       }
 }
}
