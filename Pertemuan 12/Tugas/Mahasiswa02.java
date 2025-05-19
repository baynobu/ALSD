package Tugas;

public class Mahasiswa02 {
    String nim;
    String nama;
    String jurusan;
    String keperluan;
    
    public Mahasiswa02(String nim, String nama, String jurusan, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.keperluan = keperluan;
    }
    
    public void tampilInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Keperluan: " + keperluan);
    }
}