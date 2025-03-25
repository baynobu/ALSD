package Tugas;
import java.util.Scanner;

public class DosenMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen02 listDosen = new DataDosen02();
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia Muda ke Tua)");
            System.out.println("4. Sorting DSC (Usia Tua ke Muda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Kode Dosen: ");
                String kode = sc.nextLine();
                System.out.print("Masukkan Nama Dosen: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Jenis Kelamin (Laki-laki = true, Perempuan = false): ");
                boolean jk = sc.nextBoolean();
                System.out.print("Masukkan Usia Dosen: ");
                int usia = sc.nextInt();

                Dosen02 dsn = new Dosen02(kode, nama, jk, usia);
                listDosen.tambah(dsn);
            } else if (pilihan == 2) {
                listDosen.tampil();
            } else if (pilihan == 3) {
                listDosen.SortingASC();
                listDosen.tampil();
            } else if (pilihan == 4) {
                listDosen.sortingDSC();
                listDosen.tampil();
            } else if (pilihan == 5) {
                System.out.println("Program selesai.");
                running = false;
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}