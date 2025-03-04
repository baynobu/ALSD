public class cafe02 {
    public static void main(String[] args) {
        cafeMain02[] daftarCafe = new cafeMain02[3];

        daftarCafe[0] = new cafeMain02("Cafe Santai", "Kopi Susu", 4.5, "Jakarta");
        daftarCafe[1] = new cafeMain02("Cafe Ceria", "Latte", 4.7, "Bandung");
        daftarCafe[2] = new cafeMain02("Cafe Maju", "Espresso", 4.3, "Surabaya");

        System.out.println("Informasi Semua Cafe:");
        for (int i = 0; i < daftarCafe.length; i++) {
            daftarCafe[i].tampilkanInfo();
            System.out.println();
        }

        System.out.println("Memperbarui Rating Cafe Ceria:");
        daftarCafe[1].updateRating(4.9);
        daftarCafe[1].tampilkanInfo();
    }
}
