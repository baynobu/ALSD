package Tugas.Film;
import java.util.Scanner;
public class FilmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList daftar = new DoubleLinkedList();

        int pilihan;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Depan");
            System.out.println("2. Tambah Belakang");
            System.out.println("3. Tambah di Index");
            System.out.println("4. Hapus Depan");
            System.out.println("5. Hapus Belakang");
            System.out.println("6. Hapus berdasarkan ID");
            System.out.println("7. Cetak");
            System.out.println("8. Cari Film");
            System.out.println("9. Urutkan Rating (DESC)");
            System.out.println("10. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();
                    daftar.tambahDepan(new Film(id, judul, rating));
                }
                case 2 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();
                    daftar.tambahBelakang(new Film(id, judul, rating));
                }
                case 3 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();
                    System.out.print("Index: ");
                    int index = sc.nextInt();
                    daftar.tambahDiIndex(new Film(id, judul, rating), index);
                }
                case 4 -> daftar.hapusDepan();
                case 5 -> daftar.hapusBelakang();
                case 6 -> {
                    System.out.print("ID yang akan dihapus: ");
                    int id = sc.nextInt();
                    daftar.hapusById(id);
                }
                case 7 -> daftar.cetak();
                case 8 -> {
                    System.out.print("Cari ID: ");
                    int id = sc.nextInt();
                    Film f = daftar.cariById(id);
                    if (f != null) {
                        System.out.println("Ditemukan: " + f.judul + " - " + f.rating);
                    } else {
                        System.out.println("Film tidak ditemukan.");
                    }
                }
                case 9 -> {
                    daftar.urutkanRatingDesc();
                    System.out.println("Data diurutkan!");
                    daftar.cetak();
                }
                case 10 -> System.out.println("Keluar...");
                default -> System.out.println("Pilihan salah!");
            }
            System.out.println();
        } while (pilihan != 10);

        sc.close();
    }
}