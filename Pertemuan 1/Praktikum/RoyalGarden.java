package Praktikum;
public class RoyalGarden {
    public static void main(String[] args) {
        // data stok bungan setiap cabang royal garden
        int[][] stock = {
            {10, 5, 15, 7},  // RoyalGarden 1
            {6, 11, 9, 12},  // RoyalGarden 2
            {2, 10, 10, 5},  // RoyalGarden 3
            {5, 7, 12, 9}    // RoyalGarden 4
        };

        // harga setiap jenis bungan di royal garden
        int[] harga = {75000, 50000, 60000, 10000}; // Aglonema, Keladi, Alocasia, Mawar

        // menampilkan pendapatan setiap cabang
        tampilkanPendapatan(stock, harga);

    }

    // function untuk menampilkan jumlah pendapatan jika semua bunga habis terjual
    public static void tampilkanPendapatan(int[][] stock, int[] harga) {
        int totalPendapatan = 0;
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
        System.out.println();
    }
}