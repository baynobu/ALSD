package Tugas.Vaksin;

public class Node {
    int noAntrian;
    String nama;
    Node next;
    Node prev;

    public Node(int noAntrian, String nama) {
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }
}