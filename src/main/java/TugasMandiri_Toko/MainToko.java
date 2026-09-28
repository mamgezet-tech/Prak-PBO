package TugasMandiri_Toko;
public class MainToko {
    public static void main(String[] args) {
        // 1. Siapkan keranjang belanjanya
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // 2. Siapkan barang-barangnya
        Produk buku1 = new Buku("Pemrograman Java", 100000);
        Produk elektronik1 = new Elektronik("Headset Bluetooth", 300000);

        // 3. Masukkan ke keranjang (Pastikan baris ini tidak merah)
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);

        // 4. Cetak rinciannya
        keranjang.cetakRincian();
    }
}