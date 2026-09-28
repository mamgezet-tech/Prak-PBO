package praktikum6;
// Membuat subclass Pakaian dari class induk Produk
public class Pakaian extends Produk {
    // Konstruktor untuk membuat objek pakaian baru
    public Pakaian(String nama, double harga) {
        super(nama, harga); // Mengirim data ke konstruktor kelas induk produk
    }
    // Menulis ulang metode abstrak untuk menetapkan rumus diskon Pakaian
    @Override
    public double hitungDiskon() {
        return this.harga * 0.15; // Diskon Pakaian 15%
    }
}
