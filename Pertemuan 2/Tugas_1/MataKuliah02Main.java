package Tugas_1;

public class MataKuliah02Main {
    public static void main(String[] args) {
        MataKuliah02 mk1 = new MataKuliah02();
        mk1.kodeMK = "TI101";
        mk1.nama = "Pemrograman Java";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        // mengubah SKS dan mengatur jumlah jam
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah02 mk2 = new MataKuliah02("TI102", "Struktur Data", 3, 6);
        mk2.tampilInformasi();

        // mngubah SKS dan mengatur jumlah jam
        mk2.ubahSKS(4);
        mk2.tambahJam(1);
        mk2.kurangiJam(5);
        mk2.tampilInformasi();
    }
}

