package Tugas;
import java.util.Scanner;
public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses 2 Mahasiswa (KRS)");
            System.out.println("3. Lihat 2 Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat Antrian Belakang");
            System.out.println("6. Cek Antrian Kosong / Penuh");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Cetak Jumlah Antrian");
            System.out.println("9. Cetak Jumlah Sudah KRS");
            System.out.println("10. Cetak Jumlah Belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    antrian.tambahAntrian(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.lihatDuaTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 7:
                    antrian.kosongkanAntrian();
                    break;
                case 8:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 9:
                    System.out.println("Jumlah sudah KRS: " + antrian.getJumlahSudahKRS());
                    break;
                case 10:
                    System.out.println("Jumlah belum KRS: " + antrian.getJumlahBelumKRS());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}