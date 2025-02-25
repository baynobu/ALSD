package Tugas;
import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine(); 
        
        Dosen02[] daftarDosen = new Dosen02[jumlahDosen];
        
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = scanner.nextLine();
            
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            
            System.out.print("Jenis Kelamin (true = Pria, false = Wanita): ");
            boolean jenisKelamin = scanner.nextBoolean();
            
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 
            
            daftarDosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------");
        }
        
        System.out.println("\n=== Analisis Data Dosen ===");
        DataDosen02.dataSemuaDosen(daftarDosen);
        DataDosen02.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen02.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen02.infoDosenPalingTua(daftarDosen);
        DataDosen02.infoDosenPalingMuda(daftarDosen);

    }
}