import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList02 {
    Node head;
    public void tambahDataDariKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan data yang ingin ditambahkan: ");
        int dataBaru = scanner.nextInt();

        Node newNode = new Node(dataBaru);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkan() {
        if (head == null) {
            System.out.println("Linked List Kosong");
            return;
        }
        Node temp = head;
        System.out.print("Isi Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList02 list = new LinkedList02();
        list.tambahDataDariKeyboard();
        list.tampilkan();
    }
}
