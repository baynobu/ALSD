public class MataKuliah {
    String kode, nama;
    int sks;

    // constractor
    MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    // method
    void tampilInfo() {
        System.out.println("Kode MK  : " + kode);
        System.out.println("Nama MK  : " + nama);
        System.out.println("SKS      : " + sks);
    }
}