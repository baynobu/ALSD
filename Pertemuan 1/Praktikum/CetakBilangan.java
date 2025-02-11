package Praktikum;
import java.util.Scanner;

public class CetakBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input nim
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        // ambil 2 digit terakhri nim
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // ijka n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        System.out.println("==========================");
        System.out.println("n : " + n);

        // cetak deretan sesuai urutan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // melewati angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); // cetak angka genap
            } else {
                System.out.print("* "); // cetak asteriks untuk angka ganjil
            }
        }
    }
}
