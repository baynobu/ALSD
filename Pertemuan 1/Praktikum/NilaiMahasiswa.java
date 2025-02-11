package Praktikum;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf, kelulusan;

        // input nilai
        System.out.println("====================================");
        System.out.print("Masukkan nilai tugas: ");
        tugas = scanner.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        kuis = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = scanner.nextDouble();
        System.out.println("====================================");


        // validasi input
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        // menghitung bobot nilai
        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        // konversi nilai angka ke huruf
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        // status kelulusan
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")) {
            kelulusan = "LULUS";
        } else {
            kelulusan = "TIDAK LULUS";
        }

        // output hasil
        System.out.println("====================================");
        System.out.printf("Nilai Akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("====================================");
        System.out.println("Status: " + kelulusan);
    }
}
