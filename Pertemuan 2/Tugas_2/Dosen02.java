package Tugas_2;

public class Dosen02 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // kontruktor default
    public Dosen02() {
        this.idDosen = "";
        this.nama = "";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "";
    }

    // konstruktor berparameter
    public Dosen02(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // method digunakan untuk menampilkan informasi dosen
    public void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("--------------------------");
    }

    // method yang mengatur status aktif tidak nya dosen
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif berhasil diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    // method yang digunakan  untuk menghitung masa kerja
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // method yang digunakan untuk mengubah bidang keahlian dosen
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi: " + bidangKeahlian);
    }
}

