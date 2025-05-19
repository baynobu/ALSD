package Tugas;

import java.util.Scanner;

public class AntrianLayananMahasiswa02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue02 antrian = new Queue02();
        int pilihan;

        do {
            System.out.println("\n===== SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN =====");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Cek Antrian Kosong");
            System.out.println("3. Cek Antrian Penuh");
            System.out.println("4. Panggil Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Tampilkan Antrian Terdepan");
            System.out.println("7. Tampilkan Antrian Terakhir");
            System.out.println("8. Tampilkan Jumlah Mahasiswa dalam Antrian");
            System.out.println("9. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n===== PENDAFTARAN ANTRIAN =====");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jurusan: ");
                    String jurusan = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String keperluan = sc.nextLine();

                    Mahasiswa02 mhs = new Mahasiswa02(nim, nama, jurusan, keperluan);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    System.out.println("\n===== CEK ANTRIAN KOSONG =====");
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian saat ini kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;

                case 3:
                    System.out.println("\n===== CEK ANTRIAN PENUH =====");
                    if (antrian.isFull()) {
                        System.out.println("Antrian sudah penuh");
                    } else {
                        System.out.println("Antrian belum penuh (tidak ada batas pada linked list)");
                    }
                    break;

                case 4:
                    System.out.println("\n===== PANGGIL ANTRIAN =====");
                    Mahasiswa02 next = antrian.dequeue();
                    if (next != null) {
                        System.out.println("Memanggil mahasiswa:");
                        next.tampilInfo();
                    }
                    break;

                case 5:
                    System.out.println("\n===== KOSONGKAN ANTRIAN =====");
                    antrian.clear();
                    break;

                case 6:
                    System.out.println("\n===== ANTRIAN TERDEPAN =====");
                    antrian.peekFront();
                    break;

                case 7:
                    System.out.println("\n===== ANTRIAN TERAKHIR =====");
                    antrian.peekRear();
                    break;

                case 8:
                    System.out.println("\n===== JUMLAH MAHASISWA DALAM ANTRIAN =====");
                    antrian.size();
                    break;

                case 9:
                    antrian.display();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem antrian!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

    }
}