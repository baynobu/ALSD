package Tugas;
import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // array kod plate nomor
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        // nama kota sesuai urutan plat nomor
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        // input plat nomor
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);

        // mencari dan menampilkan sesuai kode plat nomor yang din input
        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                // menampilkan nama kota sebagai string
                System.out.print("Nama Kota: ");
                for (char c : kota[i]) {
                    if (c != ' ') { // mencetak karakter yang bukan spais
                        System.out.print(c);
                    }
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }

        // jika terdapat kode plat nomor yang tidak ada dalam daftar
        if (!ditemukan) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }

    }
}
