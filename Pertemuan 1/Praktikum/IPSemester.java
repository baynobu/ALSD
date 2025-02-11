package Praktikum;
import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // daftar mata kuliah dan bobot sks
        String[] mataKuliah = {
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", 
            "Bahasa Inggris", 
            "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", 
            "Keselamatan dan Kesehatan Kerja"
        };
        
        double[] bobotSKS = {2, 3, 3, 4, 2, 3, 2, 2}; // bobot SKS untuk setiap MK
        double[] nilaiAngka = new double[mataKuliah.length];
        double[] nilaiSetara = new double[mataKuliah.length];

        // input nilai angka untuk setiap mk
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            nilaiSetara[i] = konversiNilai(nilaiAngka[i]); // konversi ke nilai bobot
        }

        // hitung ip semester
        double totalBobot = 0;
        double totalSKS = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            totalBobot += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }
        double ipSemester = totalBobot / totalSKS;

        // menampilkan hasil konversi nilai
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-40s %-10s %-10s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f%n", mataKuliah[i], nilaiAngka[i], getHuruf(nilaiSetara[i]), nilaiSetara[i]);
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("IP Semester: %.2f%n", ipSemester);

    }

    // function konversi nilai angka ke nilai setara (bobot nilai)
    public static double konversiNilai(double nilai) {
        if (nilai > 80 && nilai <= 100) return 4.0;
        if (nilai > 73 && nilai <= 80) return 3.5;
        if (nilai > 65 && nilai <= 73) return 3.0;
        if (nilai > 60 && nilai <= 65) return 2.5;
        if (nilai > 50 && nilai <= 60) return 2.0;
        if (nilai > 39 && nilai <= 50) return 1.0;
        return 0.0;
    }

    // function untuk mendapatkan nilai huruf dari bobot nilai
    public static String getHuruf(double nilai) {
        if (nilai == 4.0) return "A";
        if (nilai == 3.5) return "B+";
        if (nilai == 3.0) return "B";
        if (nilai == 2.5) return "C+";
        if (nilai == 2.0) return "C";
        if (nilai == 1.0) return "D";
        return "E";
    }
}
