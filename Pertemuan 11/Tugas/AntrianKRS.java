package Tugas;
public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkanAntrian() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa dibutuhkan untuk proses KRS.");
            return;
        }
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            mhs.sudahKRS = true;
            System.out.print("Mahasiswa diproses: ");
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void lihatTerdepan() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            data[front].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void lihatDuaTerdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else if (size == 1) {
            System.out.println("Hanya 1 mahasiswa dalam antrian:");
            data[front].tampilkanData();
        } else {
            System.out.println("2 mahasiswa terdepan:");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa paling belakang: ");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        int count = 0;
        for (int i = 0; i < max; i++) {
            if (data[i] != null && data[i].sudahKRS) count++;
        }
        return count;
    }

    public int getJumlahBelumKRS() {
        return getJumlahAntrian();
    }
}