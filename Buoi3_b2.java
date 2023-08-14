package buoi3_b2;

import java.util.Scanner;

public class Buoi3_b2 {

    public static Scanner s = new Scanner(System.in);

    public static void Buoi3_b2_chen() {
        int n;
        do {
            System.out.print("Nhap so phan tu mang n = ");
            n = s.nextInt();

        } while (n <= 0);
        int[] a = new int[n];
        System.out.print("Nhap phan tu mang :");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Nhap vi tri can chen: ");
        int k = s.nextInt();
        if (k < 0 || k > n) {
            System.out.print("ko hop le ???");
            return;
        }
        k--;
        System.out.print("Nhap gia tri can chen: ");
        int x = s.nextInt();
        int[] newA = new int[n + 1];
        for (int i = 0; i < k; i++) {
            newA[i] = a[i];
        }
        newA[k] = x;
        for (int i = n; i > k; i--) {
            newA[i] = a[i - 1];
        }
        for (int i : newA) {
            System.out.print(i + " ");
        }
    }

    public static void Buoi3_b2_xoa() {
        int n;
        do {
            System.out.print("Nhap so phan tu mang n = ");
            n = s.nextInt();

        } while (n <= 0);
        int[] a = new int[n];
        System.out.print("Nhap phan tu mang :");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Nhap vi tri can xoa: ");
        int k = s.nextInt();
        if (k < 0 || k > n) {
            System.out.print("ko hop le ???");
            return;
        }
        k--;
        int[] newA = new int[n - 1];
        for (int i = 0; i < k; i++) {
            newA[i] = a[i];
        }
        for (int i = k; i < n - 1; i++) {
            newA[i] = a[i + 1];
        }

        for (int i : newA) {
            System.out.print(i + " ");
}
    }

    public static void main(String[] args) {
        Buoi3_b2_chen();
        System.out.println();
        Buoi3_b2_xoa();

    }
}
