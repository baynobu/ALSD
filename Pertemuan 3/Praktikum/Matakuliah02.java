package Praktikum;
import java.util.Scanner;

public class Matakuliah02 {
    String kode;
    String nama;
    String dummy;
    int sks;
    int jumlahJam;
    Scanner sc = new Scanner(System.in);

    public void tambahData() {
        System.out.print("Kode : ");
        kode = sc.nextLine();
        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("Sks : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("--------------------");
        
    }

    public void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("----------------------------");
    }
}
