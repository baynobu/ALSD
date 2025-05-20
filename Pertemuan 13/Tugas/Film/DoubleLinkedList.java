package Tugas.Film;

public class DoubleLinkedList {
    Node head, tail;

    void tambahDepan(Film data) {
        Node baru = new Node(data);
        if (head == null) {
            head = tail = baru;
        } else {
            baru.next = head;
            head.prev = baru;
            head = baru;
        }
    }

    void tambahBelakang(Film data) {
        Node baru = new Node(data);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    void tambahDiIndex(Film data, int index) {
        if (index == 0) {
            tambahDepan(data);
            return;
        }

        Node baru = new Node(data);
        Node bantu = head;
        int i = 0;

        while (bantu != null && i < index - 1) {
            bantu = bantu.next;
            i++;
        }

        if (bantu == null || bantu.next == null) {
            tambahBelakang(data);
            return;
        }

        baru.next = bantu.next;
        baru.prev = bantu;
        bantu.next.prev = baru;
        bantu.next = baru;
    }

    void hapusDepan() {
        if (head == null) {
            System.out.println("List kosong!");
        } else {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        }
    }

    void hapusBelakang() {
        if (tail == null) {
            System.out.println("List kosong!");
        } else {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
        }
    }

    void hapusById(int id) {
        Node bantu = head;

        while (bantu != null && bantu.data.id != id) {
            bantu = bantu.next;
        }

        if (bantu == null) {
            System.out.println("Film tidak ditemukan!");
        } else if (bantu == head) {
            hapusDepan();
        } else if (bantu == tail) {
            hapusBelakang();
        } else {
            bantu.prev.next = bantu.next;
            bantu.next.prev = bantu.prev;
        }
    }

    void cetak() {
        if (head == null) {
            System.out.println("List kosong!");
            return;
        }

        Node bantu = head;
        while (bantu != null) {
            System.out.println("ID: " + bantu.data.id);
            System.out.println("Judul: " + bantu.data.judul);
            System.out.println("Rating: " + bantu.data.rating);
            System.out.println();
            bantu = bantu.next;
        }
    }

    Film cariById(int id) {
        Node bantu = head;
        while (bantu != null) {
            if (bantu.data.id == id) {
                return bantu.data;
            }
            bantu = bantu.next;
        }
        return null;
    }

    void urutkanRatingDesc() {
        if (head == null || head.next == null) return;

        boolean tukar;
        do {
            tukar = false;
            Node bantu = head;
            while (bantu.next != null) {
                if (bantu.data.rating < bantu.next.data.rating) {
                    Film temp = bantu.data;
                    bantu.data = bantu.next.data;
                    bantu.next.data = temp;
                    tukar = true;
                }
                bantu = bantu.next;
            }
        } while (tukar);
    }
}