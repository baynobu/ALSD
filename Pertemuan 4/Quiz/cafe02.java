public class cafe02 {
    public static void main(String[] args) {
        cafeMain02 cafe = new cafeMain02("Cafe Santai", "Kopi Susu", 4.5, "Jakarta");
        cafe.tampilkanInfo();
        cafe.updateRating(4.8);
        cafe.tampilkanInfo();

        cafe = new cafeMain02("Cafe gak Santai", "Susu Kopi", 4.9, "Bandung");
        cafe.tampilkanInfo();


    }
}
