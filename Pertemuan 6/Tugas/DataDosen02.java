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
}
