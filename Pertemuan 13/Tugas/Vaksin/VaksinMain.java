package Tugas.Vaksin;

import java.util.Scanner;

public class VaksinMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VaksinasiQueue antrian = new VaksinasiQueue();
        int pilihan = 0;

        do {
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.print("Pilihan: ");

            try {
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.println("++++++++++++++++++++++++++++++++++++++");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("--------------------------------------");
                        System.out.println("-Nomor Antrian: " + antrian.nextAntrian);
                        System.out.print("-Nama Penerima: ");
                        String nama = scanner.nextLine();
                        antrian.tambahData(nama);
                        break;
                    case 2:
                        antrian.hapusData();
                        break;
                    case 3:
                        antrian.daftarPenerima();
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid! " + e.getMessage());
                scanner.nextLine();
            }

            System.out.println();
        } while (pilihan != 4);
    }
}
