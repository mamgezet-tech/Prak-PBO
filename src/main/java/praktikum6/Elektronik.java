package praktikum6;
// Membuat sub class Elektronik dari induk Produk
public class Elektronik extends Produk{
    // Konstruktor untuk membuat objek elektronik baru
    public Elektronik(String nama, double harga) {
        super(nama, harga); // Mengirim data ke konstruktor kelas induk Produk
    }
    // Menulis ulang metode abstrak untuk menetapkan rumus diskon khusus Elektronik
    @Override
    public double hitungDiskon() {
        return this.harga * 0.20; // Diskon khusus elektronik sebesar 20%
    }

}