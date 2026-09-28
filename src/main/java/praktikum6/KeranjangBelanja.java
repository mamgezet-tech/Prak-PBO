package praktikum6;
// Mengimpor pustaka bawaan Java untuk menggunakan wadah daftar(List)
import java.util.List;
// Mengimpor pustaka bawaan Java untuk membuat objek daftar yang ukurannya bisa bertambah dinamis
import java.util.ArrayList;

// Kelas untuk kelola daftar produk yang dimasukkan ke dalam keranjang
public class KeranjangBelanja {
    // Wadah kumpulan produk di dalam keranjang
    private List<Produk> daftarProduk;
    // Konstruktor untuk menyiapkan keranjang belanja saat pertama kali dibuat
    public KeranjangBelanja() {
        this.daftarProduk = new ArrayList<>();
    }
    // Metode jumlah seluruh harga produk setelah diskon
    public double hitungTotalSetelahDiskon() {
        double total = 0.0;
        // Mengulangi setiap produk di keranjang dan menambahkan harga akhir total
        for (Produk produk : daftarProduk) {
            total += produk.getHargaSetelahDiskon();
            
        }
        return total;
    }
    // Metode cetak rincian seluruh isi keranjang dan total harga
    public void cetakRincian() {
        System.out.println("====Rincian Keranjang Belanja====");
        for (Produk item : daftarProduk) {
            double diskon = item.hitungDiskon();
            double hargaAkhir = item.getHargaSetelahDiskon();
            // Menampilkan detail produk
            System.out.printf("- %s | Harga Asli: Rp%,.2f | Diskon: Rp%,.2f | Harga Akhir: Rp%,.2f%n", 
                    item.getNama(), item.getHarga(), diskon, hargaAkhir);
            
        }
        System.out.println("------------------------------------");
        System.out.printf("TOTAL Keseluruhan Setelah Diskon: Rp%,.2f%n", hitungTotalSetelahDiskon());
    }
}

