package Praktikum;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine(); 

            Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }


        // System.out.println("\nData mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        // list.selectionSort();
        list.tampil();
        // System.out.println("--------------------------------------");
        // System.out.println("Pencarian data");
        // System.out.println("--------------------------------------");
        // System.out.println("masukkan ipk mahasiswa yang akan dicari : ");
        // System.out.print("IPK: ");
        // double cari = input.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss= (int)posisi;
        // list.tampilPosisi(posisi, pss);
        // list.tampilDataSearch(posisi, pss);

        // melakukan pencarian data Binary
        System.out.println("--------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = input.nextDouble();
        System.out.println("--------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlah-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    }
}