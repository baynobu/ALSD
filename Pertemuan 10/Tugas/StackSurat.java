package Tugas;

public class StackSurat {
    Surat[] stack;
    int top;
    int size;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat[size];
        top = -1;
    }

    public void push(Surat surat) {
        if (top < size - 1) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan surat.");
        }
    }

    public Surat pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Surat peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.printf("Ditemukan: %s - Izin %c selama %d hari\n", 
                    stack[i].namaMahasiswa, stack[i].jenisIzin, stack[i].durasi);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}