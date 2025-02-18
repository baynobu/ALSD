package Tugas_2;

public class DosenMain02 {
    public static void main(String[] args) {
        Dosen02 dosen1 = new Dosen02();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Ahmad Fauzi";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Kecerdasan Buatan";
        dosen1.tampilInformasi();

        // mengubah status aktif, bidang keahlian, dan menghitung masa kerja
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Machine Learning");
        System.out.println("Masa kerja dosen1: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.tampilInformasi();

        Dosen02 dosen2 = new Dosen02("D002", "Prof. Siti Aminah", true, 2015, "Sistem Informasi");
        dosen2.tampilInformasi();

        // mengubah status aktif dan bidang keahlian
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Data Science");
        System.out.println("Masa kerja dosen2: " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.tampilInformasi();
    }
}

