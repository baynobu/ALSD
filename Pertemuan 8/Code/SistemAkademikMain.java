import java.util.Scanner;

public class SistemAkademikMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemAkademikFunction menu = new SistemAkademikFunction();

        int pilihan;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    menu.tampilkanMahasiswa();
                    break;
                case 2:
                    menu.tampilkanMataKuliah();
                    break;
                case 3:
                    menu.tampilkanPenilaian();
                    break;
                case 4:
                    menu.urutkanMahasiswaBerdasarkanNilai();
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    menu.cariMahasiswaBerdasarkanNIM(nim);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}