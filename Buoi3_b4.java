
package buoi3_b4;
import java.util.Scanner;

public class Buoi3_b4 {
public static Scanner s = new Scanner(System.in);
public static void Buoi3_b4(){
    System.out.print("Nhap chuoi : ");
    String str = s.nextLine();
    boolean check = true ;
    for(int i = 0; i <= str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length() - i - 1)){
				check = false;
			}
		}
		System.out.println(check);
	}

    
    public static void main(String[] args) {
        Buoi3_b4();
   }

    
}
