public class MahasiswaMain02 {
    public static void main(String[] args) {
        
        Mahasiswa02 mhs1 = new Mahasiswa02();
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        mhs1.nama = "Muhammad Ali Farhan";
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa02 mhs2 = new Mahasiswa02("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa02 mhsHanif = new Mahasiswa02("Abdul Rahman Hanif Darmawan", "244107020232", 3.55, "TI 1A");
        mhsHanif.updateIpk(3.89);
        mhsHanif.tampilkanInformasi();
    }

    
}
