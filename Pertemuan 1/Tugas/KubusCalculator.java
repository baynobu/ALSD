package Tugas;
import java.util.Scanner;

public class KubusCalculator {
    // Fungsi untuk menghitung volume kubus
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    // Fungsi untuk menghitung keliling kubus
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("Pilih perhitungan kubus:");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();

        // Meminta input panjang sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        // Menjalankan perhitungan sesuai pilihan
        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

    }
}
