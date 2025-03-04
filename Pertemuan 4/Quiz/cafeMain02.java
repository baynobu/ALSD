public class cafeMain02 {
    private String namaCafe;
    private String menuAndalan;
    private double rating;
    private String lokasi;

    public cafeMain02(String namaCafe, String menuAndalan, double rating, String lokasi) {
        this.namaCafe = namaCafe;
        this.menuAndalan = menuAndalan;
        this.rating = rating;
        this.lokasi = lokasi;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Cafe: " + namaCafe);
        System.out.println("Menu Andalan: " + menuAndalan);
        System.out.println("Rating: " + rating);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("--------------------------");
    }

    public void updateRating(double ratingBaru) {
        rating = ratingBaru;
        System.out.println("Rating diperbarui menjadi: " + rating);
    }
}
