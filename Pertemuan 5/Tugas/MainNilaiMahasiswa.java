package Tugas;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
        
        int maxUTS = NilaiMahasiswa.findMax(nilaiUTS, 0, nilaiUTS.length - 1);
        int minUTS = NilaiMahasiswa.findMin(nilaiUTS, 0, nilaiUTS.length - 1);
        double avgUAS = NilaiMahasiswa.calculateAverage(nilaiUAS);
        
        System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);
        System.out.println("Nilai UTS terendah (Divide and Conquer): " + minUTS);
        System.out.println("Rata-rata nilai UAS (Brute Force): " + avgUAS);
    }
}
