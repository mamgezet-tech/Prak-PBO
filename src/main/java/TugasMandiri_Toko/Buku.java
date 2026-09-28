package TugasMandiri_Toko;
// Membuat subclass Buku dari induk Produk
public class Buku extends Produk{
    // Konstruktor untuk membuat objek buku baru
    public Buku(String nama, double harga) {
        super(nama, harga); // Mengirim data ke konnstruktor kelas induk(Prroduk)
    }
    // Menulis ulang metode abstrak untuk menetapkan rumus diskon khusus buku
    @Override
    public double hitungDiskon() {
        return this.harga * 0.10; // Diskon buku sebesar 10%
    }
}