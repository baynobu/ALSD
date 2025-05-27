package Code;

public class LinkedListAntrian {
    Node head, tail;

    public void tambahAntrian(Kendaraan kendaraan) {
        Node baru = new Node(kendaraan);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public void tampilkanAntrian() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("-- Antrian Kendaraan --");
        while (temp != null) {
            temp.kendaraan.tampilkanInformasi();
            System.out.println();
            temp = temp.next;
        }
    }

    public int hitungAntrian() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Kendaraan layaniAntrian() {
        if (head == null) return null;
        Kendaraan dilayani = head.kendaraan;
        head = head.next;
        return dilayani;
    }
}
