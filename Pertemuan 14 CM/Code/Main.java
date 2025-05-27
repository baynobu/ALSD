package Code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListAntrian antrian = new LinkedListAntrian();
        QueueTransaksi riwayat = new QueueTransaksi();

        while (true) {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    Kendaraan k = new Kendaraan(plat, tipe, merk);
                    antrian.tambahAntrian(k);
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + antrian.hitungAntrian());
                    break;
                case 4:
                    Kendaraan kendaraanDilayani = antrian.layaniAntrian();
                    if (kendaraanDilayani == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Petugas melayani " + kendaraanDilayani.platNomor);
                        System.out.print("Masukkan Jenis BBM: ");
                        String namaBBM = sc.nextLine();
                        System.out.print("Masukkan Harga per liter: ");
                        double harga = sc.nextDouble();
                        System.out.print("Masukkan Jumlah liter: ");
                        double liter = sc.nextDouble(); sc.nextLine();

                        BBM bbm = new BBM(namaBBM, harga);
                        TransaksiPengisian t = new TransaksiPengisian(kendaraanDilayani, bbm, liter);
                        riwayat.tambahTransaksi(t);
                        System.out.println(">> Transaksi berhasil dicatat.");
                    }
                    break;
                case 5:
                    riwayat.tampilkanRiwayat();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
