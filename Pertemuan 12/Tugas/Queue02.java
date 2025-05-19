package Tugas;

public class Queue02 {
    Node02 front;
    Node02 rear;
    int size;
    
    public Queue02() {
        front = null;
        rear = null;
        size = 0;
    }
    
    // Cek antrian kosong
    public boolean isEmpty() {
        return front == null;
    }
    
    // Cek antrian penuh (tidak ada batas pada linked list, jadi selalu false)
    public boolean isFull() {
        return false;
    }
    
    // Menambahkan antrian
    public void enqueue(Mahasiswa02 data) {
        Node02 newNode = new Node02(data, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + data.nama + " berhasil ditambahkan ke antrian");
    }
    
    // Memanggil antrian (dequeue)
    public Mahasiswa02 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa02 temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return temp;
    }
    
    // Mengosongkan antrian
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }
    
    // Menampilkan antrian terdepan
    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terdepan:");
        front.data.tampilInfo();
    }
    
    // Menampilkan antrian terakhir
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terakhir:");
        rear.data.tampilInfo();
    }
    
    // Menampilkan jumlah mahasiswa yang masih mengantri
    public void size() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
    
    // Menampilkan semua antrian
    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        
        System.out.println("\n===== DAFTAR ANTRIAN =====");
        Node02 temp = front;
        int no = 1;
        while (temp != null) {
            System.out.println("\nAntrian #" + no);
            temp.data.tampilInfo();
            temp = temp.next;
            no++;
        }
        System.out.println("=========================\n");
    }
}