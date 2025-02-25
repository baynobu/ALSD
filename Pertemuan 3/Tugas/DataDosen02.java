package Tugas;

public class DataDosen02 {
    // menampilkan semua data dosen
    public static void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        System.out.println("Daftar Semua Dosen:");
        for (Dosen02 dosen : arrayOfDosen) {
            dosen.tampilkanData();
        }
    }

    // menghitung jumlah dosen berdasarkan kelamin 
    public static void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    // menghitung rata rata usia dosen berdasarkan jenis kelamin 
    public static void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, jumlahPria = 0, jumlahWanita = 0;
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        double rataPria = jumlahPria == 0 ? 0 : (double) totalUsiaPria / jumlahPria;
        double rataWanita = jumlahWanita == 0 ? 0 : (double) totalUsiaWanita / jumlahWanita;

        System.out.println("Rata-rata usia Dosen Pria: " + rataPria);
        System.out.println("Rata-rata usia Dosen Wanita: " + rataWanita);
    }

    // menampilkan dosen tertua
    public static void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen02 tertua = arrayOfDosen[0];

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanData();
    }

    // menampilkan dosen termuda
    public static void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen02 termuda = arrayOfDosen[0];

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanData();
    }
}
