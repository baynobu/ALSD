package Tugas;

public class DataDosen02 {
    Dosen02[] dataDosen02 = new Dosen02[10];
    int idx = 0;

    public void tambah(Dosen02 dsn) {
        if (idx < dataDosen02.length) {
            dataDosen02[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen02[i].tampil();
        }
    }

    public void SortingASC() {}
    public void sortingDSC() {}
    public void insertionSort() {}

    public void PencarianDataSequential(String nama) {
        boolean ditemukan = false;
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen02[i].nama.equalsIgnoreCase(nama)) {
                dataDosen02[i].tampil();
                ditemukan = true;
                count++;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu hasil dengan nama yang sama!");
        }
    }

    public int PencarianDataBinary(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
    
            if (dataDosen02[mid].usia == cari) {
                return mid;
            }
            if (dataDosen02[mid].usia > cari) {
                return PencarianDataBinary(cari, left, mid - 1);
            }
            return PencarianDataBinary(cari, mid + 1, right);
        }
        return -1;
    }
    
}