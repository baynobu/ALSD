package Tugas.Film;

public class Node {
    Film data;
    Node prev, next;

    Node(Film data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}