package Praktikum;
import java.util.Scanner;

public class MatakuliahDemo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah02[] arrayOfMatakuliah = new Matakuliah02[3];

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine(); 

        Matakuliah02[] arrayOfMatakuliah02 = new Matakuliah02[jumlahMatkul];
        
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah02();
            arrayOfMatakuliah[i].tambahData();
        }

        for (int i = 0; i < jumlahMatkul; i++) {
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
