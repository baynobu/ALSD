public class SingleLinkedList02 {
    NodeMahasiswa02 head;
    NodeMahasiswa02 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa02 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        NodeMahasiswa02 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa02 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa02 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("indeks melebihi batas linked list");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("indeks melebihi batas linked list");
                return;
            }
            NodeMahasiswa02 newNode = new NodeMahasiswa02(input, temp.next);
            temp.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }
    //
    public void getData(int index) {
        if (index < 0) {
            System.out.println("Indeks salah");
            return;
        }
        NodeMahasiswa02 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                System.out.println("Indeks melebihi batas linked list");
                return;
            }
            tmp = tmp.next;
        }
        if (tmp != null) {
            tmp.data.tampilInformasi();
        } else {
            System.out.println("Indeks melebihi batas linked list");
        }
    }

    public int indexOf(String key) {
        NodeMahasiswa02 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa02 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa02 temp = head;
            NodeMahasiswa02 prev = null;
            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(key)) {
                    if (temp == head) {
                        removeFirst();
                    } else if (temp == tail) {
                        removeLast();
                    } else {
                        prev.next = temp.next;
                    }
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa02 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null || temp.next == null) {
                    System.out.println("Indeks melebihi batas Linked List!");
                    return;
                }
                temp = temp.next;
            }
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
        }
    }
}
