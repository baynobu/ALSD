package Tugas;
import java.util.Scanner;

public class SuratMain {
    public static void main(String[] args) {
        StackSurat stack = new StackSurat(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt(); scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt(); scan.nextLine();
                    stack.push(new Surat(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat berhasil ditambahkan.");
                    break;
                case 2:
                    Surat diproses = stack.pop();
                    if (diproses != null) {
                        System.out.printf("Memverifikasi surat dari %s (%c selama %d hari)\n",
                            diproses.namaMahasiswa, diproses.jenisIzin, diproses.durasi);
                    }
                    break;
                case 3:
                    Surat lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Surat terakhir dari %s (%c selama %d hari)\n",
                            lihat.namaMahasiswa, lihat.jenisIzin, lihat.durasi);
                    } else {
                        System.out.println("Tidak ada surat dalam stack.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
    }
}
