package Tugas;

public class Surat {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // 'S' = Sakit, 'I' = Izin
    int durasi;

    public Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}