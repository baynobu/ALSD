
public class BinaryTree02 {
    Node02 root;

    public BinaryTree02() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa02 mahasiswa) {
        Node02 newNode = new Node02(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node02 current = root;
            Node02 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node02 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node02 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node02 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node02 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node02 getSuccessor(Node02 del) {
        Node02 successor = del.right;
        Node02 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        // cari node (current) yang akan dihapus
        Node02 parent = root;
        Node02 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {// jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {// jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {// jika punya 2 anak
                Node02 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // TUGAS SOAL 1
    public void addRekursif(Mahasiswa02 mahasiswa) {
        root = tambahRekursif(root, mahasiswa);
    }

    private Node02 tambahRekursif(Node02 current, Mahasiswa02 mahasiswa) {
        if (current == null) {
            return new Node02(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = tambahRekursif(current.left, mahasiswa);
        } else {
            current.right = tambahRekursif(current.right, mahasiswa);
        }
        return current;
    }

    // TUGAS SOAL 2
    public void cariMinIPK() {
        if (root == null) {
            System.out.println("Tree kosong.");
        } else {
            Node02 current = root;
            while (current.left != null) {
                current = current.left;
            }
            System.out.println("Mahasiswa dengan IPK terkecil:");
            current.mahasiswa.tampilInformasi();
        }
    }

    public void cariMaxIPK() {
        if (root == null) {
            System.out.println("Tree kosong.");
        } else {
            Node02 current = root;
            while (current.right != null) {
                current = current.right;
            }
            System.out.println("Mahasiswa dengan IPK terbesar:");
            current.mahasiswa.tampilInformasi();
        }
    }

    // TUGAS SOAL 3
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtasRekursif(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtasRekursif(Node02 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasRekursif(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasRekursif(node.right, ipkBatas);
        }
    }
}
