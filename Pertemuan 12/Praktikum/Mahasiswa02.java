public class Mahasiswa02 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa02(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + nim + " Nama: " + nama + " Kelas: " + kelas + " IPK: " + ipk);
    }

    public String toString() {
        return nama + "\t" + nim + "\t" + kelas + "\t" + ipk;
    }
}
