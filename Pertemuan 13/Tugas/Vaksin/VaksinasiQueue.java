package Tugas.Vaksin;

public class VaksinasiQueue {
    Node head;
    Node tail;
    int size;
    int nextAntrian;

    public VaksinasiQueue() {
        head = null;
        tail = null;
        size = 0;
        nextAntrian = 123; // Mulai dari nomor antrian 123
    }

    public void tambahData(String nama) {
        Node newNode = new Node(nextAntrian, nama);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        nextAntrian++;
        size++;
        System.out.println("Data berhasil ditambahkan!");
    }

    public void hapusData() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(head.nama + " telah selesai divaksinasi.");

        Node temp = head;
        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }

        size--;
        daftarPenerima();
    }

    public void daftarPenerima() {
        if (isEmpty()) {
            System.out.println("Daftar kosong!");
            return;
        }

        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("|No.    |Nama    |");

        Node current = head;
        while (current != null) {
            System.out.println("|" + current.noAntrian + "    |" + current.nama + "    |");
            current = current.next;
        }

        System.out.println("Sisa Antrian: " + size);
    }

    public boolean isEmpty() {
        return size == 0;
    }
}