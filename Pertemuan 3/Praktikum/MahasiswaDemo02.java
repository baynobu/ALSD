package Praktikum;
import java.util.Scanner;
public class MahasiswaDemo02 {
    public static void main(String[] args) {

        Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3];
        arrayOfMahasiswa[0] = new Mahasiswa02();

        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = 3.75f; 

        arrayOfMahasiswa[1] = new Mahasiswa02();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = 3.36f; 

        arrayOfMahasiswa[2] = new Mahasiswa02();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = 3.80f; 

        System.out.println("NIM : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa[0].ipk);

        System.out.println("--------------------");

        System.out.println("NIM : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa[1].ipk);

        System.out.println("--------------------");

        System.out.println("NIM : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK : " + arrayOfMahasiswa[2].ipk);

        System.out.println("--------------------");
    }
}