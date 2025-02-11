package Tugas;
import java.util.Scanner;

public class JadwalKuliah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = scanner.nextInt();
        scanner.nextLine(); 

        // deklarasi array untuk menyimpan data jadwal setiap mata kuliah
        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        // input data mata kulia
        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        // menu utama
        while (true) {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            // menampliksan seluruh jadwal kuliah
            if (pilihan == 1) {
                tampilkanJadwal(namaMK, sks, semester, hariKuliah, n, "");
            } else if (pilihan == 2) {
                // menampilkan jdawal berdasarkan hari
                System.out.print("Masukkan hari kuliah yang dicari: ");
                String hariCari = scanner.nextLine();
                tampilkanJadwal(namaMK, sks, semester, hariKuliah, n, hariCari);
            } else if (pilihan == 3) {
                // menampilkan jadawa berdasarkan semester
                System.out.print("Masukkan semester yang dicari: ");
                int semesterCari = scanner.nextInt();
                tampilkanJadwalSemester(namaMK, sks, semester, hariKuliah, n, semesterCari);
            } else if (pilihan == 4) {
                // mencari mata kuliah berdasarnkan nama
                System.out.print("Masukkan nama mata kuliah yang dicari: ");
                String namaCari = scanner.nextLine();
                cariMataKuliah(namaMK, sks, semester, hariKuliah, n, namaCari);
            } else if (pilihan == 5) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    // function pencarian berdasarkan hari
    public static void tampilkanJadwal(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int n, String filterHari) {
        System.out.println("\nJadwal Kuliah:");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (filterHari.isEmpty() || hariKuliah[i].equalsIgnoreCase(filterHari)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah yang ditemukan.");
        }
    }

    // function pencarian berdasarkan semester
    public static void tampilkanJadwalSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int n, int filterSemester) {
        System.out.println("\nJadwal Kuliah untuk Semester " + filterSemester + ":");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (semester[i] == filterSemester) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah untuk semester tersebut.");
        }
    }

    // function pencarian berdasarkan nama mata kuliah
    public static void cariMataKuliah(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int n, String namaCari) {
        System.out.println("\nHasil Pencarian Mata Kuliah:");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (namaMK[i].equalsIgnoreCase(namaCari)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
                break; 
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
